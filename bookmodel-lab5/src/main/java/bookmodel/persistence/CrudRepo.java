package bookmodel.persistence;

import java.util.List;
import java.util.Optional;

public interface CrudRepo<T> {
    T save(T entity);
    Optional<T> findById(int id);
    List<T> findAll();
    void deleteById(int id);
}
