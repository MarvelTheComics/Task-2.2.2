package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    public List<Car> countCarsList(int index);
    public List<Car> carList();
}
