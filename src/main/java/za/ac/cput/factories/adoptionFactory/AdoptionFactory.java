package za.ac.cput.factories.adoptionFactory;

import za.ac.cput.domain.Adoption;

/**
 * Created by Game330 on 2016-08-28.
 */
public class AdoptionFactory {
    public static Adoption createAdoption(String animalName, String customerName,
                                            String customerSurname, String date)
    {
        Adoption adoption = new Adoption.Builder()
                .animalName(animalName)
                .customerName(customerName)
                .customerSurname(customerSurname)
                .date(date)
                .build();
        return adoption;
    }
}
