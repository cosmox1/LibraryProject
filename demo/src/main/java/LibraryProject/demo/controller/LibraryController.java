package LibraryProject.demo.controller;

import LibraryProject.demo.model.Library;
import LibraryProject.demo.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/library")
@RestController
public class LibraryController {
    private final LibraryService libraryService;
@Autowired
    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }
    public void addLibrary(@RequestBody Library library){
    libraryService.addLibrary(library);
    }
}
