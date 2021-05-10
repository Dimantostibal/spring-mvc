package web.carDAO;

import web.model.Car;

import java.util.List;


public interface CarDAO {
    public List<Car> getAllCars();
    public List<Car> getCars(int count);
}
