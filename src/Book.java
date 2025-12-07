public class Book {
    private String title;
    private String author;
    private int date;

    //初期化を強制
    public Book(String title, String author, int date) {
        this.title = title;
        this.author = author;
        this.date = date;
    }

    //Getterメソッド
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getDate() {
        return this.date;
    }
}