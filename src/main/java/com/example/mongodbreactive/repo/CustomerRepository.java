package com.example.mongodbreactive.repo;

import com.example.mongodbreactive.model.CustomerModel;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CustomerRepository extends ReactiveCrudRepository<CustomerModel, String> {
}
