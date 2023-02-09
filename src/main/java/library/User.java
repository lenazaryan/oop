package library;

import library.Book;
import library.Library;

import java.util.ArrayList;

public class User {
    private String name;
    private ArrayList<Book> books = new ArrayList<>();
    private Library library;

    private Book book;
    public User(String name, Library library) {
        this.name = name;
        this.library = library;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
    public void readingBook(Book book){
        System.out.print(name + " is reading " + getBooks().contains(book));
        book.wearOut();
    }

    public void takeBook(Book book){
        books.add(book);
    }

    public void returnBook(Book book){
        books.remove(book);
    }
}
