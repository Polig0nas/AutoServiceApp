package com.project.autoServiceApp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarDto {
    private Long id;
    private String licencePlate;
    private String make;
    private String model;
    private String yearOfMade;
    private String bodyType;
    private String fuelType;
}
