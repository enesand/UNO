package game;

/**This class creates computer bots with id and list of Uno cards for the game.
 * @author Muhammed Enes Andiç
 */

import java.util.List;

public class ComputerBot {
	public int bot_id;
	public List<UnoCard> cardsOfBot;
	
	public ComputerBot(int bot_id,List<UnoCard> cardsofBot) {
		this.bot_id=bot_id;
		this.cardsOfBot=cardsofBot;
	}
	
	public void addToCards(UnoCard card) {
		cardsOfBot.add(card);
	}

	public int getBot_id() {
		return bot_id;
	}

	public List<UnoCard> getCardsOfBot() {
		return cardsOfBot;
	}
	
}
