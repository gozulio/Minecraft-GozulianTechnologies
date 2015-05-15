package com.gozulio.gozuliantechnologies.tileentity;

import cofh.api.energy.IEnergyReceiver;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;

/**
 * Created by Xeno on 5/13/2015.
 */
public class tutorialTile extends TileEntity implements IEnergyReceiver
{
    public int energyStored = 0;
    public int maxStore = 32000000;
    public int maxin = 4096;
    public NBTTagCompound internal;

    @Override
    public int receiveEnergy(ForgeDirection from, int maxReceive, boolean simulate)
    {
        if (energyStored <= maxStore - this.maxin && !simulate)
        {
            energyStored = energyStored + maxReceive;
            return this.maxin;
        }
        return 0;
    }

    @Override
    public int getEnergyStored(ForgeDirection from) {
        return this.energyStored;
    }

    @Override
    public boolean canConnectEnergy(ForgeDirection from) {
        return true;
    }

    @Override
    public int getMaxEnergyStored(ForgeDirection from) {
        return this.maxStore;
    }

    @Override
    public void writeToNBT(NBTTagCompound par1)
    {
        super.writeToNBT(par1);
        par1.setInteger("EnergyStored", energyStored);
    }
    @Override
    public void readFromNBT(NBTTagCompound par1)
    {
        super.readFromNBT(par1);
        this.energyStored = par1.getInteger("EnergyStored");
    }
}
