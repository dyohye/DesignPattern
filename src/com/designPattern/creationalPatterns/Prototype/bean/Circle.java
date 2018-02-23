package com.designPattern.creationalPatterns.Prototype.bean;

import com.designPattern.creationalPatterns.Prototype.Abstract.Shape;

public class Circle  extends Shape {
    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
