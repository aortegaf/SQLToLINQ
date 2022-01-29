// Generated from /home/andres/Documentos/2021 - II/Lenguajes de Programación/Traductor/Entrega #3/PseIntToPython/grammar/PseIntGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PseIntGrammarParser}.
 */
public interface PseIntGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(PseIntGrammarParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(PseIntGrammarParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#proceso}.
	 * @param ctx the parse tree
	 */
	void enterProceso(PseIntGrammarParser.ProcesoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#proceso}.
	 * @param ctx the parse tree
	 */
	void exitProceso(PseIntGrammarParser.ProcesoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#subproceso}.
	 * @param ctx the parse tree
	 */
	void enterSubproceso(PseIntGrammarParser.SubprocesoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#subproceso}.
	 * @param ctx the parse tree
	 */
	void exitSubproceso(PseIntGrammarParser.SubprocesoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#id_subproceso}.
	 * @param ctx the parse tree
	 */
	void enterId_subproceso(PseIntGrammarParser.Id_subprocesoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#id_subproceso}.
	 * @param ctx the parse tree
	 */
	void exitId_subproceso(PseIntGrammarParser.Id_subprocesoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(PseIntGrammarParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(PseIntGrammarParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(PseIntGrammarParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(PseIntGrammarParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(PseIntGrammarParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(PseIntGrammarParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#comentario}.
	 * @param ctx the parse tree
	 */
	void enterComentario(PseIntGrammarParser.ComentarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#comentario}.
	 * @param ctx the parse tree
	 */
	void exitComentario(PseIntGrammarParser.ComentarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#definicion_variables}.
	 * @param ctx the parse tree
	 */
	void enterDefinicion_variables(PseIntGrammarParser.Definicion_variablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#definicion_variables}.
	 * @param ctx the parse tree
	 */
	void exitDefinicion_variables(PseIntGrammarParser.Definicion_variablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#asignacion_variable}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion_variable(PseIntGrammarParser.Asignacion_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#asignacion_variable}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion_variable(PseIntGrammarParser.Asignacion_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(PseIntGrammarParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(PseIntGrammarParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(PseIntGrammarParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(PseIntGrammarParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(PseIntGrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(PseIntGrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(PseIntGrammarParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(PseIntGrammarParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(PseIntGrammarParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(PseIntGrammarParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#comandos_especiales}.
	 * @param ctx the parse tree
	 */
	void enterComandos_especiales(PseIntGrammarParser.Comandos_especialesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#comandos_especiales}.
	 * @param ctx the parse tree
	 */
	void exitComandos_especiales(PseIntGrammarParser.Comandos_especialesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#comando_escribir}.
	 * @param ctx the parse tree
	 */
	void enterComando_escribir(PseIntGrammarParser.Comando_escribirContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#comando_escribir}.
	 * @param ctx the parse tree
	 */
	void exitComando_escribir(PseIntGrammarParser.Comando_escribirContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#comando_leer}.
	 * @param ctx the parse tree
	 */
	void enterComando_leer(PseIntGrammarParser.Comando_leerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#comando_leer}.
	 * @param ctx the parse tree
	 */
	void exitComando_leer(PseIntGrammarParser.Comando_leerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#dimensionamiento_arreglo}.
	 * @param ctx the parse tree
	 */
	void enterDimensionamiento_arreglo(PseIntGrammarParser.Dimensionamiento_arregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#dimensionamiento_arreglo}.
	 * @param ctx the parse tree
	 */
	void exitDimensionamiento_arreglo(PseIntGrammarParser.Dimensionamiento_arregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#coma}.
	 * @param ctx the parse tree
	 */
	void enterComa(PseIntGrammarParser.ComaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#coma}.
	 * @param ctx the parse tree
	 */
	void exitComa(PseIntGrammarParser.ComaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#expresion_escribir}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_escribir(PseIntGrammarParser.Expresion_escribirContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#expresion_escribir}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_escribir(PseIntGrammarParser.Expresion_escribirContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#condicional_si}.
	 * @param ctx the parse tree
	 */
	void enterCondicional_si(PseIntGrammarParser.Condicional_siContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#condicional_si}.
	 * @param ctx the parse tree
	 */
	void exitCondicional_si(PseIntGrammarParser.Condicional_siContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#condiciones}.
	 * @param ctx the parse tree
	 */
	void enterCondiciones(PseIntGrammarParser.CondicionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#condiciones}.
	 * @param ctx the parse tree
	 */
	void exitCondiciones(PseIntGrammarParser.CondicionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(PseIntGrammarParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(PseIntGrammarParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void enterComparacion(PseIntGrammarParser.ComparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void exitComparacion(PseIntGrammarParser.ComparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#condicion_sino}.
	 * @param ctx the parse tree
	 */
	void enterCondicion_sino(PseIntGrammarParser.Condicion_sinoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#condicion_sino}.
	 * @param ctx the parse tree
	 */
	void exitCondicion_sino(PseIntGrammarParser.Condicion_sinoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#ciclo_para}.
	 * @param ctx the parse tree
	 */
	void enterCiclo_para(PseIntGrammarParser.Ciclo_paraContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#ciclo_para}.
	 * @param ctx the parse tree
	 */
	void exitCiclo_para(PseIntGrammarParser.Ciclo_paraContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#ciclo_mientras}.
	 * @param ctx the parse tree
	 */
	void enterCiclo_mientras(PseIntGrammarParser.Ciclo_mientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#ciclo_mientras}.
	 * @param ctx the parse tree
	 */
	void exitCiclo_mientras(PseIntGrammarParser.Ciclo_mientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#ciclo_repetirhasta}.
	 * @param ctx the parse tree
	 */
	void enterCiclo_repetirhasta(PseIntGrammarParser.Ciclo_repetirhastaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#ciclo_repetirhasta}.
	 * @param ctx the parse tree
	 */
	void exitCiclo_repetirhasta(PseIntGrammarParser.Ciclo_repetirhastaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#paso}.
	 * @param ctx the parse tree
	 */
	void enterPaso(PseIntGrammarParser.PasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#paso}.
	 * @param ctx the parse tree
	 */
	void exitPaso(PseIntGrammarParser.PasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#asignacion_para}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion_para(PseIntGrammarParser.Asignacion_paraContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#asignacion_para}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion_para(PseIntGrammarParser.Asignacion_paraContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#comando_segunhacer}.
	 * @param ctx the parse tree
	 */
	void enterComando_segunhacer(PseIntGrammarParser.Comando_segunhacerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#comando_segunhacer}.
	 * @param ctx the parse tree
	 */
	void exitComando_segunhacer(PseIntGrammarParser.Comando_segunhacerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#caso}.
	 * @param ctx the parse tree
	 */
	void enterCaso(PseIntGrammarParser.CasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#caso}.
	 * @param ctx the parse tree
	 */
	void exitCaso(PseIntGrammarParser.CasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#de_otro_modo}.
	 * @param ctx the parse tree
	 */
	void enterDe_otro_modo(PseIntGrammarParser.De_otro_modoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#de_otro_modo}.
	 * @param ctx the parse tree
	 */
	void exitDe_otro_modo(PseIntGrammarParser.De_otro_modoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseIntGrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(PseIntGrammarParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseIntGrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(PseIntGrammarParser.BoolContext ctx);
}