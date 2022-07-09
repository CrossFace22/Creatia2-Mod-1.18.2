package net.losvagos.creatia2.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class CreatiaTab {

    public static final CreativeModeTab CREATIA_TAB = new CreativeModeTab("creatia2") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(CreatiaItems.CHOCOLATE_CUP.get());
        }
    };
}
