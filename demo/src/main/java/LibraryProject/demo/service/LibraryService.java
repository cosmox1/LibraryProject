package LibraryProject.demo.service;

import LibraryProject.demo.database.LibraryDao;
import LibraryProject.demo.model.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
/** fara void **/
//5.06.2021 last update
@Service
public class LibraryService {
    private final LibraryDao libraryDao;
@Autowired
    public LibraryService(@Qualifier("fakeLibraryDao") LibraryDao libraryDao) {
        this.libraryDao = libraryDao;
    }
    public int addLibrary(Library library){
        return libraryDao.addLibrary(library);
    }

    public List<Library>selectAll(){
    return libraryDao.selectALl();
    }
    public Optional<Library>selectLibraryById(UUID id){
    return libraryDao.selectLibraryById(id);
    }
    public int deleteLibrary(UUID id){
   return libraryDao.deleteLibraryById(id);
    }
    public int updateLibrary(UUID id,Library library){
    return libraryDao.updateLibraryById(id,library);
    }
}
