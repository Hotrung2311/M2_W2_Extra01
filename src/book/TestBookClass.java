package book;

public class TestBookClass {
    public static void main(String[] args) {

        ProgrammingBook b1 = new ProgrammingBook("BP1","Java", 50000, "Trung 1","Java", "Spring");
        ProgrammingBook b2 = new ProgrammingBook("BP2","C#", 105000, "Trung 2","C#", "dot NET");
        ProgrammingBook b3 = new ProgrammingBook("BP3","C++", 35000, "Trung 3","C++", "dot NET");
        ProgrammingBook b4 = new ProgrammingBook("BP4","Javascript", 60000, "Trung 4","Javascript", "Angular.js");
        ProgrammingBook b5 = new ProgrammingBook("BP5","Pascal", 25000, "Trung 5","Pascal", "Fano");
        ProgrammingBook b11 = new ProgrammingBook("BP6","Java 1", 75000, "Trung 1","Java", "Spring");

        FictionBook b6 = new FictionBook("BF1", "Bay giữa ngân hà", 80000, "Hà 1", "Khoa học viễn tưởng");
        FictionBook b7 = new FictionBook("BF2", "10.000 dưới đáy biển", 180000, "Hà 2", "Khoa học viễn tưởng");
        FictionBook b8 = new FictionBook("BF3", "1001 đêm", 80000, "Chưa rõ", "Cổ tích");
        FictionBook b9 = new FictionBook("BF4", "Bay giữa ngân hà", 80000, "Chưa rõ", "");
        FictionBook b10 = new FictionBook("BF5", "Truyện ma", 80000, "Hà 5", "Khoa học viễn tưởng");

        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());
        System.out.println(b4.toString());
        System.out.println(b5.toString());
        System.out.println(b6.toString());
        System.out.println(b7.toString());
        System.out.println(b8.toString());
        System.out.println(b9.toString());
        System.out.println(b10.toString());

        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("Số lượng sách: " + Book.bookAmount);
        System.out.println("Số lượng sách Fiction: " + FictionBook.fictionBookAmount);
        System.out.println("Số lượng sách Programming: " + ProgrammingBook.programmingBookAmount);

        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("Tổng tiền sách ngôn ngữ Java: " + ProgrammingBook.javaPrice);
    }
}
