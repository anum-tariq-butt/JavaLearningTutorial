package org.example.Java8Feature;

import java.util.Comparator;

public class CustomStudent implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        //return o1.name.compareTo(o2.name);
        return o1.getYear().compareTo(o2.getYear());
    }
}
