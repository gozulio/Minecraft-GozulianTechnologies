package com.gozulio.gozuliantechnologies.handler;

import com.gozulio.gozuliantechnologies.init.modItems;
import com.gozulio.gozuliantechnologies.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Xeno on 5/10/2015.
 */
public class CreativetabHandler
{
    public static final CreativeTabs GOZTECH = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return modItems.itemtiberiumgreen;
        }
    };
}
