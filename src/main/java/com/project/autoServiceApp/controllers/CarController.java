package com.project.autoServiceApp.controllers;

import com.project.autoServiceApp.model.CarDto;
import com.project.autoServiceApp.service.CarService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@Api(tags = {"Cars controller"})
public class CarController {
    private final CarService carService;
    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/allCars")
    public List<CarDto> showAllCars(){
        return carService.getAllCars();
    }

    @PostMapping("/new")
    public String newCar(@RequestParam("make") String make,
                         @RequestParam("model") String model,
                         @RequestParam("yearOfMade") String yearOfMade,
                         @RequestParam("bodyType") String bodyType,
                         @RequestParam("fuelType") String fuelType,
                         @RequestParam("licencePlate") String licencePlate) throws IOException {
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


//    @GetMapping("car/{id}")
//    public Optional<Car> showCar(@PathVariable Long id){
//        return carService.getCarById(id);
//    }

//    @PostMapping("remove/{id}")
//    public void removeCar(@PathVariable Long id){
//        carService.removeCar(id);
//    }
//    @PostMapping("/new")
//    public void newCar(@RequestBody Car car){
//        carService.createNewCar(car);
//    }

}
