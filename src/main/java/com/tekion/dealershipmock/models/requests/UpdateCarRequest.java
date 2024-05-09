package com.tekion.dealershipmock.models.requests;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;
import java.time.Year;

@Getter
@Setter
public class UpdateCarRequest {

    @Id
    @Field(name = "car_id")
    private String carId;

    @Field(name = "make")
    private String make;

    @Field(name = "model")
    private String model;

    @Field(name = "year")
    private Year year;

    @Field(name = "vin")
    private String vin;

    @Field(name = "colour")
    private String colour;

    @Field(name = "mileage")
    private short mileage;

    @Field(name = "price")
    private double price;

    @Field(name = "status")
    private String status;
}
