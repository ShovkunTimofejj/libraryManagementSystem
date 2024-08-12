package librarymanagementsystem.Controller;

import librarymanagementsystem.Service.BookService;
import librarymanagementsystem.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping
    public void  createBook(@RequestBody Book book) {
        bookService.save(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable UUID id) {
        bookService.delete(id);
    }
}
