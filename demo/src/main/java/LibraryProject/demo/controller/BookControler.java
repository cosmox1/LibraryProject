package LibraryProject.demo.controller;

import LibraryProject.demo.model.Book;
import LibraryProject.demo.service.BookService;

public class BookControler {

    /** adaugam resto controler si request maping
     * injectam serviciiul si facem constructor
     * creem metodele de add,delete,get,update**/

    private final BookService bookService;

    public BookControler(BookService bookService) {
        this.bookService = bookService;
    }
    public void addBook(Book book){
        bookService.addBook(book);
    }
}
