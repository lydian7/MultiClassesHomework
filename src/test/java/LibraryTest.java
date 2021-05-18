import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Book book;
    Library library;

    @Before
    public void before(){
        book = new Book("The Stand", "Stephen King", "Horror");
        library = new Library(4);
    }

    @Test
    public void amountOfBooks(){
        assertEquals(0, library.getAmountOfBooks());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.getAmountOfBooks());
    }

    @Test
    public void cantAddBookDueToCapacity(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(4, library.getAmountOfBooks());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(4, library.getCapacity());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book);
        library.removeBook(book);
        assertEquals(0, library.getAmountOfBooks());
    }

    @Test
    public void canUpdateHashMap(){
        Book book2 = new Book("Dracula", "Bram Stoker", "Horror");
        Book book3 = new Book("Wolfman", "Tedios Lagas", "Horror");
        Book book4 = new Book("Sunny Side Up", "Rivalt Chaltrain", "Comedy");
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(3, library.getNumberByGenre(book));
        assertEquals(1, library.getNumberByGenre(book4));
    }

}
