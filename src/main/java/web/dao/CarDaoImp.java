package web.dao;

import web.model.Car;

import java.util.List;

public class CarDaoImp implements CarDao{

    private Car car;

    public CarDaoImp() {
        this.car = new Car();
    }

    @Override
    public List<Car> getCars(String numberOfCars) {

        if (numberOfCars == null){
            return car.getListCar(0);
        } else if (Integer.parseInt(numberOfCars) > 5) {
            return car.getListCar(5);
        } else {
            return car.getListCar(Integer.parseInt(numberOfCars));
        }

    }

}
