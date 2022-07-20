package net.losvagos.creatia2.block;

import net.losvagos.creatia2.Creatia2;
import net.losvagos.creatia2.block.custom.HardenedClayCup;
import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class CreatiaBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Creatia2.MOD_ID);

    //region CUP BLOCKS
    public static final RegistryObject<Block> CLAY_CUP = registerBlock("clay_cup",
            () -> new HardenedClayCup(BlockBehaviour.Properties.copy(Blocks.FLOWER_POT).noOcclusion().sound(SoundType.GRAVEL)));

    public static final RegistryObject<Block> HARDENED_CLAY_CUP = registerBlock("hardened_clay_cup",
            () -> new HardenedClayCup(BlockBehaviour.Properties.copy(Blocks.FLOWER_POT).noOcclusion().sound(SoundType.BONE_BLOCK)));

    public static final RegistryObject<Block> CHOCOLATE_CUP = registerBlock("chocolate_cup",
            () -> new HardenedClayCup(BlockBehaviour.Properties.copy(Blocks.FLOWER_POT).noOcclusion().sound(SoundType.BONE_BLOCK)));

    public static final RegistryObject<Block> COFFEE_CUP = registerBlock("coffee_cup",
            () -> new HardenedClayCup(BlockBehaviour.Properties.copy(Blocks.FLOWER_POT).noOcclusion().sound(SoundType.BONE_BLOCK)));

    public static final RegistryObject<Block> BUILDERS_TEA_CUP = registerBlock("builders_tea_cup",
            () -> new HardenedClayCup(BlockBehaviour.Properties.copy(Blocks.FLOWER_POT).noOcclusion().sound(SoundType.BONE_BLOCK)));

    public static final RegistryObject<Block> BLACK_TEA_CUP = registerBlock("black_tea_cup",
            () -> new HardenedClayCup(BlockBehaviour.Properties.copy(Blocks.FLOWER_POT).noOcclusion().sound(SoundType.BONE_BLOCK)));

    public static final RegistryObject<Block> DANDELION_TEA_CUP = registerBlock("dandelion_tea_cup",
            () -> new HardenedClayCup(BlockBehaviour.Properties.copy(Blocks.FLOWER_POT).noOcclusion().sound(SoundType.BONE_BLOCK)));

    public static final RegistryObject<Block> GREEN_TEA_CUP = registerBlock("green_tea_cup",
            () -> new HardenedClayCup(BlockBehaviour.Properties.copy(Blocks.FLOWER_POT).noOcclusion().sound(SoundType.BONE_BLOCK)));

    public static final RegistryObject<Block> PURULENT_TEA_CUP = registerBlock("purulent_tea_cup",
            () -> new HardenedClayCup(BlockBehaviour.Properties.copy(Blocks.FLOWER_POT).noOcclusion().sound(SoundType.BONE_BLOCK)));

    public static final RegistryObject<Block> ROSE_HIP_TEA_CUP = registerBlock("rose_hip_tea_cup",
            () -> new HardenedClayCup(BlockBehaviour.Properties.copy(Blocks.FLOWER_POT).noOcclusion().sound(SoundType.BONE_BLOCK)));

    public static final RegistryObject<Block> YELLOW_TEA_CUP = registerBlock("yellow_tea_cup",
            () -> new HardenedClayCup(BlockBehaviour.Properties.copy(Blocks.FLOWER_POT).noOcclusion().sound(SoundType.BONE_BLOCK)));

    public static final RegistryObject<Block> LONG_BLACK_TEA_CUP = registerBlock("long_black_tea_cup",
            () -> new HardenedClayCup(BlockBehaviour.Properties.copy(Blocks.FLOWER_POT).noOcclusion().sound(SoundType.BONE_BLOCK)));

    public static final RegistryObject<Block> LONG_DANDELION_TEA_CUP = registerBlock("long_dandelion_tea_cup",
            () -> new HardenedClayCup(BlockBehaviour.Properties.copy(Blocks.FLOWER_POT).noOcclusion().sound(SoundType.BONE_BLOCK)));

    public static final RegistryObject<Block> LONG_GREEN_TEA_CUP = registerBlock("long_green_tea_cup",
            () -> new HardenedClayCup(BlockBehaviour.Properties.copy(Blocks.FLOWER_POT).noOcclusion().sound(SoundType.BONE_BLOCK)));

    public static final RegistryObject<Block> LONG_COFFEE_CUP = registerBlock("long_coffee_cup",
            () -> new HardenedClayCup(BlockBehaviour.Properties.copy(Blocks.FLOWER_POT).noOcclusion().sound(SoundType.BONE_BLOCK)));

    public static final RegistryObject<Block> LONG_ROSE_HIP_TEA_CUP = registerBlock("long_rose_hip_tea_cup",
            () -> new HardenedClayCup(BlockBehaviour.Properties.copy(Blocks.FLOWER_POT).noOcclusion().sound(SoundType.BONE_BLOCK)));

    public static final RegistryObject<Block> LONG_YELLOW_TEA_CUP = registerBlock("long_yellow_tea_cup",
            () -> new HardenedClayCup(BlockBehaviour.Properties.copy(Blocks.FLOWER_POT).noOcclusion().sound(SoundType.BONE_BLOCK)));

    public static final RegistryObject<Block> STRONG_BLACK_TEA_CUP = registerBlock("strong_black_tea_cup",
            () -> new HardenedClayCup(BlockBehaviour.Properties.copy(Blocks.FLOWER_POT).noOcclusion().sound(SoundType.BONE_BLOCK)));

    public static final RegistryObject<Block> STRONG_PURULENT_TEA_CUP = registerBlock("strong_purulent_tea_cup",
            () -> new HardenedClayCup(BlockBehaviour.Properties.copy(Blocks.FLOWER_POT).noOcclusion().sound(SoundType.BONE_BLOCK)));

    public static final RegistryObject<Block> STRONG_GREEN_TEA_CUP = registerBlock("strong_green_tea_cup",
            () -> new HardenedClayCup(BlockBehaviour.Properties.copy(Blocks.FLOWER_POT).noOcclusion().sound(SoundType.BONE_BLOCK)));

    public static final RegistryObject<Block> STRONG_COFFEE_CUP = registerBlock("strong_coffee_cup",
            () -> new HardenedClayCup(BlockBehaviour.Properties.copy(Blocks.FLOWER_POT).noOcclusion().sound(SoundType.BONE_BLOCK)));

    public static final RegistryObject<Block> STRONG_ROSE_HIP_TEA_CUP = registerBlock("strong_rose_hip_tea_cup",
            () -> new HardenedClayCup(BlockBehaviour.Properties.copy(Blocks.FLOWER_POT).noOcclusion().sound(SoundType.BONE_BLOCK)));

    public static final RegistryObject<Block> STRONG_YELLOW_TEA_CUP = registerBlock("strong_yellow_tea_cup",
            () -> new HardenedClayCup(BlockBehaviour.Properties.copy(Blocks.FLOWER_POT).noOcclusion().sound(SoundType.BONE_BLOCK)));
    //endregion

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
