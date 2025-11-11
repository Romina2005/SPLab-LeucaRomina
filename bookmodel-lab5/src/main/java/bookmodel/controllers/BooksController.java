package bookmodel.controllers;

import bookmodel.models.Book;
import bookmodel.persistence.CrudRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    private final CrudRepo<Book> booksRepo;

    public BooksController(CrudRepo<Book> booksRepo) {
        this.booksRepo = booksRepo;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return booksRepo.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable int id) {
        return booksRepo.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        Book saved = booksRepo.save(book);
        return ResponseEntity.created(URI.create("/books/" + saved.getId())).body(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable int id, @RequestBody Book book) {
        // naive update: ensure id if provided
        Book saved = booksRepo.save(book);
        return ResponseEntity.ok(saved);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable int id) {
        booksRepo.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
