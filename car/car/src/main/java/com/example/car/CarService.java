package com.example.car;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    public List<Car> getAllCars() {
        return List.of(
                new Car(1L, "Peugeot", "208"),
                new Car(2L, "Renault", "Clio")
        );
    }
}
