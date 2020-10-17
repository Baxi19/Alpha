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

        //System.out.println(visit(ctx.ident()));

        //System.out.println(ctx.IDENT().getSymbol().getText());
        //System.out.println(ctx.ASSING().getSymbol().getText());
        tabs++;
        visit(ctx.expression());
        tabs--;

        return null;
    }


    @Override
    public Object visitCallSingleCommandAST(AlphaParser.CallSingleCommandASTContext ctx) {
        System.out.println(getTabs(tabs) + ctx.getClass().getSimpleName());

        //System.out.println(ctx.IDENT().getSymbol().getText());
        //System.out.println(ctx.L_PARENT().getSymbol().getText());
        tabs++;
        visit(ctx.expression());
        tabs--;
        //System.out.println(ctx.R_PARENT().getSymbol().getText());

        return null;
    }

    @Override
    public Object visitIfSingleCommandAST(AlphaParser.IfSingleCommandASTContext ctx) {
        System.out.println(getTabs(tabs) + ctx.getClass().getSimpleName());

        //System.out.println(ctx.IF().getSymbol().getText());
        tabs++;
        visit(ctx.expression());
        tabs--;

        //System.out.println(ctx.THEN().getSymbol().getText());
        tabs++;
        visit(ctx.singleCommand(0));
        tabs--;

        //System.out.println(ctx.ELSE().getSymbol().getText());
        tabs++;
        visit(ctx.singleCommand(1));
        tabs--;

        return null;
    }

    @Override
    public Object visitWhileSingleCommandAST(AlphaParser.WhileSingleCommandASTContext ctx) {
        System.out.println(getTabs(tabs) + ctx.getClass().getSimpleName());

        //System.out.println(ctx.WHILE().getSymbol().getText());
        tabs++;
        visit(ctx.expression());
        tabs--;

        //System.out.println(ctx.DO().getSymbol().getText());
        tabs++;
        visit(ctx.singleCommand());
        tabs--;

        return null;
    }

    @Override
    public Object visitLetSingleCommandAST(AlphaParser.LetSingleCommandASTContext ctx) {
        System.out.println(getTabs(tabs) + ctx.getClass().getSimpleName());

        //System.out.println(ctx.LET().getSymbol().getText());
        tabs++;
        visit(ctx.declaration());
        tabs--;

        //System.out.println(ctx.IN().getSymbol().getText());
        tabs++;
        visit(ctx.singleCommand());
        tabs--;

        return null;
    }

    @Override
    public Object visitBlockSingleCommandAST(AlphaParser.BlockSingleCommandASTContext ctx) {
        System.out.println(getTabs(tabs) + ctx.getClass().getSimpleName());

        //System.out.println(ctx.BEGIN().getSymbol().getText());
        tabs++;
        visit(ctx.command());
        tabs--;

        //System.out.println(ctx.END().getSymbol().getText());

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

        //System.out.println(ctx.CONST().getSymbol().getText());
        //System.out.println(ctx.IDENT().getSymbol().getText());
        //System.out.println(ctx.VIR().getSymbol().getText());
        tabs++;
        visit(ctx.expression());
        tabs--;

        return null;
    }

    @Override
    public Object visitVarSingleDeclarationAST(AlphaParser.VarSingleDeclarationASTContext ctx) {
        System.out.println(getTabs(tabs) + ctx.getClass().getSimpleName());

        //System.out.println(ctx.VAR().getSymbol().getText());
        //System.out.println(ctx.IDENT(0));
        //System.out.println(ctx.TWO_P().getSymbol().getText());
        //System.out.println(ctx.IDENT(1));

        return null;
    }

    @Override
    public Object visitExpressionAST(AlphaParser.ExpressionASTContext ctx) {
        System.out.println(getTabs(tabs) + ctx.getClass().getSimpleName());
        tabs++;
        visit(ctx.primaryExpression(0));
        tabs--;


        int i;
        for(i = 1; i < ctx.primaryExpression().size(); i ++){
            tabs++;
            visit(ctx.operator(i-1));
            tabs--;

            tabs++;
            visit(ctx.primaryExpression(i));
            tabs--;
        }

        return null;
    }

    @Override
    public Object visitNumPrimaryExpressionAST(AlphaParser.NumPrimaryExpressionASTContext ctx) {
        System.out.println(getTabs(tabs) + ctx.getClass().getSimpleName());
        //System.out.println(ctx.LITERAL().getSymbol().getText());
        return null;
    }

    @Override
    public Object visitIdPrimaryExpressionAST(AlphaParser.IdPrimaryExpressionASTContext ctx) {
        System.out.println(getTabs(tabs) + ctx.getClass().getSimpleName());
        //System.out.println(ctx.IDENT().getSymbol().getText());
        return null;
    }

    @Override
    public Object visitGroupPrimaryExpressionAST(AlphaParser.GroupPrimaryExpressionASTContext ctx) {
        System.out.println(getTabs(tabs) + ctx.getClass().getSimpleName());

       // System.out.println(ctx.L_PARENT().getSymbol().getText());
        tabs++;
        visit(ctx.expression());
        tabs--;
       // System.out.println(ctx.R_PARENT().getSymbol().getText());

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
        //System.out.println(operador);
        return null;
    }

    @Override
    public Object visitIdentAST(AlphaParser.IdentASTContext ctx) {
        //ctx.decl =

        return ctx.IDENT().getText();
    }
}
