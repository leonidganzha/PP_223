package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDAOImpl implements CarDAO {
    public List<Car> getAllCars() {
        List<Car> list = new ArrayList<>();
        list.add(new Car("Tesla", "white", 2017));
        list.add(new Car("Tesla", "black", 2018));
        list.add(new Car("BMW", "black", 2019));
        list.add(new Car("Ford", "blue", 2019));
        list.add(new Car("Ferrari", "red", 1969));
        return list;
    }

    public List<Car> getCars(int count) {
        return (count >= 5) ? getAllCars() : getAllCars().subList(0, count);
    }
}
