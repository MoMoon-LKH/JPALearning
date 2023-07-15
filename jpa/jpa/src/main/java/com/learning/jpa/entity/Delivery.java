package com.learning.jpa.entity;

import com.learning.jpa.entity.enums.DeliveryStatus;
import lombok.Data;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Data
public class Delivery {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DELIVERY_ID")
    private Long id;

    private String city;

    private String street;

    private String zipcode;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;

    @OneToOne(mappedBy = "delivery")
    private Order order;


}
