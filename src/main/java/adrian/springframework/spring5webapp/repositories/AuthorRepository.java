package adrian.springframework.spring5webapp.repositories;

import adrian.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ab at 14.08.2019
 */
public interface AuthorRepository extends CrudRepository<Author,Long> {

}
