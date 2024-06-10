package game;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import Pages.MainMenu;
import Pages.SignUp;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

/**
 * This class basically provides GUI part of the game.
 * @author Muhammed Enes Andiç
 */
public class GameSession {

	public JFrame frame;
	private JPanel playerHand;
	private JPanel groundCard;

	public UnoGame game;
	private List<JButton> button_list;
	public JLabel groundLabel;
	private JPanel botInfoPanel;



	/**
	 * Create the application.
	 */
	public GameSession(int bot_number,UnoGame game) {
		this.game=game;
		this.button_list=new ArrayList<>();
		initialize();
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 * @author Muhammed Enes Andiç
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1232, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel playerHand = new JPanel();
		playerHand.setBounds(10, 334, 1155, 323);
		frame.getContentPane().add(playerHand);
		this.playerHand=playerHand;
		playerHand.setLayout(null);
		

		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(10, 27, 100, 138);
		playerHand.add(btnNewButton_1);
		button_list.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(123, 27, 100, 138);
		playerHand.add(btnNewButton_2);
		button_list.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(233, 27, 100, 138);
		playerHand.add(btnNewButton_3);
		button_list.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(343, 27, 100, 138);
		playerHand.add(btnNewButton_4);
		button_list.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setBounds(453, 27, 100, 138);
		playerHand.add(btnNewButton_5);
		button_list.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("New button");
		btnNewButton_6.setBounds(568, 27, 100, 138);
		playerHand.add(btnNewButton_6);
		button_list.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("New button");
		btnNewButton_7.setBounds(678, 27, 100, 138);
		playerHand.add(btnNewButton_7);
		button_list.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("New button");
		btnNewButton_8.setBounds(788, 27, 100, 138);
		playerHand.add(btnNewButton_8);
		button_list.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("New button");
		btnNewButton_9.setBounds(898, 27, 100, 138);
		playerHand.add(btnNewButton_9);
		button_list.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("New button");
		btnNewButton_10.setBounds(1008, 27, 100, 138);
		playerHand.add(btnNewButton_10);
		button_list.add(btnNewButton_10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(10, 175, 100, 138);
		playerHand.add(btnNewButton);
		button_list.add(btnNewButton);
		
		JButton btnNewButton_11 = new JButton("New button");
		btnNewButton_11.setBounds(120, 175, 100, 138);
		playerHand.add(btnNewButton_11);
		button_list.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("New button");
		btnNewButton_12.setBounds(233, 175, 100, 138);
		playerHand.add(btnNewButton_12);
		button_list.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("New button");
		btnNewButton_13.setBounds(343, 175, 100, 138);
		playerHand.add(btnNewButton_13);
		button_list.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("New button");
		btnNewButton_14.setBounds(453, 175, 100, 138);
		playerHand.add(btnNewButton_14);
		button_list.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("New button");
		btnNewButton_15.setBounds(568, 175, 100, 138);
		playerHand.add(btnNewButton_15);
		button_list.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("New button");
		btnNewButton_16.setBounds(678, 175, 100, 138);
		playerHand.add(btnNewButton_16);
		button_list.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("New button");
		btnNewButton_17.setBounds(788, 175, 100, 138);
		playerHand.add(btnNewButton_17);
		button_list.add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("New button");
		btnNewButton_18.setBounds(898, 175, 100, 138);
		playerHand.add(btnNewButton_18);
		button_list.add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("New button");
		btnNewButton_19.setBounds(1008, 175, 100, 138);
		playerHand.add(btnNewButton_19);
		button_list.add(btnNewButton_19);
		
		JPanel groundCard = new JPanel();
		groundCard.setBounds(36, 37, 98, 134);
		frame.getContentPane().add(groundCard);
		groundCard.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		this.groundLabel=lblNewLabel;
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 100, 138);
		groundCard.add(lblNewLabel);
		GroundCardImage img2=new GroundCardImage(game.groundColor,game.groundValue);
		ImageIcon groundCardImg=img2.convertGroundImage();
		lblNewLabel.setIcon(groundCardImg);
		updateCards(lblNewLabel);
		JButton drawCardButton = new JButton("Draw Card");
		drawCardButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (game.unoDeck.isEmpty()) {
					JOptionPane.showMessageDialog(null,"There is no card in the deck, game has finished. Go to Main Menu!");
					frame.dispose();
					MainMenu mainmenu=new MainMenu();
					mainmenu.frmUno.setVisible(true);
					return;
				}
				UnoCard addingCard=game.unoDeck.drawCard();
				game.unoDeck.removeTopCard();
				game.playerHand.add(addingCard);
				updatePlayerHand(addingCard,lblNewLabel);
				
			}
		});
		
		drawCardButton.setForeground(new Color(0, 128, 128));
		drawCardButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		drawCardButton.setBounds(10, 261, 147, 63);
		frame.getContentPane().add(drawCardButton);
		
		JButton btnNewButton_20 = new JButton("UNO");
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (game.playerHand.size()==1) {
					UnoCard card=game.playerHand.get(0);
					if (game.isValidCard(card)) {
						JOptionPane.showMessageDialog(null, "YOU WON THE GAME!");
						game.playerWon=true;
					}
					else {
						JOptionPane.showMessageDialog(null, "You still have cards!");
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "You still have cards!");
				}
			}
			
		});
		btnNewButton_20.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_20.setForeground(new Color(0, 128, 128));
		btnNewButton_20.setBounds(10, 192, 147, 63);
		frame.getContentPane().add(btnNewButton_20);
		
		JPanel botInfoPanel = new JPanel();
		this.botInfoPanel=botInfoPanel;
		botInfoPanel.setBounds(467, 28, 154, 296);
		frame.getContentPane().add(botInfoPanel);
		
		JButton btnNewButton_21 = new JButton("Main Menu");
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					frame.dispose();
					MainMenu main=new MainMenu();
					main.frmUno.setVisible(true);
				}
				catch (Exception error) {
					JOptionPane.showMessageDialog(null, error);
				}
		
			}
		});
		btnNewButton_21.setForeground(new Color(0, 128, 128));
		btnNewButton_21.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_21.setBounds(938, 37, 205, 68);
		frame.getContentPane().add(btnNewButton_21);
		
		
		botInfo();
		
	
	}
	/**
	 * Bot name and how many cards the bot holds mus be shown in the game session
	 * and this method achieves that.
	 * @author Muhammed Enes Andiç
	 */
	public void botInfo() {
		if (botInfoPanel!=null) {
			botInfoPanel.removeAll();
		}
		for (int i=0;i<game.getBot_list().size();i++) {
			int cardNumber=game.bot_list.get(i).cardsOfBot.size();
			int id=game.bot_list.get(i).getBot_id();
			JLabel lblNewLabel_1 = new JLabel("Bot"+ id + " has "+cardNumber+" cards");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblNewLabel_1.setBounds(470, 30+35*i, 174, 25);
			botInfoPanel.add(lblNewLabel_1);
		}
	}
	/**
	 * This method updates cards in ground and player hand.
	 * @param lblNewLabel
	 * @author Muhammed Enes Andiç
	 */
	public void updateCards(JLabel lblNewLabel) {
		for (int i=0;i<game.playerHand.size();i++) {
			UnoCard playerCard=game.playerHand.get(i);
			CardImage img=new CardImage(playerCard);
			ImageIcon cardimg=img.convertImage();
			JButton button=button_list.get(i);
			button.setIcon(cardimg);
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (game.isValidCard(playerCard)) {
						game.updateGroundCard(playerCard);
						GroundCardImage img3=new GroundCardImage(playerCard.getColor(),playerCard.getValue());
						ImageIcon newGround=img3.convertGroundImage();
						lblNewLabel.setIcon(newGround);
						
						game.playerHand.remove(playerCard);
						button.setIcon(null);
						cardAction(playerCard);
						botPlay();
						
					}
					else {
						JOptionPane.showMessageDialog(null, "Invalid Move!");
					}
				}
			});
		}
	}
	/**
	 * When player draws a new card,this card must be both visualized and got action.
	 * Therefore, whenever a new card is drawn, this method is used to update.
	 * @author Muhammed Enes Andiç
	 * @param card
	 * @param lblNewLabel
	 */
	public void updatePlayerHand(UnoCard card,JLabel lblNewLabel) {
		for (int i=0;i<button_list.size();i++) {
			if (button_list.get(i).getIcon()==null) {
				JButton button=button_list.get(i);
				CardImage temp=new CardImage(card);
				button_list.get(i).setIcon(temp.convertImage());
				ActionListener[] action=button.getActionListeners();
				if (action.length==0) {
					button.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if (game.isValidCard(card)) {
								game.updateGroundCard(card);
								GroundCardImage img3=new GroundCardImage(card.getColor(),card.getValue());
								ImageIcon newGround=img3.convertGroundImage();
								lblNewLabel.setIcon(newGround);
								
								game.playerHand.remove(card);
								button.setIcon(null);
								cardAction(card);
								botPlay();
								
								
							}
							else {
								JOptionPane.showMessageDialog(null, "Invalid Move!");
							}
						}
					});
				}
				break;
			}
		}
	}
	public void updateGround(UnoCard card) {
		game.updateGroundCard(card);
		GroundCardImage img3=new GroundCardImage(card.getColor(),card.getValue());
		ImageIcon newGround=img3.convertGroundImage();
		groundLabel.setIcon(newGround);
	}
	/**
	 * This method updates image of updated card in the ground.
	 * @author Muhammed Enes Andiç
	 */
	public void updateGroundImage() {
		UnoCard.Color groundColor=game.groundColor;
		UnoCard.Value groundValue=game.groundValue;
		GroundCardImage img4=new GroundCardImage(groundColor,groundValue);
		ImageIcon newIcon=img4.convertGroundImage();
		groundLabel.setIcon(newIcon);
	}
	/**
	 * Bots must play automatically when they are turn and
	 * this method achieves that.
	 * @author MuhammedEnesAndiç
	 */
	public void botPlay() {
		while (game.current_id>0) {
			if (game.gameFinish()) {
				return ;
			}
			if ( game.unoDeck.isEmpty()==true) {
				JOptionPane.showMessageDialog(null, "There is no card in the deck, game has finished. Go to Main Menu!");
				frame.dispose();
				MainMenu mainmenu=new MainMenu();
				mainmenu.frmUno.setVisible(true);
				return;
			}
			UnoCard card=game.botPlay(game.bot_list.get(game.current_id-1));
			game.updateGroundCard(card);
			game.bot_list.get(game.current_id-1).getCardsOfBot().remove(card);
			cardAction(card);
			updateGround(card);
			botInfo();
		}
	}
	/**
	 * Some cards like action cards have some special actions, so
	 * this method executes those actions.
	 * @author Muhammed Enes Andiç
	 * @param card
	 */
	public void cardAction(UnoCard card) {
		if (card.getValue()==UnoCard.Value.reverse) {
			if (game.gameDirection==true) {
				game.gameDirection=false;
			}
			else {
				game.gameDirection=true;
			}
		}
		if (card.getValue()==UnoCard.Value.skip) {
			game.turnChange();
			return;
		}
		if (card.getValue()==UnoCard.Value.picker) {
			addCardNextPlayer(2);
		}
		if (card.getValue()==UnoCard.Value.pick_four) {
			addCardNextPlayer(4);
			Random random=new Random();
			int randomIndex=random.nextInt(0, 4);
			UnoCard.Color[] colors= {UnoCard.Color.blue,UnoCard.Color.green,UnoCard.Color.red,UnoCard.Color.yellow};
			game.groundColor=colors[randomIndex];
		}
		if (card.getValue()==UnoCard.Value.color_changer) {
			Random random=new Random();
			int randomIndex=random.nextInt(0, 4);
			UnoCard.Color[] colors= {UnoCard.Color.blue,UnoCard.Color.green,UnoCard.Color.red,UnoCard.Color.yellow};
			game.groundColor=colors[randomIndex];
		}
		game.turnChange();
	}
	/**
	 * One of the card actions is adding card to the next player. 
	 * For instance, wild_pick_four adds 4 cards to the next player and
	 * this method achieves that.
	 * @author Muhammed Enes Andiç
	 * @param i
	 */
	public void addCardNextPlayer(int i) {
		int playerNumber=game.bot_list.size()+1;
		int nextPlayerId=0;
		if (game.gameDirection==true) {
			nextPlayerId=(game.current_id+1)%playerNumber;
		}
		else {
			nextPlayerId=(game.current_id-1+playerNumber)%playerNumber;
		}
		
		if (nextPlayerId==0) {
			for (int j=0;j<i;j++) {
				UnoCard card=game.unoDeck.drawCard();
				game.playerHand.add(card);
				game.unoDeck.removeTopCard();
				updatePlayerHand(card,this.groundLabel);
			}
		}
		else {
			for (int j=0;j<i;j++) {
				game.bot_list.get(nextPlayerId-1).getCardsOfBot().add(game.unoDeck.drawCard());
				game.unoDeck.removeTopCard();
			}
			botInfo();
		}
	}
}
