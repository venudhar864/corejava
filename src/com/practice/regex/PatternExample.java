package com.practice.regex;

import java.util.regex.Pattern;

public class PatternExample {
    public static void main(String args[]){
        System.out.println(Pattern.matches("xyz.*", "xyz123456"));
        System.out.println(Pattern.matches("xyz[0-9]+", "xyz12s"));
    }
}
