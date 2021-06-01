package LibraryProject.demo.service;

import LibraryProject.demo.database.LibraryDao;
import LibraryProject.demo.model.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class LibraryService {
    private final LibraryDao libraryDao;
@Autowired
    public LibraryService(@Qualifier("fakeLibraryDao") LibraryDao libraryDao) {
        this.libraryDao = libraryDao;
    }
    public int addLibrary( Library library){
    return libraryDao.addLibrary(library);
    }
}
