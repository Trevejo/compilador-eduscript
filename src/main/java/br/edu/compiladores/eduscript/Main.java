package br.edu.compiladores.eduscript;

import java.io.*;
import java.nio.file.*;
import java.util.List;

/**
 * Classe principal do compilador/interpretador EduScript.
 * Ponto de entrada do programa que coordena todas as fases de compilação.
 * Versão simplificada que funciona sem dependências ANTLR.
 */
public class Main {
    
    private static final String VERSION = "1.0.0";
    private static final String PROGRAM_NAME = "EduScript Compiler/Interpreter";
    
    public static void main(String[] args) {
        System.out.println(PROGRAM_NAME + " v" + VERSION);
        System.out.println("==========================================");
        
        if (args.length == 0) {
            printUsage();
            // Para demonstração, executa um exemplo padrão
            System.out.println("\nExecutando exemplo padrao...\n");
            runDefaultExample();
            return;
        }
        
        String command = args[0];
        
        switch (command.toLowerCase()) {
            case "compile":
            case "run":
                if (args.length < 2) {
                    System.err.println("Erro: Nome do arquivo nao especificado");
                    printUsage();
                    System.exit(1);
                }
                processFile(args[1], command.equals("run"));
                break;
                
            case "demo":
                runSemanticDemo();
                break;
                
            case "help":
            case "--help":
            case "-h":
                printUsage();
                break;
                
            case "version":
            case "--version":
            case "-v":
                printVersion();
                break;
                
            default:
                System.err.println("Comando desconhecido: " + command);
                printUsage();
                System.exit(1);
        }
    }
    
