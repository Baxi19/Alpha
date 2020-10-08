import generated.AlphaParser;
import generated.AlphaParserBaseVisitor;

public class Visitor extends AlphaParserBaseVisitor<Object> {
    private int tabs = 0;

    private String getTabs(int n){
        String str= "";
        for (int i = 0; i < n; i++) {
            str+="\t";
        }
        return str;
    }

    @Override
    public Object visitProgramAST(AlphaParser.ProgramASTContext ctx) {
        System.out.println(getTabs(tabs) + ctx.getClass().getSimpleName());
        tabs++;
        visit(ctx.singleCommand());
        tabs--;
        return null;
    }

    @Override
    public Object visitCommandAST(AlphaParser.CommandASTContext ctx) {
        System.out.println(getTabs(tabs) + ctx.getClass().getSimpleName());
        tabs++;
        visit(ctx.singleCommand(0));
        tabs--;
        int i;
        for(i = 1; i < ctx.singleCommand().size(); i ++){
            tabs++;
            visit(ctx.singleCommand(i));
            tabs--;
        }
        return null;
    }

    @Override
    public Object visitAssignSingleCommandAST(AlphaParser.AssignSingleCommandASTContext ctx) {
        System.out.println(getTabs(tabs) + ctx.getClass().getSimpleName());
        System.out.println(ctx.IDENT().getSymbol().getText());
        tabs++;
        visit(ctx.expression());
        tabs--;
        return null;
    }


    @Override
    public Object visitCallSingleCommandAST(AlphaParser.CallSingleCommandASTContext ctx) {
        System.out.println(getTabs(tabs) + ctx.getClass().getSimpleName());
        tabs++;

        tabs--;
        return null;
    }

    @Override
    public Object visitIfSingleCommandAST(AlphaParser.IfSingleCommandASTContext ctx) {
        System.out.println(getTabs(tabs) + ctx.getClass().getSimpleName());
        tabs++;

        tabs--;
        return null;
    }

    @Override
    public Object visitWhileSingleCommandAST(AlphaParser.WhileSingleCommandASTContext ctx) {
        System.out.println(getTabs(tabs) + ctx.getClass().getSimpleName());
        tabs++;

        tabs--;
        return null;
    }

    @Override
    public Object visitLetSingleCommandAST(AlphaParser.LetSingleCommandASTContext ctx) {
        System.out.println(getTabs(tabs) + ctx.getClass().getSimpleName());
        tabs++;

        tabs--;
        return null;
    }

    @Override
    public Object visitBlockSingleCommandAST(AlphaParser.BlockSingleCommandASTContext ctx) {
        System.out.println(getTabs(tabs) + ctx.getClass().getSimpleName());
        tabs++;

        tabs--;
        return null;
    }

    @Override
    public Object visitDeclarationAST(AlphaParser.DeclarationASTContext ctx) {
        System.out.println(getTabs(tabs) + ctx.getClass().getSimpleName());
        tabs++;
        visit(ctx.singleDeclaration(0));
        tabs--;
        int i;
        for(i = 1; i < ctx.singleDeclaration().size(); i ++){
            tabs++;
            visit(ctx.singleDeclaration(i));
            tabs--;
        }
        return null;
    }

    @Override
    public Object visitConstSingleDeclarationAST(AlphaParser.ConstSingleDeclarationASTContext ctx) {
        System.out.println(getTabs(tabs) + ctx.getClass().getSimpleName());
        tabs++;

        tabs--;
        return null;
    }

    @Override
    public Object visitVarSingleDeclarationAST(AlphaParser.VarSingleDeclarationASTContext ctx) {
        System.out.println(getTabs(tabs) + ctx.getClass().getSimpleName());
        tabs++;

        tabs--;
        return null;
    }

    @Override
    public Object visitExpressionAST(AlphaParser.ExpressionASTContext ctx) {
        System.out.println(getTabs(tabs) + ctx.getClass().getSimpleName());
        tabs++;

        tabs--;
        return null;
    }

    @Override
    public Object visitNumPrimaryExpressionAST(AlphaParser.NumPrimaryExpressionASTContext ctx) {
        System.out.println(getTabs(tabs) + ctx.getClass().getSimpleName());
        tabs++;

        tabs--;
        return null;
    }

    @Override
    public Object visitIdPrimaryExpressionAST(AlphaParser.IdPrimaryExpressionASTContext ctx) {
        System.out.println(getTabs(tabs) + ctx.getClass().getSimpleName());
        tabs++;

        tabs--;
        return null;
    }

    @Override
    public Object visitGroupPrimaryExpressionAST(AlphaParser.GroupPrimaryExpressionASTContext ctx) {
        System.out.println(getTabs(tabs) + ctx.getClass().getSimpleName());
        tabs++;

        tabs--;
        return null;
    }

    @Override
    public Object visitOperator(AlphaParser.OperatorContext ctx) {
        System.out.println(getTabs(tabs) + ctx.getClass().getSimpleName());
        String operador;
        tabs++;


        if(ctx.SUM() != null){
            operador = ctx.SUM().getText();
        }else if(ctx.SUB() != null){
            operador = ctx.SUB().getText();
        }else if(ctx.MUL() != null){
            operador = ctx.MUL().getText();
        }else {
            operador = ctx.DIV().getText();
        }

        tabs--;
        System.out.println(operador);
        return null;
    }

}
