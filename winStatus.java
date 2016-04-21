import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
 
import javax.swing.JFormattedTextField.AbstractFormatter;

public class winStatus extends JFrame{

	private JFrame      jf 		 = new JFrame("Status");

	private JPanel      p8 		 = new JPanel();	

	private JButton placeSafari  = new JButton ("Sok plats");
	private String[] text = {"Storsjon", "Ladan", "Kovattnet"};
	private JComboBox<String> box = new JComboBox<>(text);
	
		ActionListener wb8 = new ActionListener() {
	
			public void actionPerformed(ActionEvent e) {

				/*if (((JButton)e.getSource()).getText().equals("Skapa Safri")) {
					//winCreate wC = new winCreate();
		
				}//if*/
			}//metod
		};//AL

	public winStatus(){
		
		p8.add(box);
		p8.add(placeSafari);

		jf.add(p8);
	
		placeSafari.addActionListener(wb8);
		

		jf.setLayout(new FlowLayout());
		jf.setVisible(true);	
		jf.pack();

		setDefaultCloseOperation(HIDE_ON_CLOSE);
	}

}