/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task09b;

/**
 *
 * @author sr891
 */
public class TheoryCourse extends Course {

    public TheoryCourse(String name) {
        super(name); 
    }

    @Override
    public String getType() {
        return "Theory";
    }
}
