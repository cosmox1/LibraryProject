package LibraryProject.demo.service;

import LibraryProject.demo.database.BookDao;
import LibraryProject.demo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
//update 05.06.2021
@Service
public class BookService {
    private final BookDao bookDao;
@Autowired
    public BookService(@Qualifier("fakeBookDao") BookDao bookDao) {
        this.bookDao = bookDao;
    }
    public int addBook(Book book){
   return bookDao.addBook(book);
    }
    public int deleteBook(UUID id){
    return bookDao.deleteBookById(id);
    }
    public int updateBook(UUID id,Book book){
    return bookDao.updateBookById(id,book);
    }
    public List<Book>selectAllBooks(){
    return bookDao.selectAllBooks();
    }
    public Optional<Book>selectBookById(UUID id){
    return bookDao.selectBookById(id);
    }
}
