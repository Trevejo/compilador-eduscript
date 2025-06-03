package br.edu.compiladores.eduscript;

import java.util.*;

/**
 * Tabela de símbolos para a linguagem EduScript.
 * Gerencia escopos aninhados e informações sobre variáveis, funções e constantes.
 */
public class SymbolTable {
    
    /**
     * Representa um símbolo na tabela de símbolos
     */
    public static class Symbol {
        private final String name;
        private final SymbolType type;
        private final DataType dataType;
        private final boolean isConstant;
        private final List<DataType> parameters; // Para funções
        private Object value; // Para constantes
        
        public Symbol(String name, SymbolType type, DataType dataType) {
            this(name, type, dataType, false, new ArrayList<>());
        }
        
        public Symbol(String name, SymbolType type, DataType dataType, boolean isConstant, List<DataType> parameters) {
            this.name = name;
            this.type = type;
            this.dataType = dataType;
            this.isConstant = isConstant;
            this.parameters = parameters != null ? parameters : new ArrayList<>();
        }
        
        // Getters
        public String getName() { return name; }
        public SymbolType getType() { return type; }
        public DataType getDataType() { return dataType; }
        public boolean isConstant() { return isConstant; }
        public List<DataType> getParameters() { return parameters; }
        public Object getValue() { return value; }
        
        // Setters
        public void setValue(Object value) { this.value = value; }
        
        @Override
        public String toString() {
            return String.format("Symbol{name='%s', type=%s, dataType=%s, isConstant=%s}", 
                    name, type, dataType, isConstant);
        }
    }
    
    /**
     * Tipos de símbolos
     */
    public enum SymbolType {
        VARIABLE,
        CONSTANT,
        FUNCTION,
        PROCEDURE,
        PARAMETER
    }
    
    /**
     * Tipos de dados da linguagem
     */
    public enum DataType {
        INTEGER,
        REAL,
        BOOLEAN,
        TEXT,
        ARRAY,
        RECORD,
        VOID
    }
    
    // Pilha de escopos (cada escopo é um mapa de nome -> símbolo)
    private final Stack<Map<String, Symbol>> scopes;
    private int currentLevel;
    
    /**
     * Construtor da tabela de símbolos
     */
    public SymbolTable() {
        this.scopes = new Stack<>();
        this.currentLevel = 0;
        // Inicia com escopo global
        enterScope();
    }
    
    /**
     * Entra em um novo escopo
     */
    public void enterScope() {
        scopes.push(new HashMap<>());
        currentLevel++;
    }
    
    /**
     * Sai do escopo atual
     */
    public void exitScope() {
        if (scopes.size() > 1) { // Mantém sempre o escopo global
            scopes.pop();
            currentLevel--;
        }
    }
    
    /**
     * Declara um novo símbolo no escopo atual
     */
    public boolean declare(String name, SymbolType type, DataType dataType) {
        return declare(name, type, dataType, false, null);
    }
    
    /**
     * Declara um novo símbolo no escopo atual com parâmetros (para funções)
     */
    public boolean declare(String name, SymbolType type, DataType dataType, boolean isConstant, List<DataType> parameters) {
        if (isDeclaredInCurrentScope(name)) {
            return false; // Já declarado no escopo atual
        }
        
        Symbol symbol = new Symbol(name, type, dataType, isConstant, parameters);
        getCurrentScope().put(name, symbol);
        return true;
    }
    
    /**
     * Busca um símbolo em todos os escopos (do mais interno para o mais externo)
     */
    public Symbol lookup(String name) {
        // Busca do escopo mais interno para o mais externo
        for (int i = scopes.size() - 1; i >= 0; i--) {
            Map<String, Symbol> scope = scopes.get(i);
            if (scope.containsKey(name)) {
                return scope.get(name);
            }
        }
        return null; // Não encontrado
    }
    
    /**
     * Verifica se um símbolo está declarado no escopo atual
     */
    public boolean isDeclaredInCurrentScope(String name) {
        return getCurrentScope().containsKey(name);
    }
    
    /**
     * Verifica se um símbolo está declarado em qualquer escopo
     */
    public boolean isDeclared(String name) {
        return lookup(name) != null;
    }
    
    /**
     * Obtém o escopo atual
     */
    private Map<String, Symbol> getCurrentScope() {
        return scopes.peek();
    }
    
    /**
     * Obtém o nível do escopo atual
     */
    public int getCurrentLevel() {
        return currentLevel;
    }
    
    /**
     * Obtém todos os símbolos do escopo atual
     */
    public Map<String, Symbol> getCurrentScopeSymbols() {
        return new HashMap<>(getCurrentScope());
    }
    
    /**
     * Obtém todos os símbolos de todos os escopos
     */
    public List<Symbol> getAllSymbols() {
        List<Symbol> allSymbols = new ArrayList<>();
        for (Map<String, Symbol> scope : scopes) {
            allSymbols.addAll(scope.values());
        }
        return allSymbols;
    }
    
    /**
     * Remove um símbolo do escopo atual
     */
    public boolean remove(String name) {
        return getCurrentScope().remove(name) != null;
    }
    
    /**
     * Converte string de tipo para DataType enum
     */
    public static DataType stringToDataType(String typeStr) {
        switch (typeStr.toLowerCase()) {
            case "inteiro": return DataType.INTEGER;
            case "real": return DataType.REAL;
            case "logico": return DataType.BOOLEAN;
            case "texto": return DataType.TEXT;
            case "array": return DataType.ARRAY;
            case "registro": return DataType.RECORD;
            default: return DataType.VOID;
        }
    }
    
    /**
     * Converte DataType enum para string
     */
    public static String dataTypeToString(DataType dataType) {
        switch (dataType) {
            case INTEGER: return "inteiro";
            case REAL: return "real";
            case BOOLEAN: return "logico";
            case TEXT: return "texto";
            case ARRAY: return "array";
            case RECORD: return "registro";
            case VOID: return "void";
            default: return "unknown";
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SymbolTable{\n");
        for (int i = 0; i < scopes.size(); i++) {
            sb.append("  Scope Level ").append(i).append(": ");
            sb.append(scopes.get(i).values()).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
} 