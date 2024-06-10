package game;

import javax.swing.*;

/**This program checks what color and value @param card has.
 * By this, it finds an appropriate image for that card and return it.
 * @return ImageIcon
 * @author Muhammed Enes Andiç
 */
public class CardImage  {
	public UnoCard card;
	
	public CardImage(UnoCard card) {
		this.card=card;
	}
	public ImageIcon convertImage() {
		String colorOfCard=null;
		if (card.getColor()==UnoCard.Color.blue) {
			colorOfCard="blue";
		}
		else if (card.getColor()==UnoCard.Color.green) {
			colorOfCard="green";
		}
		else if (card.getColor()==UnoCard.Color.red) {
			colorOfCard="red";
		}
		else if (card.getColor()==UnoCard.Color.yellow) {
			colorOfCard="yellow";
		}
		else if (card.getColor()==UnoCard.Color.wild) {
			colorOfCard="wild";
		}
		String valueOfCard=null;
		if (card.getValue()==UnoCard.Value.one) {
			valueOfCard="one";
		}
		else if (card.getValue()==UnoCard.Value.two) {
			valueOfCard="two";
		}
		else if (card.getValue()==UnoCard.Value.three) {
			valueOfCard="three";
		}
		else if (card.getValue()==UnoCard.Value.four) {
			valueOfCard="four";
		}
		else if (card.getValue()==UnoCard.Value.five) {
			valueOfCard="five";
		}
		else if (card.getValue()==UnoCard.Value.six) {
			valueOfCard="six";
		}
		else if (card.getValue()==UnoCard.Value.seven) {
			valueOfCard="seven";
		}
		else if (card.getValue()==UnoCard.Value.eight) {
			valueOfCard="eight";
		}
		else if (card.getValue()==UnoCard.Value.zero) {
			valueOfCard="zero";
		}
		else if(card.getValue()==UnoCard.Value.nine) {
			valueOfCard="nine";
		}
		else if (card.getValue()==UnoCard.Value.skip) {
			valueOfCard="skip";
		}
		else if (card.getValue()==UnoCard.Value.reverse) {
			valueOfCard="reverse";
		}
		else if (card.getValue()==UnoCard.Value.picker) {
			valueOfCard="picker";
		}
		else if (card.getValue()==UnoCard.Value.color_changer) {
			valueOfCard="color_changer";
		}
		else if (card.getValue()==UnoCard.Value.pick_four) {
			valueOfCard="pick_four";
		}
		String path="/"+colorOfCard+"_"+valueOfCard+".png";
		ImageIcon cardimg=new ImageIcon(getClass().getResource(path));
		return cardimg;
		
	}
}
