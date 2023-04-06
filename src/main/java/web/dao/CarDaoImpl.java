package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {

    public CarDaoImpl() {
    }

    @Override
    public List<Car> getCarByList(Integer count) {
        List<Car> cars = new ArrayList<>();
        if (getCarList().size() <= count) {
            return getCarList();
        } else {
            for (int i = 0; i < count; i++) {
                if (getCarList().get(i) != null) {
                    cars.add(getCarList().get(i));
                }
            }
            return cars;
        }
    }

    @Override
    public List<Car> getCarList() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(1000, "model1"));
        carList.add(new Car(10, "model2"));
        carList.add(new Car(2020, "model3"));
        carList.add(new Car(1212, "model4"));
        carList.add(new Car(1, "model5"));
        return carList;
    }
}
