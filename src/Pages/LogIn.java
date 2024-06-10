package Pages;

import java.awt.EventQueue;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
/**
 * This class provides login page with text and password field. Moreover, 
 * if you want to create a new user, click sign up button or login with correct 
 * informations.
 * @author Muhammed Enes Andiç
 */
public class LogIn {

	public JFrame frmUno;
	public static final String FILE="users_data.txt";

	/**
	 * Launch the application.
	 */

	
	private JPasswordField passwordField;
	private JTextField username_field;
	
	/**
	 * Create the application.
	 */
	public LogIn() {
		initialize();
        Map<String,String> users_data=loadFromFile();
        if (users_data==null) {
        	users_data=new HashMap<>();
        	users_data.put("enes", "enes1234");
        }
        
        saveToFile(users_data);
		
	}
	public static Map<String,String> loadFromFile() {
		try (FileInputStream fis=new FileInputStream(FILE);
			 ObjectInputStream ois=new ObjectInputStream(fis)) {
			return (Map<String,String>) ois.readObject();
		}
		catch (IOException e) {
			return null;
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			return null; 
		}
	} 
	public static void saveToFile(Map<String,String> map)  {
		try (FileOutputStream fos=new FileOutputStream(FILE);
			 ObjectOutputStream oos=new ObjectOutputStream(fos)) {
			oos.writeObject(map);
		}
		catch (IOException e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUno = new JFrame();
		frmUno.setTitle("UNO");
		frmUno.getContentPane().setBackground(new Color(255, 255, 255));
		frmUno.getContentPane().setForeground(Color.BLACK);
		frmUno.setBounds(100, 100, 1232, 720);
		frmUno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUno.getContentPane().setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(696, 334, 317, 52);
		frmUno.getContentPane().add(passwordField);
		
		username_field = new JTextField();
		username_field.setBounds(696, 260, 317, 52);
		frmUno.getContentPane().add(username_field);
		username_field.setColumns(10);
		
		JButton Login_button = new JButton("Login");
		Login_button.setBackground(UIManager.getColor("Button.background"));
		Login_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
			        Map<String,String> users_data=loadFromFile();
			        if (users_data==null) {
			        	users_data=new HashMap<>();
			        	users_data.put("enes", "enes1234");
			        }
			        
			        saveToFile(users_data);
			        String username_text=username_field.getText();
			        String password_text=passwordField.getText();
			        if (users_data.containsKey(username_text)==true) {
			        	if (users_data.get(username_text).equals(password_text)) {
			        		try {
								frmUno.dispose();
								MainMenu mainMenu=new MainMenu();
								mainMenu.frmUno.setVisible(true);
							}
							catch(Exception error){
								JOptionPane.showMessageDialog(null, error);
							}
			        	}
			        	else {
			        		JOptionPane.showMessageDialog(null, "Password is incorrect!");
			        	}
			        }
			        else {
			        	JOptionPane.showMessageDialog(null,"User does not exist!");
			        }
				}
				catch (Exception e1){
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		Login_button.setForeground(new Color(0, 128, 128));
		Login_button.setFont(new Font("Tahoma", Font.BOLD, 20));
		Login_button.setBounds(696, 411, 317, 52);
		frmUno.getContentPane().add(Login_button);
		
		JLabel username = new JLabel("Username");
		username.setFont(new Font("Tahoma", Font.BOLD, 20));
		username.setBounds(563, 256, 180, 51);
		frmUno.getContentPane().add(username);
		
		JLabel password = new JLabel("Password");
		password.setFont(new Font("Tahoma", Font.BOLD, 20));
		password.setBounds(563, 329, 180, 52);
		frmUno.getContentPane().add(password);
		
		JLabel img_label = new JLabel("");
		img_label.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon img=new ImageIcon(this.getClass().getResource("/uno.png"));
		img_label.setIcon(img);
		img_label.setBounds(10, 43, 513, 583);
		frmUno.getContentPane().add(img_label);
		
		JLabel signup_label = new JLabel("If you do not have an account, please sign up.");
		signup_label.setForeground(new Color(0, 128, 128));
		signup_label.setFont(new Font("Tahoma", Font.BOLD, 15));
		signup_label.setBounds(658, 489, 372, 41);
		frmUno.getContentPane().add(signup_label);
		
		JButton signup_button = new JButton("Sign up");
		signup_button.setBackground(UIManager.getColor("Button.background"));
		signup_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					frmUno.dispose();
					SignUp signUp=new SignUp();
					signUp.frmUno.setVisible(true);
				}
				catch (Exception error) {
					JOptionPane.showMessageDialog(null, error);
				}
			}
		});
		signup_button.setFont(new Font("Tahoma", Font.BOLD, 20));
		signup_button.setBounds(755, 522, 186, 52);
		frmUno.getContentPane().add(signup_button);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(559, 473, 594, 10);
		frmUno.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.inactiveCaption);
		panel_1.setBorder(UIManager.getBorder("PasswordField.border"));
		panel_1.setBounds(559, 135, 594, 462);
		frmUno.getContentPane().add(panel_1);
	}

}

