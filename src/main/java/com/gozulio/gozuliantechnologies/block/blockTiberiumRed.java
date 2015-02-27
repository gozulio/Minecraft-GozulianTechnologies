package com.gozulio.gozuliantechnologies.block;

import com.gozulio.gozuliantechnologies.helper._BlockHelper_Tiberium;
import com.gozulio.gozuliantechnologies.init.modItems;
import net.minecraft.item.Item;

import java.util.Random;

public class blockTiberiumRed extends _BlockHelper_Tiberium
{
    public blockTiberiumRed()
    {
        super();
        this.setBlockName("Tiberium_Red_Block");
        this.setBlockTextureName("Tiberium_Red_Block");
    }
    @Override
    public Item getItemDropped(int metadeta, Random Random, int fortune)
    {
        return modItems.itemtiberiumred;
    }
    @Override
    public int quantityDropped(int metadata, int fortune, Random random)
    {
        return 1 + random.nextInt(4 - 2 + fortune);
    }
}
