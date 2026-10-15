package com.practice.generics;

public class PairTest {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Age", 25);
        System.out.println("Key: " + pair.getKey());
        System.out.println("Value: " + pair.getValue());
    }
}
