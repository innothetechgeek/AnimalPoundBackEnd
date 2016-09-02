/*package za.ac.cput;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.testng.annotations.Test;
import za.ac.cput.domain.Adoption;
import za.ac.cput.domain.Animal;
import za.ac.cput.factories.adoptionFactory.AdoptionFactory;
import za.ac.cput.factories.animal.AnimalFactory;
import za.ac.cput.repository.adoption.AdoptionRepo;
import za.ac.cput.repository.animal.AnimalRepo;
import za.ac.cput.services.adoption.AdoptionService;


@SpringApplicationConfiguration(classes =App.class)
@WebAppConfiguration
public class TestCrudAdoption  extends AbstractTestNGSpringContextTests {

    @Autowired
    AdoptionRepo myrepo;
    private long id;


    @Test
    public void create() throws Exception
    {
        Adoption adoption = AdoptionFactory.createAdoption("Horsy","Innocent","Mphokeli","July 2018");
        myrepo.save(adoption);
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception
    {

    }


}*/

