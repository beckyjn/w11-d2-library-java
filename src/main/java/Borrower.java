import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> books;

    public Borrower(){
        this.books = new ArrayList<Book>();
    }

    public int countBooks() {
        return this.books.size();
    }
    

    public void borrowBook(Library library, Book book) {
        Book bookToBorrow = library.lendBook(book);
        this.books.add(bookToBorrow);
    }
}
