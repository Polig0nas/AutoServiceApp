package com.project.autoServiceApp.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "Car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String licencePlate;

    private String make;

    private String model;

    private String yearOfMade;

    private String bodyType;

    private String fuelType;

}
