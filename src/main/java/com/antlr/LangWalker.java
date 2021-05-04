package com.antlr;

public class LangWalker extends LangBaseListener {
    public void enterR(LangParser.ExprContext ctx ) {
        System.out.println( "Entering R : " + ctx.getText() );
    }

    public void exitR(LangParser.ExprContext ctx ) {
        System.out.println( "Exiting R" );
    }
}
