package genericshelf;

public sealed interface IBook<T> permits Comic, Fiction, TextBook {
    T get();
}

