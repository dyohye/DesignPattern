package com.designPattern.creationalPatterns.Prototype.demo;

import com.designPattern.creationalPatterns.Prototype.Abstract.Shape;
import com.designPattern.creationalPatterns.Prototype.bean.ShapeCache;

/**
 * 步骤 4
 PrototypePatternDemo 使用 ShapeCache 类来获取存储在 Hashtable 中的形状的克隆。
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());


        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
