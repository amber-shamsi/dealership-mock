package com.tekion.dealershipmock.services;

import com.tekion.dealershipmock.entities.Car;
import com.tekion.dealershipmock.models.requests.CreateCarRequest;
import com.tekion.dealershipmock.models.requests.UpdateCarRequest;
import com.tekion.dealershipmock.models.responses.GetCarResponse;
import com.tekion.dealershipmock.repositories.CarRepository;
import com.tekion.dealershipmock.services.abstractions.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService implements ICarService {
    @Autowired
    private CarRepository carRepository;

    public CarService(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> getAll(){
        return carRepository.findAll();
    }

    @Override
    public Optional<Car> getCar(String id){
        return carRepository.findById(id);
    }

    @Override
    public Car createCar(CreateCarRequest createCarRequest){
        Car request = new Car(createCarRequest);
        return carRepository.save(request);
    }

    @Override
    public Car updateCar(String id, UpdateCarRequest updateCarRequest) {
        Car request = new Car(updateCarRequest);
        return carRepository.save(request);
    }

    @Override
    public void deleteCar(String id) {
        carRepository.deleteById(id);
    }
}
