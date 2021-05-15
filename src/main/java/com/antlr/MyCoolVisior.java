package com.antlr;

import nodes.*;

import java.util.ArrayList;

public class MyCoolVisior extends LangBaseVisitor<Node>{
   ArrayList<String> declaredVars = new ArrayList<>();

   public boolean isVarDeclared(String id) {
       for (String var : declaredVars) {
           if (var.contains(id))
               return true;
       }
       return false;
   }

    @Override
    public Node visitProgram(LangParser.ProgramContext ctx) {
        ProgramNode program = new ProgramNode();

        if(ctx.function()!= null) {
            program.functions = new ArrayList<>();
            for(int i=0; i<ctx.function().size(); i++)
                program.functions.add(this.visitFunction(ctx.function(i)));
        }

        if(ctx.statement()!= null) {
            program.statements = new ArrayList<>();
            for(int i=0; i<ctx.statement().size(); i++)
                program.statements.add(this.visitStatement(ctx.statement(i)));
        }

        return program;
    }

    @Override
    public Node visitFunction(LangParser.FunctionContext ctx) {
        FunctionNode function = new FunctionNode();
        if(ctx.statement()!= null) {
            function.statements = new ArrayList<>();
            for(int i=0; i<ctx.statement().size(); i++)
                function.statements.add(this.visitStatement(ctx.statement(i)));
        }
        return function;
    }

    @Override
    public Node visitStatement(LangParser.StatementContext ctx) {
        StatementNode statement = new StatementNode();
        if(ctx.var_define() != null)
            statement.operation = this.visitVar_define(ctx.var_define());
        else if(ctx.assign() != null)
            statement.operation = this.visitAssign(ctx.assign());
        else if(ctx.fun_print() != null)
            statement.operation = this.visitFun_print(ctx.fun_print());
        else if(ctx.if_stat() != null)
            statement.operation = this.visitIf_stat(ctx.if_stat());
        else if(ctx.while_stat() != null)
            statement.operation = this.visitWhile_stat(ctx.while_stat());
        else if(ctx.for_stat() != null)
            statement.operation = this.visitFor_stat(ctx.for_stat());
        else if(ctx.function_call() != null)
            statement.operation = this.visitFunction_call(ctx.function_call());

        return statement;
    }

    @Override
    public Node visitFunction_call(LangParser.Function_callContext ctx) {
        FunctionCallNode functionCall = new FunctionCallNode();
        functionCall.name = ctx.ID().getText();
        return functionCall;
    }

    @Override
    public Node visitVar_define(LangParser.Var_defineContext ctx) {

        VarDefineNode varDefine = new VarDefineNode();
        if (ctx.type() != null)
            varDefine.type = ctx.type().getText();
        varDefine.id = ctx.ID().getText();
        declaredVars.add(varDefine.id);
        if(ctx.expr() != null) {
            varDefine.exprs = new ArrayList<>();
            for (int i = 0; i < ctx.expr().size(); i++)
                varDefine.exprs.add(this.visitExpr(ctx.expr(i)));
            varDefine.exprs.forEach(expr -> {
                ((ExprNode) expr).mults.forEach(mult -> {
                    ((MultNode) mult).subexprs.forEach(subexpr -> {
                        if (!(((SubexprNode) subexpr).type.equals(""))
                           & (!(varDefine.type.equals(((SubexprNode) subexpr).type)))
                           & (!((SubexprNode) subexpr).type.equals("id"))){
                            System.out.println("Type compatibility error! \n" +
                                    "Required type: " + varDefine.type + "\n" +
                                    "Provided: " + ((SubexprNode) subexpr).type);
                            throw new RuntimeException();
                        }
                    });
                });
            });
        }
        else if(ctx.var_value() != null) {
            varDefine.arrValues = new ArrayList<>();
            for (int i = 0; i < ctx.var_value().size(); i++)
                varDefine.arrValues.add(this.visitVar_value(ctx.var_value(i)));

        }
        return varDefine;
    }

    @Override
    public Node visitType(LangParser.TypeContext ctx) {
        TypeNode type = new TypeNode();
        if(ctx.TYPE_INT() != null )
            type.type = ctx.TYPE_INT().getText();
        else if(ctx.TYPE_CHAR() != null )
            type.type = ctx.TYPE_CHAR().getText();
        else if(ctx.TYPE_FLOAT() != null )
            type.type = ctx.TYPE_FLOAT().getText();
        else if(ctx.TYPE_STRING() != null )
            type.type = ctx.TYPE_STRING().getText();
        return type;
    }

    @Override
    public Node visitVar_value(LangParser.Var_valueContext ctx) {
        VarValueNode varValue = new VarValueNode();
        if(ctx.INT() != null ) {
            varValue.value = ctx.INT().getText();
            varValue.type = "int";
        }
        else if(ctx.CHAR() != null ) {
            varValue.value = ctx.CHAR().getText();
            varValue.type = "char";
        }
        else if(ctx.FLOAT() != null ) {
            varValue.value = ctx.FLOAT().getText();
            varValue.type = "float";
        }
        else if(ctx.STRING() != null ) {
            varValue.value = ctx.STRING().getText();
            varValue.type = "string";
        }
        else if(ctx.ID() != null ) {
            varValue.value = ctx.ID().getText();
            varValue.type = "id";
        }
        else if(ctx.NULL() != null ) {
            varValue.value = ctx.NULL().getText();
            varValue.type = "null";
        }

        return varValue;
    }

