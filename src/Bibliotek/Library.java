package Library;

public class Library {
    public class library {
        private String name;
        private Book[] books;
        private int bookCount;

        public library(String name, int maxSize) {
            this.name = name;
            this.books = new Book[maxSize];
            this.bookCount = 0;
        }

        public void addBook(Book book) {
            if (bookCount < books.length) {
                books[bookCount] = book;
                bookCount++;
            } else {
                System.out.println("Нет места в библиотеке");
            }
        }

        public void findByAuthor(String author) {
            System.out.println("Книги автора " + author + ":");
            for (int i = 0; i < bookCount; i++) {
                if (books[i].getAuthor().equals(author)) {
                    System.out.println(books[i].getInfo());
                }
            }
        }

        public void printAvailable() {
            System.out.println("Доступные книги:");
            for (int i = 0; i < bookCount; i++) {
                if (books[i].isAvailable()) {
                    System.out.println(books[i].getInfo());
                }
            }
        }

        public void getStats() {
            int available = 0;
            for (int i = 0; i < bookCount; i++) {
                if (books[i].isAvailable()) {
                    available++;
                }
            }
            System.out.println("Библиотека \"" + name + "\"");
            System.out.println("Всего книг: " + bookCount);
            System.out.println("Доступно: " + available);
            System.out.println("Выдано: " + (bookCount - available));
        }

        // задание со звёздочкой
        public Book getBestBook() {
            if (bookCount == 0) {
                return null;
            }
            Book best = books[0];
            for (int i = 1; i < bookCount; i++) {
                if (books[i].getRating() > best.getRating()) {
                    best = books[i];
                }
            }
            return best;
        }
}
