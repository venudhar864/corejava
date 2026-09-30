package com.practice.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartExample {
    public static void main(String[] args){
        Pattern pattern=Pattern.compile("Java");
        Matcher matcher=pattern.matcher("I am learning Java programing");
        if(matcher.find()){
            System.out.println("Start Index:"+matcher.start());
        }
    }
}
