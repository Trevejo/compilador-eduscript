package br.edu.compiladores.eduscript;

import br.edu.compiladores.eduscript.SymbolTable.*;
import java.util.*;
import java.io.*;

/**
 * Interpretador para a linguagem EduScript.
 * Executa programas EduScript após análise léxica, sintática e semântica.
 */
public class Interpreter {
    
    private final SymbolTable symbolTable;
    private final Map<String, Object> variables;
    private final Map<String, Function> functions;
    private final Scanner scanner;
    private final PrintWriter output;
    private Object returnValue;
    private boolean hasReturned;
    
    /**
     * Representa uma função definida pelo usuário
     */
    public static class Function {
        private final String name;
        private final List<String> parameters;
        private final DataType returnType;
        private Object astNode; // Guardará o nó AST da função
        
        public Function(String name, List<String> parameters, DataType returnType) {
            this.name = name;
            this.parameters = parameters;
            this.returnType = returnType;
        }
        
        public String getName() { return name; }
        public List<String> getParameters() { return parameters; }
        public DataType getReturnType() { return returnType; }
        public Object getAstNode() { return astNode; }
        public void setAstNode(Object astNode) { this.astNode = astNode; }
    }
    
    /**
     * Construtor do interpretador
     */
    public Interpreter() {
        this.symbolTable = new SymbolTable();
        this.variables = new HashMap<>();
        this.functions = new HashMap<>();
        this.scanner = new Scanner(System.in);
        this.output = new PrintWriter(System.out, true);
        this.returnValue = null;
        this.hasReturned = false;
        
        // Registra funções built-in
        registerBuiltInFunctions();
    }
    
    /**
     * Registra funções built-in da linguagem
     */
    private void registerBuiltInFunctions() {
        // Função ler
        functions.put("ler", new Function("ler", Arrays.asList("var"), DataType.VOID));
        
        // Função escrever
        functions.put("escrever", new Function("escrever", new ArrayList<>(), DataType.VOID));
    }
    
    /**
     * Executa um programa EduScript (simulado)
     * Na implementação completa, isso trabalharia com a AST gerada pelo ANTLR
     */
    public void execute(String programName) {
        System.out.println("=== Executando programa: " + programName + " ===");
        
        // Por enquanto, apenas uma execução simulada
        // Na implementação real, isso percorreria a AST
        executeSimpleExample();
    }
    
    /**
     * Execução simulada de um programa simples
     */
    private void executeSimpleExample() {
        System.out.println("Simulação de execução do programa EduScript:");
        System.out.println("(Esta é uma implementação simplificada para demonstração)");
        
        // Simula declaração de variáveis
        declareVariable("numero", DataType.INTEGER, 0);
        declareVariable("resultado", DataType.INTEGER, 0);
        
        // Simula função fatorial
        declareFunction("fatorial", Arrays.asList("n"), DataType.INTEGER);
        
        // Simula entrada de dados
        System.out.print("Digite um número para calcular o fatorial: ");
        if (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            setVariable("numero", input);
            
            // Calcula fatorial
            int factorial = calculateFactorial(input);
            setVariable("resultado", factorial);
            
            // Simula saída
            System.out.println("O fatorial de " + input + " é " + factorial);
        } else {
            System.out.println("Entrada inválida!");
        }
    }
    
    /**
     * Declara uma variável
     */
    public void declareVariable(String name, DataType type, Object value) {
        symbolTable.declare(name, SymbolType.VARIABLE, type);
        variables.put(name, value);
    }
    
    /**
     * Declara uma função
     */
    public void declareFunction(String name, List<String> parameters, DataType returnType) {
        symbolTable.declare(name, SymbolType.FUNCTION, returnType, false, 
                           parameters.stream().map(p -> DataType.INTEGER).collect(ArrayList::new, ArrayList::add, ArrayList::addAll));
        functions.put(name, new Function(name, parameters, returnType));
    }
    
    /**
     * Define o valor de uma variável
     */
    public void setVariable(String name, Object value) {
        if (variables.containsKey(name)) {
            variables.put(name, value);
        } else {
            System.err.println("Erro: Variável '" + name + "' não foi declarada");
        }
    }
    
    /**
     * Obtém o valor de uma variável
     */
    public Object getVariable(String name) {
        return variables.get(name);
    }
    
