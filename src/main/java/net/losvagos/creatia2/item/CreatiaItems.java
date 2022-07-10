package net.losvagos.creatia2.item;

import com.farmersrespite.common.item.PurulentTeaItem;
import com.farmersrespite.core.utility.FRFoods;
import net.losvagos.creatia2.Creatia2;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.item.DrinkableItem;
import vectorwing.farmersdelight.common.item.HotCocoaItem;

public class CreatiaItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Creatia2.MOD_ID);

    public static final RegistryObject<Item> CLAY_CUP = ITEMS.register("clay_cup",
            () -> new Item(new Item.Properties().tab(CreatiaTab.CREATIA_TAB).stacksTo(16)));

    public static final RegistryObject<Item> HARDENED_CLAY_CUP = ITEMS.register("hardened_clay_cup",
            () -> new Item(new Item.Properties().tab(CreatiaTab.CREATIA_TAB).stacksTo(16)));

    //region <[Drinkable Cup Items]>
    public static final RegistryObject<Item> CHOCOLATE_CUP = ITEMS.register("chocolate_cup",
            () -> new HotCocoaItem(new Item.Properties().food(CreatiaFoods.CHOCOLATE).tab(CreatiaTab.CREATIA_TAB).stacksTo(1).craftRemainder(CreatiaItems.HARDENED_CLAY_CUP.get())));

    public static final RegistryObject<Item> COFFEE_CUP = ITEMS.register("coffee_cup",
            () -> new DrinkableItem((new Item.Properties()).food(FRFoods.COFFEE).stacksTo(1).tab(CreatiaTab.CREATIA_TAB).craftRemainder(CreatiaItems.HARDENED_CLAY_CUP.get()), true, false));

    public static final RegistryObject<Item> BUILDERS_TEA_CUP = ITEMS.register("builders_tea_cup",
            () -> new BuildersTeaItemModified(new Item.Properties().tab(CreatiaTab.CREATIA_TAB).stacksTo(1)));

    public static final RegistryObject<Item> BLACK_TEA_CUP = ITEMS.register("black_tea_cup",
            () -> new DrinkableItem((new Item.Properties()).food(FRFoods.BLACK_TEA).stacksTo(1).tab(CreatiaTab.CREATIA_TAB).craftRemainder(CreatiaItems.HARDENED_CLAY_CUP.get()), true, false));

    public static final RegistryObject<Item> DANDELION_TEA_CUP = ITEMS.register("dandelion_tea_cup",
            () -> new DrinkableItem((new Item.Properties()).food(FRFoods.DANDELION_TEA).stacksTo(1).tab(CreatiaTab.CREATIA_TAB).craftRemainder(CreatiaItems.HARDENED_CLAY_CUP.get()), true, false));

    public static final RegistryObject<Item> GREEN_TEA_CUP = ITEMS.register("green_tea_cup",
            () -> new DrinkableItem((new Item.Properties()).food(FRFoods.GREEN_TEA).stacksTo(1).tab(CreatiaTab.CREATIA_TAB).craftRemainder(CreatiaItems.HARDENED_CLAY_CUP.get()), true, false));

    public static final RegistryObject<Item> PURULENT_TEA_CUP = ITEMS.register("purulent_tea_cup",
            () -> new PurulentTeaItem(1200, (new Item.Properties()).food(FRFoods.PURULENT_TEA).stacksTo(1).tab(CreatiaTab.CREATIA_TAB).craftRemainder(CreatiaItems.HARDENED_CLAY_CUP.get())));

    public static final RegistryObject<Item> ROSE_HIP_TEA_CUP = ITEMS.register("rose_hip_tea_cup",
            () -> new DrinkableItem((new Item.Properties()).food(FRFoods.ROSE_HIP_TEA).stacksTo(1).tab(CreatiaTab.CREATIA_TAB).craftRemainder(CreatiaItems.HARDENED_CLAY_CUP.get())));

    public static final RegistryObject<Item> YELLOW_TEA_CUP = ITEMS.register("yellow_tea_cup",
            () -> new DrinkableItem((new Item.Properties()).food(FRFoods.YELLOW_TEA).stacksTo(1).tab(CreatiaTab.CREATIA_TAB).craftRemainder(CreatiaItems.HARDENED_CLAY_CUP.get()), true, false));

    public static final RegistryObject<Item> LONG_BLACK_TEA_CUP = ITEMS.register("long_black_tea_cup",
            () -> new DrinkableItem((new Item.Properties()).food(FRFoods.LONG_BLACK_TEA).stacksTo(1).craftRemainder(CreatiaItems.HARDENED_CLAY_CUP.get()), true, false));

    public static final RegistryObject<Item> LONG_DANDELION_TEA_CUP = ITEMS.register("long_dandelion_tea_cup",
            () -> new DrinkableItem((new Item.Properties()).food(FRFoods.LONG_DANDELION_TEA).stacksTo(1).craftRemainder(CreatiaItems.HARDENED_CLAY_CUP.get()), true, false));

    public static final RegistryObject<Item> LONG_GREEN_TEA_CUP = ITEMS.register("long_green_tea_cup",
            () -> new DrinkableItem((new Item.Properties()).food(FRFoods.LONG_GREEN_TEA).stacksTo(1).craftRemainder(CreatiaItems.HARDENED_CLAY_CUP.get()), true, false));

    public static final RegistryObject<Item> LONG_COFFEE_CUP = ITEMS.register("long_coffee_cup",
            () -> new DrinkableItem((new Item.Properties()).food(FRFoods.LONG_COFFEE).stacksTo(1).craftRemainder(CreatiaItems.HARDENED_CLAY_CUP.get()), true, false));

    public static final RegistryObject<Item> LONG_ROSE_HIP_TEA_CUP = ITEMS.register("long_rose_hip_tea_cup",
            () -> new DrinkableItem((new Item.Properties()).food(FRFoods.LONG_ROSE_HIP_TEA).stacksTo(1).craftRemainder(CreatiaItems.HARDENED_CLAY_CUP.get())));

    public static final RegistryObject<Item> LONG_YELLOW_TEA_CUP = ITEMS.register("long_yellow_tea_cup",
            () -> new DrinkableItem((new Item.Properties()).food(FRFoods.LONG_YELLOW_TEA).stacksTo(1).craftRemainder(CreatiaItems.HARDENED_CLAY_CUP.get()), true, false));

    public static final RegistryObject<Item> STRONG_BLACK_TEA_CUP = ITEMS.register("strong_black_tea_cup",
            () -> new DrinkableItem((new Item.Properties()).food(FRFoods.STRONG_BLACK_TEA).stacksTo(1).craftRemainder(CreatiaItems.HARDENED_CLAY_CUP.get()), true, false));

    public static final RegistryObject<Item> STRONG_PURULENT_TEA_CUP = ITEMS.register("strong_purulent_tea_cup",
            () -> new PurulentTeaItem(2400, (new Item.Properties()).food(FRFoods.STRONG_PURULENT_TEA).stacksTo(1).craftRemainder(CreatiaItems.HARDENED_CLAY_CUP.get())));

    public static final RegistryObject<Item> STRONG_GREEN_TEA_CUP = ITEMS.register("strong_green_tea_cup",
            () -> new DrinkableItem((new Item.Properties()).food(FRFoods.STRONG_GREEN_TEA).stacksTo(1).craftRemainder(CreatiaItems.HARDENED_CLAY_CUP.get()), true, false));

    public static final RegistryObject<Item> STRONG_COFFEE_CUP = ITEMS.register("strong_coffee_cup",
            () -> new DrinkableItem((new Item.Properties()).food(FRFoods.STRONG_COFFEE).stacksTo(1).craftRemainder(CreatiaItems.HARDENED_CLAY_CUP.get()), true, false));

    public static final RegistryObject<Item> STRONG_ROSE_HIP_TEA_CUP = ITEMS.register("strong_rose_hip_tea_cup",
            () -> new DrinkableItem((new Item.Properties()).food(FRFoods.STRONG_ROSE_HIP_TEA).stacksTo(1).craftRemainder(CreatiaItems.HARDENED_CLAY_CUP.get())));

    public static final RegistryObject<Item> STRONG_YELLOW_TEA_CUP = ITEMS.register("strong_yellow_tea_cup",
            () -> new DrinkableItem((new Item.Properties()).food(FRFoods.STRONG_YELLOW_TEA).stacksTo(1).craftRemainder(CreatiaItems.HARDENED_CLAY_CUP.get()), true, false));
    //endregion

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}