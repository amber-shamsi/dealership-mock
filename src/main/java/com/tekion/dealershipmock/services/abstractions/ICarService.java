package com.tekion.dealershipmock.services.abstractions;

import com.tekion.dealershipmock.entities.Car;
import com.tekion.dealershipmock.models.requests.CreateCarRequest;
import com.tekion.dealershipmock.models.requests.UpdateCarRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface ICarService extends MongoRepository<Car, Integer> {
    public List<Car> getAll();
    public Optional<Car> getCar(String id);
    public Car createCar(CreateCarRequest request);
    public Car updateCar(String id, UpdateCarRequest request);
    public Boolean deleteCar(String id);
}
