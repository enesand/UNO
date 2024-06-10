package game;

/**
 * This class specifies colors and values for a possible Uno card.
 * @author Muhammed Enes Andiç
 */
public class UnoCard {
	enum Color {
		red,green,yellow,blue,wild;
		private static final Color[] colors=Color.values();
		public  static Color getColor(int i) {
			return Color.colors[i];
		}
	}
	enum Value{
		zero,one,two,three,four,five,six,seven,eight,nine,reverse,skip,picker,pick_four,color_changer;
		private static final Value[] values=Value.values();
		public  static Value getValue(int i) {
			return Value.values[i];
		}
	}
	private final Color color;
	private final Value value;
	public UnoCard(final Color color,final Value value) {
		this.color=color;
		this.value=value;
	}
	public Color getColor() {
		return color;
	}
	public Value getValue() {
		return value;
	}
}
