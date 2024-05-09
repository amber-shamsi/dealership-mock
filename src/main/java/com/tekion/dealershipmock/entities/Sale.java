package com.tekion.dealershipmock.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.*;
import java.util.Date;

@Document(collection = "sale")
@Getter
@Setter
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Field(name = "sale_id")
    private String id;

    @Field(name = "date")
    private Date date;

    @Field(name = "sale_customerId")
    private String customerId;

    @Field(name = "sale_carId")
    private String carId;

    @Field(name = "sale_salesPersonId")
    private String salesPersonId;

    @Field(name = "price")
    private double salePrice;

    @Field(name = "paymentMethod")
    private String paymentMethod;
}
