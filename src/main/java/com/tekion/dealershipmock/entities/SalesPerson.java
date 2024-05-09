package com.tekion.dealershipmock.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.*;

@Document(collection = "salesPerson")
@Getter
@Setter
public class SalesPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Field(name = "salesPerson_id")
    private String id;

    @Field(name = "salesPerson_employee")
    private String employeeId;
}
