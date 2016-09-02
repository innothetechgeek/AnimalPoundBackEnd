
//package za.ac.cput;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.Test;
import za.ac.cput.domain.Animal;
import za.ac.cput.factories.animal.AnimalFactory;
import za.ac.cput.repository.animal.AnimalRepo;

//@SpringApplicationConfiguration(classes =App.class)
//@WebAppConfiguration
//public class TestCrudAnimal  extends AbstractTestNGSpringContextTests {
//
//    @Autowired
//    AnimalRepo myrepo;
//    private long id;
//    @Test
//    public void create() throws Exception
//    {
//        Animal myAnimal = AnimalFactory.createAnimal("Sheep","Whitty","Kraal");
//        myrepo.save(myAnimal);
//    }
//    @Test(dependsOnMethods = "create")
//    public void read() throws Exception
//    {
//
//    }
//}
