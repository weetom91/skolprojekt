import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class winMission extends JFrame{

	private JFrame      jf 		 = new JFrame("Uppdrag");
	private JTextArea   jta      = new JTextArea(20,20);
	private JScrollPane sp 		 = new JScrollPane(jta);
	private JPanel      p6 		 = new JPanel();	

	private JButton placeSafari  = new JButton ("Sok plats");
	private JButton searchBookNr = new JButton ("Hamta info");
	private JButton sendGuide    = new JButton ("Skicka Info till guide");
	
			JTextField placeTF 	 = new JTextField(10);
			JTextField bookNrTF  = new JTextField(10);
	
		ActionListener wb6 = new ActionListener() {
	
			public void actionPerformed(ActionEvent e) {

				/*if (((JButton)e.getSource()).getText().equals("Skapa Safri")) {
					//winCreate wC = new winCreate();
		
				}//if*/
			}//metod
		};//AL

	public winMission(){
		
		p6.add(placeTF);
		p6.add(placeSafari);

		p6.add(bookNrTF);
		p6.add(searchBookNr);

		p6.add(sendGuide);
	
		p6.add(sp);
		jf.add(p6);
	
		placeSafari.addActionListener(wb6);
		searchBookNr.addActionListener(wb6);
		sendGuide.addActionListener(wb6);
		
		jf.setLayout(new FlowLayout());
		jf.setVisible(true);	
		jf.pack();

		setDefaultCloseOperation(HIDE_ON_CLOSE);
	}

}