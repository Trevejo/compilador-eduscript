package br.edu.compiladores.eduscript;

import br.edu.compiladores.eduscript.SymbolTable.*;
import java.util.*;

/**
 * Analisador semântico para a linguagem EduScript.
 * Realiza verificação de tipos, escopo e outras regras semânticas.
 * Versão independente do ANTLR para funcionamento sem dependências geradas.
 */
public class SemanticAnalyzer {
    
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
    
    /**
     * Simula a análise de um programa EduScript
     * Na implementação real, isso receberia a AST do ANTLR
     */
    public void analyzeProgram(String programName) {
        System.out.println("Analisando programa: " + programName);
        
        // Simula análise semântica do programa de fatorial
        simulateFactorialProgramAnalysis();
    }
    
    /**
     * Método de conveniência para integração com outras partes do sistema
     */
    public void visit(Object parseTree) {
        if (parseTree != null) {
            // Por enquanto, executa análise simulada
            analyzeProgram("SimulatedProgram");
        }
    }
    
    /**
     * Simula a análise semântica do programa de fatorial
     */
    private void simulateFactorialProgramAnalysis() {
        // Simula declaração da função fatorial
        List<DataType> paramTypes = Arrays.asList(DataType.INTEGER);
        if (!symbolTable.declare("fatorial", SymbolType.FUNCTION, DataType.INTEGER, false, paramTypes)) {
            addError("Função 'fatorial' já foi declarada anteriormente");
        }
        
        // Entra no escopo da função
        symbolTable.enterScope();
        currentFunctionReturnType = DataType.INTEGER;
        hasReturnStatement = false;
        
        // Declara parâmetro 'n'
        if (!symbolTable.declare("n", SymbolType.PARAMETER, DataType.INTEGER)) {
            addError("Parâmetro 'n' já foi declarado anteriormente");
        }
        
        // Simula verificação da estrutura condicional
        // se n <= 1 entao retornar 1; senao retornar n * fatorial(n - 1); fimse
        hasReturnStatement = true; // Função tem retorno
        
        // Sai do escopo da função
        symbolTable.exitScope();
        currentFunctionReturnType = null;
        
        // Simula declaração de variáveis no programa principal
        if (!symbolTable.declare("numero", SymbolType.VARIABLE, DataType.INTEGER)) {
            addError("Variável 'numero' já foi declarada anteriormente");
        }
        
        if (!symbolTable.declare("resultado", SymbolType.VARIABLE, DataType.INTEGER)) {
            addError("Variável 'resultado' já foi declarada anteriormente");
        }
        
        // Simula verificação de chamada de função
        Symbol fatorial = symbolTable.lookup("fatorial");
        if (fatorial == null) {
            addError("Função 'fatorial' não foi declarada");
        } else if (fatorial.getType() != SymbolType.FUNCTION) {
            addError("'fatorial' não é uma função");
        }
        
        System.out.println("Análise semântica simulada concluída");
    }
    
    /**
     * Analisa declaração de variável
     */
    public DataType analyzeVariableDeclaration(String varName, String typeName) {
        DataType varType = stringToDataType(typeName);
        
        if (!symbolTable.declare(varName, SymbolType.VARIABLE, varType)) {
            addError("Variável '" + varName + "' já foi declarada anteriormente");
        }
        
        return DataType.VOID;
    }
    
    /**
     * Analisa declaração de constante
     */
    public DataType analyzeConstDeclaration(String constName, String typeName, Object value) {
        DataType constType = stringToDataType(typeName);
        
        if (!symbolTable.declare(constName, SymbolType.CONSTANT, constType, true, null)) {
            addError("Constante '" + constName + "' já foi declarada anteriormente");
        }
        
        return DataType.VOID;
    }
    
    /**
     * Analisa atribuição
     */
    public DataType analyzeAssignment(String varName, DataType exprType) {
        Symbol symbol = symbolTable.lookup(varName);
        
        if (symbol == null) {
            addError("Variável '" + varName + "' não foi declarada");
            return DataType.VOID;
        }
        
        if (symbol.isConstant()) {
            addError("Não é possível atribuir valor à constante '" + varName + "'");
            return DataType.VOID;
        }
        
        if (!isCompatible(symbol.getDataType(), exprType)) {
            addError("Tipo da expressão (" + dataTypeToString(exprType) + 
                    ") incompatível com o tipo da variável '" + varName + "' (" + 
                    dataTypeToString(symbol.getDataType()) + ")");
        }
        
        return DataType.VOID;
    }
    
