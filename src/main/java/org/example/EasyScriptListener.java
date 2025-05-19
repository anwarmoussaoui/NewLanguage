// Generated from src/main/java/org/example/EasyScript.g4 by ANTLR 4.13.1
package org.example;


import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EasyScriptParser}.
 */
public interface EasyScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EasyScriptParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(EasyScriptParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyScriptParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(EasyScriptParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link EasyScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpr(EasyScriptParser.LiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link EasyScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpr(EasyScriptParser.LiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddExpr}
	 * labeled alternative in {@link EasyScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(EasyScriptParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddExpr}
	 * labeled alternative in {@link EasyScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(EasyScriptParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(EasyScriptParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(EasyScriptParser.LiteralContext ctx);
}