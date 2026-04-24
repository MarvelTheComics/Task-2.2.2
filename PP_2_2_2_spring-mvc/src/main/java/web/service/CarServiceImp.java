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

    public List<Car> carList(Integer count) {
        if (count == null || count >= 5) {
            return carDao.carList();
        } else {
            return carDao.countCarsList(count);
        }
    }
}
