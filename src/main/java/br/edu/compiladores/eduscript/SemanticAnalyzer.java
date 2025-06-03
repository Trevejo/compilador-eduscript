package br.edu.compiladores.eduscript;

import br.edu.compiladores.eduscript.generated.EduScriptBaseVisitor;
import br.edu.compiladores.eduscript.generated.EduScriptParser;
import br.edu.compiladores.eduscript.SymbolTable.*;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

/**
 * Analisador semântico para a linguagem EduScript.
 * Realiza verificação de tipos, escopo e outras regras semânticas.
 */
public class SemanticAnalyzer extends EduScriptBaseVisitor<DataType> {
    
    private final SymbolTable symbolTable;
    private final List<String> errors;
    private DataType currentFunctionReturnType;
    private boolean hasReturnStatement;
    
    public SemanticAnalyzer() {
        this.symbolTable = new SymbolTable();
        this.errors = new ArrayList<>();
        this.currentFunctionReturnType = null;
        this.hasReturnStatement = false;
    }
    
    public List<String> getErrors() {
        return new ArrayList<>(errors);
    }
    
    public boolean hasErrors() {
        return !errors.isEmpty();
    }
    
    public SymbolTable getSymbolTable() {
        return symbolTable;
    }
    
    private void addError(String message) {
        errors.add(message);
    }
    
    @Override
    public DataType visitPrograma(EduScriptParser.ProgramaContext ctx) {
        String programName = ctx.ID().getText();
        System.out.println("Analisando programa: " + programName);
        
        // Visita declarações
        if (ctx.declaracoes() != null) {
            visit(ctx.declaracoes());
        }
        
        // Visita bloco principal
        visit(ctx.bloco());
        
        return DataType.VOID;
    }
    
    @Override
    public DataType visitDeclaracoes(EduScriptParser.DeclaracoesContext ctx) {
        for (int i = 0; i < ctx.getChildCount(); i++) {
            visit(ctx.getChild(i));
        }
        return DataType.VOID;
    }
    
    @Override
    public DataType visitFuncao(EduScriptParser.FuncaoContext ctx) {
        String functionName = ctx.ID().getText();
        DataType returnType = visit(ctx.tipo());
        
        // Coleta parâmetros
        List<DataType> parameterTypes = new ArrayList<>();
        if (ctx.parametros() != null) {
            parameterTypes = collectParameterTypes(ctx.parametros());
        }
        
        // Declara a função na tabela de símbolos
        if (!symbolTable.declare(functionName, SymbolType.FUNCTION, returnType, false, parameterTypes)) {
            addError("Função '" + functionName + "' já foi declarada anteriormente");
        }
        
        // Entra no escopo da função
        symbolTable.enterScope();
        currentFunctionReturnType = returnType;
        hasReturnStatement = false;
        
        // Declara parâmetros no escopo da função
        if (ctx.parametros() != null) {
            visit(ctx.parametros());
        }
        
        // Visita comandos da função
        visit(ctx.comandos());
        
        // Verifica se função tem retorno
        if (returnType != DataType.VOID && !hasReturnStatement) {
            addError("Função '" + functionName + "' deve ter pelo menos um comando 'retornar'");
        }
        
        // Sai do escopo da função
        symbolTable.exitScope();
        currentFunctionReturnType = null;
        
        return DataType.VOID;
    }
    
    @Override
    public DataType visitProcedimento(EduScriptParser.ProcedimentoContext ctx) {
        String procedureName = ctx.ID().getText();
        
        // Coleta parâmetros
        List<DataType> parameterTypes = new ArrayList<>();
        if (ctx.parametros() != null) {
            parameterTypes = collectParameterTypes(ctx.parametros());
        }
        
        // Declara o procedimento na tabela de símbolos
        if (!symbolTable.declare(procedureName, SymbolType.PROCEDURE, DataType.VOID, false, parameterTypes)) {
            addError("Procedimento '" + procedureName + "' já foi declarado anteriormente");
        }
        
        // Entra no escopo do procedimento
        symbolTable.enterScope();
        currentFunctionReturnType = DataType.VOID;
        
        // Declara parâmetros no escopo do procedimento
        if (ctx.parametros() != null) {
            visit(ctx.parametros());
        }
        
        // Visita comandos do procedimento
        visit(ctx.comandos());
        
        // Sai do escopo do procedimento
        symbolTable.exitScope();
        currentFunctionReturnType = null;
        
        return DataType.VOID;
    }
    
