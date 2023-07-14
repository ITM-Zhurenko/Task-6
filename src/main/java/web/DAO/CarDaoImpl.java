package web.DAO;

import org.springframework.stereotype.Repository;
import web.entity.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private final List<Car> carsList;

    public CarDaoImpl() {
        carsList = new ArrayList<>();
        carsList.add(new Car(1L, "A", "B"));
        carsList.add(new Car(2L, "C", "D"));
        carsList.add(new Car(3L, "E", "F"));
        carsList.add(new Car(4L, "G", "H"));
        carsList.add(new Car(5L, "I", "J"));
    }


    @Override
    public List<Car> getAllCars() {
        return carsList;
    }

    @Override
    public List<Car> getCertainAmountOfCars(int count) {
        if (count <= 0) {
            return new ArrayList<>();
        }
        if (count < 5) {
            final List<Car> shortCarList = new ArrayList<>();
            int carIndex = 0;
            while (shortCarList.size() < count) {
                shortCarList.add(carsList.get(carIndex));
                carIndex++;
            }
            return shortCarList;
        }
        return carsList;
    }
}
