package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.CarDao;
import web.entity.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    final CarDao carDao;

    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }


    @Override
    public List<Car> getAllCars() {
        return carDao.getAllCars();
    }

    @Override
    public List<Car> getCertainAmountOfCars(int count) {
        return carDao.getCertainAmountOfCars(count);
    }
}
