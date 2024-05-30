package com.amigoscode.customer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
public record CustomerController(CustomerService customerService) {
    @PostMapping("/post")
    public void register (@RequestBody CustomerRegisterRequest customerRegisterRequest){
        log.info("new customer registration {}",customerRegisterRequest);
        customerService.register(customerRegisterRequest);
    }

    @GetMapping("/get")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }
}
