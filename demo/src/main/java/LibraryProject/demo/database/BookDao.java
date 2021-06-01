package LibraryProject.demo.database;

import LibraryProject.demo.model.Book;

import java.util.UUID;
/** pasul doi creem o interfata cu rol de db
 * unde punem metodele de insert delete select ,update
 * **/
public interface BookDao {
    int insertBook(UUID id, Book book);
    default int insertBook(Book book){
        UUID id=UUID.randomUUID();
        return insertBook(id,book);
    }
}
