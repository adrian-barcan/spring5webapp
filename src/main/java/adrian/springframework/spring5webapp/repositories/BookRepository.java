package adrian.springframework.spring5webapp.repositories;

import adrian.springframework.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ab at 14.08.2019
 */

public interface BookRepository extends CrudRepository<Book,Long> {
}
