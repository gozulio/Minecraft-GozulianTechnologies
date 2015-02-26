package com.gozulio.gozuliantechnologies.helper;

import net.minecraft.block.material.Material;

public class _BlockHelper_Tiberium extends _BlockHelper_Generic
{
    public _BlockHelper_Tiberium(Material material)
    {
        super(material);
        this.setHardness(0.5f);
        this.setStepSound(soundTypeGlass);
        this.setLightLevel(0.3f);
    }
    public _BlockHelper_Tiberium()
    {
        this(Material.glass);
    }
}
