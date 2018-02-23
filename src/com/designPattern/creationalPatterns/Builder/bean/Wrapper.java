package com.designPattern.creationalPatterns.Builder.bean;

import com.designPattern.creationalPatterns.Builder.Interface.Packing;

/**
 * 步骤 2
 创建实现 Packing 接口的实体类。(包装)
 */
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }

}
