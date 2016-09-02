
package za.ac.cput.repository.customer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Customer;

/**
 * Created by Game330 on 2016-05-31.
 */

@Repository
public interface CustomerRepo  extends CrudRepository<Customer, Long> {


}
