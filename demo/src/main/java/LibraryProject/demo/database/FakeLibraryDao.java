package LibraryProject.demo.database;

import LibraryProject.demo.model.Library;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Repository("fakeLibraryDao")
public class FakeLibraryDao implements LibraryDao {
    private static final List<Library>DBLIBRARY=new ArrayList<>();
    @Override
    public int addLibrary(UUID id, Library library) {
        DBLIBRARY.add(new Library(id,library.getName()));
        return 1;
    }
}
