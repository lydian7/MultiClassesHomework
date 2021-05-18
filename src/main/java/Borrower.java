import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> books;

    public Borrower() {
        this.books = new ArrayList<>();
    }

    public int getNoOfBooks() {
        return this.books.size();
    }

    public void borrowBook(Library library, Book book){
        this.books.add(library.removeBook(book));
    }


}
