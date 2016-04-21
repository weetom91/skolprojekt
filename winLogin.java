import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class winLogin extends JFrame{

	private JLabel     username   = new JLabel  ("Anvandarnamn");
	private JLabel     password   = new JLabel  ("Losenord");
	private JLabel     space      = new JLabel  ("     ");

			JTextField usernameTF = new JTextField(10);
			JTextField passwordTF = new JTextField(10);
			JButton    sysLogin   = new JButton ("Logga in");
			//Run r = new Run(); SQL klassen

	ActionListener wb2 = new ActionListener() {
	    public void actionPerformed(ActionEvent e) {

	    		if (((JButton)e.getSource()).getText().equals("Logga in")) {
	    			winAdminLogin wB = new winAdminLogin();
	    			winCostumer   wC = new winCostumer();
	    		/*String getValue  = usernameTF.getText();
	    		String getValue2 = passwordTF.getText();
	    		r.changeEmail(getValue,getValue2);*/
	    	}
    	}
	}; //Actionlistener

		public winLogin(){

		JPanel  p2 = new JPanel(new  GridLayout(3,5));
		setLayout(new  GridLayout(1,10));
		
		setTitle("Logga in");
		add(p2);
		
		p2.add(username);
		p2.add(usernameTF);
		
		p2.add(password);
		p2.add(passwordTF);
		
		p2.add(space);
		p2.add(sysLogin);
		sysLogin.addActionListener(wb2);

		setLayout(new FlowLayout());
		
		pack();
		setVisible(true);

		setDefaultCloseOperation(HIDE_ON_CLOSE);

	}// Metod

}//publika klassen 
