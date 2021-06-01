package LibraryProject.demo.database;

import LibraryProject.demo.model.Library;

import java.util.UUID;

public interface LibraryDao {
    int addLibrary(UUID id, Library library);
    default int addLibrary(Library library){
        UUID id=UUID.randomUUID();
        return addLibrary(id,library);
    }

}
