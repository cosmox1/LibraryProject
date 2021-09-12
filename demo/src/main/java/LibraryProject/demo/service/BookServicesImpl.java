package LibraryProject.demo.service;

import LibraryProject.demo.database.BookRepository;
import LibraryProject.demo.model.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServicesImpl implements BookServices{
    private final BookRepository bookRepository;

    @Autowired
    public BookServicesImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @Override
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

}
