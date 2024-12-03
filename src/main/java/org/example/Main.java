package org.example;

import org.example.Java8Feature.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(3, "Charlie"));
        studentList.add(new Student(1, "Alice"));
        studentList.add(new Student(2, "Bob"));

        Collections.sort(studentList);
        System.out.println(studentList);

    }
}