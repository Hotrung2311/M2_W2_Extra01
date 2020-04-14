package book;

public class ProgrammingBook extends Book{
    private String language;
    private String framework;
    static int programmingBookAmount;
    static int javaAmount;
    static int javaPrice;

    public ProgrammingBook(String bookCode, String name, int price, String author, String language, String framework){
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
        programmingBookAmount++;
        if (language == "Java"){
            javaAmount++;
            javaPrice += price;
        }
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    @Override
    public String toString(){
        return "Mã sách: " + getBookCode()
                + ", Tên sách: " + getName()
                + ", Giá tiền: " + getPrice()
                + ", Tác giả: " + getAuthor()
                + ", Ngôn ngữ: " + getLanguage()
                + ", Framework: " + getFramework();
    }
}
