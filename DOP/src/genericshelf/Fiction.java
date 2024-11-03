package genericshelf;

public record Fiction(String name) implements IBook<String> {
    @Override
    public String get() {
        return name;
    }
}
