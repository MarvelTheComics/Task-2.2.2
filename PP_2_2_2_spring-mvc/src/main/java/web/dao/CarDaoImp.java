package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImp implements CarDao {
    private static int CAR_ID;
    private final List<Car> carList = new ArrayList<>();
    {
        carList.add(new Car(++CAR_ID, "Ford", "Focus"));
        carList.add(new Car(++CAR_ID, "Opel", "Astra"));
        carList.add(new Car(++CAR_ID, "Geely", "Coolray"));
        carList.add(new Car(++CAR_ID, "Toyota", "Camry"));
        carList.add(new Car(++CAR_ID, "LADA", "Largus"));
    }
    @Override
    public List<Car> countCarsList(int index) {
        return carList.stream().limit(index).toList();
    }

    @Override
    public List<Car> carList() {
        return carList;
    }
}
