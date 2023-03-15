package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.Service.CarService;
import web.Service.CarServiceImp;
import web.model.Car;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private final Car car;

    public CarController(Car car) {
        this.car = car;
    }


    @GetMapping(value = "/cars")
    public String getTheNumberOfCars(ModelMap model, HttpServletRequest httpServletRequest) {

        CarService carService = new CarServiceImp();

        System.out.println(carService.getCars(httpServletRequest.getParameter("count")));

        model.addAttribute("cars", carService.getCars(httpServletRequest.getParameter("count")));

        return "cars";

    }

}
