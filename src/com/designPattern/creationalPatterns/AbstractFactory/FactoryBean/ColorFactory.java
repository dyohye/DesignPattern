package com.designPattern.creationalPatterns.AbstractFactory.FactoryBean;

import com.designPattern.creationalPatterns.AbstractFactory.Abstract.AbstractFactory;
import com.designPattern.creationalPatterns.AbstractFactory.Implements.Green;
import com.designPattern.creationalPatterns.AbstractFactory.Implements.Red;
import com.designPattern.creationalPatterns.AbstractFactory.Interface.Color;
import com.designPattern.creationalPatterns.Factory.Implements.Circle;
import com.designPattern.creationalPatterns.Factory.Implements.Rectangle;
import com.designPattern.creationalPatterns.Factory.Interface.Shape;
/**
 步骤 6
 创建扩展了 AbstractFactory 的工厂类，基于给定的信息生成实体类的对象。
 */
public class ColorFactory extends AbstractFactory {

    @Override public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        }
        return null;
    }


    @Override public Shape getShape(String shapeType) {

        return null;
    }
}
