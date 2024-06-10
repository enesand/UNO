package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.swing.ImageIcon;
/**
 * This class's purpose is to create a Uno deck from Uno cards.
 * @author Muhammed Enes Andiç
 */
public class UnoDeck {
	public List<UnoCard> uno_cards;
	
	public UnoDeck() {
		uno_cards=new ArrayList<>();
		startDeck();
	}
	/**
	 * This method  initializes a Uno deck. 
	 * This Uno deck has 108 cards.
	 * @author Muhammed Enes Andiç 
	 */
	public void startDeck() {
		UnoCard.Color[] colors=UnoCard.Color.values();
		
		for (int i=0;i<colors.length-1;i++) {
			UnoCard.Color color=colors[i];
			uno_cards.add(new UnoCard(color,UnoCard.Value.getValue(0)));
			
			for (int j=1;j<10;j++) {
				uno_cards.add( new UnoCard(color,UnoCard.Value.getValue(j)));
				uno_cards.add( new UnoCard(color,UnoCard.Value.getValue(j)));
			}
			UnoCard.Value[] values=new UnoCard.Value[] {UnoCard.Value.skip,UnoCard.Value.reverse,UnoCard.Value.picker};
			for (UnoCard.Value value:values) {
				uno_cards.add( new UnoCard(color,value));
				uno_cards.add( new UnoCard(color,value));
				
			}
		color=colors[colors.length-1];
		UnoCard.Value[] values1=new UnoCard.Value[] {UnoCard.Value.color_changer,UnoCard.Value.pick_four};
		for (UnoCard.Value value:values1) {
			for (int c=0;c<4;c++) {
				uno_cards.add(new UnoCard(color,value));
				}
			}
		}
	}
	
	/**
	 * This method checks whether deck is empty or not.
	 * @author Muhammed Enes Andiç
	 * @return boolean
	 */
	public boolean isEmpty() {
		if (uno_cards.isEmpty()) {
			return true;
		}
		return false;
	}
	/**
	 * This method uses shuffle method of Collections to shuffle the Uno deck.
	 * @author Muhammed Enes Andiç
	 */
	public void shuffle() {

		Collections.shuffle(uno_cards);
		
	}
	/**
	 * This method gets and returns top card of the Uno deck.
	 * @return UnoCard
	 * @throws IllegalArgumentException
	 * @author Muhammed Enes Andiç
	 */
	public UnoCard drawCard() throws IllegalArgumentException {
		if (isEmpty()) {
			throw new IllegalArgumentException("There is no card in the deck");
		}
		else {
			return uno_cards.get(0);
		}
	}
	/**
	 * Unlike previous method, this method can get and return multiple cards of the
	 * Uno deck.
	 * @param i
	 * @return List<UnoCard> 
	 * @throws IllegalArgumentException
	 * @author Muhammed Enes Andiç
	 */
	public List<UnoCard> drawCard(int i) throws IllegalArgumentException {
		if (isEmpty()) {
			throw new IllegalArgumentException("There is no card in the deck");
		}
		else {
			List<UnoCard> ret=new ArrayList<>();
			for (int j=0;j<i;j++) {
				ret.add(uno_cards.get(0));
				removeTopCard();
			}
			return ret;
		}
	}
	/**
	 * When the user draw card, top card of the Uno deck must be removed.
	 * Otherwise, the users will draw the same card and this method removes top card of 
	 * the Uno deck.
	 * @author Muhammed Enes Andiç
	 */
	public void removeTopCard() {
		uno_cards.remove(0);
	}
	

}