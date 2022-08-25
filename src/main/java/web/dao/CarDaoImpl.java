package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("Жига", 2101, 1.1));
        cars.add(new Car("Жига", 2111, 1.4));
        cars.add(new Car("Жига", 2104, 1.3));
        cars.add(new Car("Жига", 2108, 1.4));
        cars.add(new Car("Жига", 2106, 1.2));
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }
}
