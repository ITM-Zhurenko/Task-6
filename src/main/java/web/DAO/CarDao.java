package web.DAO;

import web.entity.Car;

import java.util.List;


public interface CarDao {

    List<Car> getAllCars();

    List<Car> getCertainAmountOfCars(int count);
}
