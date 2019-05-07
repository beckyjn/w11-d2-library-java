import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    Borrower borrower;

    @Before
    public void before(){
    library = new Library(5);
    book1 = new Book("Pride and Prejudice", "Jane Austen", "Romance");
    book2 = new Book("Hitchhikers Guide to the Galaxy", "Douglas Adams", "Sci-fi");
    book3 = new Book("The Pursuit of Love", "Nancy Mitford", "Romance");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
    borrower = new Borrower();
    }

    @Test
        public void hasNoBooks(){
        assertEquals(0, borrower.countBooks());
    }

    @Test
        public void canBorrowBook(){
        borrower.borrowBook(library, book1);
        assertEquals(1, borrower.countBooks());
    }



}
