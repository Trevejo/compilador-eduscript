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
 * Testes unitários avançados para funcionalidades específicas do EduScript.
 * Testes focados em casos complexos e situações especiais.
 */
public class TestEduScriptAdvanced {

    // ========== TESTES DE ARRAYS ==========
    
    @Test
    @DisplayName("Teste - Arrays Unidimensionais")
    public void testArraysUnidimensionais() {
        String input = "programa TesteArrays1D;\n" +
                "var numeros: array[10] de inteiro;\n" +
                "var i: inteiro;\n" +
                "inicio\n" +
                "    para i = 0 ate 9 passo 1 faca\n" +
                "        numeros[i] = i * 2;\n" +
                "    fimpara\n" +
                "    escrever(\"Elemento 5: \", numeros[5]);\n" +
                "fimprograma";
        
        assertTrue(isValidCode(input), "Arrays unidimensionais devem ser válidos");
    }
    
    @Test
    @DisplayName("Teste - Arrays Bidimensionais")
    public void testArraysBidimensionais() {
        String input = "programa TesteArrays2D;\n" +
                "var matriz: array[3, 3] de inteiro;\n" +
                "var i, j: inteiro;\n" +
                "inicio\n" +
                "    para i = 0 ate 2 passo 1 faca\n" +
                "        para j = 0 ate 2 passo 1 faca\n" +
                "            matriz[i, j] = i + j;\n" +
                "        fimpara\n" +
                "    fimpara\n" +
                "    escrever(\"Elemento [1,1]: \", matriz[1, 1]);\n" +
                "fimprograma";
        
        assertTrue(isValidCode(input), "Arrays bidimensionais devem ser válidos");
    }
    
    @Test
    @DisplayName("Teste - Array com Índice Inválido")
    public void testArrayIndiceInvalido() {
        String input = "programa TesteArrayIndiceInvalido;\n" +
                "var lista: array[5] de inteiro;\n" +
                "var texto: texto;\n" +
                "inicio\n" +
                "    lista[texto] = 10;\n" +
                "fimprograma";
        
        assertFalse(isValidCode(input), "Uso de índice não-inteiro deve ser erro");
    }

    // ========== TESTES DE PROCEDIMENTOS ==========
    
    @Test
    @DisplayName("Teste - Procedimentos Simples")
    public void testProcedimentosSimples() {
        String input = "programa TesteProcedimentos;\n" +
                "\n" +
                "procedimento imprimirMensagem(msg: texto)\n" +
                "inicio\n" +
                "    escrever(\"Mensagem: \", msg);\n" +
                "fim\n" +
                "\n" +
                "procedimento incrementar(ref valor: inteiro)\n" +
                "inicio\n" +
                "    valor = valor + 1;\n" +
                "fim\n" +
                "\n" +
                "var numero: inteiro;\n" +
                "\n" +
                "inicio\n" +
                "    numero = 10;\n" +
                "    imprimirMensagem(\"Olá Mundo\");\n" +
                "    incrementar(numero);\n" +
                "    escrever(\"Número incrementado: \", numero);\n" +
                "fimprograma";
        
        assertTrue(isValidCode(input), "Procedimentos simples devem ser válidos");
    }
    
    @Test
    @DisplayName("Teste - Passagem por Referência")
    public void testPassagemReferencia() {
        String input = "programa TesteReferencia;\n" +
                "\n" +
                "procedimento trocar(ref a: inteiro, ref b: inteiro)\n" +
                "var temp: inteiro;\n" +
                "inicio\n" +
                "    temp = a;\n" +
                "    a = b;\n" +
                "    b = temp;\n" +
                "fim\n" +
                "\n" +
                "var x, y: inteiro;\n" +
                "\n" +
                "inicio\n" +
                "    x = 10;\n" +
                "    y = 20;\n" +
                "    trocar(x, y);\n" +
                "    escrever(\"x=\", x, \" y=\", y);\n" +
                "fimprograma";
        
        assertTrue(isValidCode(input), "Passagem por referência deve ser válida");
    }

    // ========== TESTES DE RECURSÃO ==========
    
    @Test
    @DisplayName("Teste - Função Recursiva Fibonacci")
    public void testRecursaoFibonacci() {
        String input = "programa TesteFibonacci;\n" +
                "\n" +
                "funcao fibonacci(n: inteiro): inteiro\n" +
                "inicio\n" +
                "    se n <= 1 entao\n" +
                "        retornar n;\n" +
                "    senao\n" +
                "        retornar fibonacci(n - 1) + fibonacci(n - 2);\n" +
                "    fimse\n" +
                "fim\n" +
                "\n" +
                "var resultado: inteiro;\n" +
                "\n" +
                "inicio\n" +
                "    resultado = fibonacci(8);\n" +
                "    escrever(\"Fibonacci(8) = \", resultado);\n" +
                "fimprograma";
        
        assertTrue(isValidCode(input), "Função recursiva deve ser válida");
    }
    
