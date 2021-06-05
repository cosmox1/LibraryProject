package LibraryProject.demo.controller;

import LibraryProject.demo.model.Library;
import LibraryProject.demo.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
//LastUpDate 05.06.2021
@RequestMapping("/api/v1/library")
@RestController
public class LibraryController {
    private final LibraryService libraryService;
@Autowired
    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }
    @PostMapping
    public void addLibrary(@RequestBody Library library){
    libraryService.addLibrary(library);
    }
    @GetMapping()
    public List<Library>selectAll(){
    return libraryService.selectAll();
    }
    @GetMapping(path = "{id}")
    public Optional<Library>selectLibraryById(@PathVariable("id") UUID id){
    return libraryService.selectLibraryById(id);
    }
    @DeleteMapping(path = "{id}")
    public void deleteLibraryById(@PathVariable("id") UUID id){
    libraryService.deleteLibrary(id);
    }
    @PutMapping(path = "{id}")
    public void updateLibraryById(@PathVariable("id") UUID id,@RequestBody Library library){
    libraryService.updateLibrary(id,library);
    }

}
