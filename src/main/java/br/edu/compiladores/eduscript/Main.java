package br.edu.compiladores.eduscript;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import br.edu.compiladores.eduscript.generated.*;

import java.io.*;
import java.nio.file.*;
import java.util.List;

/**
 * Classe principal do compilador/interpretador EduScript.
 * Ponto de entrada do programa que coordena todas as fases de compilação.
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
            System.out.println("\nExecutando exemplo padrão...\n");
            runDefaultExample();
            return;
        }
        
        String command = args[0];
        
        switch (command.toLowerCase()) {
            case "compile":
            case "run":
                if (args.length < 2) {
                    System.err.println("Erro: Nome do arquivo não especificado");
                    printUsage();
                    System.exit(1);
                }
                processFile(args[1], command.equals("run"));
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
     * Processa um arquivo EduScript
     */
    private static void processFile(String filename, boolean execute) {
        try {
            System.out.println("Processando arquivo: " + filename);
            
            // Verifica se o arquivo existe
            Path filePath = Paths.get(filename);
            if (!Files.exists(filePath)) {
                System.err.println("Erro: Arquivo não encontrado: " + filename);
                System.exit(1);
            }
            
            // Lê o conteúdo do arquivo
            String input = new String(Files.readAllBytes(filePath));
            System.out.println("Conteúdo do arquivo lido com sucesso.");
            
            // Fase 1: Análise Léxica
            System.out.println("\n=== FASE 1: ANALISE LEXICA ===");
            ANTLRInputStream inputStream = new ANTLRInputStream(input);
            EduScriptLexer lexer = new EduScriptLexer(inputStream);
            
            // Verifica erros léxicos
            lexer.removeErrorListeners();
            lexer.addErrorListener(new EduScriptErrorListener("Lexico"));
            
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            System.out.println("Analise lexica concluida com sucesso.");
            
            // Fase 2: Análise Sintática
            System.out.println("\n=== FASE 2: ANALISE SINTATICA ===");
            EduScriptParser parser = new EduScriptParser(tokens);
            
            // Verifica erros sintáticos
            parser.removeErrorListeners();
            parser.addErrorListener(new EduScriptErrorListener("Sintatico"));
            
            ParseTree tree = parser.programa();
            System.out.println("Analise sintatica concluida com sucesso.");
            
            // Debug: Mostra a árvore sintática
            if (System.getProperty("debug") != null) {
                System.out.println("\nArvore Sintatica:");
                System.out.println(tree.toStringTree(parser));
            }
            
            // Fase 3: Análise Semântica
            System.out.println("\n=== FASE 3: ANALISE SEMANTICA ===");
            SemanticAnalyzer semanticAnalyzer = new SemanticAnalyzer();
            semanticAnalyzer.visit(tree);
            
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
                System.out.println("\nTabela de Símbolos:");
                System.out.println(semanticAnalyzer.getSymbolTable());
            }
            
            // Fase 4: Execução/Interpretação
            if (execute) {
                System.out.println("\n=== FASE 4: EXECUÇÃO ===");
                Interpreter interpreter = new Interpreter();
                
                String programName = extractProgramName(filename);
                interpreter.execute(programName);
                
                interpreter.close();
            } else {
                System.out.println("\nCompilação concluída com sucesso!");
                System.out.println("Use 'run " + filename + "' para executar o programa.");
            }
            
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
     * Executa um exemplo padrão para demonstração
     */
    private static void runDefaultExample() {
        System.out.println("Demonstração do interpretador EduScript:");
        System.out.println("Simulando execução do programa de fatorial...\n");
        
        Interpreter interpreter = new Interpreter();
        interpreter.execute("ExemploFatorial");
        interpreter.close();
        
        System.out.println("\nPara usar arquivos reais, utilize:");
        System.out.println("  java -jar eduscript.jar run arquivo.eds");
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
        System.out.println("  java -jar eduscript.jar <comando> [arquivo]");
        System.out.println();
        System.out.println("Comandos:");
        System.out.println("  compile <arquivo>  - Compila o arquivo EduScript");
        System.out.println("  run <arquivo>      - Compila e executa o arquivo EduScript");
        System.out.println("  help               - Mostra esta mensagem de ajuda");
        System.out.println("  version            - Mostra a versão do programa");
        System.out.println();
        System.out.println("Exemplos:");
        System.out.println("  java -jar eduscript.jar run examples/ExemploFatorial.eds");
        System.out.println("  java -jar eduscript.jar compile meuPrograma.eds");
        System.out.println();
        System.out.println("Opções de debug:");
        System.out.println("  -Ddebug=true       - Mostra informações detalhadas de debug");
        System.out.println();
        System.out.println("Exemplo com debug:");
        System.out.println("  java -Ddebug=true -jar eduscript.jar run arquivo.eds");
    }
    
    /**
     * Imprime informações de versão
     */
    private static void printVersion() {
        System.out.println(PROGRAM_NAME);
        System.out.println("Versão: " + VERSION);
        System.out.println("Linguagem: Java " + System.getProperty("java.version"));
        System.out.println("ANTLR: 4.13.1");
        System.out.println();
        System.out.println("Desenvolvido para a disciplina de Compiladores");
        System.out.println("Curso: Engenharia da Computação");
    }
    
    /**
     * Listener customizado para capturar erros do ANTLR
     */
    private static class EduScriptErrorListener extends BaseErrorListener {
        
        private final String phase;
        
        public EduScriptErrorListener(String phase) {
            this.phase = phase;
        }
        
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer,
                              Object offendingSymbol,
                              int line,
                              int charPositionInLine,
                              String msg,
                              RecognitionException e) {
            
            System.err.println("Erro " + phase + " [linha " + line + ":" + charPositionInLine + "] " + msg);
            
            if (offendingSymbol instanceof Token) {
                Token token = (Token) offendingSymbol;
                System.err.println("  Token problemático: '" + token.getText() + "'");
            }
            
            System.exit(1);
        }
    }
} 