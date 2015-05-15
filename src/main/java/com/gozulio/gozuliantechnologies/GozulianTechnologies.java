package com.gozulio.gozuliantechnologies;

import com.gozulio.gozuliantechnologies.handler.ConfigurationHandler;
import com.gozulio.gozuliantechnologies.Utility.LogHelper;
import com.gozulio.gozuliantechnologies.handler.FuelHandler;
import com.gozulio.gozuliantechnologies.init.*;
import com.gozulio.gozuliantechnologies.proxy.iProxy;
import com.gozulio.gozuliantechnologies.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

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

        //Load or Generate config file.
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        LogHelper.info("Configuration Loaded.");

        //Register Items.
        modItems.init();
        //bl0x pl0x
        modBlocks.init();
        //Lod Tile Entities.
        modTiles.init();
        //Register fuel Handler
        GameRegistry.registerFuelHandler(new FuelHandler());
        LogHelper.info("Pre-Init Complete!");
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        //Register mod oreDictionary things to ore dictionary
        modLocalOreDict.init();
        //Register crafting recipes
        modCraftDict.init();
        //Register smelting recipes
        modSmeltingDict.init();
        //dungeon loot! w00t!
        modDungeonLoot.init();
        LogHelper.info("Initialisation Complete!");
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {


        LogHelper.info("Post-Init Complete!");
    }
}
