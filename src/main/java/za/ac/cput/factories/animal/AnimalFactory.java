package za.ac.cput.factories.animal;

import za.ac.cput.domain.Animal;


/**
 * Created by Game330 on 2016-08-27.
 */
public class AnimalFactory{
    public static Animal createAnimal(String name,
                                          String breed,
                                          String livingArea)
    {
        return new Animal.Builder()
                .name(name)
                .breed(breed)
                .livingArea(livingArea)
                .build();
    }
}
