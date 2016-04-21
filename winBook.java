import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class winBook extends JFrame{

	private JLabel     memberId   = new JLabel  ("Medlemsnummer");
	private JLabel     name 	  = new JLabel  ("For och Efternamn");
	private JLabel     email 	  = new JLabel  ("Email");
	private JLabel     telefon 	  = new JLabel  ("Telefonnummer");
	private JLabel     total 	  = new JLabel  ("Deltagare");
	private JLabel     pole 	  = new JLabel  ("Antal fiskespon");
	private JLabel     boots 	  = new JLabel  ("Par stovlar");
	private JLabel     m 	 	  = new JLabel  ("          ");
	//private JLabel     lodging 	  = new JLabel  (""); JComboBox
	
	private String[] totalP   = {"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};		
    private String[] fpole    = {"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};
	private String[] bootsC   = {"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};
	
	private JComboBox<String> tbox = new JComboBox<>(totalP);
	private JComboBox<String> fbox = new JComboBox<>(fpole);
	private JComboBox<String> bbox = new JComboBox<>(bootsC);
	

			JTextField memberIdTF 	= new JTextField(20);
			JTextField nameTF 		= new JTextField(20);
			JTextField emailTF 		= new JTextField(20);
			JTextField telefonTF	= new JTextField(10);
			JTextField totalTF  	= new JTextField(10);

			JButton addBoka  = new JButton ("Boka");
			//Run r = new Run(); SQL klassen

			private void errorMsg(String msg) {
				JOptionPane optionPane = new JOptionPane(msg, JOptionPane.ERROR_MESSAGE);    
				JDialog dialog = optionPane.createDialog("Failure");
				dialog.setAlwaysOnTop(true);
				dialog.setVisible(true);
			}

	ActionListener wb3 = new ActionListener() {
	    public void actionPerformed(ActionEvent e) {

	    		if (((JButton)e.getSource()).getText().equals("Boka")) {
				String getValue  = memberIdTF.getText();
				String getValue2 = nameTF.getText();
	    		String getValue3 = emailTF.getText();
	    		String getValue4 = telefonTF.getText();
	    		String getValue5 = totalTF.getText();

					if (getValue2 == null || getValue2.isEmpty()) {
						errorMsg("Skriv in fullstandigt namn");
					}
					else if (getValue3 == null || getValue3.isEmpty()) {
						errorMsg("Skriv in email");
					}
					else if (getValue4 == null || getValue4.isEmpty()) {
						errorMsg("Skriv in telefonnummer");
					}
					else if (getValue5 == null || getValue5.isEmpty()) {
						errorMsg("Skriv in deltagare");
					}
			
					/*else {

	    		r.addMember(getValue,getValue2,getValue3,getValue4,getValue5,getValue6,getValue7,role2);
					}*/
	    	}
    	}
	}; //Actionlistener

		public winBook(){

		JPanel  p3 = new JPanel(new  GridLayout(8,1));
		setLayout(new  GridLayout(8,1));

		setTitle("Boka Safari");
		add(p3);
		
		p3.add(memberId);
		p3.add(memberIdTF);
		
		p3.add(name);
		p3.add(nameTF);
		
		p3.add(email);
		p3.add(emailTF);
		
		p3.add(telefon);
		p3.add(telefonTF);
		
		p3.add(total);
		p3.add(tbox);
		
		p3.add(pole);
		p3.add(fbox);
		
		p3.add(boots);
		p3.add(bbox);

		p3.add(m);
		
		p3.add(addBoka);
		p3.add(addBoka);
		addBoka.addActionListener(wb3);

		setLayout(new FlowLayout());
		
		pack();
		setVisible(true);

	}// Metod

}//publika klassen 
