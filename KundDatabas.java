import java.io.*;

public class KundDatabas{
	private RandomAccessFile fil;
	private String filnamn;
	private Kund post = new Kund();

	public KundDatabas(String filnamn) throws IOException{
		this.filnamn = filnamn;
		open();
	}

	public void open() throws IOException{
		if(fil == null){
			fil = new RandomAccessFile(filnamn, "rw");
		}
	}

	public void close() throws IOException{
		if(fil != null){
			fil.close();
			fil = null;
		}
	}

	@Override
	public void finalize() throws Throwable{
		close();
		super.finalize();
	}

	public synchronized boolean transaktion(int kundNr, String losenord, String namn, String adress, String email, int telefon, String land, String medlem, String medarbetare, Kund k) throws IOException{
		//kod för att lagra sid 633-634
		return true; //endast för kompilering
	}
}