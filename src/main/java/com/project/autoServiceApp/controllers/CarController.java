package com.project.autoServiceApp.controllers;

import com.project.autoServiceApp.model.CarDto;
import com.project.autoServiceApp.service.CarService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@Api(tags = {"Cars controller"})
public class CarController {
    private final CarService carService;
    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/allcars")
    public List<CarDto> showAllCars(){
        return carService.getAllCars();
    }

    @PostMapping("/new")
    public String newCar(@RequestParam("make") String make,
                         @RequestParam("model") String model,
                         @RequestParam("yearOfMade") String yearOfMade,
                         @RequestParam("bodyType") String bodyType,
                         @RequestParam("fuelType") String fuelType,
                         @RequestParam("licencePlate") String licencePlate) {
        CarDto carDto = CarDto.builder()
                .make(make)
                .model(model)
                .yearOfMade(yearOfMade)
                .bodyType(bodyType)
                .fuelType(fuelType)
                .licencePlate(licencePlate)
                .build();
        return carService.createNewCar(carDto);
    }
}
