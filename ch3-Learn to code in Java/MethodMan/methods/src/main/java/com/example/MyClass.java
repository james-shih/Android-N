package com.example;

public class MyClass {

    public static void main(String[] args) {
        printName();
        printArea(5, 10);
    }

    public static void printName() {
        System.out.println("Hi, my name is Enrique, but my friends call ma Henry.");
    }

    public static void printArea(int length, int width) {
        System.out.println("Area: " + (length * width));
    }

    public static int getArea(int length, int width) {
        int area = length * width;
        return area;
    }

}
