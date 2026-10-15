package com.practice.generics;

public class NumberBoxTest {
    public static void main(String[] args) {
        NumberBox<Integer> intBox = new NumberBox<>();
        intBox.setNumber(10);
        System.out.println("Integer Value: " + intBox.getNumber());

        NumberBox<Double> doubleBox = new NumberBox<>();
        doubleBox.setNumber(20.5);
        System.out.println("Double Value: " + doubleBox.getNumber());
    }
}
