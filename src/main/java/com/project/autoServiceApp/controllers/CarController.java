package com.project.autoServiceApp.controllers;

import com.project.autoServiceApp.model.Car;
import com.project.autoServiceApp.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CarController {
    private final CarService carService;
    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/showall")
    public List<Car> showAllCars(){
        return carService.getAllCars();
    }
    @GetMapping("show/{id}")
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
