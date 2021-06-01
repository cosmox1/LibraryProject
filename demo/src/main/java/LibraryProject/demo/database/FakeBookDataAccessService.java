package LibraryProject.demo.database;

import LibraryProject.demo.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/** implementam interfata si metodele din aceasta
 * si dam functionalitate metodelor
 * creem o lista statica numita database(DB)
 * **/
@Repository("fakeBookDao")
public class FakeBookDataAccessService implements BookDao {
private static final List<Book> DB=new ArrayList<>();
    @Override
    public int insertBook(UUID id, Book book) {
        DB.add(new Book(id, book.getName(), book.getAutor()));
        return 1;
    }
}
