package net.losvagos.creatia2.villager;

import com.google.common.collect.ImmutableSet;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.Create;
import net.losvagos.creatia2.Creatia2;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.InvocationTargetException;
import java.rmi.registry.Registry;

public class CreatiaVillagers {

    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, Creatia2.MOD_ID);

    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(ForgeRegistries.PROFESSIONS, Creatia2.MOD_ID);

    public static final RegistryObject<PoiType> STEAMPUNKER_POI = POI_TYPES.register("steampunker_poi",
            () -> new PoiType("steampunker_poi", PoiType.getBlockStates(AllBlocks.MILLSTONE.get()), 1, 1));

    public static final RegistryObject<VillagerProfession> STEAMPUNKER = VILLAGER_PROFESSIONS.register("steampunker"
    , () -> new VillagerProfession("steampunker", STEAMPUNKER_POI.get(), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_TOOLSMITH));

    public static void RegisterPOIs() {
        try {
            ObfuscationReflectionHelper.findMethod(PoiType.class
            , "registerBlockStates", PoiType.class).invoke(null, STEAMPUNKER_POI.get());
        } catch(InvocationTargetException | IllegalAccessException exception) {
            exception.printStackTrace();
        }
    }



    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }


}
