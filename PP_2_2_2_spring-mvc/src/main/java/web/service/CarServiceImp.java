package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService{
    @Autowired
    private CarDao carDao;

    public List<Car> countCarsList(int index) {
        return carDao.countCarsList(index);
    }
    public List<Car> carList() {
        return carDao.carList();
    }
}
