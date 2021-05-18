import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("The Stand", "Stephen King", "Horror");
    }

    @Test
    public void getBookVariables(){
        assertEquals("The Stand", book.getTitle());
        assertEquals("Stephen King", book.getAuthor());
        assertEquals("Horror", book.getGenre());
    }

}
