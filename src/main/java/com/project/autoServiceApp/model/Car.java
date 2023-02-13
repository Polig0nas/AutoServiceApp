package com.project.autoServiceApp.model;

import lombok.*;
import javax.persistence.*;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "Car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String licencePlate;
    private String make;
    private String model;
    private String yearOfMade;
    private String bodyType;
    private String fuelType;
}