    @Override
    public Node visitAssign(LangParser.AssignContext ctx) {
        AssignNode assign = new AssignNode();
        assign.id = ctx.ID().getText();
        if (!isVarDeclared(assign.id)) {
            System.out.println("Undeclared variable " + assign.id + "!");
            throw new RuntimeException();
        }
        assign.expr = this.visitExpr(ctx.expr());
        return assign;
    }

    @Override
    public Node visitFun_print(LangParser.Fun_printContext ctx) {
        FunPrintNode funPrint = new FunPrintNode();
        funPrint.text = this.visitExpr(ctx.expr());
        return funPrint;
    }

    @Override
    public Node visitIf_stat(LangParser.If_statContext ctx) {
        IfNode ifNode = new IfNode();

        if(ctx.comparison() != null || ctx.expr() != null){
            ifNode.conditions = new ArrayList<>();
            for(int i=0; i<ctx.comparison().size(); i++)
                ifNode.conditions.add(this.visitComparison(ctx.comparison(i)));
            for(int i=0; i<ctx.expr().size(); i++)
                ifNode.conditions.add(this.visitExpr(ctx.expr(i)));
        }
        if(ctx.statement() != null) {
            ifNode.statements = new ArrayList<>();
            for(int i=0; i<ctx.statement().size(); i++)
                ifNode.statements.add(this.visitStatement(ctx.statement(i)));
        }

        return ifNode;
    }

    @Override
    public Node visitWhile_stat(LangParser.While_statContext ctx) {
        WhileNode whileNode = new WhileNode();

        if(ctx.comparison() != null || ctx.expr() != null){
            whileNode.conditions = new ArrayList<>();
            for(int i=0; i<ctx.comparison().size(); i++)
                whileNode.conditions.add(this.visitComparison(ctx.comparison(i)));
            for(int i=0; i<ctx.expr().size(); i++)
                whileNode.conditions.add(this.visitExpr(ctx.expr(i)));
        }
        if(ctx.statement() != null) {
            whileNode.statements = new ArrayList<>();
            for(int i=0; i<ctx.statement().size(); i++)
                whileNode.statements.add(this.visitStatement(ctx.statement(i)));
        }

        return whileNode;
    }

    @Override
    public Node visitFor_stat(LangParser.For_statContext ctx) {
        ForNode forNode = new ForNode();

        forNode.forExpr = this.visitFor_expr(ctx.for_expr());

        if(ctx.statement() != null) {
            forNode.statements = new ArrayList<>();
            for(int i=0; i<ctx.statement().size(); i++)
                forNode.statements.add(this.visitStatement(ctx.statement(i)));
        }

        return forNode;
    }

    @Override
    public Node visitFor_expr(LangParser.For_exprContext ctx) {
        ForExprNode forExpr = new ForExprNode();
        if(ctx.assign()!=null && ctx.expr() != null){
            forExpr.assign = this.visitAssign(ctx.assign());
            forExpr.expr = this.visitExpr(ctx.expr());
        }
        else if(ctx.ID() != null){
            forExpr.id = ctx.ID(0).getText();
            forExpr.arrayId = ctx.ID(1).getText();
        }
        return forExpr;
    }

    @Override
    public Node visitExpr(LangParser.ExprContext ctx) {
        ExprNode expr = new ExprNode();
        expr.mults = new ArrayList<>();
        for(int i=0; i<ctx.mult().size(); i++)
            expr.mults.add(this.visitMult(ctx.mult(i)));
        return expr;
    }

    @Override
    public Node visitMult(LangParser.MultContext ctx) {
        MultNode mult = new MultNode();
        mult.subexprs = new ArrayList<>();
        for(int i=0; i<ctx.subexpr().size(); i++)
            mult.subexprs.add(this.visitSubexpr(ctx.subexpr(i)));
        return mult;
    }

    @Override
    public Node visitSubexpr(LangParser.SubexprContext ctx) {
        SubexprNode subexpr = new SubexprNode();
        if(ctx.expr()!= null)
            subexpr.expr = this.visitExpr(ctx.expr());
        else if (ctx.var_value()!=null) {
            VarValueNode varValue = (VarValueNode) this.visitVar_value(ctx.var_value());
            subexpr.expr = varValue;
            subexpr.type = varValue.type;
        }
        return subexpr;
    }

    @Override
    public Node visitComparison(LangParser.ComparisonContext ctx) {
        ComparisionNode comparision = new ComparisionNode();
        comparision.expr1 = visitExpr(ctx.expr(0));
        comparision.expr2 = visitExpr(ctx.expr(1));
        return comparision;
    }
}
