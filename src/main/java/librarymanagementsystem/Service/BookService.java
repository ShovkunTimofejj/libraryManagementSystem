package librarymanagementsystem.Service;


import librarymanagementsystem.Repository.BookRepository;
import librarymanagementsystem.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    public Book save(Book book) {
        return bookRepository.save(book);
    }
    public void delete(UUID id) {
        bookRepository.deleteById(id);
    }
}
