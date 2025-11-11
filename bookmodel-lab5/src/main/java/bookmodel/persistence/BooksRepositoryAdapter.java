package bookmodel.persistence;

import bookmodel.models.Book;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BooksRepositoryAdapter implements CrudRepo<Book> {

    private final BooksRepository repo;

    public BooksRepositoryAdapter(BooksRepository repo) {
        this.repo = repo;
    }

    @Override
    public Book save(Book entity) {
        return repo.save(entity);
    }

    @Override
    public Optional<Book> findById(int id) {
        return repo.findById(id);
    }

    @Override
    public List<Book> findAll() {
        return repo.findAll();
    }

    @Override
    public void deleteById(int id) {
        repo.deleteById(id);
    }
}
