package com.practice.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindExample {
    public static void main(String[] args){
        Pattern pattern = Pattern.compile("Java");
        Matcher matcher = pattern.matcher("I am learning Java Programming.");

        if (matcher.find()) {
            System.out.println("Pattern Found");
        } else {
            System.out.println("Pattern Not Found");
        }
    }
}
