import static java.util.List.of;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("book1", "author1");
        Book book2 = new Book("book2", "author2");
        Book book3 = new Book("book3", "author3");
        Book book4 = new Book("book4", "author4");
        Book book5 = new Book("book5", "author5");
//        Book[] books = new Book[]{book1, book2, book3, book4, book5};
//        Library library = new Library(new ArrayList<Book>(Arrays.asList(books)));
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        System.out.println(library.getBooks());
        User user = new User("Lena", library);
        System.out.println(library.getBooks());
        library.giveBook(user, book1);
        user.readingBook(book1);
        System.out.println(library.getBooks());
        library.returnBook(user, book1);
        library.returnBook(user, book2);
        System.out.println(library.getBooks());
    }
}
