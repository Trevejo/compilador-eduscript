package br.edu.compiladores.eduscript;

import br.edu.compiladores.eduscript.generated.*;
import br.edu.compiladores.eduscript.SymbolTable.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Testes unitários abrangentes para o compilador EduScript.
 * Cobertura: análise léxica, sintática, semântica, tabela de símbolos e interpretação.
 */
public class TestEduScript {

    // ========== TESTES DE ANÁLISE LÉXICA ==========
    
    @Test
    @DisplayName("Teste de Tokens - Palavras-chave")
    public void testTokensPalavrasChave() {
        String input = "programa funcao procedimento inicio fim var const se entao senao fimse enquanto faca fimenquanto para ate passo fimpara ler escrever retornar inteiro real logico texto";
        
        ANTLRInputStream inputStream = new ANTLRInputStream(input);
        EduScriptLexer lexer = new EduScriptLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();
        
        List<Token> tokenList = tokens.getTokens();
        
        // Verifica se os tokens principais foram reconhecidos corretamente
        assertTrue(tokenList.size() > 20, "Deve reconhecer pelo menos 20 tokens de palavras-chave");
        
        // Verifica alguns tokens específicos
        assertEquals("programa", tokenList.get(0).getText());
        assertEquals("funcao", tokenList.get(1).getText());
        assertEquals("inteiro", tokenList.get(tokenList.size() - 5).getText()); // Penúltimo token antes de EOF
    }
    
    @Test
    @DisplayName("Teste de Tokens - Operadores")
    public void testTokensOperadores() {
        String input = "+ - * / % = <> < <= > >= e ou nao";
        
        ANTLRInputStream inputStream = new ANTLRInputStream(input);
        EduScriptLexer lexer = new EduScriptLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();
        
        List<Token> tokenList = tokens.getTokens();
        
        assertTrue(tokenList.size() >= 13, "Deve reconhecer todos os operadores");
        assertEquals("+", tokenList.get(0).getText());
        assertEquals("=", tokenList.get(5).getText());
        assertEquals("e", tokenList.get(11).getText());
    }
    
    @Test
    @DisplayName("Teste de Tokens - Literais")
    public void testTokensLiterais() {
        String input = "123 45.67 \"Hello World\" verdadeiro falso";
        
        ANTLRInputStream inputStream = new ANTLRInputStream(input);
        EduScriptLexer lexer = new EduScriptLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();
        
        List<Token> tokenList = tokens.getTokens();
        
        assertEquals("123", tokenList.get(0).getText());
        assertEquals("45.67", tokenList.get(1).getText());
        assertEquals("\"Hello World\"", tokenList.get(2).getText());
        assertEquals("verdadeiro", tokenList.get(3).getText());
        assertEquals("falso", tokenList.get(4).getText());
    }
    
    @Test
    @DisplayName("Teste de Tokens - Identificadores")
    public void testTokensIdentificadores() {
        String input = "minhaVariavel contador_1 _teste variavel123";
        
        ANTLRInputStream inputStream = new ANTLRInputStream(input);
        EduScriptLexer lexer = new EduScriptLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();
        
        List<Token> tokenList = tokens.getTokens();
        
        assertEquals("minhaVariavel", tokenList.get(0).getText());
        assertEquals("contador_1", tokenList.get(1).getText());
        assertEquals("_teste", tokenList.get(2).getText());
        assertEquals("variavel123", tokenList.get(3).getText());
    }

    // ========== TESTES DE ANÁLISE SINTÁTICA ==========
    
    @Test
    @DisplayName("Teste de Parsing - Programa Simples")
    public void testParsingProgramaSimples() {
        String input = "programa TesteSimples;\n" +
                "inicio\n" +
                "fimprograma";
        
        ANTLRInputStream inputStream = new ANTLRInputStream(input);
        EduScriptLexer lexer = new EduScriptLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EduScriptParser parser = new EduScriptParser(tokens);
        
        ParseTree tree = parser.programa();
        assertNotNull(tree, "Árvore sintática deve ser criada");
        assertEquals(0, parser.getNumberOfSyntaxErrors(), "Não deve haver erros sintáticos");
    }
    
    @Test
    @DisplayName("Teste de Parsing - Declaração de Variáveis")
    public void testParsingDeclaracaoVariaveis() {
        String input = "programa TesteVar;\n" +
                "var x, y: inteiro;\n" +
                "var nome: texto;\n" +
                "inicio\n" +
                "fimprograma";
        
        ANTLRInputStream inputStream = new ANTLRInputStream(input);
        EduScriptLexer lexer = new EduScriptLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EduScriptParser parser = new EduScriptParser(tokens);
        
        ParseTree tree = parser.programa();
        assertNotNull(tree);
        assertEquals(0, parser.getNumberOfSyntaxErrors(), "Não deve haver erros sintáticos");
    }
    
