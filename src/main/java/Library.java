import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private int stock;

    public Library(int stock){
        this.books = new ArrayList<Book>();
        this.stock = stock;
    }


    public int countBooks() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if (this.books.size() < this.stock){
            books.add(book);
        }
    }

    public Book lendBook(Book book){
        int bookToBorrow = this.books.indexOf(book);
        return this.books.remove(0);
    }
}
