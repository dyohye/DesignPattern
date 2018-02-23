package com.designPattern.creationalPatterns.Builder.Abstract;

import com.designPattern.creationalPatterns.Builder.Interface.Item;
import com.designPattern.creationalPatterns.Builder.Interface.Packing;
import com.designPattern.creationalPatterns.Builder.bean.Bottle;

/**
 * 步骤 3
 创建实现 Item 接口的抽象类，该类提供了默认的功能。(冷饮)
 */
public abstract class ColdDrink  implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
