package com.example.mongodbreactive.util;

import com.example.mongodbreactive.model.AddressModel;
import com.example.mongodbreactive.model.CustomerModel;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Component;

@Component
public class TemplateDatabaseLoader {
    @Bean
    CommandLineRunner initialize(MongoOperations mongo){
        return args -> {
            mongo.save(new CustomerModel("0x9c9",
                    "SOLT",
                    "solt@gmail.com",
                    "eie23",
                    new AddressModel("YGN-008", "009", "YGN")));
            mongo.save(new CustomerModel("0x9c10",
                    "MIT",
                    "mit@gmail.com",
                    "eie23",
                    new AddressModel("YGN-012", "1111", "YGN")));
        };
    }
}
