package com.practice.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartEnd {
    public static void main(String[] args){
        Pattern pattern= Pattern.compile("(java is)");
        Matcher matcher=pattern.matcher("java is a programming language");
        if(matcher.find()){
            System.out.println("Start Index:"+matcher.start());
            System.out.println("End Index:"+matcher.end());
            System.out.println(matcher.start(1));
            System.out.println(matcher.end(1));
        }
    }
}
