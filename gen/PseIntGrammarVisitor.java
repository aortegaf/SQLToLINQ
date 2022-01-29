// Generated from /home/andres/Documentos/2021 - II/Lenguajes de Programación/Traductor/Entrega #3/PseIntToPython/grammar/PseIntGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PseIntGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PseIntGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(PseIntGrammarParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#proceso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProceso(PseIntGrammarParser.ProcesoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#subproceso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubproceso(PseIntGrammarParser.SubprocesoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#id_subproceso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_subproceso(PseIntGrammarParser.Id_subprocesoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(PseIntGrammarParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#comandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandos(PseIntGrammarParser.ComandosContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(PseIntGrammarParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#comentario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComentario(PseIntGrammarParser.ComentarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#definicion_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicion_variables(PseIntGrammarParser.Definicion_variablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#asignacion_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion_variable(PseIntGrammarParser.Asignacion_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(PseIntGrammarParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(PseIntGrammarParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(PseIntGrammarParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(PseIntGrammarParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(PseIntGrammarParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#comandos_especiales}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandos_especiales(PseIntGrammarParser.Comandos_especialesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#comando_escribir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando_escribir(PseIntGrammarParser.Comando_escribirContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#comando_leer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando_leer(PseIntGrammarParser.Comando_leerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#dimensionamiento_arreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensionamiento_arreglo(PseIntGrammarParser.Dimensionamiento_arregloContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#coma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComa(PseIntGrammarParser.ComaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#expresion_escribir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_escribir(PseIntGrammarParser.Expresion_escribirContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#condicional_si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional_si(PseIntGrammarParser.Condicional_siContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#condiciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondiciones(PseIntGrammarParser.CondicionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(PseIntGrammarParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacion(PseIntGrammarParser.ComparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#condicion_sino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion_sino(PseIntGrammarParser.Condicion_sinoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#ciclo_para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo_para(PseIntGrammarParser.Ciclo_paraContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#ciclo_mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo_mientras(PseIntGrammarParser.Ciclo_mientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#ciclo_repetirhasta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo_repetirhasta(PseIntGrammarParser.Ciclo_repetirhastaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#paso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPaso(PseIntGrammarParser.PasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#asignacion_para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion_para(PseIntGrammarParser.Asignacion_paraContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#comando_segunhacer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando_segunhacer(PseIntGrammarParser.Comando_segunhacerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#caso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaso(PseIntGrammarParser.CasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#de_otro_modo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDe_otro_modo(PseIntGrammarParser.De_otro_modoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseIntGrammarParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(PseIntGrammarParser.BoolContext ctx);
}