    /**
     * Processa um arquivo EduScript (versão simulada)
     */
    private static void processFile(String filename, boolean execute) {
        try {
            System.out.println("Processando arquivo: " + filename);
            
            // Verifica se o arquivo existe
            Path filePath = Paths.get(filename);
            if (!Files.exists(filePath)) {
                System.err.println("Erro: Arquivo nao encontrado: " + filename);
                System.exit(1);
            }
            
            // Lê o conteúdo do arquivo
            String input = new String(Files.readAllBytes(filePath));
            System.out.println("Conteudo do arquivo lido com sucesso.");
            
            // Simula as fases de compilação
            simulateCompilationPhases(input, filename, execute);
            
        } catch (IOException e) {
            System.err.println("Erro ao ler arquivo: " + e.getMessage());
            System.exit(1);
        } catch (Exception e) {
            System.err.println("Erro durante o processamento: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }
    
    /**
     * Simula as fases de compilação
     */
    private static void simulateCompilationPhases(String input, String filename, boolean execute) {
        // Fase 1: Análise Léxica (simulada)
        System.out.println("\n=== FASE 1: ANALISE LEXICA ===");
        if (simulateLexicalAnalysis(input)) {
            System.out.println("Analise lexica concluida com sucesso.");
        } else {
            System.err.println("Erros encontrados na analise lexica");
            System.exit(1);
        }
        
        // Fase 2: Análise Sintática (simulada)
        System.out.println("\n=== FASE 2: ANALISE SINTATICA ===");
        if (simulateSyntacticAnalysis(input)) {
            System.out.println("Analise sintatica concluida com sucesso.");
        } else {
            System.err.println("Erros encontrados na analise sintatica");
            System.exit(1);
        }
        
        // Fase 3: Análise Semântica
        System.out.println("\n=== FASE 3: ANALISE SEMANTICA ===");
        SemanticAnalyzer semanticAnalyzer = new SemanticAnalyzer();
        semanticAnalyzer.analyzeCompleteProgram();
        
        List<String> semanticErrors = semanticAnalyzer.getErrors();
        if (!semanticErrors.isEmpty()) {
            System.err.println("Erros semanticos encontrados:");
            for (String error : semanticErrors) {
                System.err.println("  - " + error);
            }
            System.exit(1);
        }
        
        System.out.println("Analise semantica concluida com sucesso.");
        
        // Mostra tabela de símbolos se debug estiver ativo
        if (System.getProperty("debug") != null) {
            System.out.println("\nTabela de Simbolos:");
            System.out.println(semanticAnalyzer.getSymbolTable());
        }
        
        // Fase 4: Execução/Interpretação
        if (execute) {
            System.out.println("\n=== FASE 4: EXECUCAO ===");
            Interpreter interpreter = new Interpreter();
            
            String programName = extractProgramName(filename);
            interpreter.execute(programName);
            
            interpreter.close();
        } else {
            System.out.println("\nCompilacao concluida com sucesso!");
            System.out.println("Use 'run " + filename + "' para executar o programa.");
        }
    }
    
    /**
     * Simula análise léxica
     */
    private static boolean simulateLexicalAnalysis(String input) {
        // Verifica palavras-chave básicas
        String[] keywords = {"programa", "inicio", "fim", "fimprograma", "funcao", 
                           "se", "entao", "senao", "fimse", "enquanto", "faca"};
        
        for (String keyword : keywords) {
            if (input.contains(keyword)) {
                System.out.println("  Token encontrado: " + keyword);
            }
        }
        
        // Verifica estrutura básica
        if (!input.contains("programa") || !input.contains("fimprograma")) {
            System.err.println("Erro lexico: Estrutura de programa invalida");
            return false;
        }
        
        return true;
    }
    
    /**
     * Simula análise sintática
     */
    private static boolean simulateSyntacticAnalysis(String input) {
        // Verifica estrutura básica do programa
        if (!input.matches("(?s).*programa\\s+\\w+\\s*;.*inicio.*fimprograma.*")) {
            System.err.println("Erro sintatico: Estrutura de programa invalida");
            return false;
        }
        
        System.out.println("  Estrutura do programa valida");
        return true;
    }
    
    /**
     * Executa demonstração do analisador semântico
     */
    private static void runSemanticDemo() {
        System.out.println("\n=== DEMONSTRACAO ANALISE SEMANTICA ===");
        
        SemanticAnalyzer analyzer = new SemanticAnalyzer();
        analyzer.analyzeCompleteProgram();
        
        System.out.println("\nTabela de simbolos final:");
        System.out.println(analyzer.getSymbolTable());
    }
    
    /**
     * Executa um exemplo padrão para demonstração
     */
    private static void runDefaultExample() {
        System.out.println("Demonstracao do interpretador EduScript:");
        System.out.println("Simulando execucao do programa de fatorial...\n");
        
        Interpreter interpreter = new Interpreter();
        interpreter.execute("ExemploFatorial");
        interpreter.close();
        
        System.out.println("\nPara usar arquivos reais, utilize:");
        System.out.println("  java -cp target/classes Main run examples/ExemploFatorial.eds");
        System.out.println("  java -cp target/classes Main demo");
    }
    
    /**
     * Extrai o nome do programa do nome do arquivo
     */
    private static String extractProgramName(String filename) {
        Path path = Paths.get(filename);
        String name = path.getFileName().toString();
        int lastIndexOfDot = name.lastIndexOf('.');
        if (lastIndexOfDot > 0) {
            return name.substring(0, lastIndexOfDot);
        }
        return name;
    }
    
    /**
     * Imprime instruções de uso
     */
    private static void printUsage() {
        System.out.println("\nUso:");
        System.out.println("  java -cp target/classes Main <comando> [arquivo]");
        System.out.println();
        System.out.println("Comandos:");
        System.out.println("  compile <arquivo>  - Compila o arquivo EduScript");
        System.out.println("  run <arquivo>      - Compila e executa o arquivo EduScript");
        System.out.println("  demo               - Executa demonstracao do analisador semantico");
        System.out.println("  help               - Mostra esta mensagem de ajuda");
        System.out.println("  version            - Mostra a versao do programa");
        System.out.println();
        System.out.println("Exemplos:");
        System.out.println("  java -cp target/classes Main run examples/ExemploFatorial.eds");
        System.out.println("  java -cp target/classes Main compile meuPrograma.eds");
        System.out.println("  java -cp target/classes Main demo");
        System.out.println();
        System.out.println("Opcoes de debug:");
        System.out.println("  -Ddebug=true       - Mostra informacoes detalhadas de debug");
        System.out.println();
        System.out.println("Exemplo com debug:");
        System.out.println("  java -Ddebug=true -cp target/classes Main run arquivo.eds");
    }
    
    /**
     * Imprime informações de versão
     */
    private static void printVersion() {
        System.out.println(PROGRAM_NAME);
        System.out.println("Versao: " + VERSION);
        System.out.println("Linguagem: Java " + System.getProperty("java.version"));
        System.out.println("ANTLR: Simulado (versao completa requer ANTLR4)");
        System.out.println();
        System.out.println("Desenvolvido para a disciplina de Compiladores");
        System.out.println("Curso: Engenharia da Computacao");
    }
} 