package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImp implements CarDao {
    private final List<Car> carList = new ArrayList<>();
    {
        carList.add(new Car(1, "Ford", "Focus"));
        carList.add(new Car(2, "Opel", "Astra"));
        carList.add(new Car(3, "Geely", "Coolray"));
        carList.add(new Car(4, "Toyota", "Camry"));
        carList.add(new Car(5, "LADA", "Largus"));
    }
    @Override
    public List<Car> countCarsList(int count) {
        return carList.stream().limit(count).toList();
    }

    @Override
    public List<Car> carList() {
        return carList;
    }
}
