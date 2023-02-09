package library;

import java.util.ArrayList;

//1. identify entity
//library.Library, library.Book, Student
//2. Define entities
//library.Book - Author, Title
//Student - name, books[], read()
//library.Library - books[], take(returns book), return()
//Design&Implementation

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }


    public void giveBook(User user, Book book) {
        books.remove(book);
        user.takeBook(book);
    }

    public void returnBook(User user, Book book) {
        if (user.getBooks().contains(book)) {
            books.add(book);
            user.returnBook(book);
        } else {
            System.out.println(user.getName() + " doesn't have the book");
        }
    }
}
