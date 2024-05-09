package com.tekion.dealershipmock.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.*;
import java.util.Date;

@Document(collection = "serviceRequest")
@Getter
@Setter
public class ServiceRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Field(name = "serviceRequest_id")
    private String id;

    @Field(name = "serviceRequest_carId")
    private String carId;

    @Field(name = "serviceRequest_customerId")
    private int customerId;

    @Field(name = "date")
    private Date date;

    @Field(name = "description")
    private String description;

    @Field(name = "status")
    private String status;
}
