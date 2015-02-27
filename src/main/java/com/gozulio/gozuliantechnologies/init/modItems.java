package com.gozulio.gozuliantechnologies.init;

import com.gozulio.gozuliantechnologies.helper._ItemHelper_Generic;
import com.gozulio.gozuliantechnologies.helper.tool._ToolHelper_Sword;
import com.gozulio.gozuliantechnologies.item.itemTiberiumBlue;
import com.gozulio.gozuliantechnologies.item.itemTiberiumGreen;
import com.gozulio.gozuliantechnologies.item.itemTiberiumRed;
import com.gozulio.gozuliantechnologies.item.tool.sword.swordTiberiumGreen;
import com.gozulio.gozuliantechnologies.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder((Reference.MOD_ID))
public class modItems
{
    //declare items
    public static final _ItemHelper_Generic itemtiberiumgreen = new itemTiberiumGreen();
    public static final _ItemHelper_Generic itemtiberiumblue = new itemTiberiumBlue();
    public static final _ItemHelper_Generic itemtiberiumred = new itemTiberiumRed();

    //declare swords
    public static final _ToolHelper_Sword tooltiberiumgreensword = new swordTiberiumGreen();
    //declare pickaxes

    //declare shovels

    //declare axes
    public static void init()
    {
        //init base items
        GameRegistry.registerItem(itemtiberiumgreen, "Tiberium_Green");
        GameRegistry.registerItem(itemtiberiumblue, "Tiberium_Blue");
        GameRegistry.registerItem(itemtiberiumred, "Tiberium_Red");

        //init swords
        GameRegistry.registerItem(tooltiberiumgreensword, "Tiberium_Green_Sword");
        //init pickaxes

        //init shovels

        //init axes
    }
}
