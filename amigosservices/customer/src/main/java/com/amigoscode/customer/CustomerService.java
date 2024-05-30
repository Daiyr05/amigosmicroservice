package com.amigoscode.customer;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record CustomerService(CustomerRespository customerRespository) {
    public void register(CustomerRegisterRequest customerRegisterRequest){
        Customer customer = Customer.builder()
                .firstName(customerRegisterRequest.firstName())
                .lastName(customerRegisterRequest.lastName())
                .email(customerRegisterRequest.email())
                .build();
        customerRespository.save(customer);
    }

    public List<Customer> getAllCustomers() {
        return customerRespository.findAll();
    }
}
