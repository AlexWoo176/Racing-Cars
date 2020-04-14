package com.codegym;

public class Main {
    public static int DISTANCE = 200;

    public static int STEP = 5;

    public static void main(String[] args) {
        Car carA = new Car("A");
        Car carB = new Car("B");
        Car carC = new Car("C");

        Thread t1 = new Thread(carA);
        Thread t2 = new Thread(carB);
        Thread t3 = new Thread(carC);

        System.out.println("Distance: 200KM");
        t1.start();
        t2.start();
        t3.start();
    }
}
