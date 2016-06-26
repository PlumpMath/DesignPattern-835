package chapter1;

public class Main {
	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("hosinooujisama"));
		bookShelf.appendBook(new Book("konan"));
		bookShelf.appendBook(new Book("test"));
		bookShelf.appendBook(new Book("history"));
		Iterator it = bookShelf.iterator();
		while (it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}

	}
}
