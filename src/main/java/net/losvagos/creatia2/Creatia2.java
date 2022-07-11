package net.losvagos.creatia2;

import com.mojang.logging.LogUtils;
import net.losvagos.creatia2.item.CreatiaItems;
import net.losvagos.creatia2.villager.CreatiaVillagers;
import net.mcreator.createstuffaddons.init.CreateStuffAdditionsModItems;
import net.mcreator.createstuffaddons.item.ExperienceAxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Creatia2.MOD_ID)
public class Creatia2
{
    public static final String MOD_ID = "creatia2";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public Creatia2()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        CreatiaItems.register(eventBus);
        CreatiaVillagers.register(eventBus);
        eventBus.addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());

        CreatiaVillagers.RegisterPOIs();
    }
}
