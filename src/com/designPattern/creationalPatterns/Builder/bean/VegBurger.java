package com.designPattern.creationalPatterns.Builder.bean;

import com.designPattern.creationalPatterns.Builder.Abstract.Burger;

/**
 * 步骤 4
 创建扩展了 Burger的实体类。(素食汉堡)
 */
public class VegBurger extends Burger {
    @Override public String name() {
        return "Veg Burger";
    }

    @Override public float price() {
        return 25.0f;
    }
}
