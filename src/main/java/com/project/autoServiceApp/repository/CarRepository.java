package com.project.autoServiceApp.repository;

import com.project.autoServiceApp.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {

}
