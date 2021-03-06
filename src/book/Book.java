package book;

public class Book {
    private String bookCode;
    private String name;
    private int price;
    private String author;
    static int bookAmount;

    public Book(String bookCode, String name, int price, String author){
        this.bookCode = bookCode;
        this.name = name;
        this.price = price;
        this.author = author;
        bookAmount++;
    }

//    public Book() {
//
//    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString(){
        return "Mã sách: " + this.bookCode
                + ", Tên sách: " + this.name
                + ", Giá tiền: " + this.price
                + ", Tác giả: " + this.author;
    }
}

