package za.ac.cput.services.customer.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Customer;
import za.ac.cput.repository.customer.CustomerRepo;
import za.ac.cput.services.customer.CustomerService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by hashcode on 2016/07/26.
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepo repository;

    @Override
    public Customer create(Customer entity) {
        return repository.save(entity);
    }

    @Override
    public Customer readById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public List<Customer> readAll()
    {
        List<Customer>  customerList = new ArrayList<Customer>();
        Iterable<Customer> customers = repository.findAll();
        for (Customer client : customers) {
            customerList.add(client);
        }
        return customerList;
    }

    @Override
    public Customer update(Customer entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Customer entity) {
        repository.delete(entity);

    }
}
