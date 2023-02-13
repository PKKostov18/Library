public class Book {

    private int bookId;
    private String author;
    private String title;
    private double price;

    private boolean isReturned;

    public Book(int bookId, String author, String title, double price, boolean isReturned) {
        this.bookId = bookId;
        this.author = author;
        this.title = title;
        this.price = price;
        this.isReturned = isReturned;
    }

    public Book() {
        this.bookId = 1;
        this.author = "Plamen";
        this.title = "The diary of a wimpy kid";
        this.price = 10.98;
        this.isReturned = false;
    }

    public boolean isReturned() {
        return isReturned;
    }

    public void setReturned(boolean returned) {
        isReturned = returned;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", isReturned=" + isReturned +
                '}';
    }
}
