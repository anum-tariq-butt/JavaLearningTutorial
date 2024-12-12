package org.example.Java8Feature;

import java.util.Objects;

public class Student{
    //int id;
    private String name;
    private String year;


    public Student(String name, String Year){
        this.name = name;
        //this.id = id;
        this.year = Year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
