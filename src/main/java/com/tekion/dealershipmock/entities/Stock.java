package com.tekion.dealershipmock.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.*;

@Document(collection = "stock")
@Getter
@Setter
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Field(name = "stock_id")
    private String id;

    @Field(name = "stock_carId")
    private String CarId;

    @Field(name = "quantity")
    private int quantity;

    @Field(name = "location")
    private String location;
}
