package web.Service;

import web.dao.CarDao;
import web.dao.CarDaoImp;
import web.model.Car;

import java.util.List;

public class CarServiceImp implements CarService{

    private CarDao carDao;

    public CarServiceImp() {
        this.carDao = new CarDaoImp();
    }

    @Override
    public List<Car> getCars(String str) {
        return carDao.getCars(str);
    }
}
