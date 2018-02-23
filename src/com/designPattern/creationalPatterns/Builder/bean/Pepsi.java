package com.designPattern.creationalPatterns.Builder.bean;

import com.designPattern.creationalPatterns.Builder.Abstract.ColdDrink;
/**
 * 步骤 4
 创建扩展了ColdDrink 的实体类。(百事)
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
