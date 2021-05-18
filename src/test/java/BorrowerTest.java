import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Book book;
    Borrower borrower;
    Library library;

    @Before
    public void before(){
        book = new Book("The Stand", "Stephen King", "Horror");
        borrower = new Borrower();
        library = new Library(2);
    }

    @Test
    public void borrowerNoOfBooks(){
        assertEquals(0, borrower.getNoOfBooks());
    }

    @Test
    public void canBorrowBook(){
        library.addBook(book);
        borrower.borrowBook(library, book);
        assertEquals(1, borrower.getNoOfBooks());
        assertEquals(0, library.getAmountOfBooks());
    }


}
