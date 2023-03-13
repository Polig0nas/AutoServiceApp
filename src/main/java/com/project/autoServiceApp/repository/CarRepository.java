package com.project.autoServiceApp.repository;

import com.project.autoServiceApp.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {

    @Query(value = "SELECT * FROM CARS", nativeQuery = true)
    List<Car> getAllCars();
}