    @Override
    public DataType visitParametros(EduScriptParser.ParametrosContext ctx) {
        for (EduScriptParser.ParametroContext param : ctx.parametro()) {
            visit(param);
        }
        return DataType.VOID;
    }
    
    @Override
    public DataType visitParametro(EduScriptParser.ParametroContext ctx) {
        String paramName = ctx.ID().getText();
        DataType paramType = visit(ctx.tipo());
        boolean isReference = ctx.REF() != null;
        
        if (!symbolTable.declare(paramName, SymbolType.PARAMETER, paramType)) {
            addError("Parâmetro '" + paramName + "' já foi declarado anteriormente");
        }
        
        return paramType;
    }
    
    @Override
    public DataType visitDeclaracaoVar(EduScriptParser.DeclaracaoVarContext ctx) {
        DataType varType = visit(ctx.tipo());
        
        for (TerminalNode idNode : ctx.listaVar().ID()) {
            String varName = idNode.getText();
            if (!symbolTable.declare(varName, SymbolType.VARIABLE, varType)) {
                addError("Variável '" + varName + "' já foi declarada anteriormente");
            }
        }
        
        return DataType.VOID;
    }
    
    @Override
    public DataType visitDeclaracaoConst(EduScriptParser.DeclaracaoConstContext ctx) {
        String constName = ctx.ID().getText();
        DataType constType = visit(ctx.tipo());
        DataType exprType = visit(ctx.expressao());
        
        // Verifica compatibilidade de tipos
        if (!isCompatible(constType, exprType)) {
            addError("Tipo da expressão (" + dataTypeToString(exprType) + 
                    ") incompatível com o tipo da constante '" + constName + "' (" + 
                    dataTypeToString(constType) + ")");
        }
        
        if (!symbolTable.declare(constName, SymbolType.CONSTANT, constType, true, null)) {
            addError("Constante '" + constName + "' já foi declarada anteriormente");
        }
        
        return DataType.VOID;
    }
    
    @Override
    public DataType visitAtribuicao(EduScriptParser.AtribuicaoContext ctx) {
        String varName = ctx.ID().getText();
        Symbol symbol = symbolTable.lookup(varName);
        
        if (symbol == null) {
            addError("Variável '" + varName + "' não foi declarada");
            return DataType.VOID;
        }
        
        if (symbol.isConstant()) {
            addError("Não é possível atribuir valor à constante '" + varName + "'");
            return DataType.VOID;
        }
        
        // Para atribuição, a expressão de valor é sempre a última na lista
        List<EduScriptParser.ExpressaoContext> expressoes = ctx.expressao();
        if (!expressoes.isEmpty()) {
            DataType exprType = visit(expressoes.get(expressoes.size() - 1));
            
            if (!isCompatible(symbol.getDataType(), exprType)) {
                addError("Tipo da expressão (" + dataTypeToString(exprType) + 
                        ") incompatível com o tipo da variável '" + varName + "' (" + 
                        dataTypeToString(symbol.getDataType()) + ")");
            }
        }
        
        return DataType.VOID;
    }
    
    @Override
    public DataType visitChamadaFuncao(EduScriptParser.ChamadaFuncaoContext ctx) {
        String functionName = ctx.ID().getText();
        Symbol symbol = symbolTable.lookup(functionName);
        
        if (symbol == null) {
            addError("Função '" + functionName + "' não foi declarada");
            return DataType.VOID;
        }
        
        if (symbol.getType() != SymbolType.FUNCTION && symbol.getType() != SymbolType.PROCEDURE) {
            addError("'" + functionName + "' não é uma função ou procedimento");
            return DataType.VOID;
        }
        
        // Verifica argumentos
        List<DataType> expectedTypes = symbol.getParameters();
        List<DataType> actualTypes = new ArrayList<>();
        
        if (ctx.argumentos() != null) {
            List<EduScriptParser.ExpressaoContext> argumentExpressoes = ctx.argumentos().expressao();
            for (EduScriptParser.ExpressaoContext expr : argumentExpressoes) {
                actualTypes.add(visit(expr));
            }
        }
        
        if (expectedTypes.size() != actualTypes.size()) {
            addError("Função '" + functionName + "' espera " + expectedTypes.size() + 
                    " argumentos, mas recebeu " + actualTypes.size());
        } else {
            for (int i = 0; i < expectedTypes.size(); i++) {
                if (!isCompatible(expectedTypes.get(i), actualTypes.get(i))) {
                    addError("Argumento " + (i + 1) + " da função '" + functionName + 
                            "' tem tipo incompatível");
                }
            }
        }
        
        return symbol.getDataType();
    }
    
