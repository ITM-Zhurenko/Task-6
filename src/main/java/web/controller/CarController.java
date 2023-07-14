package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.services.CarService;

@Controller
public class CarController {

    final CarService carService;

    @Autowired
    public CarController(final CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String showCars(ModelMap model) {
        model.addAttribute("cars", carService.getAllCars());
        return "cars";
    }

    @GetMapping(value = "/cars", params = "count")
    public String getCarsByNumber(int count, ModelMap model) {
        model.addAttribute("cars", carService.getCertainAmountOfCars(count));
        return "cars";
    }
}
