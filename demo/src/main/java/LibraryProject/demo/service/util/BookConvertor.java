package LibraryProject.demo.service.util;

import LibraryProject.demo.model.dto.BookDto;
import LibraryProject.demo.model.entity.Book;

public class BookConvertor {

    public static Book convertToBookEntity(BookDto bookDto){
        Book book=new Book();
        book.setBookName(bookDto.getBookName());
        book.setAuthor(bookDto.getAuthor());
        book.setId(bookDto.getId());
        return book;
    }
    public static BookDto covertToBookDto(Book book){
        BookDto bookDto=new BookDto();
        bookDto.setBookName(book.getBookName());
        bookDto.setAuthor(book.getAuthor());
        bookDto.setId(book.getId());
        return bookDto;
    }
}
