package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    CarDao carDao;

    @Autowired
    public void setCarDao(CarDao carDao) {
        this.carDao = carDao;
    }

    public CarServiceImpl() {
    }

    @Override
    public List<Car> getCarByList(Integer count) {
        return carDao.getCarByList(count);
    }

    @Override
    public List<Car> getCarList() {
        return carDao.getCarList();
    }
}
