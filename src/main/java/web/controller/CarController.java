package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.Service.CarService;
import web.Service.CarServiceImp;

import javax.servlet.http.HttpServletRequest;


@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String getTheNumberOfCars(ModelMap model, HttpServletRequest httpServletRequest) {

        CarService carService = new CarServiceImp();

        model.addAttribute("cars", carService.getCars(httpServletRequest.getParameter("count")));

        return "cars";

    }

}
