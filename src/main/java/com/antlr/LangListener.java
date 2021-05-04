// Generated from D:/Û˜Â·‡/ﬂœ»—/myCompiler/src/grammar\Lang.g4 by ANTLR 4.9.1
package com.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LangParser}.
 */
public interface LangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(LangParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(LangParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(LangParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(LangParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#var_define}.
	 * @param ctx the parse tree
	 */
	void enterVar_define(LangParser.Var_defineContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#var_define}.
	 * @param ctx the parse tree
	 */
	void exitVar_define(LangParser.Var_defineContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(LangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(LangParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#var_value}.
	 * @param ctx the parse tree
	 */
	void enterVar_value(LangParser.Var_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#var_value}.
	 * @param ctx the parse tree
	 */
	void exitVar_value(LangParser.Var_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(LangParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(LangParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#fun_print}.
	 * @param ctx the parse tree
	 */
	void enterFun_print(LangParser.Fun_printContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#fun_print}.
	 * @param ctx the parse tree
	 */
	void exitFun_print(LangParser.Fun_printContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(LangParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(LangParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(LangParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(LangParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void enterFor_stat(LangParser.For_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void exitFor_stat(LangParser.For_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#for_expr}.
	 * @param ctx the parse tree
	 */
	void enterFor_expr(LangParser.For_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#for_expr}.
	 * @param ctx the parse tree
	 */
	void exitFor_expr(LangParser.For_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LangParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(LangParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(LangParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#subexpr}.
	 * @param ctx the parse tree
	 */
	void enterSubexpr(LangParser.SubexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#subexpr}.
	 * @param ctx the parse tree
	 */
	void exitSubexpr(LangParser.SubexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(LangParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(LangParser.ComparisonContext ctx);
}