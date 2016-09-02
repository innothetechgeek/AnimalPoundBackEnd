package za.ac.cput.services.adoption.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Adoption;
import za.ac.cput.repository.adoption.AdoptionRepo;
import za.ac.cput.services.adoption.AdoptionService;
import za.ac.cput.services.animal.AnimalService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Game330 on 2016-08-28.
 */
@Service
public class AdoptionServiceImpl implements AdoptionService {

    @Autowired
    AdoptionRepo repository;

    @Override
    public Adoption create(Adoption entity) {
        return repository.save(entity);
    }

    @Override
    public Adoption readById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public List<Adoption> readAll(){

        List<Adoption>  adoptionList = new ArrayList<Adoption>();
        Iterable<Adoption>adoptions = repository.findAll();
        for(Adoption adoption : adoptions) {
            adoptionList.add(adoption);
        }
        return adoptionList;
    }

    @Override
    public Adoption update(Adoption entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Adoption entity) {
        repository.delete(entity);

    }
}
