package web.service;

import org.springframework.stereotype.Service;
import web.carDAO.CarDAO;
import web.carDAO.CarDAOImpl;
import web.model.Car;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    CarDAO carDAO = new CarDAOImpl();

    @Override
    public List<Car> getAllCars() {
        return carDAO.getAllCars();
    }

    @Override
    public List<Car> getCars(int count) {
        return carDAO.getCars(count);
    }
}
