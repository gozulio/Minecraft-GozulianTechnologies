package com.gozulio.gozuliantechnologies.block;

import com.gozulio.gozuliantechnologies.helper._BlockHelper_Tiberium;
import com.gozulio.gozuliantechnologies.init.modItems;
import net.minecraft.item.Item;

import java.util.Random;

public class blockTiberiumGreen extends _BlockHelper_Tiberium
{
    public blockTiberiumGreen()
    {
        super();
        this.setBlockName("Tiberium_Green_Block");
        this.setBlockTextureName("Tiberium_Green_Block");
    }
    @Override
    public Item getItemDropped(int metadeta, Random Random, int fortune)
    {
        return modItems.itemtiberiumgreen;
    }
    @Override
    public int quantityDropped(int metadata, int fortune, Random random)
    {
        return 1 + random.nextInt(4 - 2 + fortune);
    }
}
