package org.example.second.model;

import java.util.ArrayList;
import java.util.List;

public class DatabaseMock {

    public List<Car> getAudi(){
        List<Car> cars = new ArrayList<>();
        Car car = new Car();
        car.setId("3");
        car.setPrice("200000 EUR");
        car.setType("AUDI");

        Car car2 = new Car();
        car2.setId("4");
        car2.setPrice("100011010 USD");
        car2.setType("AUDI");

        cars.add(car);
        cars.add(car2);
        return cars;
    }

    public List<Car> getBwm(){
        List<Car> cars = new ArrayList<>();
        Car car = new Car();
        car.setId("1");
        car.setPrice("10000 EUR");
        car.setType("BMW");

        Car car2 = new Car();
        car2.setId("2");
        car2.setPrice("221000 EUR");
        car2.setType("BMW");

        cars.add(car);
        cars.add(car2);

        return cars;
    }
}
