package com.gozulio.gozuliantechnologies.tileentity;

import cofh.api.energy.IEnergyReceiver;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;

/**
 * Created by Xeno on 5/15/2015.
 */

public class tileEnergySink extends TileEntity implements IEnergyReceiver
{
    protected int energystored = 0;
    public int maxenergystored = 9000000;


    public int receiveEnergy(ForgeDirection from, int maxReceive, boolean simulate)
    {
        return maxReceive;
    }
    public int getEnergyStored(ForgeDirection from)
    {
        return this.energystored;
    }

    @Override
    public boolean canConnectEnergy(ForgeDirection from)
    {
        return true;
    }

    @Override
    public int getMaxEnergyStored(ForgeDirection from)
    {
        return this.maxenergystored;
    }

}
