package web.model;

import org.springframework.stereotype.Repository;
import web.controller.CarController;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Car {
    private String model;

    private String brand;

    private int price;

    private List<Car> carControllers;

    public Car() {
    }

    public Car(String brand, String model, int price) {
        this.model = model;
        this.brand = brand;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public List<Car> getListCar(int numberOfCar) {

        List<Car> carList = new ArrayList<>();
        for (int i = 1; i < numberOfCar + 1; i++) {
            carList.add(new Car("Brand - " + i, "model - " + i, i * 1000));
        }

        return carList;

    }
}
