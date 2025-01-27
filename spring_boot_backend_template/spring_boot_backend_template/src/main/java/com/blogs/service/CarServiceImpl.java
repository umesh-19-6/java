package com.blogs.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.blogs.Entity.Car;
import com.blogs.Repository.CarRepository;


@Service
@Transactional
public class CarServiceImpl implements CarService {
	@Autowired
    private CarRepository carRepository;

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Optional<Car> getCarById(int id) {
        return carRepository.findById(id);
    }

    public Car createCar(Car car) {
        return carRepository.save(car);
    }

    public Optional<Car> updateCar(int id, Car car) {
        if (carRepository.existsById(id)) {
            car.setId(id);
            return Optional.of(carRepository.save(car));
        } else {
            return Optional.empty();
        }
    }

    public boolean deleteCar(int id) {
        if (carRepository.existsById(id)) {
            carRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
