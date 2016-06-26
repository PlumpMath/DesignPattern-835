
package chapter8.listfactory;
import chapter8.factory.*;
import java.util.Iterator;

public class ListPage extends Page {
	public ListPage(String title, String author) {
		super(title, author);
	}
	public String makeHTML() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html><head>")
	}

}
