
package game;

import java.awt.EventQueue;

import Pages.LogIn;
/**
 * This method initializes the game.
 * @author Muhammed Enes Andiç
 */
public class Main {
	public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						LogIn window = new LogIn();
						window.frmUno.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	}
