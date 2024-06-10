package Pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
/**
 * This class provides registration process for a new user.
 * @author Muhammed Enes Andiç
 */
public class SignUp {

	public JFrame frmUno;
	private JTextField username_field;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp window = new SignUp();
					window.frmUno.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SignUp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUno = new JFrame();
		frmUno.setTitle("\r\n\r\n\r\nUNO");
		frmUno.getContentPane().setBackground(new Color(255, 255, 255));
		frmUno.setBounds(100, 100, 1232, 720);
		frmUno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUno.getContentPane().setLayout(null);
		
		JLabel password_label = new JLabel("Password");
		password_label.setFont(new Font("Tahoma", Font.BOLD, 20));
		password_label.setBounds(17, 298, 125, 38);
		frmUno.getContentPane().add(password_label);
		
		JLabel password_copy_label = new JLabel("Password copy");
		password_copy_label.setFont(new Font("Tahoma", Font.BOLD, 20));
		password_copy_label.setBounds(17, 346, 179, 38);
		frmUno.getContentPane().add(password_copy_label);
		ImageIcon img=new ImageIcon(this.getClass().getResource("/uno.png"));
		
		JButton signup_button = new JButton("Sign Up");
		signup_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
			        Map<String,String> users_data=LogIn.loadFromFile();
			        if (users_data==null) {
			        	users_data=new HashMap<>();
			        }
			        users_data.put("enes", "enes1234");
			        LogIn.saveToFile(users_data);
					String username_text=username_field.getText();
					String password_text=passwordField.getText();
					String password_copy_text=passwordField_1.getText();
					if (users_data.containsKey(username_text)) {
						JOptionPane.showMessageDialog(null, "User already exists.");
					}
					else {
						if (password_text.equals(password_copy_text)) {
							users_data.put(username_text,password_text);
							LogIn.saveToFile(users_data);
							JOptionPane.showMessageDialog(null, "Registration is successful!");
						}
						else {
							JOptionPane.showMessageDialog(null, "Passwords are not matched!");
							}
					}
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		signup_button.setBackground(UIManager.getColor("Button.background"));
		signup_button.setFont(new Font("Tahoma", Font.BOLD, 20));
		signup_button.setForeground(new Color(0, 128, 128));
		signup_button.setBounds(17, 438, 186, 52);
		frmUno.getContentPane().add(signup_button);
		

		
		JButton back_login = new JButton("Back to Login");
		back_login.setBackground(UIManager.getColor("Button.background"));
		back_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					frmUno.dispose();
					LogIn login=new LogIn();
					login.frmUno.setVisible(true);
				}
				catch(Exception error){
					JOptionPane.showMessageDialog(null, error);
				}
			}
		});
		back_login.setFont(new Font("Tahoma", Font.BOLD, 20));
		back_login.setForeground(new Color(0, 128, 128));
		back_login.setBounds(377, 438, 186, 52);
		frmUno.getContentPane().add(back_login);
		
		JLabel img_label = new JLabel("");
		img_label.setBounds(659, 70, 512, 512);
		frmUno.getContentPane().add(img_label);
		img_label.setHorizontalAlignment(SwingConstants.CENTER);
		img_label.setIcon(img);
		img_label.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBorder(UIManager.getBorder("PasswordField.border"));
		panel.setBounds(10, 149, 582, 400);
		frmUno.getContentPane().add(panel);
		panel.setLayout(null);
		
		username_field = new JTextField();
		username_field.setBounds(183, 76, 365, 52);
		panel.add(username_field);
		username_field.setColumns(10);
		
		JLabel username_label = new JLabel("Username");
		username_label.setBounds(10, 91, 125, 38);
		panel.add(username_label);
		username_label.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		passwordField = new JPasswordField();
		passwordField.setBounds(183, 134, 365, 52);
		panel.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(183, 196, 365, 52);
		panel.add(passwordField_1);
	}
}
