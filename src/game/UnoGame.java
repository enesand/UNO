package game;

import java.util.ArrayList;
import javax.swing.*;

import Pages.MainMenu;

import java.util.Arrays;
import java.util.List;
/**
 * This class basically provides functionality of the Uno game.
 * @author Muhammed Enes Andiç
 */
public class UnoGame {
	public UnoDeck unoDeck;
	public List<ComputerBot> bot_list;
	public int bot_number;
	public int current_id;
	public List<UnoCard> playerHand;
	boolean gameDirection;
	public UnoCard.Color groundColor;
	public UnoCard.Value groundValue;
	public boolean playerWon;
	

	
	
	public UnoGame(int bot_number) {
		this.unoDeck=new UnoDeck();
		unoDeck.shuffle();
		this.playerHand=unoDeck.drawCard(7);
		this.bot_list=new ArrayList<>();
		this.bot_number=bot_number;
		for (int i=1;i<=bot_number;i++) {
			List<UnoCard> tempCardList=unoDeck.drawCard(7);
			bot_list.add(new ComputerBot(i,tempCardList));
			
		}
		this.current_id=0;
		this.gameDirection=true;
		gameStart();
		this.playerWon=false;
		


	}


	public List<ComputerBot> getBot_list() {
		return bot_list;
	}


	/**
	 * This method gets a card for the ground and if this card is wild, the card in the
	 * ground must be changed.If it is an action card, then its action
	 * must be executed.
	 * @author Muhammed Enes Andiç
	 */
	public void gameStart() {
		UnoCard cardInGround=unoDeck.drawCard();
		unoDeck.removeTopCard();
		updateGroundCard(cardInGround);
		
		if (cardInGround.getValue()==UnoCard.Value.pick_four) {
			gameStart();
		}
		if (cardInGround.getValue()==UnoCard.Value.color_changer) {
			gameStart();
		}
		if (cardInGround.getValue()==UnoCard.Value.picker) {
			gameStart();
		}
		if (cardInGround.getValue()==UnoCard.Value.skip) {
			if (gameDirection==true) {
				current_id=(current_id+1)%(bot_list.size()+1);
			}
			else {
				current_id=(current_id-1)%(bot_list.size()+1);
			}
		}
		if (cardInGround.getValue()==UnoCard.Value.reverse) {
			if (gameDirection==true) {
				gameDirection=false;
				current_id=(current_id-1)%(bot_list.size()+1);
			}
			else {
				gameDirection=true;
				current_id=(current_id+1)%(bot_list.size()+1);
			}
		}
		
		
	}
	/**
	 * This method updates color and value of the card in the ground.
	 * @author Muhammed Enes Andiç
	 * @param card
	 */
	public void updateGroundCard(UnoCard card) {
		this.groundColor=card.getColor();
		this.groundValue=card.getValue();
	}
	/**
	 * This method changes turn with changing of ID number. 
	 * Game direction is crucial to change turn, so method depends on
	 * game direction.
	 * @author Muhammed Enes Andiç
	 */
	public void turnChange(){
		int playerNumber=bot_list.size()+1;
		if (gameDirection==true) {
			current_id=(current_id+1)%playerNumber;
		}
		else {
			current_id=(current_id-1+playerNumber)%playerNumber;
		}
	}
	/**
	 * When bot plays, card in the ground must be changed. However,
	 * to achieve this we need the card that is played by the bot, so this
	 * method returns this card.
	 * @author Muhammed Enes Andiç
	 * @param bot
	 * @return UnoCard
	 */
	public UnoCard botPlay(ComputerBot bot) {
		for (UnoCard card: bot.getCardsOfBot()) {
			if (isValidCard(card)) {
				return card;
			}
		}
		if (unoDeck.isEmpty()==false) {
			bot.getCardsOfBot().add(unoDeck.drawCard());
			unoDeck.removeTopCard();
			return botPlay(bot);
		}
		return null;
	}
	/**
	 * When a card is tried to be thrown, it must be a valid card for card in
	 * the ground. Therefore, this method checks whether a card is valid or not, and
	 * returns boolean depends on the result.
	 * @param card
	 * @return boolean
	 */
	public boolean isValidCard(UnoCard card) {
		if (card.getColor()==groundColor) {
			return true;
		}
		if (card.getValue()==groundValue) {
			return true;
		}
		if (card.getValue()==UnoCard.Value.color_changer || card.getValue() ==UnoCard.Value.pick_four) {
			return true;
		}
		return false;
	}
	/**
	 * If one of the bots has only one valid card, then game is finished and
	 * that bot becomes the winner. This method checks whether a game is finished or not and
	 * returns boolean. If it is finished, the method prints the winner bot.
	 * @return boolean
	 * @author Muhammed Enes Andiç
	 */
	public boolean gameFinish() {
		for (ComputerBot bot: bot_list) {
			if (bot.getCardsOfBot().size()==1) {
				UnoCard card=bot.getCardsOfBot().get(0);
				if (isValidCard(card)) {
					JOptionPane.showMessageDialog(null, "Bot"+bot.getBot_id()+" won!");
					return true;
				}
				return false;
			}
		}
		return false;
	}

}
