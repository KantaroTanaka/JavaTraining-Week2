import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        //ScannerとLibraryのインスタンス化
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        
        System.out.println("図書管理システム 1: 書籍を登録する 2: 登録済みの書籍を一覧表示する 3: 書籍を削除する 0: 終了");

        int choice;

        //０が入力されるまで操作を繰り返す do-while
        do {
            System.out.println("----------------------------");
            System.out.println("番号を入力してください");
            
            choice = scanner.nextInt();
            scanner.nextLine();

            //選択肢に応じた処理の振り分け
            switch (choice) {
                //書籍の登録
                case 1:
                    System.out.println("書籍登録");
                    System.out.println("タイトルを入力");
                    String title = scanner.nextLine();

                    System.out.println("著者を入力");
                    String author = scanner.nextLine();

                    System.out.println("出版日を入力");
                    int date = scanner.nextInt();

                    library.addBook(title, author, date);
                    break;
                    
                //一覧表示
                case 2: 
                    library.showBooks();
                    break;

                //書籍の削除
                case 3: 
                    System.out.println("削除する本を番号で指定");
                    int deleteIndex = scanner.nextInt();

                    library.removeBook(deleteIndex);
                    break;

                //終了
                case 0:
                    break;
            }
        }
        while(choice !=0 );
        
        System.out.println("図書管理システムのご利用ありがとうございました。");
        scanner.close();
    }
}
