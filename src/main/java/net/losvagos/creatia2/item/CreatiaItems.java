package net.losvagos.creatia2.item;

import net.losvagos.creatia2.Creatia2;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CreatiaItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Creatia2.MOD_ID);

    public static final RegistryObject<Item> CLAY_CUP = ITEMS.register("clay_cup",
            () -> new Item(new Item.Properties().tab(CreatiaTab.CREATIA_TAB).stacksTo(1)));

    public static final RegistryObject<Item> HARDENED_CLAY_CUP = ITEMS.register("hardened_clay_cup",
            () -> new Item(new Item.Properties().tab(CreatiaTab.CREATIA_TAB).stacksTo(1)));

    public static final RegistryObject<Item> CHOCOLATE_CUP = ITEMS.register("chocolate_cup",
            () -> new Item(new Item.Properties().tab(CreatiaTab.CREATIA_TAB).stacksTo(1)));

    public static final RegistryObject<Item> COFFEE_CUP = ITEMS.register("coffee_cup",
            () -> new Item(new Item.Properties().tab(CreatiaTab.CREATIA_TAB).stacksTo(1)));

    public static final RegistryObject<Item> BUILDERS_TEA_CUP = ITEMS.register("builders_tea_cup",
            () -> new Item(new Item.Properties().tab(CreatiaTab.CREATIA_TAB).stacksTo(1)));

    public static final RegistryObject<Item> BLACK_TEA_CUP = ITEMS.register("black_tea_cup",
            () -> new Item(new Item.Properties().tab(CreatiaTab.CREATIA_TAB).stacksTo(1)));

    public static final RegistryObject<Item> DANDELION_TEA_CUP = ITEMS.register("dandelion_tea_cup",
            () -> new Item(new Item.Properties().tab(CreatiaTab.CREATIA_TAB).stacksTo(1)));

    public static final RegistryObject<Item> GREEN_TEA_CUP = ITEMS.register("green_tea_cup",
            () -> new Item(new Item.Properties().tab(CreatiaTab.CREATIA_TAB).stacksTo(1)));

    public static final RegistryObject<Item> PURULENT_TEA_CUP = ITEMS.register("purulent_tea_cup",
            () -> new Item(new Item.Properties().tab(CreatiaTab.CREATIA_TAB).stacksTo(1)));

    public static final RegistryObject<Item> ROSE_HIP_TEA_CUP = ITEMS.register("rose_hip_tea_cup",
            () -> new Item(new Item.Properties().tab(CreatiaTab.CREATIA_TAB).stacksTo(1)));

    public static final RegistryObject<Item> YELLOW_TEA_CUP = ITEMS.register("yellow_tea_cup",
            () -> new Item(new Item.Properties().tab(CreatiaTab.CREATIA_TAB).stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}