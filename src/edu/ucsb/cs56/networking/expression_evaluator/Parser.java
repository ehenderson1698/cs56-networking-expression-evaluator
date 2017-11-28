package edu.ucsb.cs56.networking.expression_evaluator;
import java.util.IO;

public class Parser{

    private int lhs;
    private String operator;
    private int rhs;
    
    public Parser(){
	lhs = 0;
	rhs = 0;
	operator = "+";
    }

    public Parser(String s){
        if(s.indexOf("+")>0){
	    parseHelper(s,"+");
	}
	else if(s.indexOf("-")>0){
	    parseHelper(s,"-");
	}
	else if(s.indexOf("*")>0){
	    parseHelper(s,"*");
	}
	else if(s.indexOf("/")>0){
	    parseHelper(s,"/");
	}
    }

    public void parseHelper(String s,String op){
	int index = s.indexOf(op);
	String left = s.substring(0,index);
	String right = s.substring(index+1);

	this.operator = op;
	this.lhs = Integer.parseInt(left);
	this.rhs = Integer.parseInt(right);
    }

    public int getLHS(){ return lhs; }

    public int getRHS(){ return rhs; }

    public String getOp(){ return operator; }
}