    @Test
    @DisplayName("Teste de Parsing - Função")
    public void testParsingFuncao() {
        String input = "programa TesteFuncao;\n" +
                "funcao soma(a: inteiro, b: inteiro): inteiro\n" +
                "inicio\n" +
                "    retornar a + b;\n" +
                "fim\n" +
                "inicio\n" +
                "fimprograma";
        
        ANTLRInputStream inputStream = new ANTLRInputStream(input);
        EduScriptLexer lexer = new EduScriptLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EduScriptParser parser = new EduScriptParser(tokens);
        
        ParseTree tree = parser.programa();
        assertNotNull(tree);
        assertEquals(0, parser.getNumberOfSyntaxErrors(), "Não deve haver erros sintáticos");
    }
    
    @Test
    @DisplayName("Teste de Parsing - Estruturas de Controle")
    public void testParsingEstruturasControle() {
        String input = "programa TesteControle;\n" +
                "var i: inteiro;\n" +
                "inicio\n" +
                "    se i > 0 entao\n" +
                "        escrever(\"Positivo\");\n" +
                "    senao\n" +
                "        escrever(\"Não positivo\");\n" +
                "    fimse\n" +
                "    \n" +
                "    enquanto i < 10 faca\n" +
                "        i = i + 1;\n" +
                "    fimenquanto\n" +
                "    \n" +
                "    para i = 1 ate 5 passo 1 faca\n" +
                "        escrever(i);\n" +
                "    fimpara\n" +
                "fimprograma";
        
        ANTLRInputStream inputStream = new ANTLRInputStream(input);
        EduScriptLexer lexer = new EduScriptLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EduScriptParser parser = new EduScriptParser(tokens);
        
        ParseTree tree = parser.programa();
        assertNotNull(tree);
        assertEquals(0, parser.getNumberOfSyntaxErrors(), "Não deve haver erros sintáticos");
    }

    // ========== TESTES DA TABELA DE SÍMBOLOS ==========
    
    @Test
    @DisplayName("Teste - Declaração e Busca de Símbolos")
    public void testTabelaSimbolosBasica() {
        SymbolTable symbolTable = new SymbolTable();
        
        // Declarar variável
        boolean success = symbolTable.declare("x", SymbolType.VARIABLE, DataType.INTEGER);
        assertTrue(success, "Deve conseguir declarar variável nova");
        
        // Buscar variável
        Symbol symbol = symbolTable.lookup("x");
        assertNotNull(symbol, "Deve encontrar variável declarada");
        assertEquals("x", symbol.getName());
        assertEquals(SymbolType.VARIABLE, symbol.getType());
        assertEquals(DataType.INTEGER, symbol.getDataType());
    }
    
    @Test
    @DisplayName("Teste - Redeclaração de Símbolos")
    public void testTabelaSimbolosRedeclaracao() {
        SymbolTable symbolTable = new SymbolTable();
        
        // Primeira declaração
        boolean first = symbolTable.declare("x", SymbolType.VARIABLE, DataType.INTEGER);
        assertTrue(first, "Primeira declaração deve ser bem-sucedida");
        
        // Tentativa de redeclaração
        boolean second = symbolTable.declare("x", SymbolType.VARIABLE, DataType.REAL);
        assertFalse(second, "Redeclaração deve falhar");
    }
    
    @Test
    @DisplayName("Teste - Escopo Aninhado")
    public void testTabelaSimbolosEscopo() {
        SymbolTable symbolTable = new SymbolTable();
        
        // Escopo global
        symbolTable.declare("global", SymbolType.VARIABLE, DataType.INTEGER);
        
        // Entra em novo escopo
        symbolTable.enterScope();
        symbolTable.declare("local", SymbolType.VARIABLE, DataType.REAL);
        
        // Deve encontrar ambas as variáveis
        assertNotNull(symbolTable.lookup("global"), "Deve encontrar variável global");
        assertNotNull(symbolTable.lookup("local"), "Deve encontrar variável local");
        
        // Sai do escopo
        symbolTable.exitScope();
        
        // Deve encontrar apenas a global
        assertNotNull(symbolTable.lookup("global"), "Ainda deve encontrar variável global");
        assertNull(symbolTable.lookup("local"), "Não deve mais encontrar variável local");
    }
    
