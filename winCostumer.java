import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class winCostumer extends JFrame {

	private JFrame     jf 	    = new JFrame("Valkommen");
	private JPanel     p9 	    = new JPanel();	
	
	private JButton    book     = new JButton("Boka");
	private JButton    payBook  = new JButton("Betala");
	
		ActionListener wb9 = new ActionListener() {
	
			public void actionPerformed(ActionEvent e) {

				if (((JButton)e.getSource()).getText().equals("Boka")) {
					winBook wB = new winBook();
		
				}//if
			}//metod
		};//AL

	public winCostumer(){
		jf.add(p9);
		
		p9.add(book);
		p9.add(payBook);
			
		book.addActionListener(wb9);

		jf.setLayout(new FlowLayout());
		jf.setVisible(true);	
		jf.pack();

		setDefaultCloseOperation(HIDE_ON_CLOSE);
	}
}