package com.project.autoServiceApp.service;

import com.project.autoServiceApp.model.Car;
import com.project.autoServiceApp.model.CarDto;
import com.project.autoServiceApp.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class CarServiceImpl implements CarService{
    private final CarRepository repository;
    @Override
    public List<CarDto> getAllCars() {
        return mapCarDto(repository.getAllCars());
    }

    @Override
    public String createNewCar(CarDto carDto) {
        Car newCar = buildNewCar(carDto);
        repository.save(newCar);
        return newCar.getId() != null ? "success" : "failed";
    }

    private Car buildNewCar(CarDto carDto){
        return Car.builder()
                .make(carDto.getMake())
                .model(carDto.getModel())
                .yearOfMade(carDto.getYearOfMade())
                .bodyType(carDto.getBodyType())
                .fuelType(carDto.getFuelType())
                .licencePlate(carDto.getLicencePlate())
                .build();
    }

    private List<CarDto> mapCarDto(Collection<Car> carEntities){
        return carEntities.stream()
                .map(car -> CarDto.builder()
                        .id(car.getId())
                        .make(car.getMake())
                        .model(car.getModel())
                        .yearOfMade(car.getYearOfMade())
                        .bodyType(car.getBodyType())
                        .fuelType(car.getFuelType())
                        .licencePlate(car.getLicencePlate())
                        .build())
                .collect(Collectors.toList());
    }

}
