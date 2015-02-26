package com.gozulio.gozuliantechnologies.init;


import com.gozulio.gozuliantechnologies.block.blockTiberiumBlue;
import com.gozulio.gozuliantechnologies.block.blockTiberiumGreen;
import com.gozulio.gozuliantechnologies.block.blockTiberiumRed;
import com.gozulio.gozuliantechnologies.helper._BlockHelper_Generic;
import cpw.mods.fml.common.registry.GameRegistry;

public class modBlocks
{
    public static final _BlockHelper_Generic tiberiumgreenblock = new blockTiberiumGreen();
    public static final _BlockHelper_Generic tiberiumblueblock = new blockTiberiumBlue();
    public static final _BlockHelper_Generic tiberiumredblock = new blockTiberiumRed();

    public static void init()
    {
        GameRegistry.registerBlock(tiberiumgreenblock, "Tiberium_Green_Block");
        GameRegistry.registerBlock(tiberiumblueblock, "Tiberium_Blue_block");
        GameRegistry.registerBlock(tiberiumredblock, "Tiberium_Red_Block");
    }
}
