package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {

    List<Car> getCarByList(Integer count);

    List<Car> getCarList();
}
