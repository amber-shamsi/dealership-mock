package com.tekion.dealershipmock.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.*;
import java.util.Date;

@Document(collection = "payment")
@Getter
@Setter
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Field(name = "payment_id")
    private String id;

    @Field(name = "payment_saleId")
    private String saleId;

    @Field(name = "amount")
    private int amount;

    @Field(name = "date")
    private Date date;

    @Field(name = "paymentMethod")
    private String paymentMethod;

    @Getter
    @ManyToOne
    @JoinTable(
            name = "payment_sale",
            joinColumns = {@JoinColumn(name = "sale_id")},
            inverseJoinColumns = {@JoinColumn(name = "payment_saleId")}
    )
    @ToString.Exclude
    @JsonIgnore
    @Setter(AccessLevel.NONE)
    private Car paymentSale;
}
