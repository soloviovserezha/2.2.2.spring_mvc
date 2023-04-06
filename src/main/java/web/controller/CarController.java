package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;


@Controller
public class CarController {

    CarService carService;

    @Autowired
    public void setCarService(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String getCars(@RequestParam(name = "count", required = false) Integer count, Model model) {
        if (count == null || count >= 5) {
            model.addAttribute("title", "List of Cars");
            model.addAttribute("carList", carService.getCarList());
        } else if (count <= 0) {
            model.addAttribute("count", "Request " + count + " cars");
            return "carsEmpty";
        } else {
            model.addAttribute("title", "Cars by count");
            model.addAttribute("carsByCount", carService.getCarByList(count));
        }
        return "cars";
    }
}
