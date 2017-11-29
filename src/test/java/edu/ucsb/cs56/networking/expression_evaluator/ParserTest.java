package edu.ucsb.cs56.networking.expression_evaluator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ParserTest{
    private String s1 = "0+0";
    private String s2 = "1-2";
    private String s3 = "3*2";
    private String s4 = "5/2";
    private String s5 = "15+200";

    @Test
    public void test_Parser_1(){
	Parser p = new Parser(s1);
	assertEquals(0,p.getLHS());
	assertEquals(0,p.getRHS());
	assertEquals("+",p.getOp());

    }

    @Test
    public void test_default_const(){
	Parser p = new Parser();
	assertEquals(0,p.getLHS());
	assertEquals(0,p.getRHS());
	assertEquals("+",p.getOp());
    }
	    
}
