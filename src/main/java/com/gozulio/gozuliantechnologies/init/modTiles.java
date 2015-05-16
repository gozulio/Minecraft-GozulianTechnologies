package com.gozulio.gozuliantechnologies.init;


import com.gozulio.gozuliantechnologies.block.blockcontainer.containerEnergySink;
import com.gozulio.gozuliantechnologies.helper._BlockContainerHelper_Generic;
import com.gozulio.gozuliantechnologies.tileentity.tutorialTile;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Xeno on 5/13/2015.
 */
public class modTiles
{
    //TileEnt Data

    //blockContainers
    public static final _BlockContainerHelper_Generic energysink = new containerEnergySink();

    public static void preinit()
    {
        GameRegistry.registerTileEntity(tutorialTile.class, "Energy_Sink_Data");
    }
    public static void init()
    {
        GameRegistry.registerBlock(energysink, "energy_Sink");
    }
}
