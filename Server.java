
import java.io.*;
import java.net.*;

public class Server{
	public static KundDatabas dbas;

	public static void main(String[]args) throws IOException{
		int lyssnarPort = Integer.parseInt(args[0]);

		ServerSocket lyssnarSock = new ServerSocket(lyssnarPort);

		System.out.println("Lyssnar på port nummer:" + lyssnarPort);

		dbas = new KundDatabas("Kund");

		while(true){
			Socket klientSock = lyssnarSock.accept();
			System.out.println(klientSock.getInetAddress().getHostName() + " ansluten");
			new KlientHanterare(klientSock);
		}

	}//Stänger main
	
}//Stänger klassen