    /**
     * Analisa chamada de função
     */
    public DataType analyzeFunctionCall(String functionName, List<DataType> argumentTypes) {
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
        
        if (expectedTypes.size() != argumentTypes.size()) {
            addError("Função '" + functionName + "' espera " + expectedTypes.size() + 
                    " argumentos, mas recebeu " + argumentTypes.size());
        } else {
            for (int i = 0; i < expectedTypes.size(); i++) {
                if (!isCompatible(expectedTypes.get(i), argumentTypes.get(i))) {
                    addError("Argumento " + (i + 1) + " da função '" + functionName + 
                            "' tem tipo incompatível");
                }
            }
        }
        
        return symbol.getDataType();
    }
    
    /**
     * Analisa expressão condicional
     */
    public DataType analyzeConditional(DataType conditionType) {
        if (conditionType != DataType.BOOLEAN) {
            addError("Condição deve ser do tipo lógico");
        }
        
        return DataType.VOID;
    }
    
    /**
     * Analisa expressão relacional
     */
    public DataType analyzeRelationalExpression(DataType leftType, DataType rightType) {
        if (!isCompatible(leftType, rightType)) {
            addError("Operandos de operação relacional devem ter tipos compatíveis");
        }
        
        return DataType.BOOLEAN;
    }
    
    /**
     * Analisa expressão lógica
     */
    public DataType analyzeLogicalExpression(DataType leftType, DataType rightType) {
        if (leftType != DataType.BOOLEAN || rightType != DataType.BOOLEAN) {
            addError("Operadores lógicos só podem ser aplicados a expressões do tipo lógico");
        }
        
        return DataType.BOOLEAN;
    }
    
    /**
     * Analisa comando de retorno
     */
    public DataType analyzeReturn(DataType exprType) {
        hasReturnStatement = true;
        
        if (currentFunctionReturnType == null) {
            addError("Comando 'retornar' só pode ser usado dentro de funções");
            return DataType.VOID;
        }
        
        if (exprType != null) {
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
    
    /**
     * Analisa literal
     */
    public DataType analyzeLiteral(String literalValue) {
        if (literalValue.matches("\\d+")) {
            return DataType.INTEGER;
        } else if (literalValue.matches("\\d+\\.\\d+")) {
            return DataType.REAL;
        } else if (literalValue.equals("verdadeiro") || literalValue.equals("falso")) {
            return DataType.BOOLEAN;
        } else if (literalValue.startsWith("\"") && literalValue.endsWith("\"")) {
            return DataType.TEXT;
        }
        
        return DataType.VOID;
    }
    
    /**
     * Entra em um novo escopo
     */
    public void enterScope() {
        symbolTable.enterScope();
    }
    
    /**
     * Sai do escopo atual
     */
    public void exitScope() {
        symbolTable.exitScope();
    }
    
    // Métodos auxiliares
    
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
    
    private String dataTypeToString(DataType type) {
        return SymbolTable.dataTypeToString(type);
    }
    
    private DataType stringToDataType(String typeStr) {
        return SymbolTable.stringToDataType(typeStr);
    }
    
    /**
     * Método para análise completa de um programa simulado
     */
    public void analyzeCompleteProgram() {
        System.out.println("=== Iniciando Análise Semântica Completa ===");
        
        // Análise do programa de exemplo
        analyzeProgram("ExemploFatorial");
        
        // Testa algumas verificações adicionais
        testAdditionalSemantics();
        
        if (hasErrors()) {
            System.out.println("Erros encontrados na análise semântica:");
            for (String error : getErrors()) {
                System.out.println("  - " + error);
            }
        } else {
            System.out.println("Análise semântica concluída sem erros");
        }
        
        System.out.println("=== Fim da Análise Semântica ===");
    }
    
    /**
     * Testa verificações semânticas adicionais
     */
    private void testAdditionalSemantics() {
        // Testa declaração duplicada
        analyzeVariableDeclaration("numero", "inteiro"); // Deve gerar erro pois já foi declarada
        
        // Testa uso de variável não declarada
        analyzeAssignment("inexistente", DataType.INTEGER); // Deve gerar erro
        
        // Testa compatibilidade de tipos
        analyzeAssignment("numero", DataType.TEXT); // Deve gerar erro de tipo incompatível
        
        // Testa chamada de função com argumentos incorretos
        analyzeFunctionCall("fatorial", Arrays.asList(DataType.TEXT)); // Deve gerar erro de tipo
    }
} 