package com.gozulio.gozuliantechnologies.block.blockcontainer;

import com.gozulio.gozuliantechnologies.helper._BlockContainerHelper_Generic;
import com.gozulio.gozuliantechnologies.reference.Reference;
import com.gozulio.gozuliantechnologies.tileentity.tileEnergySink;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by Xeno on 5/15/2015.
 */
public class containerEnergySink extends _BlockContainerHelper_Generic
{
    public containerEnergySink()
    {
        this.setHarvestLevel("pickaxe", 1);
        this.setHardness(0.8f);
        this.setBlockName("Energy_Sink");
    }
    @Override
    public TileEntity createNewTileEntity(World world, int meta)
    {
        return new tileEnergySink();
    }
}