    @Override
    public DataType visitCondicional(EduScriptParser.CondicionalContext ctx) {
        DataType conditionType = visit(ctx.expressao());
        
        if (conditionType != DataType.BOOLEAN) {
            addError("Condição do 'se' deve ser do tipo lógico");
        }
        
        // Visita comandos do 'se'
        visit(ctx.comandos(0));
        
        // Visita comandos do 'senao' se existir
        if (ctx.comandos().size() > 1) {
            visit(ctx.comandos(1));
        }
        
        return DataType.VOID;
    }
    
    @Override
    public DataType visitLacoEnquanto(EduScriptParser.LacoEnquantoContext ctx) {
        DataType conditionType = visit(ctx.expressao());
        
        if (conditionType != DataType.BOOLEAN) {
            addError("Condição do 'enquanto' deve ser do tipo lógico");
        }
        
        visit(ctx.comandos());
        
        return DataType.VOID;
    }
    
    @Override
    public DataType visitLacoPara(EduScriptParser.LacoParaContext ctx) {
        String varName = ctx.ID().getText();
        Symbol symbol = symbolTable.lookup(varName);
        
        if (symbol == null) {
            addError("Variável '" + varName + "' não foi declarada");
        } else if (symbol.getDataType() != DataType.INTEGER) {
            addError("Variável de controle do 'para' deve ser do tipo inteiro");
        }
        
        DataType initType = visit(ctx.expressao(0));
        DataType endType = visit(ctx.expressao(1));
        
        if (initType != DataType.INTEGER) {
            addError("Valor inicial do 'para' deve ser do tipo inteiro");
        }
        
        if (endType != DataType.INTEGER) {
            addError("Valor final do 'para' deve ser do tipo inteiro");
        }
        
        if (ctx.expressao().size() > 2) { // Tem passo
            DataType stepType = visit(ctx.expressao(2));
            if (stepType != DataType.INTEGER) {
                addError("Passo do 'para' deve ser do tipo inteiro");
            }
        }
        
        visit(ctx.comandos());
        
        return DataType.VOID;
    }
    
    @Override
    public DataType visitRetorno(EduScriptParser.RetornoContext ctx) {
        hasReturnStatement = true;
        
        if (currentFunctionReturnType == null) {
            addError("Comando 'retornar' só pode ser usado dentro de funções");
            return DataType.VOID;
        }
        
        if (ctx.expressao() != null) {
            DataType exprType = visit(ctx.expressao());
            if (!isCompatible(currentFunctionReturnType, exprType)) {
                addError("Tipo do retorno (" + dataTypeToString(exprType) + 
                        ") incompatível com o tipo da função (" + 
                        dataTypeToString(currentFunctionReturnType) + ")");
            }
        } else if (currentFunctionReturnType != DataType.VOID) {
            addError("Função deve retornar um valor do tipo " + 
                    dataTypeToString(currentFunctionReturnType));
        }
        
        return DataType.VOID;
    }
    
    @Override
    public DataType visitExpressaoRelacional(EduScriptParser.ExpressaoRelacionalContext ctx) {
        if (ctx.operadorRelacional() == null) {
            return visit(ctx.expressaoAritmetica(0));
        }
        
        DataType leftType = visit(ctx.expressaoAritmetica(0));
        DataType rightType = visit(ctx.expressaoAritmetica(1));
        
        if (!isCompatible(leftType, rightType)) {
            addError("Operandos de operação relacional devem ter tipos compatíveis");
        }
        
        return DataType.BOOLEAN;
    }
    
    @Override
    public DataType visitExpressaoLogica(EduScriptParser.ExpressaoLogicaContext ctx) {
        DataType resultType = visit(ctx.expressaoRelacional(0));
        
        for (int i = 1; i < ctx.expressaoRelacional().size(); i++) {
            DataType rightType = visit(ctx.expressaoRelacional(i));
            
            if (resultType != DataType.BOOLEAN || rightType != DataType.BOOLEAN) {
                addError("Operadores lógicos só podem ser aplicados a expressões do tipo lógico");
            }
            
            resultType = DataType.BOOLEAN;
        }
        
        return resultType;
    }
    
