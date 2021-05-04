// Generated from D:/Û˜Â·‡/ﬂœ»—/myCompiler/src/grammar\Lang.g4 by ANTLR 4.9.1
package com.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(LangParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(LangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(LangParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#var_define}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_define(LangParser.Var_defineContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(LangParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#var_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_value(LangParser.Var_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(LangParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#fun_print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun_print(LangParser.Fun_printContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(LangParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(LangParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#for_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stat(LangParser.For_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#for_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_expr(LangParser.For_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(LangParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(LangParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#subexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubexpr(LangParser.SubexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(LangParser.ComparisonContext ctx);
}