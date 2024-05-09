package com.tekion.dealershipmock.controllers;

import com.tekion.dealershipmock.models.requests.CreateCarRequest;
import com.tekion.dealershipmock.models.responses.GetCarResponse;
import com.tekion.dealershipmock.services.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/car")
@RequiredArgsConstructor
public class CarController {
    @Autowired
    CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Object> getAll() {
        return new ResponseEntity<>(carService.getAll(), new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Object> getCar ( @PathVariable("id") int id){
        Optional<GetCarResponse> car = carService.getCar(id);

        if (car.isEmpty()) {
            return new ResponseEntity<>("A car with that Id could not be found.", new HttpHeaders(), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(car, new HttpHeaders(), HttpStatus.OK);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Object> addKeyFeature (@RequestBody CreateCarRequest request){
        GetCarResponse car = carService.createCar(request);

        return new ResponseEntity<>(car, new HttpHeaders(), HttpStatus.CREATED);

    }
}