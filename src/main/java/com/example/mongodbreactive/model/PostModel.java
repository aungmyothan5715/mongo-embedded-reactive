package com.example.mongodbreactive.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

@Value
public class PostModel {
    String title;
    String body;
    Integer id;
    Integer userId;

    @JsonCreator
    public PostModel(@JsonProperty("title") String title,
                     @JsonProperty("body") String body,
                     @JsonProperty("id") Integer id,
                     @JsonProperty("userId") Integer userId) {
        this.title = title;
        this.body = body;
        this.id = id;
        this.userId = userId;
    }
}
