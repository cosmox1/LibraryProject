package LibraryProject.demo.controller;

import LibraryProject.demo.model.dto.BookDto;
import LibraryProject.demo.service.BookServicesImpl;
import LibraryProject.demo.service.util.BookConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
@CrossOrigin("*")

public class BookControler {

    private BookServicesImpl bookServices;

    @Autowired
    public BookControler(BookServicesImpl bookServices) {
        this.bookServices = bookServices;
    }

    @PostMapping
    public ResponseEntity<BookDto> createBook(@RequestBody BookDto bookDto) {
        BookDto responseBody = BookConvertor.covertToBookDto(bookServices.createBook(BookConvertor.convertToBookEntity(bookDto)));
        return ResponseEntity.ok(responseBody);
    }

}
