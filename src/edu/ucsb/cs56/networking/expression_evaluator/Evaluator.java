package edu.ucsb.cs56.networking.expression_evaluator;

public class Evaluator{
    
    public static int evaluate(Parser p){
	int result = 0;
	switch (p.getOp()){
	case "+":
	    result = p.getLHS() + p.getRHS();
	    break;
	case "-":
	    result = p.getLHS() - p.getRHS();
	    break;
	case "*":
	    result = p.getLHS() * p.getRHS();
	    break;
	case "/":
	    result = p.getLHS() / p.getRHS();
	    break;
	}
	return result;
    }
}
