package web.carDAO;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Repository
public class CarDAOImpl implements CarDAO {
    List<Car> carList = new ArrayList<>();

    public CarDAOImpl() {
        carList.add(new Car("bmw", 11, "black"));
        carList.add(new Car("opel", 22, "white"));
        carList.add(new Car("mercedes", 33, "red"));
        carList.add(new Car("feat", 44, "green"));
        carList.add(new Car("bmw", 55, "blue"));
    }

    @Override
    public List<Car> getAllCars() {
        return carList;
    }

    @Override
    public List<Car> getCars(int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
