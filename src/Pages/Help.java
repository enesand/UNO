package Pages;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * This class provides basic information about Uno game.
 * @author Muhammed Enes Andiç
 */
public class Help {

	JFrame frmUno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Help window = new Help();
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
	public Help() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUno = new JFrame();
		frmUno.setTitle("Uno");
		frmUno.setBounds(100, 100, 1232, 720);
		frmUno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUno.getContentPane().setLayout(null);

		
		JButton btnNewButton = new JButton("Back to Maın Menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					frmUno.dispose();
					MainMenu mainMenu=new MainMenu();
					mainMenu.frmUno.setVisible(true);
				}
				catch (Exception error) {
					JOptionPane.showMessageDialog(null, error);
				}
			}
		});
		btnNewButton.setForeground(new Color(0, 128, 128));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(740, 532, 368, 112);
		frmUno.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 20, 720, 640);
		frmUno.getContentPane().add(lblNewLabel);
		ImageIcon icon=new ImageIcon(getClass().getResource("/rules.png"));
		lblNewLabel.setIcon(icon);
		

	}
}
