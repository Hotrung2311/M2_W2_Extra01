package book;

public class FictionBook extends Book{
    private String category;
    static int fictionBookAmount;

    public FictionBook(String bookCode, String name, int price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
        fictionBookAmount++;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString(){
        return "Mã sách: " + getBookCode()
                + ", Tên sách: " + getName()
                + ", Giá tiền: " + getPrice()
                + ", Tác giả: " + getAuthor()
                + ", Thể loại: " + getCategory();
    }
}
