import java.util.ArrayList;

public class Library {
    //書籍データを保持するリスト
    private ArrayList<Book> book = new ArrayList<>();

    //登録機能：タイトル・著者・出版年を受け取り、Bookオブジェクトを生成してリストに追加
    public void addBook(String title, String author, int date) {
        book.add(new Book(title, author, date));
    }

    //一覧表示機能：登録されている書籍を番号付きで表示
    public void showBooks() {
        if (book.isEmpty()) {
            System.out.println("書籍は登録されていません。");
        }

        int index = 1;

        for (Book b : book) {
            System.out.println(index + ". タイトル: " + b.getTitle() + 
            ", 著者名: " + b.getAuthor() + 
            ", 出版年: " + b.getDate());
            index++;
        }
    }

    //削除機能：ユーザー指定の番号を削除
    public void removeBook(int index) {
        int listIndex = index - 1;

        if (listIndex >= 0 && listIndex < book.size()) {
            book.remove(listIndex);
        } else {
            System.out.println("エラー：指定された番号("+ index +")の書籍はありません。");
        }
    }    
}