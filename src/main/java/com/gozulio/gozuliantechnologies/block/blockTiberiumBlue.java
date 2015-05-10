package com.gozulio.gozuliantechnologies.block;

import com.gozulio.gozuliantechnologies.handler.CreativetabHandler;
import com.gozulio.gozuliantechnologies.helper._BlockHelper_Tiberium;
import com.gozulio.gozuliantechnologies.init.modItems;
import net.minecraft.item.Item;

import java.util.Random;

public class blockTiberiumBlue extends _BlockHelper_Tiberium
{
    public blockTiberiumBlue()
    {
        super();
        this.setBlockName("Tiberium_Blue_Block");
        this.setBlockTextureName("Tiberium_Blue_Block");
    }
    @Override
    public Item getItemDropped(int metadeta, Random Random, int fortune)
    {
        return modItems.itemtiberiumblue;
    }
    @Override
    public int quantityDropped(int metadata, int fortune, Random random)
    {
        return 1 + random.nextInt(4 - 2) + fortune;
    }
}
