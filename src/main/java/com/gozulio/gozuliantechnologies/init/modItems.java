package com.gozulio.gozuliantechnologies.init;

import com.gozulio.gozuliantechnologies.helper._ItemHelper_Generic;
import com.gozulio.gozuliantechnologies.helper.tool._ToolHelper_Pickaxe;
import com.gozulio.gozuliantechnologies.helper.tool._ToolHelper_Sword;
import com.gozulio.gozuliantechnologies.item.*;
import com.gozulio.gozuliantechnologies.item.tool.pickaxe.*;
import com.gozulio.gozuliantechnologies.item.tool.sword.*;
import com.gozulio.gozuliantechnologies.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder((Reference.MOD_ID))
public class modItems
{
    //declare items
    public static final _ItemHelper_Generic itemtiberiumgreen = new itemTiberiumGreen();
    public static final _ItemHelper_Generic itemtiberiumblue = new itemTiberiumBlue();
    public static final _ItemHelper_Generic itemtiberiumred = new itemTiberiumRed();
    public static final _ItemHelper_Generic itemorganicgoop = new itemOrganicGoop();

    //declare swords
    public static final _ToolHelper_Sword tooltiberiumgreensword = new swordTiberiumGreen();
    public static final _ToolHelper_Sword tooltiberiumbluesword = new swordTiberiumBlue();
    public static final _ToolHelper_Sword tooltiberiumredsword = new swordTiberiumRed();
    //declare pickaxes
    public static final _ToolHelper_Pickaxe tooltiberiumgreenpickaxe = new pickaxeTiberiumGreen();
    public static final _ToolHelper_Pickaxe tooltiberiumbluepickaxe = new pickaxeTiberiumBlue();
    public static final _ToolHelper_Pickaxe tooltiberiumredpickaxe = new pickaxeTiberiumRed();
    //declare shovels

    //declare axes
    public static void init()
    {
        //init base items
        GameRegistry.registerItem(itemtiberiumgreen, "Tiberium_Green");
        GameRegistry.registerItem(itemtiberiumblue, "Tiberium_Blue");
        GameRegistry.registerItem(itemtiberiumred, "Tiberium_Red");
        GameRegistry.registerItem(itemorganicgoop, "Organic_Goop");

        //init swords
        GameRegistry.registerItem(tooltiberiumgreensword, "Tiberium_Green_Sword");
        GameRegistry.registerItem(tooltiberiumbluesword, "Tiberium_Blue_Sword");
        GameRegistry.registerItem(tooltiberiumredsword, "Tiberium_Red_Sword");

        //init pickaxes
        GameRegistry.registerItem(tooltiberiumgreenpickaxe, "Tiberium_Green_Pickaxe");
        GameRegistry.registerItem(tooltiberiumbluepickaxe, "Tiberium_Blue_Pickaxe");
        GameRegistry.registerItem(tooltiberiumredpickaxe, "Tiberium_Red_Pickaxe");
        //init shovels

        //init axes
    }
}
