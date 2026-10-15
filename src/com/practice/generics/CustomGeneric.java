package com.practice.generics;

public class CustomGeneric {
    public static void main(String[] args) {
        Box<Student> studentBox = new Box<>();

        studentBox.setData(new Student("Akshat", 20));

        Student student = studentBox.getData();
        System.out.println(student.getName() + " is " + student.getAge() + " years old.");

    }
}