    @Override
    public DataType visitExpressaoAritmetica(EduScriptParser.ExpressaoAritmeticaContext ctx) {
        DataType resultType = visit(ctx.termo(0));
        
        for (int i = 1; i < ctx.termo().size(); i++) {
            DataType rightType = visit(ctx.termo(i));
            
            if (!isNumericType(resultType) || !isNumericType(rightType)) {
                addError("Operadores aritméticos só podem ser aplicados a tipos numéricos");
            }
            
            // Promoção de tipo: se um dos operandos é real, o resultado é real
            if (resultType == DataType.REAL || rightType == DataType.REAL) {
                resultType = DataType.REAL;
            } else {
                resultType = DataType.INTEGER;
            }
        }
        
        return resultType;
    }
    
    @Override
    public DataType visitTermo(EduScriptParser.TermoContext ctx) {
        DataType resultType = visit(ctx.fator(0));
        
        for (int i = 1; i < ctx.fator().size(); i++) {
            DataType rightType = visit(ctx.fator(i));
            
            if (!isNumericType(resultType) || !isNumericType(rightType)) {
                addError("Operadores multiplicativos só podem ser aplicados a tipos numéricos");
            }
            
            // Promoção de tipo: se um dos operandos é real, o resultado é real
            if (resultType == DataType.REAL || rightType == DataType.REAL) {
                resultType = DataType.REAL;
            } else {
                resultType = DataType.INTEGER;
            }
        }
        
        return resultType;
    }
    
    @Override
    public DataType visitFator(EduScriptParser.FatorContext ctx) {
        if (ctx.LPAREN() != null) {
            // Expressão entre parênteses
            return visit(ctx.expressao(0));
        } else if (ctx.chamadaFuncao() != null) {
            // Chamada de função
            return visit(ctx.chamadaFuncao());
        } else if (ctx.ID() != null) {
            // Variável ou array
            String varName = ctx.ID().getText();
            Symbol symbol = symbolTable.lookup(varName);
            
            if (symbol == null) {
                addError("Variável '" + varName + "' não foi declarada");
                return DataType.VOID;
            }
            
            return symbol.getDataType();
        } else if (ctx.literal() != null) {
            // Literal
            return visit(ctx.literal());
        } else if (ctx.operadorUnario() != null && ctx.fator() != null) {
            // Operador unário
            DataType operandType = visit(ctx.fator());
            
            if (ctx.operadorUnario().NAO() != null) {
                // Operador lógico NOT
                if (operandType != DataType.BOOLEAN) {
                    addError("Operador 'nao' só pode ser aplicado a expressões lógicas");
                }
                return DataType.BOOLEAN;
            } else {
                // Operadores + e -
                if (!isNumericType(operandType)) {
                    addError("Operadores unários '+' e '-' só podem ser aplicados a tipos numéricos");
                }
                return operandType;
            }
        }
        
        return DataType.VOID;
    }
    
    @Override
    public DataType visitTipoBasico(EduScriptParser.TipoBasicoContext ctx) {
        return SymbolTable.stringToDataType(ctx.getText());
    }
    
    @Override
    public DataType visitLiteral(EduScriptParser.LiteralContext ctx) {
        if (ctx.NUMERO_INTEIRO() != null) {
            return DataType.INTEGER;
        } else if (ctx.NUMERO_REAL() != null) {
            return DataType.REAL;
        } else if (ctx.STRING() != null) {
            return DataType.TEXT;
        } else if (ctx.BOOLEAN() != null) {
            return DataType.BOOLEAN;
        }
        return DataType.VOID;
    }
    
    // Métodos auxiliares
    
    private List<DataType> collectParameterTypes(EduScriptParser.ParametrosContext ctx) {
        List<DataType> types = new ArrayList<>();
        for (EduScriptParser.ParametroContext param : ctx.parametro()) {
            types.add(visit(param.tipo()));
        }
        return types;
    }
    
    private boolean isCompatible(DataType expected, DataType actual) {
        if (expected == actual) {
            return true;
        }
        
        // Permite conversão de inteiro para real
        if (expected == DataType.REAL && actual == DataType.INTEGER) {
            return true;
        }
        
        return false;
    }
    
    private boolean isNumericType(DataType type) {
        return type == DataType.INTEGER || type == DataType.REAL;
    }
    
    private String dataTypeToString(DataType type) {
        return SymbolTable.dataTypeToString(type);
    }
} 