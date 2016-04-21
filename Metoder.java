import java.sql.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Metoder extends JFrame{
	public static void main(String[]args){
		Metoder m = new Metoder();
	}

	//java -cp "sqlite-jdbc-3.8.11.2.jar;."  databas - SF/Metoder
	// i SQLITE3: .open ../databas - SF/SF.db

	Connection c;
	Statement s;

	public void createConn() {
		try{
			Class.forName("org.sqlite.JDBC");
		}

		catch(ClassNotFoundException e){
			System.out.println("Kan inte hitta driver, anledningen är:" + e.getMessage());
			System.exit(1);
		}

		c = null;
			try{
				c = DriverManager.getConnection("jdbc:sqlite:databas - SF/SF.db");
			} catch(SQLException se){
				System.out.println("Kan inte hitta driver-klassen! Anledningen är:" + se.getMessage());
				System.exit(1);
			}
			
			if(c != null){
				System.out.println("Connected!");
			}
	}//Stänger createConn

	public void createStatement() {
			try{
				s = c.createStatement();
			} catch(SQLException se){
				System.out.println("Exception medan vi försökte köra statementet... Anledningen:" + se.getMessage());
				System.exit(1);
			}
	}//Stänger createStatement
	
}