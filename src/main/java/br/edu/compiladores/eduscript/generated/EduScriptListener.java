// Generated from EduScript.g4 by ANTLR 4.13.1
package br.edu.compiladores.eduscript.generated;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EduScriptParser}.
 */
public interface EduScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EduScriptParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(EduScriptParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EduScriptParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(EduScriptParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link EduScriptParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(EduScriptParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link EduScriptParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(EduScriptParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link EduScriptParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(EduScriptParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EduScriptParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(EduScriptParser.FuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EduScriptParser#procedimento}.
	 * @param ctx the parse tree
	 */
	void enterProcedimento(EduScriptParser.ProcedimentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EduScriptParser#procedimento}.
	 * @param ctx the parse tree
	 */
	void exitProcedimento(EduScriptParser.ProcedimentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EduScriptParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(EduScriptParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link EduScriptParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(EduScriptParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link EduScriptParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(EduScriptParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link EduScriptParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(EduScriptParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link EduScriptParser#declaracaoVar}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoVar(EduScriptParser.DeclaracaoVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link EduScriptParser#declaracaoVar}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoVar(EduScriptParser.DeclaracaoVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link EduScriptParser#listaVar}.
	 * @param ctx the parse tree
	 */
	void enterListaVar(EduScriptParser.ListaVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link EduScriptParser#listaVar}.
	 * @param ctx the parse tree
	 */
	void exitListaVar(EduScriptParser.ListaVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link EduScriptParser#declaracaoConst}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoConst(EduScriptParser.DeclaracaoConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link EduScriptParser#declaracaoConst}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoConst(EduScriptParser.DeclaracaoConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link EduScriptParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(EduScriptParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EduScriptParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(EduScriptParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EduScriptParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(EduScriptParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link EduScriptParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(EduScriptParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link EduScriptParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(EduScriptParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EduScriptParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(EduScriptParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EduScriptParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(EduScriptParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EduScriptParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(EduScriptParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EduScriptParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 */
	void enterChamadaFuncao(EduScriptParser.ChamadaFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EduScriptParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 */
	void exitChamadaFuncao(EduScriptParser.ChamadaFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EduScriptParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(EduScriptParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link EduScriptParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(EduScriptParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link EduScriptParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(EduScriptParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EduScriptParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(EduScriptParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link EduScriptParser#laco}.
	 * @param ctx the parse tree
	 */
	void enterLaco(EduScriptParser.LacoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EduScriptParser#laco}.
	 * @param ctx the parse tree
	 */
	void exitLaco(EduScriptParser.LacoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EduScriptParser#lacoEnquanto}.
	 * @param ctx the parse tree
	 */
	void enterLacoEnquanto(EduScriptParser.LacoEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EduScriptParser#lacoEnquanto}.
	 * @param ctx the parse tree
	 */
	void exitLacoEnquanto(EduScriptParser.LacoEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EduScriptParser#lacoPara}.
	 * @param ctx the parse tree
	 */
	void enterLacoPara(EduScriptParser.LacoParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EduScriptParser#lacoPara}.
	 * @param ctx the parse tree
	 */
	void exitLacoPara(EduScriptParser.LacoParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link EduScriptParser#entrada}.
	 * @param ctx the parse tree
	 */
	void enterEntrada(EduScriptParser.EntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EduScriptParser#entrada}.
	 * @param ctx the parse tree
	 */
	void exitEntrada(EduScriptParser.EntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link EduScriptParser#saida}.
	 * @param ctx the parse tree
	 */
	void enterSaida(EduScriptParser.SaidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EduScriptParser#saida}.
	 * @param ctx the parse tree
	 */
	void exitSaida(EduScriptParser.SaidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link EduScriptParser#listaExpressoes}.
	 * @param ctx the parse tree
	 */
	void enterListaExpressoes(EduScriptParser.ListaExpressoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link EduScriptParser#listaExpressoes}.
	 * @param ctx the parse tree
	 */
	void exitListaExpressoes(EduScriptParser.ListaExpressoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link EduScriptParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(EduScriptParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EduScriptParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(EduScriptParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EduScriptParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(EduScriptParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EduScriptParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(EduScriptParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EduScriptParser#expressaoLogica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoLogica(EduScriptParser.ExpressaoLogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EduScriptParser#expressaoLogica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoLogica(EduScriptParser.ExpressaoLogicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link EduScriptParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoRelacional(EduScriptParser.ExpressaoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EduScriptParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoRelacional(EduScriptParser.ExpressaoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link EduScriptParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritmetica(EduScriptParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EduScriptParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritmetica(EduScriptParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link EduScriptParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(EduScriptParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EduScriptParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(EduScriptParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EduScriptParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(EduScriptParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EduScriptParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(EduScriptParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EduScriptParser#operadorLogico}.
	 * @param ctx the parse tree
	 */
	void enterOperadorLogico(EduScriptParser.OperadorLogicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EduScriptParser#operadorLogico}.
	 * @param ctx the parse tree
	 */
	void exitOperadorLogico(EduScriptParser.OperadorLogicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EduScriptParser#operadorRelacional}.
	 * @param ctx the parse tree
	 */
	void enterOperadorRelacional(EduScriptParser.OperadorRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EduScriptParser#operadorRelacional}.
	 * @param ctx the parse tree
	 */
	void exitOperadorRelacional(EduScriptParser.OperadorRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link EduScriptParser#operadorAditivo}.
	 * @param ctx the parse tree
	 */
	void enterOperadorAditivo(EduScriptParser.OperadorAditivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EduScriptParser#operadorAditivo}.
	 * @param ctx the parse tree
	 */
	void exitOperadorAditivo(EduScriptParser.OperadorAditivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EduScriptParser#operadorMultiplicativo}.
	 * @param ctx the parse tree
	 */
	void enterOperadorMultiplicativo(EduScriptParser.OperadorMultiplicativoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EduScriptParser#operadorMultiplicativo}.
	 * @param ctx the parse tree
	 */
	void exitOperadorMultiplicativo(EduScriptParser.OperadorMultiplicativoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EduScriptParser#operadorUnario}.
	 * @param ctx the parse tree
	 */
	void enterOperadorUnario(EduScriptParser.OperadorUnarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link EduScriptParser#operadorUnario}.
	 * @param ctx the parse tree
	 */
	void exitOperadorUnario(EduScriptParser.OperadorUnarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link EduScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(EduScriptParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link EduScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(EduScriptParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link EduScriptParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(EduScriptParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EduScriptParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(EduScriptParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EduScriptParser#tipoBasico}.
	 * @param ctx the parse tree
	 */
	void enterTipoBasico(EduScriptParser.TipoBasicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EduScriptParser#tipoBasico}.
	 * @param ctx the parse tree
	 */
	void exitTipoBasico(EduScriptParser.TipoBasicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EduScriptParser#tipoArray}.
	 * @param ctx the parse tree
	 */
	void enterTipoArray(EduScriptParser.TipoArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link EduScriptParser#tipoArray}.
	 * @param ctx the parse tree
	 */
	void exitTipoArray(EduScriptParser.TipoArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link EduScriptParser#tipoRegistro}.
	 * @param ctx the parse tree
	 */
	void enterTipoRegistro(EduScriptParser.TipoRegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link EduScriptParser#tipoRegistro}.
	 * @param ctx the parse tree
	 */
	void exitTipoRegistro(EduScriptParser.TipoRegistroContext ctx);
	/**
	 * Enter a parse tree produced by {@link EduScriptParser#camposRegistro}.
	 * @param ctx the parse tree
	 */
	void enterCamposRegistro(EduScriptParser.CamposRegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link EduScriptParser#camposRegistro}.
	 * @param ctx the parse tree
	 */
	void exitCamposRegistro(EduScriptParser.CamposRegistroContext ctx);
}