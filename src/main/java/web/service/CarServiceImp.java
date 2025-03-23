package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImp implements CarService {
    private final List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car("BMW X5", "Внедорожник премиум-класса"));
        cars.add(new Car("Audi A4", "Стильный седан"));
        cars.add(new Car("Toyota Corolla", "Надежный и экономичный"));
        cars.add(new Car("Mercedes-Benz C-Class", "Комфорт и элегантность"));
        cars.add(new Car("Kia Rio", "Доступный городской автомобиль"));
    }

    public List<Car> getCars(int count) {
        if (count >= 5 || count < 1) {
            return cars;
        }
        return cars.subList(0, count);
    }

    public List<Car> getAllCars() {
        return cars;
    }
}
}
