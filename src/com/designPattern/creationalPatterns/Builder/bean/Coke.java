package com.designPattern.creationalPatterns.Builder.bean;

import com.designPattern.creationalPatterns.Builder.Abstract.ColdDrink;
/**
 * 步骤 4
 创建扩展了 ColdDrink 的实体类。(可乐)
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
