package genericshelf;

public record TextBook(String subject) implements IBook<String> {
    @Override
    public String get() {
        return subject;
    }
}
