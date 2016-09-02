package za.ac.cput.services.animal.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Animal;
import za.ac.cput.repository.animal.AnimalRepo;

import za.ac.cput.services.animal.AnimalService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Game330 on 2016-08-27.
 */
@Service
public class AnimalServiceImpl implements AnimalService {
    @Autowired
    AnimalRepo repository;

    @Override
    public Animal create(Animal entity) {
        return repository.save(entity);
    }

    @Override
    public Animal readById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public List<Animal> readAll(){

        List<Animal>  animalList = new ArrayList<Animal>();
        Iterable<Animal>animals = repository.findAll();
        for(Animal animal : animals) {
            animalList.add(animal);
        }
        return animalList;
    }

    @Override
    public Animal update(Animal entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Animal entity) {
        repository.delete(entity);

    }
}

