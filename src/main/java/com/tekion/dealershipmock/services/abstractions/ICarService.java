package com.tekion.dealershipmock.services.abstractions;

import com.tekion.dealershipmock.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICarService extends JpaRepository<Car, Integer> {

}
