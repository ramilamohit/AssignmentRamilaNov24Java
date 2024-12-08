package com.tekarch.customermanagementMS.Services.Interfaces;

import com.tekarch.customermanagementMS.Models.Customer;

import java.util.List;

public interface CustomerService {
    Customer getCustomerById(Long id);
    Customer addCustomer(Customer customer);
    List<Customer> getAllCustomers();
}
