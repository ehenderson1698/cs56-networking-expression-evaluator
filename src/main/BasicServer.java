import java.lang.*
import java.io.*
import java.net.*

public class BasicServer {

	privte int portNum;
	ServerSocket servSock;
	Socket clientSock;

	public void runServer {


		portNum = 3000;

		try {
		servSock = new ServerSocket(portNum);
		
		System.out.println("Listening on port " + portNum + "...");

		clientSock = serverSock.accept();

		PrintWriter out = new PrintWriter(clientSock.getOutputStream(), true);
		BufferedReader in = new BufferedReader(new InputStreamReader(clientSock.getInputStream()));
		
		String input;

		while ((input = in.readLine()) != null) {
			System.out.println("The following expression has been received: " + input);

			Parser p = new Parser(input);
			Evaluator e = new Evaluator(p.Parse())

			String evaluated = e.Evaluate();


			out.println(evaluated);
		}

		} catch (IOException ex) { System.out.println("Couldn't connect to port" + portNum) }



	public static void main (String args[]) {

		BasicServer server = new BasicServer();

		server.runServer();

	}
}
