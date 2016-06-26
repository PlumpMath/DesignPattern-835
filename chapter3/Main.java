package chapter3;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main( String[] args ) {
		CharDisplay d1 = new CharDisplay('H');
		StringDisplay d2 = new StringDisplay("Hello world.");
		StringDisplay d3 = new StringDisplay("ちわーっす");

		List<AbstractDisplay> displays = new ArrayList<>();
		displays.add(d1);
		displays.add(d2);
		displays.add(d3);

		for(AbstractDisplay display : displays) {
			display.display();
		}
	}
}
