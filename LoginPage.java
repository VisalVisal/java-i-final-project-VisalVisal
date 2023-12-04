package FinalProject;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JTextField;
import javax.swing.JButton;

public class LoginPage extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField nameTextField;
	private JPasswordField passwordTextField;
    private JLabel loginStatus;
	private JButton loginButton;
	private JButton resetButton;

	 HashMap<String,String> logininfo = new  HashMap<String,String>();
	 IDandPassword iDandPassword = new IDandPassword();
	 ShoppingPage shop = new ShoppingPage(iDandPassword.getLoginInfo());

	 
	 
	 
	public LoginPage(HashMap<String,String> loginInfoOriginal) {
		 logininfo = loginInfoOriginal;
		
		setTitle("Log in page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 881, 747);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(160, 95, 571, 480);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel userName = new JLabel("Username:");
		userName.setFont(new Font("Tahoma", Font.BOLD, 20));
		userName.setBounds(57, 141, 162, 36);
		panel.add(userName);
		
		JLabel userPassword = new JLabel("Password:");
		userPassword.setFont(new Font("Tahoma", Font.BOLD, 20));
		userPassword.setBounds(57, 217, 162, 36);
		panel.add(userPassword);
		
		nameTextField = new JTextField();
		nameTextField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nameTextField.setBounds(184, 150, 233, 19);
		panel.add(nameTextField);
		nameTextField.setColumns(10);
		
		passwordTextField = new JPasswordField();
		passwordTextField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		passwordTextField.setColumns(10);
		passwordTextField.setBounds(184, 227, 233, 19);
		panel.add(passwordTextField);
		
	    loginButton = new JButton("Login");
		loginButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		loginButton.setBounds(141, 282, 131, 30);
		loginButton.setFocusable(false);
		loginButton.addActionListener(this);
		panel.add(loginButton);
		
		resetButton = new JButton("Reset");
		resetButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		resetButton.setFocusable(false);
		resetButton.setBounds(286, 282, 131, 30);
		resetButton.addActionListener(this);
		panel.add(resetButton);
		
		loginStatus = new JLabel("Log In to Continue");
		loginStatus.setFont(new Font("Tahoma", Font.BOLD, 20));
		loginStatus.setBounds(187, 76, 276, 43);
		panel.add(loginStatus);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== resetButton) {
			nameTextField.setText("");
			passwordTextField.setText("");
		}
		if(e.getSource()==loginButton) {
			String userName = nameTextField.getText();
			String password = String.valueOf(passwordTextField.getText());
			
			if(logininfo.containsKey(userName)) {
				if(logininfo.get(userName).equals(password)) {
					shop.setVisible(true);
		           } else {
		        	loginStatus.setForeground(Color.red);
				    loginStatus.setFont(new Font("Tahoma", Font.BOLD, 30));
			        loginStatus.setText("Try Again!");
		           }
		            
				
			}
			
		}
		
	}
}
