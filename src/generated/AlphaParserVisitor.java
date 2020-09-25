// Generated from C:/Users/Baxi/Desktop/Alpha\AlphaParser.g4 by ANTLR 4.8
package generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AlphaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AlphaParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AlphaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AlphaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlphaParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(AlphaParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlphaParser#single_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_command(AlphaParser.Single_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlphaParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(AlphaParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlphaParser#single_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_declaration(AlphaParser.Single_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlphaParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(AlphaParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlphaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(AlphaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlphaParser#primary_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_exp(AlphaParser.Primary_expContext ctx);
}