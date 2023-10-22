package factory;

import factory.qa_depart.Car;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Car car = new Car();
        car.start();
    }
}