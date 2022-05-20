package main.service;

import main.model.Car;
import main.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@PropertySource("classpath:application.properties")
public class CarServiceImpl implements CarService {
    @Autowired
    private CarRepository carRepository;

    @Value("${car.carMax}")
    int carMax;

    @Override
    public List<Car> getCars(Integer count) {
        List<Car> carList = carRepository.findAll();

        if (count == null || count >= carMax) {
            return carList;
        }
        return carList.subList(0, count);
    }

}
