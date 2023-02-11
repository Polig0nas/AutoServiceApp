package com.project.autoServiceApp.service;

import com.project.autoServiceApp.model.Car;
import com.project.autoServiceApp.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class CarServiceImpl implements CarService{
    private final CarRepository repository;

    @Override
    public List<Car> getAllCars() {
        return repository.findAll();
    }
}
