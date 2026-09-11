/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.task09b;

/**
 *
 * @author sr891
 */
public class Task09B {
    public static void main(String[] args) {
        
        Department csDepartment = new Department("Computer Science");

        
        Course javaTheory = new TheoryCourse("Java Programming Concepts");
        Course databaseTheory = new TheoryCourse("Database Systems");
        Course javaLab = new LabCourse("Java Programming Lab");
        Course webLab = new LabCourse("Web Development Lab");

       
        csDepartment.addCourse(javaTheory);
        csDepartment.addCourse(databaseTheory);
        csDepartment.addCourse(javaLab);
        csDepartment.addCourse(webLab);

        
        Student student1 = new Student("Salah");
        student1.enrollInCourse(javaTheory);
        student1.enrollInCourse(javaLab);

        Student student2 = new Student("Ahmed");
        student2.enrollInCourse(databaseTheory);
        student2.enrollInCourse(webLab);

        
        csDepartment.addStudent(student1);
        csDepartment.addStudent(student2);

        
        csDepartment.displayAllCourses();

        System.out.println("\n=== Students Enrolled Courses ===");
        
        student1.displayCourses();
        System.out.println();
        student2.displayCourses();
    }
}