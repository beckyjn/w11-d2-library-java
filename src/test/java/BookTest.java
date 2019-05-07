import org.junit.Before;
import org.junit.Test;

public class BookTest {

    Book book1;
    Book book2;
    Book book3;

    @Before
    public void before() {
        book1 = new Book("Pride and Prejudice", "Jane Austen", "Romance");
        book2 = new Book("Hitchhikers Guide to the Galaxy", "Douglas Adams", "Sci-fi");
        book3 = new Book("The Pursuit of Love", "Nancy Mitford", "Romance");
    }


}
