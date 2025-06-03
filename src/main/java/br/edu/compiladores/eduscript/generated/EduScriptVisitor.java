// Generated from src/main/antlr4/EduScript.g4 by ANTLR 4.13.1
package br.edu.compiladores.eduscript.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EduScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EduScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EduScriptParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(EduScriptParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link EduScriptParser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes(EduScriptParser.DeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link EduScriptParser#funcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncao(EduScriptParser.FuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EduScriptParser#procedimento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedimento(EduScriptParser.ProcedimentoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EduScriptParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(EduScriptParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link EduScriptParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(EduScriptParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link EduScriptParser#declaracaoVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoVar(EduScriptParser.DeclaracaoVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link EduScriptParser#listaVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaVar(EduScriptParser.ListaVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link EduScriptParser#declaracaoConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoConst(EduScriptParser.DeclaracaoConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link EduScriptParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(EduScriptParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EduScriptParser#comandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandos(EduScriptParser.ComandosContext ctx);
	/**
	 * Visit a parse tree produced by {@link EduScriptParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(EduScriptParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EduScriptParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(EduScriptParser.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EduScriptParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamadaFuncao(EduScriptParser.ChamadaFuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EduScriptParser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(EduScriptParser.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link EduScriptParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(EduScriptParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link EduScriptParser#laco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLaco(EduScriptParser.LacoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EduScriptParser#lacoEnquanto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLacoEnquanto(EduScriptParser.LacoEnquantoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EduScriptParser#lacoPara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLacoPara(EduScriptParser.LacoParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link EduScriptParser#entrada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntrada(EduScriptParser.EntradaContext ctx);
	/**
	 * Visit a parse tree produced by {@link EduScriptParser#saida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSaida(EduScriptParser.SaidaContext ctx);
	/**
	 * Visit a parse tree produced by {@link EduScriptParser#listaExpressoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaExpressoes(EduScriptParser.ListaExpressoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link EduScriptParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(EduScriptParser.RetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EduScriptParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(EduScriptParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EduScriptParser#expressaoLogica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoLogica(EduScriptParser.ExpressaoLogicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link EduScriptParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoRelacional(EduScriptParser.ExpressaoRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link EduScriptParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoAritmetica(EduScriptParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link EduScriptParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(EduScriptParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EduScriptParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(EduScriptParser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link EduScriptParser#operadorLogico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorLogico(EduScriptParser.OperadorLogicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EduScriptParser#operadorRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorRelacional(EduScriptParser.OperadorRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link EduScriptParser#operadorAditivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorAditivo(EduScriptParser.OperadorAditivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EduScriptParser#operadorMultiplicativo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorMultiplicativo(EduScriptParser.OperadorMultiplicativoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EduScriptParser#operadorUnario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorUnario(EduScriptParser.OperadorUnarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link EduScriptParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(EduScriptParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link EduScriptParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(EduScriptParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EduScriptParser#tipoBasico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoBasico(EduScriptParser.TipoBasicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EduScriptParser#tipoArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoArray(EduScriptParser.TipoArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link EduScriptParser#tipoRegistro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoRegistro(EduScriptParser.TipoRegistroContext ctx);
	/**
	 * Visit a parse tree produced by {@link EduScriptParser#camposRegistro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCamposRegistro(EduScriptParser.CamposRegistroContext ctx);
}