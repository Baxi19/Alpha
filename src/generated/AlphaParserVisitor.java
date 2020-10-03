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
	 * Visit a parse tree produced by the {@code programAST}
	 * labeled alternative in {@link AlphaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramAST(AlphaParser.ProgramASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commandAST}
	 * labeled alternative in {@link AlphaParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandAST(AlphaParser.CommandASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignSingleCommandAST}
	 * labeled alternative in {@link AlphaParser#singleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignSingleCommandAST(AlphaParser.AssignSingleCommandASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callSingleCommandAST}
	 * labeled alternative in {@link AlphaParser#singleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallSingleCommandAST(AlphaParser.CallSingleCommandASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifSingleCommandAST}
	 * labeled alternative in {@link AlphaParser#singleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfSingleCommandAST(AlphaParser.IfSingleCommandASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileSingleCommandAST}
	 * labeled alternative in {@link AlphaParser#singleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileSingleCommandAST(AlphaParser.WhileSingleCommandASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letSingleCommandAST}
	 * labeled alternative in {@link AlphaParser#singleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetSingleCommandAST(AlphaParser.LetSingleCommandASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockSingleCommandAST}
	 * labeled alternative in {@link AlphaParser#singleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockSingleCommandAST(AlphaParser.BlockSingleCommandASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarationAST}
	 * labeled alternative in {@link AlphaParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationAST(AlphaParser.DeclarationASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constSingleDeclarationAST}
	 * labeled alternative in {@link AlphaParser#singleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstSingleDeclarationAST(AlphaParser.ConstSingleDeclarationASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varSingleDeclarationAST}
	 * labeled alternative in {@link AlphaParser#singleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSingleDeclarationAST(AlphaParser.VarSingleDeclarationASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeDenoterAST}
	 * labeled alternative in {@link AlphaParser#typeDenoter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDenoterAST(AlphaParser.TypeDenoterASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionAST}
	 * labeled alternative in {@link AlphaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAST(AlphaParser.ExpressionASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numPrimaryExpressionAST}
	 * labeled alternative in {@link AlphaParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumPrimaryExpressionAST(AlphaParser.NumPrimaryExpressionASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idPrimaryExpressionAST}
	 * labeled alternative in {@link AlphaParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdPrimaryExpressionAST(AlphaParser.IdPrimaryExpressionASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code groupPrimaryExpressionAST}
	 * labeled alternative in {@link AlphaParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupPrimaryExpressionAST(AlphaParser.GroupPrimaryExpressionASTContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlphaParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(AlphaParser.OperatorContext ctx);
}