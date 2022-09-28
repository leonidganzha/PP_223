package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.dao.CarDAOImpl;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService{
    private final CarDAO carDAO = new CarDAOImpl();

    public List<Car> getAllCars() {
        return carDAO.getAllCars();
    }
    public List<Car> show(int count) {
        return carDAO.show(count);
    }
}
