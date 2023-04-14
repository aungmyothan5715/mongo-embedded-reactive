package com.example.mongodbreactive.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

@Value
public class AddressModel {
    String addressLine;
    String postalCode;
    String city;

    public AddressModel(@JsonProperty("addressLine") String addressLine,
                        @JsonProperty("postalCode") String postalCode,
                        @JsonProperty("city") String city) {
        this.addressLine = addressLine;
        this.postalCode = postalCode;
        this.city = city;
    }
}
