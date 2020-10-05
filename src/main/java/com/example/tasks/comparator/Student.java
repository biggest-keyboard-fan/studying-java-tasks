package com.example.tasks.comparator;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    public Student(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    private int weight;
    private int height;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int compareTo(Student student) {
        return (student.height - height) - (student.weight - weight);
    }
    public Comparator<Student> getComparator(){
        return (a,b) -> (a.weight - b.weight) - (a.weight - b.height);
    }
}
