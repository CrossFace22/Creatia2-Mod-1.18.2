package net.losvagos.creatia2.event;

import com.mojang.math.Constants;
import net.losvagos.creatia2.Creatia2;
import net.mcreator.createstuffaddons.CreateStuffAdditionsMod;
import net.mcreator.createstuffaddons.init.CreateStuffAdditionsModItems;
import net.mcreator.createstuffaddons.item.ExperienceAxeItem;
import net.mcreator.createstuffaddons.item.ExperiencePickaxeItem;
import net.mcreator.createstuffaddons.item.ExperienceShovelItem;
import net.mcreator.createstuffaddons.item.ExperienceSwordItem;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.AnvilUpdateEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Map;

@Mod.EventBusSubscriber(modid = Creatia2.MOD_ID)
public class ExperienceToolNerf {

    @SubscribeEvent
    public static void onAnvilUpdate(AnvilUpdateEvent event) {

        ItemStack left = event.getLeft();
        ItemStack right = event.getRight();
        ItemStack out = event.getOutput();

        if(out.isEmpty() && (left.isEmpty() || right.isEmpty()))
            return;

        boolean isMended = false;

        Map<Enchantment, Integer> enchLeft = EnchantmentHelper.getEnchantments(left);
        Map<Enchantment, Integer> enchRight = EnchantmentHelper.getEnchantments(right);

        if(enchLeft.containsKey(Enchantments.MENDING) || enchRight.containsKey(Enchantments.MENDING)) {
            if(left.getItem() == right.getItem())
                isMended = true;

            if(right.getItem() == Items.ENCHANTED_BOOK)
                isMended = true;
        }

        if(isMended && (left.getItem() instanceof ExperienceAxeItem || left.getItem() instanceof ExperienceSwordItem || left.getItem() instanceof ExperiencePickaxeItem || left.getItem() instanceof ExperienceShovelItem)) {
            if(out.isEmpty())
                out = left.copy();

            if(!out.hasTag())
                out.setTag(new CompoundTag());

            Map<Enchantment, Integer> enchOutput = EnchantmentHelper.getEnchantments(out);
            enchOutput.putAll(enchRight);
            enchOutput.remove(Enchantments.MENDING);

            EnchantmentHelper.setEnchantments(enchOutput, out);

            out.setRepairCost(0);
            if(out.isDamageableItem())
                out.setDamageValue(0);

            event.setOutput(out);
            if(event.getCost() == 0)
                event.setCost(1);
        }
    }
}
