package com.tekion.dealershipmock.services.abstractions;

import com.tekion.dealershipmock.entities.Car;
import com.tekion.dealershipmock.models.requests.CreateCarRequest;
import com.tekion.dealershipmock.models.requests.UpdateCarRequest;

import java.util.List;
import java.util.Optional;

public interface ICarService{
    List<Car> getAll();
    Optional<Car> getCar(String id);
    Car createCar(CreateCarRequest request);
    Car updateCar(String id, UpdateCarRequest request);
    void deleteCar(String id);
}
