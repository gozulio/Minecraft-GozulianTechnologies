package com.gozulio.gozuliantechnologies.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by Xeno on 5/11/2015.
 */
public class modSmeltingDict
{
    public static void init()
    {
        GameRegistry.addSmelting(new ItemStack(Items.ender_eye), new ItemStack(modItems.itemorganicgoop, 16), 0);
        GameRegistry.addSmelting(new ItemStack(modItems.itemorganicgoop), new ItemStack(modBlocks.tiberiumgreenblock), 0);
    }
}
