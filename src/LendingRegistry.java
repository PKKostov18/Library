import java.util.ArrayList;

public class LendingRegistry {

    private Book book;
    private Reader reader;

    public LendingRegistry(Book book, Reader reader) {
        this.book = book;
        this.reader = reader;
    }

    public LendingRegistry() {
        this.book = new Book();
        this.reader = new Reader();
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    @Override
    public String toString() {
        return "LendingRegistry{" +
                "book=" + book +
                ", reader=" + reader +
                '}';
    }

    public LendingRegistry addInfo() {
        return new LendingRegistry();
    }

    public void printInfo(ArrayList<LendingRegistry> lendingRegistries) {
        for (LendingRegistry lr : lendingRegistries) {
            System.out.println(lr.toString());
        }
    }

    public void deleteBookInfo(ArrayList<LendingRegistry> lendingRegistries) {
        for (LendingRegistry lr : lendingRegistries) {
            if(lr.book.isReturned() == true) {
                lendingRegistries.remove(book);
            }
        }
    }

}
