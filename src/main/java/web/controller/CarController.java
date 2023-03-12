package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private String model;

    private String brand;

    private int price;

    private List<CarController> carControllers;

    public CarController() {
        carControllers = getListCar();
    }

    public CarController(String brand, String model, int price) {
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


    public List<CarController> getListCar() {

        List<CarController> carControllerList = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            carControllerList.add(new CarController("Brand - " + i, "model - " + i, i * 1000));
        }

        return carControllerList;

    }

    @GetMapping(value = "/cars")
    public String getTheNumberOfCars1(ModelMap model, HttpServletRequest httpServletRequest) {

        if (httpServletRequest.getParameter("count") != null) {

            int count = Integer.parseInt(httpServletRequest.getParameter("count"));

            if (count > 5) {
                model.addAttribute("cars", carControllers);
            } else {
                model.addAttribute("cars", carControllers.subList(0, count));
            }
        }

        return "cars";

    }

}
