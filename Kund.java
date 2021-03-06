import java.io.*;

public class Kund{
	public int kundNr;
	public String losenord = "";
	public String namn = "";
	public String adress = "";
	public String email = "";
	public int telefon;
	public String land = "";
	public String medlem = "";
	public String medarbetare = "";

	public void write(DataOutput out) throws IOException{
		out.writeInt(kundNr);
		out.writeBytes(String.format("%-10", losenord));
		out.writeBytes(String.format("%-20", namn));
		out.writeBytes(String.format("%-50", adress));
		out.writeBytes(String.format("%-50", email));
		out.writeInt(telefon);
		out.writeBytes(String.format("%-20", land));
		out.writeBytes(String.format("%-3", medlem));
		out.writeBytes(String.format("%-3", medarbetare));
	}

	public void read(DataInput in) throws IOException{
		kundNr = in.readInt();
		
		byte [] losenordBuf = new byte[10];
		in.readFully(losenordBuf);
		losenord = new String(losenordBuf);

		byte [] namnBuf = new byte[20];
		in.readFully(namnBuf);
		namn = new String(namnBuf);
		
		byte [] adressBuf = new byte[50];
		in.readFully(adressBuf);
		adress = new String(adressBuf);

		byte [] emailBuf = new byte[50];
		in.readFully(emailBuf);
		email = new String(emailBuf);

		telefon = in.readInt();

		byte [] landBuf = new byte[20];
		in.readFully(landBuf);
		land = new String(landBuf);

		byte [] medlemBuf = new byte[3];
		in.readFully(medlemBuf);
		medlem = new String(medlemBuf);

		byte [] medarbetareBuf = new byte[3];
		in.readFully(medarbetareBuf);
		medarbetare = new String(medarbetareBuf);
	}
}