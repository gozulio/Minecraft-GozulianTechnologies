package com.gozulio.gozuliantechnologies;

import com.gozulio.gozuliantechnologies.handler.ConfigurationHandler;
import com.gozulio.gozuliantechnologies.Utility.LogHelper;
import com.gozulio.gozuliantechnologies.init.*;
import com.gozulio.gozuliantechnologies.proxy.iProxy;
import com.gozulio.gozuliantechnologies.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class GozulianTechnologies
{
    @Mod.Instance(Reference.MOD_ID)
    public static GozulianTechnologies instance;

    @SidedProxy(clientSide =Reference.CLIENT_PROXY_PATH , serverSide =Reference.SERVER_PROXY_PATH )
    public static iProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        LogHelper.info("Configuration Loaded.");
        modItems.init();
        LogHelper.info("Items Loaded.");
        modBlocks.init();
        LogHelper.info("Blocks Loaded.");

        LogHelper.info("Pre-Init Complete!");
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Registering to OreDictionary.");
        modLocalOreDict.init();
        LogHelper.info("Ore Dictionary entries registered.");

        LogHelper.info("Registering to Crafting Dictionary.");
        modCraftDict.init();
        LogHelper.info("Crafting recipes Registered.");

        LogHelper.info("Registering to Smelting Dictionary");
        modSmeltingDict.init();
        LogHelper.info("Smelting Recipes Registered");

        modDungeonLoot.init();
        LogHelper.info("Initialisation Complete!");
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {


        LogHelper.info("Post-Init Complete!");
    }
}
