package edu.ucsb.cs56.networking.expression_evaluator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EvaluatorTest{
    private String s1 = "0+0";
    private String s2 = "1-2";
    private String s3 = "3*2";
    private String s4 = "5/2";
    private String s5 = "15+200";

    @Test
    public void test_Parser_1(){
	assertEquals(0,Evaluator.evaluate(new Parser(s1)));
    }

    @Test
    public void test_default_const(){
	assertEquals(0,Evaluator.evaluate(new Parser()));
    }
	    
}
