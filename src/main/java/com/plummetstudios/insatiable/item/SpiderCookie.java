package com.plummetstudios.insatiable.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class SpiderCookie extends Item {


    public SpiderCookie(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack ItemStack, Level worldIn, LivingEntity playerIn) {
        if (worldIn.getDayTime() >= 12000) {
            if (worldIn.getDayTime() <= 23000)
            {
                playerIn.addEffect(new MobEffectInstance(MobEffects.SATURATION, 1, 9));
            }
        }

        return super.finishUsingItem(ItemStack, worldIn, playerIn);
    }
}
