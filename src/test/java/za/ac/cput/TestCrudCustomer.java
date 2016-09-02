/*package za.ac.cput;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.Test;
import za.ac.cput.domain.Customer;
import za.ac.cput.factories.customer.CustomerFactory;
import za.ac.cput.repository.customer.CustomerRepo;



@SpringApplicationConfiguration(classes =App.class)
@WebAppConfiguration

public class TestCrudCustomer  extends AbstractTestNGSpringContextTests{

    private long id;

    @Autowired
    CustomerRepo myrepo;


    @Test
    public void create() throws Exception
    {
        Customer myCust = CustomerFactory.createCustomer("Willhem","Rothman","0833456567");
        myrepo.save(myCust);
    }



    @Test(dependsOnMethods = "create")
    public void read() throws Exception
    {

    }



} */
