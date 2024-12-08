package com.tekarch.customermanagementMS.Services;

import com.tekarch.customermanagementMS.Models.Customer;
import com.tekarch.customermanagementMS.Repositories.CustomerRepository;
import com.tekarch.customermanagementMS.Services.Interfaces.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer getCustomerById(Long id) {
       return customerRepository.getCustomerById(id);
    }

    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}
