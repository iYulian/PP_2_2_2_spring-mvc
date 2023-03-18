package web.dao;

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarDaoImp implements CarDao{

    private Car car;

    public CarDaoImp() {
        this.car = new Car();
    }

    @Override
    public List<Car> getCars(String numberOfCars) {

        return car.getListCar(5).stream().limit(Integer
                .parseInt(numberOfCars == null ? "0": numberOfCars)).collect(Collectors.toList());

    }
}
