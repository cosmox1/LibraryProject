package LibraryProject.demo.database;

import LibraryProject.demo.model.Book;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
/** no void for this part**/
//lastupdate 05.06.2021
public interface BookDao {
    int addBook(UUID id, Book book);
    default int addBook(Book book){
        UUID id=UUID.randomUUID();
        return addBook(id,book);
    }

    List<Book>selectAllBooks();
    Optional<Book>selectBookById(UUID id);
    int deleteBookById(UUID id);
    int updateBookById(UUID id, Book book);

}
