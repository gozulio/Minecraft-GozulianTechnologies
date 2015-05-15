package com.gozulio.gozuliantechnologies.helper;

import com.gozulio.gozuliantechnologies.handler.CreativetabHandler;
import com.gozulio.gozuliantechnologies.reference.Reference;
import com.gozulio.gozuliantechnologies.tileentity.tileEnergyHandler;
import com.gozulio.gozuliantechnologies.tileentity.tutorialTile;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by Xeno on 5/13/2015.
 */
public class _BlockContainerHelper_Generic extends BlockContainer
{
    public _BlockContainerHelper_Generic(Material material)
    {
        super(material);
        this.setCreativeTab(CreativetabHandler.GOZTECH);
        this.setBlockName("GenericBlockContainer");
    }
    public _BlockContainerHelper_Generic()
    {
        this(Material.rock);
    }
    //Blegh...
    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
    //you're holding this!
    public TileEntity createNewTileEntity(World world, int meta)
    {
        return new tileEnergyHandler();
    }
}
