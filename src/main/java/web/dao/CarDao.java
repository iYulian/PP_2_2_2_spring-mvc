package web.dao;

import org.springframework.ui.ModelMap;
import web.model.Car;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface CarDao {

    List<Car> getCars(String numberOfCars);

}
