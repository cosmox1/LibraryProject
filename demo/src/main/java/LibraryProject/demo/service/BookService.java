package LibraryProject.demo.service;

import LibraryProject.demo.database.BookDao;
import LibraryProject.demo.model.Book;

public class BookService {
    /**anotam serviciul ca service pt a fi injectat
     *injectam interfata dao si creem un constructor
     * o legam prin autowire pt a injecta
     * creem serviciile de add,get,delete,update**/
    private final BookDao bookDao;

    public BookService(BookDao bookDao) {
        this.bookDao = bookDao;
    }
    public int addBook(Book book){
        return bookDao.insertBook(book);
    }
}
