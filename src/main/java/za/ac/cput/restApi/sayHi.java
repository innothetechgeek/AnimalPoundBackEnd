package za.ac.cput.restApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.services.customer.CustomerService;
/**
 * Created by Game330 on 2016-08-22.
 */

@RestController
public class sayHi {

    @Autowired
    //private CustomerService myService;

    //-------------------Retrieve Single Story--------------------------------------------------------
    // @RequestMapping(value = "/cust/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping("/hi_there")
  /*  public ResponseEntity<Customer> getCustomer(@PathVariable("id") long id) {
        Customer cust = myService.readById(id);
        if (cust == null) {
            return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Customer>(cust, HttpStatus.OK);
    }*/
    public String getValue()
    {
        return "Hi There im from sayHi Class";
    }
}