package com.antlr;

import nodes.*;

import java.util.ArrayList;

public class GenCode extends LangBaseVisitor<String>{


    @Override
    public String visitProgram(LangParser.ProgramContext ctx) {
        StringBuilder code = new StringBuilder();
        code.append("public class Out {\n");
        code.append("public static void main( String[] args) {\n");
        if(ctx.function()!= null) {
            for(int i=0; i<ctx.function().size(); i++)
                code.append(this.visitFunction(ctx.function(i)));
        }

        if(ctx.statement()!= null) {
            for(int i=0; i<ctx.statement().size(); i++)
                code.append(this.visitStatement(ctx.statement(i)));
        }
        code.append("return;\n");
        code.append("}\n}\n");
        return code.toString();
    }

    @Override
    public String visitFunction(LangParser.FunctionContext ctx) {
        StringBuilder code = new StringBuilder();
        code.append("private void " + ctx.ID().getText() + "(){");
        if(ctx.statement()!= null) {
            for(int i=0; i<ctx.statement().size(); i++)
                code.append(this.visitStatement(ctx.statement(i)));
        }
        code.append("}\n");
        return code.toString();
    }

    @Override
    public String visitStatement(LangParser.StatementContext ctx) {
        StringBuilder code = new StringBuilder();
        if(ctx.var_define() != null)
            code.append(this.visitVar_define(ctx.var_define()));
        else if(ctx.assign() != null)
            code.append(this.visitAssign(ctx.assign()));
        else if(ctx.fun_print() != null)
            code.append(this.visitFun_print(ctx.fun_print()));
        else if(ctx.if_stat() != null)
            code.append(this.visitIf_stat(ctx.if_stat()));
        else if(ctx.while_stat() != null)
            code.append(this.visitWhile_stat(ctx.while_stat()));
        else if(ctx.for_stat() != null)
            code.append(this.visitFor_stat(ctx.for_stat()));
        else if(ctx.function_call() != null)
            code.append(this.visitFunction_call(ctx.function_call()));
        code.append(";\n");
        return code.toString();
    }

    @Override
    public String visitFunction_call(LangParser.Function_callContext ctx) {
        StringBuilder code = new StringBuilder();
        code.append(ctx.ID().getText()+"();");
        return code.toString();
    }

    @Override
    public String visitVar_define(LangParser.Var_defineContext ctx) {
        StringBuilder code = new StringBuilder();
        if (ctx.type() != null) {
            if (ctx.type().getText().equals("string"))
                code.append("String ");
            else
                code.append(ctx.type().getText() + " ");
        }
        code.append(ctx.ID().getText());
        if(ctx.expr() != null) {
            code.append(" = ");
            for (int i = 0; i < ctx.expr().size(); i++)
                code.append(this.visitExpr(ctx.expr(i)));
        }
        else if(ctx.var_value() != null) {
            for (int i = 0; i < ctx.var_value().size(); i++)
                code.append(this.visitVar_value(ctx.var_value(i)));

        }
        return code.toString();
    }

    @Override
    public String visitType(LangParser.TypeContext ctx) {
        StringBuilder code = new StringBuilder();
        TypeNode type = new TypeNode();
        if(ctx.TYPE_INT() != null )
            type.type = ctx.TYPE_INT().getText();
        else if(ctx.TYPE_CHAR() != null )
            type.type = ctx.TYPE_CHAR().getText();
        else if(ctx.TYPE_FLOAT() != null )
            type.type = ctx.TYPE_FLOAT().getText();
        else if(ctx.TYPE_STRING() != null )
            type.type = ctx.TYPE_STRING().getText();
        return code.toString();
    }

    @Override
    public String visitVar_value(LangParser.Var_valueContext ctx) {
        StringBuilder code = new StringBuilder();
        if(ctx.INT() != null ) {
            code.append(ctx.INT().getText());
        }
        else if(ctx.CHAR() != null ) {
            code.append(ctx.CHAR().getText());
        }
        else if(ctx.FLOAT() != null ) {
            code.append(ctx.FLOAT().getText());
        }
        else if(ctx.STRING() != null ) {
            code.append(ctx.STRING().getText());
        }
        else if(ctx.ID() != null ) {
            code.append(ctx.ID().getText());
        }
        else if(ctx.NULL() != null ) {
            code.append(ctx.NULL().getText());
        }
        return code.toString();
    }

    @Override
    public String visitAssign(LangParser.AssignContext ctx) {
        StringBuilder code = new StringBuilder();
        code.append(ctx.ID().getText() + " = " + this.visitExpr(ctx.expr()));
        return code.toString();
    }

    @Override
    public String visitFun_print(LangParser.Fun_printContext ctx) {
        StringBuilder code = new StringBuilder();
        code.append("System.out.println(");
        code.append(this.visitExpr(ctx.expr()));
        code.append(")");
        return code.toString();
    }

