import br.edu.compiladores.eduscript.*;
import br.edu.compiladores.eduscript.SymbolTable.*;

/**
 * Teste simples para demonstrar o funcionamento das classes EduScript
 */
public class TestEduScript {
    
    public static void main(String[] args) {
        System.out.println("=== Teste EduScript ===");
        
        // Teste da tabela de símbolos
        testSymbolTable();
        
        // Teste do interpretador
        testInterpreter();
        
        System.out.println("=== Fim dos testes ===");
    }
    
    private static void testSymbolTable() {
        System.out.println("\n--- Testando Tabela de Símbolos ---");
        
        SymbolTable table = new SymbolTable();
        
        // Declara algumas variáveis
        boolean success1 = table.declare("numero", SymbolType.VARIABLE, DataType.INTEGER);
        boolean success2 = table.declare("resultado", SymbolType.VARIABLE, DataType.INTEGER);
        boolean success3 = table.declare("PI", SymbolType.CONSTANT, DataType.REAL, true, null);
        
        System.out.println("Declaração de 'numero': " + (success1 ? "Sucesso" : "Falha"));
        System.out.println("Declaração de 'resultado': " + (success2 ? "Sucesso" : "Falha"));
        System.out.println("Declaração de 'PI': " + (success3 ? "Sucesso" : "Falha"));
        
        // Busca símbolos
        Symbol numero = table.lookup("numero");
        Symbol inexistente = table.lookup("inexistente");
        
        System.out.println("Busca 'numero': " + (numero != null ? "Encontrado - " + numero : "Não encontrado"));
        System.out.println("Busca 'inexistente': " + (inexistente != null ? "Encontrado" : "Não encontrado"));
        
        // Testa escopo
        table.enterScope();
        boolean success4 = table.declare("variavel_local", SymbolType.VARIABLE, DataType.TEXT);
        System.out.println("Declaração em novo escopo: " + (success4 ? "Sucesso" : "Falha"));
        
        table.exitScope();
        Symbol varLocal = table.lookup("variavel_local");
        System.out.println("Busca variável após sair do escopo: " + (varLocal != null ? "Encontrada" : "Não encontrada"));
        
        System.out.println("Tabela de símbolos atual:\n" + table);
    }
    
    private static void testInterpreter() {
        System.out.println("\n--- Testando Interpretador ---");
        
        Interpreter interpreter = new Interpreter();
        
        // Declara algumas variáveis no interpretador
        interpreter.declareVariable("x", DataType.INTEGER, 10);
        interpreter.declareVariable("y", DataType.INTEGER, 20);
        
        // Testa obtenção de valores
        Object x = interpreter.getVariable("x");
        Object y = interpreter.getVariable("y");
        
        System.out.println("Valor de x: " + x);
        System.out.println("Valor de y: " + y);
        
        // Testa modificação de valores
        interpreter.setVariable("x", 50);
        Object xNovo = interpreter.getVariable("x");
        System.out.println("Novo valor de x: " + xNovo);
        
        // Testa avaliação de expressões simples
        Object expr1 = interpreter.evaluateExpression("42");
        Object expr2 = interpreter.evaluateExpression("x");
        
        System.out.println("Avaliação de '42': " + expr1);
        System.out.println("Avaliação de 'x': " + expr2);
        
        System.out.println("Variáveis do interpretador: " + interpreter.getVariables());
        System.out.println("Funções do interpretador: " + interpreter.getFunctions().keySet());
        
        interpreter.close();
    }
} 