    @Test
    @DisplayName("Teste - Função com Parâmetros")
    public void testTabelaSimbolosFuncao() {
        SymbolTable symbolTable = new SymbolTable();
        
        // Declarar função
        List<DataType> parameters = List.of(DataType.INTEGER, DataType.REAL);
        boolean success = symbolTable.declare("minhaFuncao", SymbolType.FUNCTION, DataType.INTEGER, false, parameters);
        assertTrue(success, "Deve conseguir declarar função");
        
        // Buscar função
        Symbol symbol = symbolTable.lookup("minhaFuncao");
        assertNotNull(symbol);
        assertEquals(SymbolType.FUNCTION, symbol.getType());
        assertEquals(DataType.INTEGER, symbol.getDataType());
        assertEquals(2, symbol.getParameters().size());
        assertEquals(DataType.INTEGER, symbol.getParameters().get(0));
        assertEquals(DataType.REAL, symbol.getParameters().get(1));
    }

    // ========== TESTES DE ANÁLISE SEMÂNTICA ==========
    
    @Test
    @DisplayName("Teste Semântico - Programa Válido")
    public void testSemanticoProgramaValido() {
        String input = "programa TesteSemantico;\n" +
                "var x: inteiro;\n" +
                "var y: real;\n" +
                "inicio\n" +
                "    x = 10;\n" +
                "    y = 3.14;\n" +
                "fimprograma";
        
        ANTLRInputStream inputStream = new ANTLRInputStream(input);
        EduScriptLexer lexer = new EduScriptLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EduScriptParser parser = new EduScriptParser(tokens);
        ParseTree tree = parser.programa();
        
        SemanticAnalyzer analyzer = new SemanticAnalyzer();
        analyzer.visit(tree);
        
        assertFalse(analyzer.hasErrors(), "Não deve ter erros semânticos");
        assertTrue(analyzer.getErrors().isEmpty(), "Lista de erros deve estar vazia");
    }
    
    @Test
    @DisplayName("Teste Semântico - Variável Não Declarada")
    public void testSemanticoVariavelNaoDeclarada() {
        String input = "programa TesteErro;\n" +
                "inicio\n" +
                "    x = 10;\n" +
                "fimprograma";
        
        ANTLRInputStream inputStream = new ANTLRInputStream(input);
        EduScriptLexer lexer = new EduScriptLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EduScriptParser parser = new EduScriptParser(tokens);
        ParseTree tree = parser.programa();
        
        SemanticAnalyzer analyzer = new SemanticAnalyzer();
        analyzer.visit(tree);
        
        assertTrue(analyzer.hasErrors(), "Deve detectar erro semântico");
        assertTrue(analyzer.getErrors().get(0).contains("não foi declarada"), "Deve reportar variável não declarada");
    }
    
    @Test
    @DisplayName("Teste Semântico - Incompatibilidade de Tipos")
    public void testSemanticoIncompatibilidadeTipos() {
        String input = "programa TesteIncompatibilidade;\n" +
                "var x: inteiro;\n" +
                "var texto: texto;\n" +
                "inicio\n" +
                "    x = \"hello\";\n" +
                "fimprograma";
        
        ANTLRInputStream inputStream = new ANTLRInputStream(input);
        EduScriptLexer lexer = new EduScriptLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EduScriptParser parser = new EduScriptParser(tokens);
        ParseTree tree = parser.programa();
        
        SemanticAnalyzer analyzer = new SemanticAnalyzer();
        analyzer.visit(tree);
        
        assertTrue(analyzer.hasErrors(), "Deve detectar erro de tipo");
        assertTrue(analyzer.getErrors().get(0).contains("incompatível"), "Deve reportar incompatibilidade de tipos");
    }
    
    @Test
    @DisplayName("Teste Semântico - Função com Retorno")
    public void testSemanticoFuncaoRetorno() {
        String input = "programa TesteFuncaoRetorno;\n" +
                "funcao dobrar(n: inteiro): inteiro\n" +
                "inicio\n" +
                "    retornar n * 2;\n" +
                "fim\n" +
                "var resultado: inteiro;\n" +
                "inicio\n" +
                "    resultado = dobrar(5);\n" +
                "fimprograma";
        
        ANTLRInputStream inputStream = new ANTLRInputStream(input);
        EduScriptLexer lexer = new EduScriptLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EduScriptParser parser = new EduScriptParser(tokens);
        ParseTree tree = parser.programa();
        
        SemanticAnalyzer analyzer = new SemanticAnalyzer();
        analyzer.visit(tree);
        
        assertFalse(analyzer.hasErrors(), "Função válida não deve ter erros: " + analyzer.getErrors());
    }
    
