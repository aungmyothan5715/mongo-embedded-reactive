package com.example.mongodbreactive.controller;

import com.example.mongodbreactive.model.CustomerModel;
import com.example.mongodbreactive.service.CustomerService;
import org.reactivestreams.Publisher;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {
    private final CustomerService customerService;

    public CustomerRestController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(value = "/customers", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    Publisher<CustomerModel> findAllCustomers(){
        return customerService.findAllCustomers();
    }
}
