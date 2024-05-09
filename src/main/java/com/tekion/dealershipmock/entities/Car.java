package com.tekion.dealershipmock.entities;

import com.tekion.dealershipmock.models.requests.CreateCarRequest;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.*;
import java.time.Year;

@Document(collection = "car")
@Getter
@Setter
public class Car {

    public Car(){

    }

    public Car(CreateCarRequest request){
        this.carId= request.getCarId();
        this.make = request.getMake();
        this.model = request.getModel();
        this.year = request.getYear();
        this.vin = request.getVin();
        this.colour = request.getColour();
        this.mileage = request.getMileage();
        this.price = request.getPrice();
        this.status = request.getStatus();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
