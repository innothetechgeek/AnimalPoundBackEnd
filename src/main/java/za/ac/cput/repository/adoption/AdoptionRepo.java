package za.ac.cput.repository.adoption;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Adoption;

/**
 * Created by Game330 on 2016-08-28.
 */

@Repository
public interface AdoptionRepo extends CrudRepository<Adoption,Long> {
}
