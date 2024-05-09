package com.tekion.dealershipmock.models.responses;

import lombok.Getter;
import lombok.Setter;

import java.time.Year;

@Getter
@Setter
public class GetCarResponse {
    private String carId;

    private String make;

    private String model;

    private Year year;

    private String vin;

    private String colour;

    private short mileage;

    private double price;

    private String status;
}
