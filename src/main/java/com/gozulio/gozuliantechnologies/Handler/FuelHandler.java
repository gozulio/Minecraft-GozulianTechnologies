package com.gozulio.gozuliantechnologies.handler;

import com.gozulio.gozuliantechnologies.init.modBlocks;
import com.gozulio.gozuliantechnologies.init.modItems;
import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by Xeno on 5/11/2015.
 */
public class FuelHandler implements IFuelHandler
{
    @Override
    public int getBurnTime(ItemStack fuel)
    {
        Block blockFuel = Block.getBlockFromItem(fuel.getItem());
        Item itemFuel = fuel.getItem();

        //BLOCKS
        if (blockFuel == modBlocks.tiberiumgreenblock)
        {
            return 1600;
        }
        else if (blockFuel == modBlocks.tiberiumblueblock)
        {
            return 3200;
        }
        else if (blockFuel == modBlocks.tiberiumredblock)
        {
            return 6400;
        }
        //ITEMS
        else if (itemFuel == modItems.itemtiberiumgreen)
        {
            return 400;
        }
        else if (itemFuel == modItems.itemtiberiumblue)
        {
            return 800;
        }
        else if (itemFuel == modItems.itemtiberiumred)
        {
            return 1600;
        }
        return 0;
    }
}
