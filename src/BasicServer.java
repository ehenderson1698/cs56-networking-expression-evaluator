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
		
		System.out.println("Attempting to connect to port " + portNum);

		clientSock = serverSock.accept();

		out = new PrintWriter(clientSock.getOutputStream(), true);
		in = new BufferedReader(new InputStreamReader(clientSock.getInputStream()));

		} catch (IOException ex) {ex.printStackTrace(); }



	public static void main (String args[]) {

		BasicServer server = new BasicServer();

		server.runServer();

	}
}
