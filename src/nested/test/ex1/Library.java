package nested.test.ex1;

public class Library {
    private int bookCount;
    Book[] books;

    public Library(int size) {
        books = new Book[size];
    }

    private static class Book {
        private String title;
        private String author;

        private Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }

    public void addBook(String title, String author) {
        //검증 로직을 다 처리하고
        if (bookCount >= books.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }

        //정상 로직을 처리
        books[bookCount++] = new Book(title, author);

    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (Book book : books) {
            System.out.println("도서 제목:" + book.title + ", 저자:" + book.title);
        }
    }

}
