package LibraryProject.demo.controller;

import LibraryProject.demo.model.Book;
import LibraryProject.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequestMapping("/api/v1/book")
@RestController
public class BookController {
    private final BookService bookService;
@Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public void addBook(@RequestBody Book book){
    bookService.addBook(book);
    }
    @PutMapping(path = "{id}")
    public void updateBook(@PathVariable("id")UUID id,@RequestBody Book book){
    bookService.updateBook(id,book);
    }
    @GetMapping
    public List<Book>getAllBooks(){
    return bookService.selectAllBooks();
    }
    @GetMapping(path = "{id}")
    public Optional<Book>getBookById(@PathVariable("id") UUID id){
    return bookService.selectBookById(id);
    }
    @DeleteMapping(path = "{id}")
    public void deleteBookById(@PathVariable("id") UUID id){
    bookService.deleteBook(id);
    }
}
