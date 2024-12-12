package org.example;
import org.example.Java8Feature.CustomStudent;
import org.example.Java8Feature.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Kalices", "2005"));
        studentList.add(new Student("Charlie", "2003"));
        studentList.add(new Student("Alice", "2000"));
        studentList.add(new Student("Bob", "2002"));
        studentList.add(new Student("Dob", "2002"));

        studentList.sort(Comparator.comparing(Student::getYear).thenComparing(Student::getName));
        System.out.println("byNAme and year "+studentList);
        // Sorting by name
//        System.out.println("byNAme"+studentList);
//        Comparator<Student> byName = (s1, s2) -> s1.getYear().compareTo(s2.getYear());
//        System.out.println("byYear"+byName);
//        studentList.sort((s1, s2) -> s1.getYear().compareTo(s2.getYear()));
//        System.out.println(studentList);

    }
}