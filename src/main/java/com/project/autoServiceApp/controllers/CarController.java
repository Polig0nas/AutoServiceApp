package com.project.autoServiceApp.controllers;

import com.project.autoServiceApp.model.Car;
import com.project.autoServiceApp.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/cars")
public class CarController {
    private final CarService carService;
    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/allCars")
    public List<Car> showAllCars(){
        return carService.getAllCars();
    }
    @GetMapping("/{id}")
    public Optional<Car> showCar(@PathVariable Long id){
        return carService.getCarById(id);
    }
}
