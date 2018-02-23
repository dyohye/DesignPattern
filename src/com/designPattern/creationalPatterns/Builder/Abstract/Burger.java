package com.designPattern.creationalPatterns.Builder.Abstract;

import com.designPattern.creationalPatterns.Builder.Interface.Item;
import com.designPattern.creationalPatterns.Builder.Interface.Packing;
import com.designPattern.creationalPatterns.Builder.bean.Wrapper;

/**
 * 步骤 3
 创建实现 Item 接口的抽象类，该类提供了默认的功能。(汉堡）
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {

        return new Wrapper(); //返回包装
    }

    @Override
    public abstract float price();
}
