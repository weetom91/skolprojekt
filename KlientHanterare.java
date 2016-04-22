import java.io.*;
import java.net.*;

public class KlientHanterare implements Runnable{
	public Thread aktivitet = new Thread(this);
	Socket so;
	
	DataInputStream streamIn;
	DataOutputStream streamOut;

	public KlientHanterare(Socket s) throws IOException{
		so = s;

		streamIn = new DataInputStream(s.getInputStream());
		streamOut = new DataOutputStream(s.getOutputStream());
		aktivitet.start();
	}

	public void run(){
		Kund k = new Kund(); 

		while(true){
			try{
				int kundNr = streamIn.readInt();
				String losenord = streamIn.readLine();
				String namn = streamIn.readLine();
				String adress = streamIn.readLine();
				String email = streamIn.readLine();
				int telefon = streamIn.readInt();
				String land = streamIn.readLine();
				String medlem = streamIn.readLine();
				String medarbetare = streamIn.readLine();

				boolean transOK = Server.dbas.transaktion(kundNr, losenord, namn, adress, email, telefon, land, medlem, medarbetare, k);
				streamOut.writeBoolean(transOK);
				k.write(streamOut);
			}

			catch(IOException e) {
				break;
			}

			System.out.println(so.getInetAddress().getHostName() + "Nedkopplad");

			try{
				so.close();
			}

			catch(IOException e){
				
			}
		}
	}
}