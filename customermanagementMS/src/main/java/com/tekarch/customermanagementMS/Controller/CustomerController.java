package com.tekarch.customermanagementMS.Controller;

import com.tekarch.customermanagementMS.Models.Customer;
import com.tekarch.customermanagementMS.Services.CustomerServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    private final CustomerServiceImpl customerserviceImpl;

    public CustomerController(CustomerServiceImpl customerserviceImpl) {
        this.customerserviceImpl = customerserviceImpl;
    }

    @GetMapping("/customer")
    public List<Customer> getCustomer(){
         return customerserviceImpl.getAllCustomers();
    }

    @GetMapping("/customer/{id}")
    public Customer getCustomer(@PathVariable Long id){
        return customerserviceImpl.getCustomerById(id);
    }

    @PostMapping("/customer")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerserviceImpl.addCustomer(customer);
    }
}
