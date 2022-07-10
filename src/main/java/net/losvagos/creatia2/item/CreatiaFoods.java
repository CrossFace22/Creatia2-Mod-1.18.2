package net.losvagos.creatia2.item;

import net.minecraft.world.food.FoodProperties;

public class CreatiaFoods {
    public static final FoodProperties CHOCOLATE = (new FoodProperties.Builder())
            .nutrition(8).saturationMod(0.8F).alwaysEat().build();
}
