package LibraryProject.demo.controller;

import LibraryProject.demo.model.Book;
import LibraryProject.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/book")
@RestController
public class BookController {

    /** adaugam resto controler si request maping
     * injectam serviciiul si facem constructor
     * creem metodele de add,delete,get,update**/

    private final BookService bookService;
@Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @PostMapping
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);
    }
}
