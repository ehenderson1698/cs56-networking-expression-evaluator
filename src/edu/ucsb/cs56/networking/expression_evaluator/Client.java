package edu.ucsb.cs56.networking.expression_evaluator;
import java.lang.*;
import java.io.*;
import java.net.*;

public class Client {

	int portNum;
	String expression;

	public Client(int portNum) {
		this.portNum = portNum;
	}


	public void runClient() {
		try {
			Socket s1 = new Socket("localhost", portNum);
			PrintWriter out = new PrintWriter(s1.getOutputStream(), true);
			System.out.println("Sending expression: " + expression);
			out.print(expression);

			
			BufferedReader in = new BufferedReader(new InputStreamReader(s1.getInputStream()));
			System.out.println(in.readLine());
		    }
		catch(Exception ex) {
			System.out.println("Sorry, nothing was returned");
		}
	}

	public void set(String e1) {
		this.expression = e1;
	}



	public  void main (String args[]) {
		String testExpresh1 = ("3+3");
		Client c1 = new Client(3000);
		c1.set(testExpresh1);
		c1.runClient();
	} 
}
