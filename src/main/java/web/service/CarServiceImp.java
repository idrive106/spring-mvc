package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private final List<Car> cars = Arrays.asList(
            new Car("BMW", "M4", "Синий", 575, "/image/M4Blue.webp"),
            new Car("BMW", "M8", "Серый", 575, "/image/M8Grey.webp"),
            new Car("BMW", "X5", "Белый", 555, "/image/X5White.webp"),
            new Car("BMW", "X6", "Голубой", 555, "/image/X6Blue.webp"),
            new Car("BMW", "Z4", "Красный", 425, "/image/Z4Red.webp")
    );

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}


