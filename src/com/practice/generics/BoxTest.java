package com.practice.generics;

public class BoxTest {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setData(10);
        System.out.println("Integer Value: " + integerBox.getData());

        Box<String> stringBox = new Box<>();
        stringBox.setData("Hello Generics");
        System.out.println("String Value: " + stringBox.getData());
    }
}
