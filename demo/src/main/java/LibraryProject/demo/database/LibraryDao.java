package LibraryProject.demo.database;

import LibraryProject.demo.model.Library;
import LibraryProject.demo.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
//5.06.2021 last update
public interface LibraryDao {
    int addLibrary(UUID id, Library library);
    default int addLibrary(Library library){
        UUID id=UUID.randomUUID();
        return addLibrary(id,library);
    }
    List<Library> selectALl();

    Optional<Library> selectLibraryById(UUID id);
    int deleteLibraryById(UUID id);
    int updateLibraryById(UUID id, Library library);


}