    /**
     * Chama uma função
     */
    public Object callFunction(String name, List<Object> arguments) {
        Function function = functions.get(name);
        if (function == null) {
            System.err.println("Erro: Função '" + name + "' não foi declarada");
            return null;
        }
        
        // Implementação específica para funções built-in
        switch (name) {
            case "ler":
                return handleReadFunction(arguments);
            case "escrever":
                return handleWriteFunction(arguments);
            default:
                return executeUserFunction(function, arguments);
        }
    }
    
    /**
     * Manipula a função ler
     */
    private Object handleReadFunction(List<Object> arguments) {
        if (arguments.size() != 1) {
            System.err.println("Erro: Função 'ler' espera exatamente 1 argumento");
            return null;
        }
        
        String varName = arguments.get(0).toString();
        System.out.print("Digite um valor para " + varName + ": ");
        
        if (scanner.hasNextInt()) {
            int value = scanner.nextInt();
            setVariable(varName, value);
            return value;
        } else {
            System.err.println("Erro: Entrada inválida");
            return null;
        }
    }
    
    /**
     * Manipula a função escrever
     */
    private Object handleWriteFunction(List<Object> arguments) {
        for (Object arg : arguments) {
            System.out.print(arg);
        }
        System.out.println();
        return null;
    }
    
    /**
     * Executa uma função definida pelo usuário
     */
    private Object executeUserFunction(Function function, List<Object> arguments) {
        // Salva contexto atual
        Map<String, Object> savedVariables = new HashMap<>(variables);
        symbolTable.enterScope();
        
        try {
            // Declara e inicializa parâmetros
            List<String> parameters = function.getParameters();
            for (int i = 0; i < parameters.size() && i < arguments.size(); i++) {
                String paramName = parameters.get(i);
                Object paramValue = arguments.get(i);
                declareVariable(paramName, DataType.INTEGER, paramValue);
            }
            
            // Executa corpo da função (simplificado)
            if ("fatorial".equals(function.getName())) {
                return calculateFactorial((Integer) arguments.get(0));
            }
            
            return returnValue;
        } finally {
            // Restaura contexto
            symbolTable.exitScope();
            variables.clear();
            variables.putAll(savedVariables);
            hasReturned = false;
            returnValue = null;
        }
    }
    
    /**
     * Calcula fatorial (função auxiliar)
     */
    private int calculateFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
    
    /**
     * Avalia uma expressão (simplificado)
     */
    public Object evaluateExpression(String expression) {
        // Implementação muito simplificada
        // Na versão real, isso trabalharia com a AST da expressão
        
        try {
            // Tenta interpretar como número
            if (expression.matches("\\d+")) {
                return Integer.parseInt(expression);
            }
            
            // Tenta interpretar como variável
            if (variables.containsKey(expression)) {
                return variables.get(expression);
            }
            
            // Expressões mais complexas exigiriam análise da AST
            return null;
        } catch (Exception e) {
            System.err.println("Erro ao avaliar expressão: " + expression);
            return null;
        }
    }
    
    /**
     * Executa um comando de atribuição
     */
    public void executeAssignment(String variable, String expression) {
        Object value = evaluateExpression(expression);
        if (value != null) {
            setVariable(variable, value);
        }
    }
    
    /**
     * Executa um comando condicional (simplificado)
     */
    public void executeConditional(String condition, Runnable thenBlock, Runnable elseBlock) {
        Object conditionValue = evaluateExpression(condition);
        
        if (conditionValue instanceof Boolean) {
            if ((Boolean) conditionValue) {
                thenBlock.run();
            } else if (elseBlock != null) {
                elseBlock.run();
            }
        }
    }
    
    /**
     * Fecha recursos
     */
    public void close() {
        scanner.close();
        output.close();
    }
    
    /**
     * Obtém a tabela de símbolos
     */
    public SymbolTable getSymbolTable() {
        return symbolTable;
    }
    
    /**
     * Obtém o mapa de variáveis
     */
    public Map<String, Object> getVariables() {
        return new HashMap<>(variables);
    }
    
    /**
     * Obtém o mapa de funções
     */
    public Map<String, Function> getFunctions() {
        return new HashMap<>(functions);
    }
} 