    @Test
    @DisplayName("Teste - Função Recursiva Fatorial")
    public void testRecursaoFatorial() {
        String input = "programa TesteFatorial;\n" +
                "\n" +
                "funcao fatorial(n: inteiro): inteiro\n" +
                "inicio\n" +
                "    se n <= 1 entao\n" +
                "        retornar 1;\n" +
                "    senao\n" +
                "        retornar n * fatorial(n - 1);\n" +
                "    fimse\n" +
                "fim\n" +
                "\n" +
                "var num: inteiro;\n" +
                "var fat: inteiro;\n" +
                "\n" +
                "inicio\n" +
                "    num = 5;\n" +
                "    fat = fatorial(num);\n" +
                "    escrever(\"Fatorial de \", num, \" = \", fat);\n" +
                "fimprograma";
        
        assertTrue(isValidCode(input), "Função fatorial recursiva deve ser válida");
    }

    // ========== TESTES DE EXPRESSÕES COMPLEXAS ==========
    
    @Test
    @DisplayName("Teste - Expressões Complexas com Precedência")
    public void testExpressoesComplexas() {
        String input = "programa TesteExpressoesComplexas;\n" +
                "var a, b, c, d: inteiro;\n" +
                "var resultado: inteiro;\n" +
                "var condicao: logico;\n" +
                "inicio\n" +
                "    a = 10;\n" +
                "    b = 5;\n" +
                "    c = 3;\n" +
                "    d = 2;\n" +
                "    resultado = a + b * c - d * 2;\n" +
                "    condicao = (a > b) e ((c < d) ou (a = 10));\n" +
                "    resultado = (a + b) * (c - d);\n" +
                "    escrever(\"Resultado: \", resultado);\n" +
                "fimprograma";
        
        assertTrue(isValidCode(input), "Expressões complexas devem ser válidas");
    }
    
    @Test
    @DisplayName("Teste - Operadores Unários")
    public void testOperadoresUnarios() {
        String input = "programa TesteUnarios;\n" +
                "var positivo, negativo: inteiro;\n" +
                "var verdade, mentira: logico;\n" +
                "inicio\n" +
                "    positivo = +10;\n" +
                "    negativo = -5;\n" +
                "    verdade = verdadeiro;\n" +
                "    mentira = nao verdade;\n" +
                "    escrever(\"Positivo: \", positivo);\n" +
                "    escrever(\"Negativo: \", negativo);\n" +
                "    escrever(\"Negação: \", mentira);\n" +
                "fimprograma";
        
        assertTrue(isValidCode(input), "Operadores unários devem ser válidos");
    }

    // ========== TESTES DE CONVERSÃO DE TIPOS ==========
    
    @Test
    @DisplayName("Teste - Conversão Implícita Inteiro para Real")
    public void testConversaoImplicita() {
        String input = "programa TesteConversao;\n" +
                "var inteiro_var: inteiro;\n" +
                "var real_var: real;\n" +
                "inicio\n" +
                "    inteiro_var = 10;\n" +
                "    real_var = inteiro_var;\n" +
                "    real_var = 3.14 + inteiro_var;\n" +
                "    escrever(\"Real: \", real_var);\n" +
                "fimprograma";
        
        assertTrue(isValidCode(input), "Conversão implícita inteiro->real deve ser válida");
    }
    
    @Test
    @DisplayName("Teste - Conversão Inválida Real para Inteiro")
    public void testConversaoInvalida() {
        String input = "programa TesteConversaoInvalida;\n" +
                "var inteiro_var: inteiro;\n" +
                "var real_var: real;\n" +
                "inicio\n" +
                "    real_var = 3.14;\n" +
                "    inteiro_var = real_var;\n" +
                "fimprograma";
        
        assertFalse(isValidCode(input), "Conversão real->inteiro deve ser erro");
    }

    // ========== TESTES DE CASOS EXTREMOS ==========
    
