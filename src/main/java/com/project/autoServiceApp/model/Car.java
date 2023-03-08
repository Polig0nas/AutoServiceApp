package com.project.autoServiceApp.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "CAR")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "LICENCE_PLATE")
    private String licencePlate;
    @Column(name = "MAKE")
    private String make;
    @Column(name = "MODEL")
    private String model;
    @Column(name = "YEAR_OF_MADE")
    private String yearOfMade;
    @Column(name = "BODY_TYPE")
    private String bodyType;
    @Column(name = "FUEL_TYPE")
    private String fuelType;
}