/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task09b;

/**
 *
 * @author sr891
 */
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Course> courses; 

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollInCourse(Course course) {
        courses.add(course);
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void displayCourses() {
        System.out.println("Courses for Student: " + name);
        for (Course course : courses) {
            System.out.println(" - " + course.toString());
        }
    }
}
