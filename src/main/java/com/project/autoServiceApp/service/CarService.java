package com.project.autoServiceApp.service;

import com.project.autoServiceApp.model.Car;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CarService {

    List<Car> getAllCars();

    Optional<Car> getCarById(Long id);
}
