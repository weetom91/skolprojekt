import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class winRegister extends JFrame{

	private JLabel     name   	   = new JLabel  ("For och efternamn");
	private JLabel     adress      = new JLabel  ("Adress");
	private JLabel     email       = new JLabel  ("Email");
	private JLabel     telephone   = new JLabel  ("Telefonnummer");
	private JLabel     coworker    = new JLabel  ("Vill vara medarbetare?");
	private JLabel     password    = new JLabel  ("Onskat losenord");
	private JLabel     space       = new JLabel  ("     ");	
			
			JTextField nameTF 	   = new JTextField(10);
			JTextField adressTF    = new JTextField(10);
			JTextField emailTF     = new JTextField(10);
			JTextField telephoneTF = new JTextField(10);
			JTextField passwordTF  = new JTextField(10);

	private String[] coWorker       = {"Ja", "Nej"};
	private JComboBox<String> cobox = new JComboBox<>(coWorker);
			
			JButton    register    = new JButton ("Registrera");
			//Run r = new Run(); SQL klassen

			private void errorMsg(String msg) {
				JOptionPane optionPane = new JOptionPane(msg, JOptionPane.ERROR_MESSAGE);    
				JDialog dialog = optionPane.createDialog("Failure");
				dialog.setAlwaysOnTop(true);
				dialog.setVisible(true);
			}

	ActionListener wb4 = new ActionListener() {
	    public void actionPerformed(ActionEvent e) {

	    		if (((JButton)e.getSource()).getText().equals("Registrera")) {
					String getValue  = nameTF.getText();
					String getValue2 = adressTF.getText();
		    		String getValue3 = emailTF.getText();
		    		String getValue4 = telephoneTF.getText();
		    		String getValue6 = passwordTF.getText();

					if (getValue == null || getValue.isEmpty()) {
						errorMsg("Skriv in fullstandigt namn");
					}
					else if (getValue2 == null || getValue2.isEmpty()) {
						errorMsg("Skriv in adress");
					}
					else if (getValue3 == null || getValue3.isEmpty()) {
						errorMsg("Skriv in email");
					}
					else if (getValue4 == null || getValue4.isEmpty()) {
						errorMsg("Skriv in telefonnummer");
					}
			
					else if (getValue6 == null || getValue6.isEmpty()) {
						errorMsg("Skriv in losenord");
					}	    	
			}
    	}
	}; //Actionlistener

		public winRegister(){

		JPanel  p4 = new JPanel(new  GridLayout(10,10));
		setLayout(new  GridLayout(10,  10));
		
		setTitle("Registrera");
		add(p4);

		p4.add(name);
		p4.add(nameTF);

		p4.add(adress);
		p4.add(adressTF);

		p4.add(email);
		p4.add(emailTF);

		p4.add(telephone);
		p4.add(telephoneTF);

		p4.add(coworker);
		p4.add(cobox);

		p4.add(password);
		p4.add(passwordTF);
		
		p4.add(space);
		p4.add(register);
		register.addActionListener(wb4);

		setLayout(new FlowLayout());
		
		pack();
		setVisible(true);

		setDefaultCloseOperation(HIDE_ON_CLOSE);

	}// Metod

}//publika klassen 
