package genericshelf;

public record Comic(String title, int age) implements IBook<String> {
    @Override
    public String get() {
        return title;
    }
}