    @Test
    @DisplayName("Teste - Função sem Parâmetros")
    public void testFuncaoSemParametros() {
        String input = "programa TesteSemParametros;\n" +
                "\n" +
                "funcao obterConstante(): inteiro\n" +
                "inicio\n" +
                "    retornar 42;\n" +
                "fim\n" +
                "\n" +
                "var valor: inteiro;\n" +
                "\n" +
                "inicio\n" +
                "    valor = obterConstante();\n" +
                "    escrever(\"Constante: \", valor);\n" +
                "fimprograma";
        
        assertTrue(isValidCode(input), "Função sem parâmetros deve ser válida");
    }
    
    @Test
    @DisplayName("Teste - Múltiplas Declarações no Mesmo Escopo")
    public void testMultiplasDeclaracoes() {
        String input = "programa TesteMultiplasDeclaracoes;\n" +
                "var a, b, c: inteiro;\n" +
                "var x, y: real;\n" +
                "var nome, sobrenome: texto;\n" +
                "var ativo, inativo: logico;\n" +
                "\n" +
                "const MAX: inteiro = 100;\n" +
                "const PI: real = 3.14159;\n" +
                "const TITULO: texto = \"Sistema\";\n" +
                "\n" +
                "inicio\n" +
                "    a = 1; b = 2; c = 3;\n" +
                "    x = 1.5; y = 2.5;\n" +
                "    nome = \"João\"; sobrenome = \"Silva\";\n" +
                "    ativo = verdadeiro; inativo = falso;\n" +
                "    escrever(\"Teste concluído\");\n" +
                "fimprograma";
        
        assertTrue(isValidCode(input), "Múltiplas declarações devem ser válidas");
    }
    
    @Test
    @DisplayName("Teste - Chamadas de Função em Expressões")
    public void testChamadasFuncaoExpressoes() {
        String input = "programa TesteChamadasExpressoes;\n" +
                "\n" +
                "funcao quadrado(n: inteiro): inteiro\n" +
                "inicio\n" +
                "    retornar n * n;\n" +
                "fim\n" +
                "\n" +
                "funcao cubo(n: inteiro): inteiro\n" +
                "inicio\n" +
                "    retornar n * n * n;\n" +
                "fim\n" +
                "\n" +
                "var resultado: inteiro;\n" +
                "\n" +
                "inicio\n" +
                "    resultado = quadrado(3) + cubo(2);\n" +
                "    resultado = quadrado(quadrado(2));\n" +
                "    escrever(\"Resultado: \", resultado);\n" +
                "fimprograma";
        
        assertTrue(isValidCode(input), "Chamadas de função em expressões devem ser válidas");
    }

    // ========== TESTES DE VALIDAÇÃO E/S ==========
    
    @Test
    @DisplayName("Teste - Comandos de E/S Complexos")
    public void testEntradaSaidaComplexos() {
        String input = "programa TesteESComplexo;\n" +
                "var nome: texto;\n" +
                "var idade: inteiro;\n" +
                "var altura: real;\n" +
                "inicio\n" +
                "    escrever(\"=== Cadastro de Pessoa ===\");\n" +
                "    escrever(\"Digite seu nome: \");\n" +
                "    ler(nome);\n" +
                "    escrever(\"Digite sua idade: \");\n" +
                "    ler(idade);\n" +
                "    escrever(\"Digite sua altura: \");\n" +
                "    ler(altura);\n" +
                "    escrever(\"Dados cadastrados:\");\n" +
                "    escrever(\"Nome: \", nome);\n" +
                "    escrever(\"Idade: \", idade, \" anos\");\n" +
                "    escrever(\"Altura: \", altura, \" metros\");\n" +
                "fimprograma";
        
        assertTrue(isValidCode(input), "Comandos de E/S complexos devem ser válidos");
    }

    // ========== TESTES DE PERFORMANCE ==========
    
    @Test
    @DisplayName("Teste - Programa Grande")
    public void testProgramaGrande() {
        StringBuilder input = new StringBuilder();
        input.append("programa TesteGrande;\n");
        
        // Gera muitas declarações
        for (int i = 0; i < 50; i++) {
            input.append("var var").append(i).append(": inteiro;\n");
        }
        
        input.append("inicio\n");
        
        // Gera muitas atribuições
        for (int i = 0; i < 50; i++) {
            input.append("var").append(i).append(" = ").append(i).append(";\n");
        }
        
        input.append("fimprograma\n");
        
        // Teste de performance: deve conseguir processar programa grande rapidamente
        long startTime = System.currentTimeMillis();
        boolean valid = isValidCode(input.toString());
        long endTime = System.currentTimeMillis();
        
        assertTrue(valid, "Programa grande deve ser válido");
        assertTrue((endTime - startTime) < 5000, "Parsing deve ser rápido (< 5s)");
    }
    
