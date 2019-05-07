import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    Borrower borrower;

    @Before
    public void before(){
        library = new Library(2);
        book1 = new Book("Pride and Prejudice", "Jane Austen", "Romance");
        book2 = new Book("Hitchhikers Guide to the Galaxy", "Douglas Adams", "Sci-fi");
        book3 = new Book("The Pursuit of Love", "Nancy Mitford", "Romance");
        borrower = new Borrower();
    }

    @Test
    public void libraryStartsWithNoBooks(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBookToTheLibrary(){
        library.addBook(book1);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void cantAddBookIfLibraryFull(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2, library.countBooks());
    }

}
