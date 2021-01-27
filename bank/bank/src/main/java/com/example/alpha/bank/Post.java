package com.example.alpha.bank;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
public class Post {

    private String disclaimer;
    private String license;
    private Long timestamp;
    private String base;
    @JsonIgnoreProperties
    public Rates rates;


    @Override
    public String toString() {
        return "Post{" +
                "disclaimer='" + disclaimer + '\'' +
                ", license='" + license + '\'' +
                ", timestamp=" + timestamp +
                ", base='" + base + '\'' +
                ", rates=" + rates +
                '}';
    }
}