    @Test
    @DisplayName("Teste Semântico - Função Sem Retorno Obrigatório")
    public void testSemanticoFuncaoSemRetorno() {
        String input = "programa TesteFuncaoSemRetorno;\n" +
                "funcao semRetorno(n: inteiro): inteiro\n" +
                "inicio\n" +
                "    n = n + 1;\n" +
                "fim\n" +
                "inicio\n" +
                "fimprograma";
        
        ANTLRInputStream inputStream = new ANTLRInputStream(input);
        EduScriptLexer lexer = new EduScriptLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EduScriptParser parser = new EduScriptParser(tokens);
        ParseTree tree = parser.programa();
        
        SemanticAnalyzer analyzer = new SemanticAnalyzer();
        analyzer.visit(tree);
        
        assertTrue(analyzer.hasErrors(), "Deve detectar falta de retorno");
        assertTrue(analyzer.getErrors().get(0).contains("retornar"), "Deve reportar falta de comando retornar");
    }

    // ========== TESTES DE EXPRESSÕES ==========
    
    @Test
    @DisplayName("Teste - Expressões Aritméticas")
    public void testExpressoesAritmeticas() {
        String input = "programa TesteExpressoes;\n" +
                "var a, b, c: inteiro;\n" +
                "var x, y: real;\n" +
                "inicio\n" +
                "    c = a + b;\n" +
                "    c = a - b * 2;\n" +
                "    x = y / 2.0;\n" +
                "    c = a % 3;\n" +
                "fimprograma";
        
        ANTLRInputStream inputStream = new ANTLRInputStream(input);
        EduScriptLexer lexer = new EduScriptLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EduScriptParser parser = new EduScriptParser(tokens);
        ParseTree tree = parser.programa();
        
        SemanticAnalyzer analyzer = new SemanticAnalyzer();
        analyzer.visit(tree);
        
        assertFalse(analyzer.hasErrors(), "Expressões aritméticas válidas não devem ter erros: " + analyzer.getErrors());
    }
    
    @Test
    @DisplayName("Teste - Expressões Lógicas")
    public void testExpressoesLogicas() {
        String input = "programa TesteLogicas;\n" +
                "var flag1, flag2: logico;\n" +
                "var a, b: inteiro;\n" +
                "inicio\n" +
                "    flag1 = verdadeiro e falso;\n" +
                "    flag2 = a > b ou a = b;\n" +
                "    flag1 = nao flag2;\n" +
                "fimprograma";
        
        ANTLRInputStream inputStream = new ANTLRInputStream(input);
        EduScriptLexer lexer = new EduScriptLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EduScriptParser parser = new EduScriptParser(tokens);
        ParseTree tree = parser.programa();
        
        SemanticAnalyzer analyzer = new SemanticAnalyzer();
        analyzer.visit(tree);
        
        assertFalse(analyzer.hasErrors(), "Expressões lógicas válidas não devem ter erros: " + analyzer.getErrors());
    }

    // ========== TESTES DO INTERPRETADOR ==========
    
    @Test
    @DisplayName("Teste - Interpretador Básico")
    public void testInterpretadorBasico() {
        Interpreter interpreter = new Interpreter();
        
        // Teste básico de funcionalidade
        assertDoesNotThrow(() -> {
            interpreter.execute("TesteBasico");
        }, "Interpretador deve executar sem exceções");
        
        interpreter.close();
    }

    // ========== TESTES DE INTEGRAÇÃO ==========
    
