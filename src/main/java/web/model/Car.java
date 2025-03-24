package web.model;

import java.util.Objects;

public class Car {
    private String marka;
    private String model;
    private String color;
    private int horsePower;
    private String imagePath;

    public Car() {
    }

    public Car(String marka, String model, String color, int horsePower, String imagePath) {
        this.marka = marka;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.imagePath = imagePath;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return marka + " " + model + "<br>" + "Цвет " + color + "<br>" + "Мощность " + horsePower + " л/с";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return horsePower == car.horsePower && Objects.equals(marka, car.marka) && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marka, model, color, horsePower);
    }
}
