package genericshelf;

public class NewSelection {

    /**
     * @param o object
     *          returns an empty string if o is not an IBook,
     *          returns title if Comic, name if Fiction,
     *          and subject if TextBook.
     */
    public static String getAgeOrTitle(Object o) {
        return switch (o) {
            case Comic(String title, int age) when title != null -> title;
            case Fiction(String name) when name != null -> name;
            case TextBook(String subject) when subject != null -> subject;
            default -> "";
        };
    }

    public static void main(String[] args) {
        // Test code
        Comic comic = new Comic("yadhu", 20);
        Fiction fiction = new Fiction("Mystery");
        TextBook textBook = new TextBook("Mathematics");

        System.out.println(getAgeOrTitle(comic));
        System.out.println(getAgeOrTitle(fiction));
        System.out.println(getAgeOrTitle(textBook));
        System.out.println(getAgeOrTitle("Not a book"));
    }
}
