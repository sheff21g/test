package Library;

public class Main {
    public void main(String[] args) {
        Library library = new Library();
        Book b1 = new Book("Тарас Бульба", "Гоголь Н.В.", 1835);
        Book b2 = new Book("Муму", "Тургенев И.С.", 1852);
        Book b3 = new Book("Мастер и Маргарита", "Булгаков М.", 1928);
        Book b4 = new Book("Война и Мир", "Толстой Л.", 1869);
        Book b5 = new Book("Преступление и Наказание", "Достоевский Ф.", 1865);
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);
        library.addBook(b4);
        library.addBook(b5);
        b1.borrow();
        b2.borrow();
        b4.borrow();
        b2.returnBook();
        b1.setRating(5);
        b3.returnBook(4);
        b5.returnBook(3);
        library.printAvailable();
        library.findByAuthor("Толстой Л.");
        library.getStats();

        Book best = library.getBestBook();
        System.out.println("Лучшая книга: " + best.getInfo());
    }
    



    }

}
