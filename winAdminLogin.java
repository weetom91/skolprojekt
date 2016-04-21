import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class winAdminLogin extends JFrame{

	private JFrame      jf 		 = new JFrame("Admin");
	private JPanel  	p5 		 = new JPanel();

	private JButton create 	 	= new JButton ("Skapa Safari");
	private JButton book 		= new JButton ("Boka");
	private JButton status 		= new JButton ("Status");
	private JButton missionSta 	= new JButton ("Uppdragsbeskrivning");
	
	
			ActionListener wb5 = new ActionListener() {
	
			public void actionPerformed(ActionEvent e) {


				if (((JButton)e.getSource()).getText().equals("Skapa Safari")) {
					winCreate wC = new winCreate();
		
				}
				else if (((JButton)e.getSource()).getText().equals("Boka")) {
					winBook wB = new winBook();

				} 
				else if (((JButton)e.getSource()).getText().equals("Status")) {
					winStatus wS = new winStatus();
		
				}
				else if (((JButton)e.getSource()).getText().equals("Uppdragsbeskrivning")) {
					winMission wM = new winMission();
		
				}
			}//if
		};//AL


	public winAdminLogin(){

		p5.add(create);
		p5.add(book);
		p5.add(status);
		p5.add(missionSta);
		
		jf.add(p5);
		
		create.addActionListener(wb5);
		book.addActionListener(wb5);
		status.addActionListener(wb5);
		missionSta.addActionListener(wb5);
		
		jf.setLayout(new FlowLayout());
		jf.setVisible(true);	
		jf.pack();

		setDefaultCloseOperation(HIDE_ON_CLOSE);
	}

}