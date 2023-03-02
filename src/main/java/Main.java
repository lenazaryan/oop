import static java.util.List.of;


public class Main {
    public static void main(String[] args) {
//        BitVector32 vector = new BitVector32();
//
//        System.out.println(vector);
//        vector.set(3);
//        System.out.println(vector);
//        vector.set(5);
//        System.out.println(vector);
//        vector.reset(3);
//        System.out.println(vector);
//        vector.set(31);
//        System.out.println(vector);
//        vector.set(3532);
//        System.out.println(vector);
//
//        BitVector vector1 = new BitVector(45);
//        vector1.set(2);
//        vector1.printBits();
//
//
//        library.Book book1 = new library.Book("book1", "author1");
//        library.Book book2 = new library.Book("book2", "author2");
//        library.Book book3 = new library.Book("book3", "author3");
//        library.Book book4 = new library.Book("book4", "author4");
//        library.Book book5 = new library.Book("book5", "author5");
////        library.Book[] books = new library.Book[]{book1, book2, book3, book4, book5};
////        library.Library library = new library.Library(new ArrayList<library.Book>(Arrays.asList(books)));
//        library.Library library = new library.Library();
//        library.addBook(book1);
//        library.addBook(book2);
//        library.addBook(book3);
//        library.addBook(book4);
//        library.addBook(book5);
//        System.out.println(library.getBooks());
//        library.User user = new library.User("Lena", library);
//        System.out.println(library.getBooks());
//        library.giveBook(user, book1);
//        user.readingBook(book1);
//        System.out.println(library.getBooks());
//        library.returnBook(user, book1);
//        library.returnBook(user, book2);
//        System.out.println(library.getBooks());

        MultiTon multiTon = MultiTon.createMultiTonInstance();
        multiTon.printInstanceCounter();
        MultiTon multiTon2 = MultiTon.createMultiTonInstance();
        multiTon2.printInstanceCounter();
        MultiTon multiTon3 = MultiTon.createMultiTonInstance();
        multiTon3.printInstanceCounter();
        MultiTon multiTon4 = MultiTon.createMultiTonInstance();
        multiTon4.printInstanceCounter();
        MultiTon multiTon5 = MultiTon.createMultiTonInstance();
        multiTon5.printInstanceCounter();
        MultiTon multiTon6 = MultiTon.createMultiTonInstance();
        multiTon6.printInstanceCounter();
    }
}

