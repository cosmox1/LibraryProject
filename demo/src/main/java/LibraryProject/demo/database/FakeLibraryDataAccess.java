package LibraryProject.demo.database;

import LibraryProject.demo.model.Library;
import LibraryProject.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
//5.06.2021 last update
@Repository("fakeLibraryDao")
public class FakeLibraryDataAccess implements LibraryDao{
    private static final List<Library>DBLIBRARY=new ArrayList<>();
    @Override
    public int addLibrary(UUID id, Library library) {
        DBLIBRARY.add(new Library(id,library.getName()));
        return 1;
    }

    @Override
    public List<Library> selectALl() {
        return DBLIBRARY;
    }

    @Override
    public Optional<Library> selectLibraryById(UUID id) {
        return DBLIBRARY.stream()
                .filter(library -> library.getId().equals(id))
                .findFirst();
    }

    @Override
    public int deleteLibraryById(UUID id) {
        Optional<Library> libraryMaybe=selectLibraryById(id);
        if (libraryMaybe.isEmpty()){
            return 0;
        }
        DBLIBRARY.remove(libraryMaybe.get());
        return 1;
    }


    @Override
    public int updateLibraryById(UUID id, Library library) {
        return selectLibraryById(id)
                .map(person1 -> {
                    int indexOfLibraryToUpdate = DBLIBRARY.indexOf(person1);
                    if (indexOfLibraryToUpdate>=0){
                        DBLIBRARY.set(indexOfLibraryToUpdate,new Library(id, library.getName()));
                        return 1;
                    }
                    return 0;
                })
                .orElse(0);
    }
}
