package net.losvagos.creatia2.event;

import com.simibubi.create.AllBlocks;
import com.simibubi.create.AllItems;
import com.simibubi.create.content.palettes.AllPaletteStoneTypes;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.losvagos.creatia2.Creatia2;
import net.losvagos.creatia2.villager.CreatiaVillagers;
import net.mcreator.createstuffaddons.init.CreateStuffAdditionsModItems;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@Mod.EventBusSubscriber(modid = Creatia2.MOD_ID)
public class CustomTrades {
    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event){
        if(event.getType() == CreatiaVillagers.STEAMPUNKER.get()){
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack1 = new ItemStack(AllItems.GOGGLES.get(), 1);
            ItemStack[] stack2 = {new ItemStack(AllBlocks.PECULIAR_BELL.get(), 1),new ItemStack(AllBlocks.HAUNTED_BELL.get(), 1),};
            ItemStack[] stack3 = {new ItemStack(CreateStuffAdditionsModItems.ZINC_CHESTPLATE.get(), 1),new ItemStack(CreateStuffAdditionsModItems.ZINC_LEGGINGS.get(), 1)};
            ItemStack[] stack4 = {new ItemStack(CreateStuffAdditionsModItems.ZINC_BOOTS.get(), 1),new ItemStack(CreateStuffAdditionsModItems.ZINC_HELMET.get(), 1)};
            ItemStack stack5 = new ItemStack(CreateStuffAdditionsModItems.REFINED_RADIANCE_NEON.get(), ThreadLocalRandom.current().nextInt(4,6));
            ItemStack stack6 = new ItemStack(CreateStuffAdditionsModItems.BRASS_MOPED_ITEM.get(), 1);
            ItemStack stack7 = new ItemStack(CreateStuffAdditionsModItems.BRASS_GLOBE.get(), 1);

            ItemStack[] blocks1 = {new ItemStack(AllPaletteStoneTypes.VERIDIUM.getBaseBlock().get(),4),new ItemStack(AllPaletteStoneTypes.ASURINE.getBaseBlock().get(),4)
                    ,new ItemStack(AllPaletteStoneTypes.LIMESTONE.getBaseBlock().get(),4),new ItemStack(AllPaletteStoneTypes.OCHRUM.getBaseBlock().get(),4)};
            ItemStack[] blocks2 = {new ItemStack(AllPaletteStoneTypes.CRIMSITE.getBaseBlock().get(),4), new ItemStack(AllPaletteStoneTypes.SCORCHIA.getBaseBlock().get(),4)
                    ,new ItemStack(AllPaletteStoneTypes.SCORIA.getBaseBlock().get(),4)};

            MerchantOffer[] merchsLvl5 = {new MerchantOffer(
                    new ItemStack(AllItems.REFINED_RADIANCE.get(), ThreadLocalRandom.current().nextInt(2,3)),
                    stack5, 2, 5, 0.04F), new MerchantOffer(
                    new ItemStack(AllBlocks.BRASS_BLOCK.get(), ThreadLocalRandom.current().nextInt(3,6)),
                    stack6, 1, 1, 0.02F),new MerchantOffer(new ItemStack(AllBlocks.BRASS_BLOCK.get(),2),new ItemStack(CreateStuffAdditionsModItems.CHOCOLATE_FOUNTAIN.get(),1),1,6,0.04F)};

            trades.get(2).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(AllItems.ZINC_INGOT.get(), ThreadLocalRandom.current().nextInt(6,8)),
                    stack3[ThreadLocalRandom.current().nextInt(0,1)], 12, 4, 0.02F));
            trades.get(2).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(AllItems.ZINC_INGOT.get(), ThreadLocalRandom.current().nextInt(4,6)),
                    stack4[ThreadLocalRandom.current().nextInt(0,1)], 12, 4, 0.02F));
            trades.get(3).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(AllItems.BRASS_INGOT.get(), 10),
                    stack1, 1, 5, 0.02F));
            trades.get(3).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(AllItems.BRASS_INGOT.get(), 12),
                    stack2[ThreadLocalRandom.current().nextInt(0,1)], 1, 10, 0.02F));
            trades.get(4).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(AllItems.BRASS_INGOT.get(), 1),
                    blocks1[ThreadLocalRandom.current().nextInt(0,blocks1.length)], 8, 1, 0.02F));
            trades.get(4).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(AllItems.BRASS_INGOT.get(), 1),
                        blocks2[ThreadLocalRandom.current().nextInt(0,blocks2.length)], 8, 1, 0.02F));
            trades.get(5).add((trader, rand) -> merchsLvl5[ThreadLocalRandom.current().nextInt(0,merchsLvl5.length)]);
            trades.get(5).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(AllBlocks.BRASS_BLOCK.get(), ThreadLocalRandom.current().nextInt(6,8)),
                    stack7, 1, 1, 0.02F));
        }
    }
}
