package com.project.autoServiceApp.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(name = "Valstybinis numeris")
    private String licencePlate;
    @Column(name = "Markė")
    private String make;
    @Column(name = "Modelis")
    private String model;
    @Column(name = "Metai")
    private String yearOfMade;
    @Column(name = "Kėbulo tipas")
    private String bodyType;
    @Column(name = "Kuro tipas")
    private String fuelType;

}
