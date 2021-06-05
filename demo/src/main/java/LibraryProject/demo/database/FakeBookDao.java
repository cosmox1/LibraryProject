package LibraryProject.demo.database;

import LibraryProject.demo.model.Book;
import LibraryProject.demo.model.Library;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

//last update 05.06.2021
@Repository("fakeBookDao")
public class FakeBookDao implements BookDao{
    private static final List<Book> BOOKDB=new ArrayList<>();
    @Override
    public int addBook(UUID id, Book book) {
        BOOKDB.add(new Book(id, book.getName(), book.getAutor()));
        return 1;
    }

    @Override
    public List<Book> selectAllBooks() {
        return BOOKDB;
    }

    @Override
    public Optional<Book> selectBookById(UUID id) {
        return BOOKDB.stream()
                .filter(book -> book.getId().equals(id))
                .findFirst();
    }

    @Override
    public int deleteBookById(UUID id) {
        Optional<Book>maybeBook=selectBookById(id);
        if (maybeBook.isEmpty()) {
            return 0;
        }
        //ce rezulta din maybebook de aceea nu inseram id ci get
    BOOKDB.remove(maybeBook.get());
    return 1;}

    @Override
    public int updateBookById(UUID id, Book book) {
        return selectBookById(id)
                .map(book1 -> {
                    int indexOfBookToUpdate = BOOKDB.indexOf(book1);
                    if (indexOfBookToUpdate>=0){
                        BOOKDB.set(indexOfBookToUpdate,new Book(id, book.getName(), book.getAutor()));
                        return 1;
                    }
                    return 0;
                })
                .orElse(0);
    }
}
