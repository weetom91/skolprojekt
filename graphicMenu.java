import  java.awt.*;
import  java.awt.event.*;
import  javax.swing.*;

public class graphicMenu extends JFrame{

	private JButton book 	 = new JButton ("Boka");
	private JButton login 	 = new JButton ("Logga in");
	private JButton register = new JButton ("Registrera");
	
	public void graphicMenu() {
			ActionListener bl = new ActionListener() {
	
			public void actionPerformed(ActionEvent e) {

				if (((JButton)e.getSource()).getText().equals("Boka")) {
					winBook wB = new winBook();

				} 
				else if (((JButton)e.getSource()).getText().equals("Logga in")) {
					winLogin wL = new winLogin();
		
				}
				else if (((JButton)e.getSource()).getText().equals("Registrera")) {
					winRegister wR = new winRegister();
		
				}
			
			}//if
		};//AL
	
		JPanel  p1 = new JPanel(new  FlowLayout());
		
		setTitle("Valkommen");
		add(p1);
		
		p1.add(book);
		p1.add(login);
		p1.add(register);
	
		book.addActionListener(bl);
		login.addActionListener(bl);
		register.addActionListener(bl);

		setLayout(new FlowLayout());
		
		pack();
		setVisible(true);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}