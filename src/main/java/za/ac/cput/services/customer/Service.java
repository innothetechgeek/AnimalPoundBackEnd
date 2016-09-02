package za.ac.cput.services.customer;

import java.util.List;
import java.util.Set;

/**
 * Created by Game330 on 2016-08-08.
 */


public interface Service<E, ID> {

    E create(E entity);

    E readById(ID id);

    List<E> readAll();

    E update(E entity);

    void delete(E entity);


}