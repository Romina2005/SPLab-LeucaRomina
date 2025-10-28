package bookmodel.controllers;

import bookmodel.webmodels.Book;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    @GetMapping
    public List<Book> getAllBooks() {
        return List.of(
                new Book(1L, "Design Patterns", "GoF"),
                new Book(2L, "Clean Code", "Robert C. Martin")
        );
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return new Book(id, "Dummy Book", "Anonymous");
    }

    @PostMapping
    public String createBook(@RequestBody Book book) {
        return "Book created: " + book.getTitle();
    }

    @PutMapping("/{id}")
    public String updateBook(@PathVariable Long id, @RequestBody Book book) {
        return "Updated book with ID " + id + ": " + book.getTitle();
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Long id) {
        return "Deleted book with ID " + id;
    }
}
