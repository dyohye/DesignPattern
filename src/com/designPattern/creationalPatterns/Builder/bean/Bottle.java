package com.designPattern.creationalPatterns.Builder.bean;

import com.designPattern.creationalPatterns.Builder.Interface.Packing;
/**
 * 步骤 2
 创建实现 Packing 接口的实体类。(瓶子)
 */
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}
