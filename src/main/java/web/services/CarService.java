package web.services;

import web.entity.Car;

import java.util.List;

public interface CarService {

    List<Car> getAllCars();

    List<Car> getCertainAmountOfCars(int count);
}
