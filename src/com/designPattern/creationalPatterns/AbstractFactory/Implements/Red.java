package com.designPattern.creationalPatterns.AbstractFactory.Implements;

import com.designPattern.creationalPatterns.AbstractFactory.Interface.Color;

/**
 * 步骤4
 创建实现接口的实体类。
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("this Red");
    }
}
