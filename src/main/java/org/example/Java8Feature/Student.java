package org.example.Java8Feature;

public class Student implements Comparable<Student>{
    int id;
    String name;

    public Student(int id, String name){
        this.name = name;
        this.id = id;
    }


    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
