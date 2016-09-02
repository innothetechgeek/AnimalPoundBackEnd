package za.ac.cput.services.adoption;

import java.util.List;

/**
 * Created by Game330 on 2016-08-28.
 */
public interface Service<E, ID> {
    E create(E entity);

    E readById(ID id);

    List<E> readAll();

    E update(E entity);

    void delete(E entity);
}
