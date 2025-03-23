package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class CarController {

    @GetMapping("/cars")
    public String cars(Model model) {
        return "cars";
    }
}
