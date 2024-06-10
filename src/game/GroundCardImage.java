package game;

/**
 * Card in the ground is not a button unlike cards of player, and
 * it needs to be visualized. This method visualizes card in the ground.
 * @author Muhammed Enes Andiç
 */
import javax.swing.ImageIcon;

public class GroundCardImage {
	public UnoCard.Color color;
	public UnoCard.Value value;
	
	public GroundCardImage(UnoCard.Color color,UnoCard.Value value) {
		this.color=color;
		this.value=value;
	}
	public ImageIcon convertGroundImage() {
		String colorOfCard=null;
		if (color==UnoCard.Color.blue) {
			colorOfCard="blue";
		}
		else if (color==UnoCard.Color.green) {
			colorOfCard="green";
		}
		else if (color==UnoCard.Color.red) {
			colorOfCard="red";
		}
		else if (color==UnoCard.Color.yellow) {
			colorOfCard="yellow";
		}
		else if (color==UnoCard.Color.wild) {
			colorOfCard="wild";
		}
		String valueOfCard=null;
		if (value==UnoCard.Value.one) {
			valueOfCard="one";
		}
		else if (value==UnoCard.Value.two) {
			valueOfCard="two";
		}
		else if (value==UnoCard.Value.three) {
			valueOfCard="three";
		}
		else if (value==UnoCard.Value.four) {
			valueOfCard="four";
		}
		else if (value==UnoCard.Value.five) {
			valueOfCard="five";
		}
		else if (value==UnoCard.Value.six) {
			valueOfCard="six";
		}
		else if (value==UnoCard.Value.seven) {
			valueOfCard="seven";
		}
		else if (value==UnoCard.Value.eight) {
			valueOfCard="eight";
		}
		else if (value==UnoCard.Value.zero) {
			valueOfCard="zero";
		}
		else if(value==UnoCard.Value.nine) {
			valueOfCard="nine";
		}
		else if (value==UnoCard.Value.skip) {
			valueOfCard="skip";
		}
		else if (value==UnoCard.Value.reverse) {
			valueOfCard="reverse";
		}
		else if (value==UnoCard.Value.picker) {
			valueOfCard="picker";
		}
		else if (value==UnoCard.Value.color_changer) {
			valueOfCard="color_changer";
		}
		else if (value==UnoCard.Value.pick_four) {
			valueOfCard="pick_four";
		}
		String path="/"+colorOfCard+"_"+valueOfCard+".png";
		ImageIcon cardimg=new ImageIcon(getClass().getResource(path));
		return cardimg;
		
	}
}
