package LibraryProject.demo.service;

import LibraryProject.demo.database.BookDao;
import LibraryProject.demo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    /**anotam serviciul ca service pt a fi injectat
     *injectam interfata dao si creem un constructor
     * o legam prin autowire pt a injecta
     * creem serviciile de add,get,delete,update**/
    private final BookDao bookDao;
@Autowired
    public BookService(@Qualifier("fakeBookDao") BookDao bookDao) {
        this.bookDao = bookDao;
    }
    public int addBook(Book book){
        return bookDao.insertBook(book);
    }
}
