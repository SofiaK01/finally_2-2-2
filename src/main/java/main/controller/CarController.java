package main.controller;

import main.model.Car;
import main.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> carList = carService.getCars(count);
        model.addAttribute("cars", carList);
        System.out.println("AAAAAAAAA");
        return "cars";
    }

}

