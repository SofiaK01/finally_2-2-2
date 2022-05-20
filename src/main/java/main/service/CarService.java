package main.service;


import main.model.Car;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CarService {
    List<Car> getCars(Integer count);

}
