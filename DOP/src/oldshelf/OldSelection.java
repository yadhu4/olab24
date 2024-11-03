package oldshelf;

public class OldSelection {

	public static String getAgeOrTitle(Object o) {
		return switch (o) {
			case Comic comic -> comic.getTitle();

			case Fiction fiction -> fiction.getName();

			case TextBook textBook -> textBook.getSubject();

			default -> "";
		};
	}

	public static void main(String[] args) {
		Comic comic = new Comic("yadhu", 20);

		Fiction fiction = new Fiction("tom", FictionType.Comedy);

		TextBook textBook = new TextBook("maths");

		System.out.println(getAgeOrTitle(comic));
		System.out.println(getAgeOrTitle(fiction));
		System.out.println(getAgeOrTitle(textBook));
	}
}
