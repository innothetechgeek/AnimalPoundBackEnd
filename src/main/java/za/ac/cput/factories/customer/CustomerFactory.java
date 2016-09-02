package za.ac.cput.factories.customer;

import za.ac.cput.domain.Customer;

/**
 * Created by Game330 on 2016-05-30.
 */
public class CustomerFactory {


    public static Customer createCustomer(String name, String surname,String phoneNumber)
    {
        return new Customer.Builder()
                .name(name)
                .surname(surname)
                .phoneNumber(phoneNumber)
                .build();
    }

}
