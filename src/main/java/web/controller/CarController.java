package web.controller;

import org.springframework.web.bind.annotation.RequestParam;
import java.util.Optional;
import web.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam Optional<Integer> count) {
        model.addAttribute("table", carService.getCars(count.orElse(0)));
        return "cars";
    }
}
