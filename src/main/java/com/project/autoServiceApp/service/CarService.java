package com.project.autoServiceApp.service;

import com.project.autoServiceApp.model.CarDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarService {
    List<CarDto> getAllCars();

//    Optional<Car> getCarById(Long id);
//    void removeCar(Long id);
    String createNewCar(CarDto carDto);
}