    @Test
    @DisplayName("Teste - Expressão Muito Aninhada")
    public void testExpressaoMuitoAninhada() {
        String expression = "1";
        for (int i = 0; i < 15; i++) {
            expression = "(" + expression + " + 1)";
        }
        
        String input = "programa TesteAninhado;\n" +
                "var resultado: inteiro;\n" +
                "inicio\n" +
                "    resultado = " + expression + ";\n" +
                "fimprograma";
        
        assertTrue(isValidCode(input), "Expressão muito aninhada deve ser válida");
    }

    // ========== TESTES DE STRESS E VERIFICAÇÃO ==========
    
    @Test
    @DisplayName("Teste - Muitas Chamadas de Função")
    public void testMuitasChamadasFuncao() {
        StringBuilder input = new StringBuilder();
        input.append("programa TesteMuitasChamadas;\n");
        
        // Declara função simples
        input.append("funcao identidade(x: inteiro): inteiro\n");
        input.append("inicio\n");
        input.append("    retornar x;\n");
        input.append("fim\n");
        
        input.append("var resultado: inteiro;\n");
        input.append("inicio\n");
        
        // Cria cadeia de chamadas: identidade(identidade(identidade(...)))
        String call = "1";
        for (int i = 0; i < 10; i++) {
            call = "identidade(" + call + ")";
        }
        input.append("resultado = ").append(call).append(";\n");
        
        input.append("fimprograma\n");
        
        assertTrue(isValidCode(input.toString()), "Muitas chamadas de função devem ser válidas");
    }
    
    @Test
    @DisplayName("Teste - Validação de Tokens Especiais")
    public void testTokensEspeciais() {
        String input = "programa TesteTokens;\n" +
                "var result: logico;\n" +
                "inicio\n" +
                "    result = verdadeiro e falso;\n" +
                "    result = nao result;\n" +
                "    result = (5 <> 3) ou (2 <= 4);\n" +
                "    result = (10 >= 5) e (7 < 9);\n" +
                "fimprograma";
        
        assertTrue(isValidCode(input), "Tokens especiais devem ser reconhecidos");
    }
    
    @Test
    @DisplayName("Teste - Verificação de Escopo Local")
    public void testEscopoLocal() {
        String input = "programa TesteEscopoLocal;\n" +
                "var global: inteiro;\n" +
                "\n" +
                "funcao testeEscopo(param: inteiro): inteiro\n" +
                "var local: inteiro;\n" +
                "inicio\n" +
                "    local = param + global;\n" +
                "    retornar local;\n" +
                "fim\n" +
                "\n" +
                "inicio\n" +
                "    global = 100;\n" +
                "    escrever(\"Resultado: \", testeEscopo(50));\n" +
                "fimprograma";
        
        assertTrue(isValidCode(input), "Escopo local deve funcionar corretamente");
    }

    // ========== MÉTODOS AUXILIARES ==========
    
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
            ANTLRInputStream inputStream = new ANTLRInputStream(code);
            EduScriptLexer lexer = new EduScriptLexer(inputStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            EduScriptParser parser = new EduScriptParser(tokens);
            
            // Verifica erros sintáticos
            if (parser.getNumberOfSyntaxErrors() > 0) {
                return false;
            }
            
            ParseTree tree = parser.programa();
            if (tree == null) {
                return false;
            }
            
            // Verifica erros semânticos
            SemanticAnalyzer analyzer = new SemanticAnalyzer();
            analyzer.visit(tree);
            
            return !analyzer.hasErrors();
        } catch (Exception e) {
            return false;
        }
    }
    
    /**
     * Método auxiliar para contar tokens em uma string
     */
    private int countTokens(String input) {
        ANTLRInputStream inputStream = new ANTLRInputStream(input);
        EduScriptLexer lexer = new EduScriptLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();
        return tokens.getTokens().size() - 1; // -1 para excluir EOF
    }
    
    /**
     * Método auxiliar para verificar se uma expressão tem tipo específico
     */
    private boolean expressionHasType(String expression, DataType expectedType) {
        String program = "programa TesteExpressao;\n" +
                "var x: inteiro;\n" +
                "var y: real;\n" +
                "var z: logico;\n" +
                "var s: texto;\n" +
                "inicio\n" +
                "    x = " + expression + ";\n" +
                "fimprograma";
        
        try {
            SemanticAnalyzer analyzer = analyzeCode(program);
            return !analyzer.hasErrors();
        } catch (Exception e) {
            return false;
        }
    }
} 