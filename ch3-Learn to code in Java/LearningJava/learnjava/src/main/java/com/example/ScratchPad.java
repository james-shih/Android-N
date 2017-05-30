package com.example;

import shape.Triangle;
import vehicle.Bus;
import vehicle.Car;
import vehicle.Vehicle;

public class ScratchPad {
    public static void main(String[] args) {

        String name = "John";
        int homeRuns = 55;
        float bankBalance = 100.44f;
        System.out.println(name + " has " + homeRuns + " home runs!");

        float finalBalance = bankBalance - 50;
        System.out.println(name + " has " + finalBalance + "in his account!");

        Person person = new Person("Jack", "Wu", 45);
        person.speakName();

        //Vehicle scope ----------------------
        Vehicle vehicle = new Vehicle("Honda", "Civic");
        Car car = new Car("Chevy", "Camaro");
        Bus bus = new Bus("Yellow", "Bus");

        vehicle.accelerate();
        car.accelerate();
        bus.accelerate();

        vehicle.printDetail();
        car.printDetail();

        vehicle.setOdometer(-100);
        System.out.println("Odometer: "+ vehicle.getOdometer());

        car.addToOdometer(-100);
        car.addToOdometer(500);
        System.out.println("Odometer: "+ car.getOdometer());

        //Shape scope    --------------------
        shape.Rectangle rectangle = new shape.Rectangle();
        rectangle.calculateArea(5, 6);

        Triangle triangle = new Triangle();
        triangle.calculateArea(5, 8);

    }
}
