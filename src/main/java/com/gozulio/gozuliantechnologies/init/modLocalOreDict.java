package com.gozulio.gozuliantechnologies.init;

import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by Xeno on 5/10/2015.
 */
public class modLocalOreDict
{


    public static void init()
    {
        /*
        REGISTER OREDICTIONARY ITEMS
         */
        OreDictionary.registerOre("tibshardgreen", modItems.itemtiberiumgreen);
        OreDictionary.registerOre("tibshardblue", modItems.itemtiberiumblue);
        OreDictionary.registerOre("tibshardred", modItems.itemtiberiumred);
        /*
        REGISTER OREDICTIONARY BLOCKS
         */
        OreDictionary.registerOre("tibblockgreen", modBlocks.tiberiumgreenblock);
        OreDictionary.registerOre("tibblockblue", modBlocks.tiberiumblueblock);
        OreDictionary.registerOre("tibblockred", modBlocks.tiberiumredblock);
    }
}