    @Test
    @DisplayName("Teste de Integração - Pipeline Completo")
    public void testPipelineCompleto() {
        String input = "programa TesteIntegracao;\n" +
                "\n" +
                "funcao fibonacci(n: inteiro): inteiro\n" +
                "inicio\n" +
                "    se n <= 1 entao\n" +
                "        retornar n;\n" +
                "    senao\n" +
                "        retornar fibonacci(n-1) + fibonacci(n-2);\n" +
                "    fimse\n" +
                "fim\n" +
                "\n" +
                "var numero: inteiro;\n" +
                "var resultado: inteiro;\n" +
                "\n" +
                "inicio\n" +
                "    numero = 5;\n" +
                "    resultado = fibonacci(numero);\n" +
                "    escrever(\"Fibonacci de \", numero, \" é \", resultado);\n" +
                "fimprograma";
        
        // Análise Léxica
        ANTLRInputStream inputStream = new ANTLRInputStream(input);
        EduScriptLexer lexer = new EduScriptLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();
        
        assertTrue(tokens.getTokens().size() > 50, "Deve reconhecer muitos tokens");
        
        // Análise Sintática
        tokens.seek(0); // Reset token stream
        EduScriptParser parser = new EduScriptParser(tokens);
        ParseTree tree = parser.programa();
        
        assertNotNull(tree, "Árvore sintática deve ser criada");
        assertEquals(0, parser.getNumberOfSyntaxErrors(), "Não deve haver erros sintáticos");
        
        // Análise Semântica
        SemanticAnalyzer analyzer = new SemanticAnalyzer();
        analyzer.visit(tree);
        
        assertFalse(analyzer.hasErrors(), "Não deve haver erros semânticos: " + analyzer.getErrors());
        
        // Verificar símbolos na tabela
        SymbolTable symbolTable = analyzer.getSymbolTable();
        Symbol fibonacciSymbol = symbolTable.lookup("fibonacci");
        assertNotNull(fibonacciSymbol, "Função fibonacci deve estar na tabela de símbolos");
        assertEquals(SymbolType.FUNCTION, fibonacciSymbol.getType());
        assertEquals(DataType.INTEGER, fibonacciSymbol.getDataType());
        assertEquals(1, fibonacciSymbol.getParameters().size());
    }
    
    @Test
    @DisplayName("Teste - Detecção de Múltiplos Erros")
    public void testMultiplosErros() {
        String input = "programa TesteErros;\n" +
                "var x: inteiro;\n" +
                "inicio\n" +
                "    y = 10;\n" +
                "    x = \"texto\";\n" +
                "    z = x + y;\n" +
                "fimprograma";
        
        ANTLRInputStream inputStream = new ANTLRInputStream(input);
        EduScriptLexer lexer = new EduScriptLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EduScriptParser parser = new EduScriptParser(tokens);
        ParseTree tree = parser.programa();
        
        SemanticAnalyzer analyzer = new SemanticAnalyzer();
        analyzer.visit(tree);
        
        assertTrue(analyzer.hasErrors(), "Deve detectar múltiplos erros");
        assertTrue(analyzer.getErrors().size() >= 3, "Deve detectar pelo menos 3 erros: " + analyzer.getErrors());
    }

    // ========== HELPER METHODS ==========
    
    /**
     * Método auxiliar para análise completa de código
     */
    private SemanticAnalyzer analyzeCode(String code) {
        ANTLRInputStream inputStream = new ANTLRInputStream(code);
        EduScriptLexer lexer = new EduScriptLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EduScriptParser parser = new EduScriptParser(tokens);
        ParseTree tree = parser.programa();
        
        SemanticAnalyzer analyzer = new SemanticAnalyzer();
        analyzer.visit(tree);
        return analyzer;
    }
    
    /**
     * Método auxiliar para verificar se código é válido
     */
    private boolean isValidCode(String code) {
        try {
            SemanticAnalyzer analyzer = analyzeCode(code);
            return !analyzer.hasErrors();
        } catch (Exception e) {
            return false;
        }
    }
    
    // ========== TESTES DE CASOS EDGE ==========
    
    @Test
    @DisplayName("Teste - Programa Vazio")
    public void testProgramaVazio() {
        String input = "programa Vazio;\n" +
                "inicio\n" +
                "fimprograma";
        
        assertTrue(isValidCode(input), "Programa vazio deve ser válido");
    }
    
    @Test
    @DisplayName("Teste - Constantes")
    public void testConstantes() {
        String input = "programa TesteConstantes;\n" +
                "const PI: real = 3.14159;\n" +
                "const MAX: inteiro = 100;\n" +
                "var raio: real;\n" +
                "var area: real;\n" +
                "inicio\n" +
                "    raio = 5.0;\n" +
                "    area = PI * raio * raio;\n" +
                "fimprograma";
        
        assertTrue(isValidCode(input), "Uso de constantes deve ser válido");
    }
    
    @Test
    @DisplayName("Teste - Atribuição a Constante (Erro)")
    public void testAtribuicaoConstante() {
        String input = "programa TesteErroConstante;\n" +
                "const MAX: inteiro = 100;\n" +
                "inicio\n" +
                "    MAX = 200;\n" +
                "fimprograma";
        
        assertFalse(isValidCode(input), "Atribuição a constante deve ser erro");
    }
} 