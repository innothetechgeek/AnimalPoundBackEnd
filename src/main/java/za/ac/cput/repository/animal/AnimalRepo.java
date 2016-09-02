package za.ac.cput.repository.animal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Animal;

/**
 * Created by Game330 on 2016-08-27.
 */

@Repository
public interface AnimalRepo  extends CrudRepository<Animal, Long> {
}
