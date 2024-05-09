package com.tekion.dealershipmock.repositories;

import com.tekion.dealershipmock.entities.Car;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarRepository extends MongoRepository<Car, String> {
}
