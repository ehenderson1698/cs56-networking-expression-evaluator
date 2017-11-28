package edu.ucsb.cs56.networking.expression_evaluator;
import java.lang.*;
import java.io.*;
import java.net.*;

public class BasicServer {
    
    int portNum;
    ServerSocket servSock;
    ArrayList<Socket> clientSock;

    public BasicServer(int portNum){
	this.portNum = portNum;
    }
    
    public void runServer() {
	try {
	    servSock = new ServerSocket(portNum);
	    
	    System.out.println("Listening on port " + portNum + "...");
	    
	    clientSock.add(servSock.accept());
	    
	    System.out.println("Connecton established! Waiting for data transfer");
	    
	    PrintWriter out = new PrintWriter(clientSock.getOutputStream(), true);
	    BufferedReader in = new BufferedReader(new InputStreamReader(clientSock.getInputStream()));
	    
	    String input;
	    
	    while ((input = in.readLine()) != null) {
		System.out.println("The following expression has been received: " + input);
		
			Parser p = new Parser(input);
			Evaluator e = new Evaluator();
			int evaluated = e.evaluate(p);
		
		
			out.println(evaluated);
	    }
	    
	} catch (IOException ex) { System.out.println("Couldn't connect to port" + portNum); }
    }
    
    
    public static void main (String args[]) {
	
	BasicServer server = new BasicServer(3000);
	
	server.runServer();
	
    }
    
}
