package com.designPattern.creationalPatterns.Prototype.bean;

import com.designPattern.creationalPatterns.Prototype.Abstract.Shape;

/**
 * 步骤 2
 创建扩展了Shape.class抽象类的实体类。
 */
public class Rectangle extends Shape {
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }

}
