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

public class Department {
    private String name;
    private List<Course> courses;
    private List<Student> students;

    public Department(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayAllCourses() {
        System.out.println("=== Department: " + name + " (Courses List) ===");
        for (Course course : courses) {
            System.out.println("- " + course.toString());
        }
    }

    public List<Student> getStudents() {
        return students;
    }
}
