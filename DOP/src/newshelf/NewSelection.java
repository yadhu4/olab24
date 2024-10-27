package newshelf;

public class NewSelection {

	// TODO: Complete this method
	/**
	 * 
	 * @param o object
	 *          returns if o is not a book, returns empty string, if Comic, returns
	 *          title, of Fiction
	 *          returns name, and if TextBook, returns subject.
	 */
	public static String getAgeOrTitle(Object o) {

		if (o instanceof IBook) {
			if (o instanceof Comic comic) {
				return comic.title();
			} else if (o instanceof Fiction fiction) {
				return fiction.name();
			} else if (o instanceof TextBook textBook) {
				return textBook.subject();
			}
		}
		return "";
	}

	public static void main(String[] args) {

		// TODO: Write a test code here and execute and text.

		Comic comic = new Comic("yadhu", 20);
		Fiction fiction = new Fiction("Mystery");
		TextBook textBook = new TextBook("Mathematics");

		System.out.println(getAgeOrTitle(comic));
		System.out.println(getAgeOrTitle(fiction));
		System.out.println(getAgeOrTitle(textBook));
	}
}
