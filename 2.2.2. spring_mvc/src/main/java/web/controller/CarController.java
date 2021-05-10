package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarController {

    CarService carService = new CarServiceImpl();

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String showCars (@RequestParam(value = "count", required = false) Integer count, Model model){
        if (count == null) {
            model.addAttribute("massage", carService.getAllCars());
        } else {
            model.addAttribute("massage", carService.getCars(count));
        }
        return "cars";
    }
}
