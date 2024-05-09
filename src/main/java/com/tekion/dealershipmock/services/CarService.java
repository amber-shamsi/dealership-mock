package com.tekion.dealershipmock.services;

import com.tekion.dealershipmock.entities.Car;
import com.tekion.dealershipmock.models.requests.CreateCarRequest;
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

    public List<Car> getAll(){
        return carRepository.findAll();
    }

    public Optional<Car> getCar(String id){
        return carRepository.findById(id);
    }

    public Car createCar(CreateCarRequest createCarRequest){
        Car request = new Car(createCarRequest);
        return carRepository.save(createCarRequest);
    }
}