    @Override
    public String visitIf_stat(LangParser.If_statContext ctx) {
        StringBuilder code = new StringBuilder();
        code.append("if (");
        if(ctx.comparison() != null || ctx.expr() != null){
            for(int i=0; i<ctx.comparison().size(); i++) {
                code.append(this.visitComparison(ctx.comparison(i)));
            }
            for(int i=0; i<ctx.expr().size(); i++) {
                code.append(this.visitExpr(ctx.expr(i)));
            }
        }
        code.append("){\n");
        if(ctx.statement() != null) {
            for(int i=0; i<ctx.statement().size(); i++)
                code.append(this.visitStatement(ctx.statement(i)));
        }
        code.append("}");
        return code.toString();
    }

    @Override
    public String visitWhile_stat(LangParser.While_statContext ctx) {
        StringBuilder code = new StringBuilder();
        WhileNode whileNode = new WhileNode();

        if(ctx.comparison() != null || ctx.expr() != null){
            whileNode.conditions = new ArrayList<>();
           /* for(int i=0; i<ctx.comparison().size(); i++)
                whileNode.conditions.add(this.visitComparison(ctx.comparison(i)));
            for(int i=0; i<ctx.expr().size(); i++)
                whileNode.conditions.add(this.visitExpr(ctx.expr(i)));*/
        }
        if(ctx.statement() != null) {
            whileNode.statements = new ArrayList<>();
           // for(int i=0; i<ctx.statement().size(); i++)
             //   whileNode.statements.add(this.visitStatement(ctx.statement(i)));
        }

        return code.toString();
    }

    @Override
    public String visitFor_stat(LangParser.For_statContext ctx) {
        StringBuilder code = new StringBuilder();
        ForNode forNode = new ForNode();

        //forNode.forExpr = this.visitFor_expr(ctx.for_expr());

        if(ctx.statement() != null) {
            forNode.statements = new ArrayList<>();
            //for(int i=0; i<ctx.statement().size(); i++)
             //   forNode.statements.add(this.visitStatement(ctx.statement(i)));
        }

        return code.toString();
    }

    @Override
    public String visitFor_expr(LangParser.For_exprContext ctx) {
        StringBuilder code = new StringBuilder();
        ForExprNode forExpr = new ForExprNode();
        if(ctx.assign()!=null && ctx.expr() != null){
            //forExpr.assign = this.visitAssign(ctx.assign());
            //forExpr.expr = this.visitExpr(ctx.expr());
        }
        else if(ctx.ID() != null){
            forExpr.id = ctx.ID(0).getText();
            forExpr.arrayId = ctx.ID(1).getText();
        }
        return code.toString();
    }

    @Override
    public String visitExpr(LangParser.ExprContext ctx) {
        StringBuilder code = new StringBuilder();
        code.append(this.visitMult(ctx.mult(0)));
        for(int i=1; i<ctx.mult().size(); i++) {
            if(ctx.PLUS() != null)
                code.append(" + ");
            else if(ctx.MINUS() != null)
                code.append(" - ");
            code.append(this.visitMult(ctx.mult(i)));
        }

        return code.toString();
    }

    @Override
    public String visitMult(LangParser.MultContext ctx) {
        StringBuilder code = new StringBuilder();
        code.append(this.visitSubexpr(ctx.subexpr(0)));
        for(int i=1; i<ctx.subexpr().size(); i++) {
            if(ctx.DIVIDE() != null)
                code.append(" % ");
            else if(ctx.MOD() != null)
                code.append(" / ");
            else if(ctx.MULT() != null)
                code.append(" * ");
            code.append(this.visitSubexpr(ctx.subexpr(i)));
        }
        return code.toString();
    }

    @Override
    public String visitSubexpr(LangParser.SubexprContext ctx) {
        StringBuilder code = new StringBuilder();
        if(ctx.expr()!= null)
            code.append("(" + this.visitExpr(ctx.expr()) + ")");
        else if (ctx.var_value()!=null) {
            code.append(this.visitVar_value(ctx.var_value()));
        }
        return code.toString();
    }

    @Override
    public String visitComparison(LangParser.ComparisonContext ctx) {
        StringBuilder code = new StringBuilder();
        code.append(visitExpr(ctx.expr(0)));
        if(ctx.EQUALS() != null)
            code.append(" == ");
        else if(ctx.MORE_THAN() != null)
            code.append(" > ");
        else if(ctx.LESS_THAN() != null)
            code.append(" < ");
        else if(ctx.NOT_EQUALS() != null)
            code.append(" != ");
        code.append(visitExpr(ctx.expr(1)));
        return code.toString();
    }
}
