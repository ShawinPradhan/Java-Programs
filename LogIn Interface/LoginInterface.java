// Creating a simple LogIn interface using Java Swing

package GUIpractice;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoginInterface implements ActionListener {

	private static JLabel userLabel, passLabel, success;
	private static JTextField userText;
	private static JPasswordField passText;
	private static JButton button;
	
	
	public static void main(String[] args) {
		JPanel panel = new JPanel(); //creating object for Java Panel
		//panel is the body that contains all the details like text images
		JFrame frame = new JFrame(); //creating object for Java Frame
		//frame is used for the window that pops up
		frame.setSize(450,250); //setting size of the window 450 width 300 height(in pixel)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closing the window through exit
		frame.add(panel); //adding panel to the frame
		
		panel.setLayout(null); // layout is the content where we can add rows and columns
		
		userLabel = new JLabel("UserName:"); //creating object for Java Label
		//label actually contains field like User name, password and login button
		userLabel.setBounds(50, 20, 80, 25); //the size of the text (x,y,width height)
		panel.add(userLabel); //adding label to the panel to be shown
		
		passLabel = new JLabel("Password:");
		passLabel.setBounds(50, 60, 80,25);
		panel.add(passLabel);
		
		userText = new JTextField(20); //creating object for Java Text Field
		//20 in JTextField states the length of the text field like 20 characters
		userText.setBounds(130, 20, 200, 25); //size of the box (x,y,width height)
		//100 is the pixel count from the left side of panel similarly 20 is the pixel count from the top
		//200 is the length of the box and 25 is the height of the box
		panel.add(userText); //adding the box to panel
		
		passText = new JPasswordField();
		passText.setBounds(130, 60, 200, 25);
		panel.add(passText);
		
		
		button = new JButton("LogIn");
		button.setBounds(180, 100, 80, 25);
		//this is added so that when we press the login it checks certain criteria and displays a message
		button.addActionListener(new LoginInterface()); //adding with the main class 
		panel.add(button);
		
		success = new JLabel("");
		success.setBounds(50, 140, 300, 25);
		panel.add(success);
		
		frame.setVisible(true); //making the frame visible to the user

	}

	@Override
	public void actionPerformed(ActionEvent e) //method created to store what Login button does
	{
		String user = userText.getText();
		String password = passText.getText();
		System.out.println(user +", " +password);
		
		if(user.equals("Shawin") && password.equals("admin123"))
		{
			success.setText("Login Successful!");
		}
		else
		{
			success.setText("Please check the UserName/Password!!");
		}
	}

}
