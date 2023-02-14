package com.project.autoServiceApp.service;

import com.project.autoServiceApp.model.Car;
import com.project.autoServiceApp.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class CarServiceImpl implements CarService{
    private final CarRepository repository;
    @Override
    public List<Car> getAllCars() {
        return repository.findAll();
    }
    @Override
    public Optional<Car> getCarById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void removeCar(Long id) {
        repository.deleteById(id);
    }

    public void createNewCar(Car car){
        Car newCar = new Car();
        newCar.setLicencePlate(car.getLicencePlate());
        newCar.setMake(car.getMake());
        newCar.setModel(car.getModel());
        newCar.setYearOfMade(car.getYearOfMade());
        newCar.setBodyType(car.getBodyType());
        newCar.setFuelType(car.getFuelType());
        repository.save(newCar);
    }
}
