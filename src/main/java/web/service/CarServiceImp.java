package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImp implements CarService {

    private final List<Car> cars;

    public CarServiceImp() {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", "M4", "Синий", 575, "/image/M4Blue.webp"));
        cars.add(new Car("BMW", "M8", "Серый", 575, "/image/M8Grey.webp"));
        cars.add(new Car("BMW", "X5", "Белый", 555, "/image/X5White.webp"));
        cars.add(new Car("BMW", "X6", "Голубой", 555, "/image/X6Blue.webp"));
        cars.add(new Car("BMW", "Z4", "Красный", 425, "/image/Z4Red.webp"));
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }

    public List<Car> getAllCars() {
        return cars;
    }
}

