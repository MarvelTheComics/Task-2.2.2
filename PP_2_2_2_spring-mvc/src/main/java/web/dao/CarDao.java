package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    public List<Car> countCarsList(int index);
    public List<Car> carList();
}
