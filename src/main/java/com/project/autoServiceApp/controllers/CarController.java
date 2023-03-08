package com.project.autoServiceApp.controllers;

import com.project.autoServiceApp.model.Car;
import com.project.autoServiceApp.model.CarDto;
import com.project.autoServiceApp.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @GetMapping("car/{id}")
    public Optional<Car> showCar(@PathVariable Long id){
        return carService.getCarById(id);
    }
    @PostMapping("remove/{id}")
    public void removeCar(@PathVariable Long id){
        carService.removeCar(id);
    }
    @PostMapping("/new")
    public void newCar(@RequestBody Car car){
        carService.createNewCar(car);
    }

}
