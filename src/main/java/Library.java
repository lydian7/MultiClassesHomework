import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Library {
    private int capacity;
    private ArrayList<Book> books;
    private HashMap<String, Integer> numberByGenre;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<>();
        this.numberByGenre = new HashMap<>();
    }

    public int getAmountOfBooks(){
        return this.books.size();
    }

    public void addBook(Book book){
        if(this.books.size()+1 <= this.capacity){
            if(this.numberByGenre.containsKey(book.getGenre())){
                int bookCount = this.numberByGenre.get(book.getGenre());
                this.numberByGenre.put(book.getGenre(), bookCount + 1);
            } else {
                this.numberByGenre.put(book.getGenre(), 1);
            }
            this.books.add(book);
        }
    }

    public int getCapacity() {
        return this.capacity;
    }

    public Book removeBook(Book book){
        int index = this.books.indexOf(book);
        return this.books.remove(index);
    }

    public int getNumberByGenre(Book book){
        return this.numberByGenre.get(book.getGenre());
    }



}
