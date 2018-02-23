package com.designPattern.creationalPatterns.Factory.Implements;

import com.designPattern.creationalPatterns.Factory.Interface.Shape;

/**
 * 步骤 2
 创建实现接口的实体类。
 */
public class Circle implements Shape {
    @Override public void draw() {
        System.out.println("this Circle");
    }
}
