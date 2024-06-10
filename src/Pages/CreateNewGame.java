package Pages;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JPanel;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.UIManager;

import game.GameSession;
import game.UnoGame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
/**
 * This class provides a frame to ask bot number and game name.
 * @author Muhammed Enes Andiç
 */
public class CreateNewGame {

	public JFrame frmUno;
	private JTextField game_name_field;
	public  int bot_number;
	public  String game_session_name;

	public  int getBot_number() {
		return bot_number;
	}

	public  String getGame_session_name() {
		return game_session_name;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateNewGame window = new CreateNewGame();
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
	public CreateNewGame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUno = new JFrame();
		frmUno.setTitle("UNO");
		frmUno.setBounds(500, 200, 546, 324);
		frmUno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUno.getContentPane().setLayout(null);
		
		game_name_field = new JTextField();
		this.game_session_name=game_name_field.getText();
		
		game_name_field.setBounds(252, 99, 250, 41);
		frmUno.getContentPane().add(game_name_field);
		game_name_field.setColumns(10);
		
		JLabel game_name_label = new JLabel("Game Name");
		game_name_label.setFont(new Font("Tahoma", Font.BOLD, 20));
		game_name_label.setBounds(82, 96, 147, 38);
		frmUno.getContentPane().add(game_name_label);
		
		JLabel bot_number_label = new JLabel("Bot Number");
		bot_number_label.setFont(new Font("Tahoma", Font.BOLD, 20));
		bot_number_label.setBounds(82, 168, 147, 38);
		frmUno.getContentPane().add(bot_number_label);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBounds(-13, 47, 574, 10);
		frmUno.getContentPane().add(panel);
		
		JLabel new_game_label = new JLabel("Create a New Game");
		ImageIcon img3=new ImageIcon(this.getClass().getResource("/new_game.png"));
		Image resize_img3=img3.getImage().getScaledInstance(25, 25,Image.SCALE_SMOOTH);
		new_game_label.setIcon(new ImageIcon(resize_img3));
		new_game_label.setForeground(new Color(0, 128, 128));
		new_game_label.setFont(new Font("Tahoma", Font.BOLD, 25));
		new_game_label.setBounds(10, 10, 303, 38);
		frmUno.getContentPane().add(new_game_label);
		
		JButton backMain = new JButton("Back to Main Menu");
		ImageIcon img4=new ImageIcon(this.getClass().getResource("/main-menu.png"));
		Image resize_img4=img4.getImage().getScaledInstance(50, 50,Image.SCALE_SMOOTH);
		backMain.setIcon(new ImageIcon(resize_img4));
		backMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					frmUno.dispose();
					MainMenu mainmenu=new MainMenu();
					mainmenu.frmUno.setVisible(true);
				}
				catch (Exception error) {
					JOptionPane.showMessageDialog(null, error);
				}
			}
		});
		backMain.setForeground(new Color(0, 128, 128));
		backMain.setBackground(UIManager.getColor("Button.background"));
		backMain.setFont(new Font("Tahoma", Font.BOLD, 20));
		backMain.setBounds(10, 225, 289, 52);
		frmUno.getContentPane().add(backMain);
		


		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1, null, 9, 1));
		
		
		JButton create = new JButton("Create");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					bot_number=(int) spinner.getValue();
					frmUno.dispose();
					UnoGame game=new UnoGame(bot_number);
					GameSession gameSession=new GameSession(bot_number,game);
					gameSession.frame.setVisible(true);
				}
				catch (Exception error) {
					JOptionPane.showMessageDialog(null, error);
				}
			}
		});
		
		create.setForeground(new Color(0, 128, 128));
		create.setFont(new Font("Tahoma", Font.BOLD, 20));
		create.setBounds(370, 225, 132, 52);
		frmUno.getContentPane().add(create);
		
		spinner.setFont(new Font("Tahoma", Font.BOLD, 20));
		spinner.setBounds(252, 168, 49, 34);
		frmUno.getContentPane().add(spinner);
	}
}
