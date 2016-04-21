import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class winCreate extends JFrame {

	private JFrame     jf 	    = new JFrame("Skapa Safaritillfalle");
	private JPanel     p7 	    = new JPanel();	
	
	private String[] text = {"Storsjon", "Ladan", "Kovattnet"};
	private JComboBox<String> box = new JComboBox<>(text);
	
	private JLabel     date     = new JLabel("Datum");
			JTextField dateTF  = new JTextField(10);

	private JButton    createST = new JButton ("Skapa Safari");
	
		ActionListener wb7 = new ActionListener() {
	
			public void actionPerformed(ActionEvent e) {

				/*if (((JButton)e.getSource()).getText().equals("Skapa Safari")) {
					//winCreate wC = new winCreate();
		
				}//if*/
			}//metod
		};//AL

	public winCreate(){
		jf.add(p7);
		
		p7.add(box);
		
		p7.add(date);
		p7.add(dateTF);

		p7.add(createST);
	
		createST.addActionListener(wb7);

		jf.setLayout(new FlowLayout());
		jf.setVisible(true);	
		jf.pack();

		setDefaultCloseOperation(HIDE_ON_CLOSE);
	}
}