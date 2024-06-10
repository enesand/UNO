package Pages;

import java.awt.EventQueue;



import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollBar;
/**
 * This class provides main menu interface of the game.
 * This class is a kind of bridge since it has connection to Help, Login, CreateNewGame 
 * classes.
 * @author Muhammed Enes Andiç
 */
public class MainMenu {

	public JFrame frmUno;
	public static final String FILE_PATH="users_statistics.txt";


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
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
	public MainMenu() {
		initialize();
		
	}
	
	public static Map<String,int[]> loadToFile() {
		try (FileInputStream fis=new FileInputStream(FILE_PATH);
				 ObjectInputStream ois=new ObjectInputStream(fis)) {
				return (Map<String,int[]>) ois.readObject();
			}
			catch (IOException e) {
				return null;
			}
			catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				return null; 
			}
	}
	public static void saveToFile(Map<String,int[]> map)  {
		try (FileOutputStream fos=new FileOutputStream(FILE_PATH);
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
		frmUno.setBounds(100, 100, 1232, 720);
		frmUno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUno.getContentPane().setLayout(null);
		ImageIcon img=new ImageIcon(this.getClass().getResource("/leaderboard.png"));
		Image resize_img=img.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		
		JButton helpButton = new JButton("Help");
		helpButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					frmUno.dispose();
					Help help=new Help();
					help.frmUno.setVisible(true);
				}
				catch (Exception error) {
					JOptionPane.showMessageDialog(null, error);
				}
			}
		});
		ImageIcon img2=new ImageIcon(this.getClass().getResource("/help.png"));
		Image resize_img2=img2.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		helpButton.setIcon(new ImageIcon(resize_img2));
		helpButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		helpButton.setForeground(new Color(0, 128, 128));
		helpButton.setBackground(UIManager.getColor("Button.background"));
		helpButton.setBounds(366, 211, 419, 103);
		frmUno.getContentPane().add(helpButton);
		
		JButton new_game_button = new JButton("New Game");
		new_game_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmUno.dispose();
				CreateNewGame createnewgame=new CreateNewGame();
				createnewgame.frmUno.setVisible(true);
			}
		});
		ImageIcon img3=new ImageIcon(this.getClass().getResource("/new_game.png"));
		Image resize_img3=img3.getImage().getScaledInstance(50, 50,Image.SCALE_SMOOTH);
		new_game_button.setIcon(new ImageIcon(resize_img3));
		new_game_button.setBackground(UIManager.getColor("Button.background"));
		new_game_button.setForeground(new Color(0, 128, 128));
		new_game_button.setFont(new Font("Tahoma", Font.BOLD, 30));
		new_game_button.setBounds(366, 354, 419, 103);
		frmUno.getContentPane().add(new_game_button);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBounds(0, 107, 1208, 10);
		frmUno.getContentPane().add(panel);
		
		JLabel maın_menu_label = new JLabel("MAIN MENU");
		ImageIcon img4=new ImageIcon(this.getClass().getResource("/main-menu.png"));
		Image resize_img4=img4.getImage().getScaledInstance(50, 50,Image.SCALE_SMOOTH);
		maın_menu_label.setIcon(new ImageIcon(resize_img4));
		maın_menu_label.setBackground(UIManager.getColor("Button.background"));
		maın_menu_label.setForeground(new Color(0, 128, 128));
		maın_menu_label.setFont(new Font("Tahoma", Font.BOLD, 30));
		maın_menu_label.setBounds(10, 40, 283, 38);
		frmUno.getContentPane().add(maın_menu_label);
		
		JButton logout_button = new JButton("Logout");
		logout_button.addActionListener(new ActionListener() {
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
		ImageIcon img5=new ImageIcon(this.getClass().getResource("/logout.png"));
		Image resize_img5=img5.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		logout_button.setIcon(new ImageIcon(resize_img5));
		logout_button.setFont(new Font("Tahoma", Font.BOLD, 30));
		logout_button.setForeground(new Color(0, 128, 128));
		logout_button.setBounds(366, 493, 419, 103);
		frmUno.getContentPane().add(logout_button);
	}
}
