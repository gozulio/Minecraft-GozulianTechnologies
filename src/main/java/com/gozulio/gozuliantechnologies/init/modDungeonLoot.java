package com.gozulio.gozuliantechnologies.init;


import com.gozulio.gozuliantechnologies.Utility.ChestGenHelper;

/**
 * Created by Xeno on 5/10/2015.
 */
public class modDungeonLoot
{

    public static void init()
    {
        ChestGenHelper.ALL(modItems.itemtiberiumgreen, 1, 16, 40);
        ChestGenHelper.NO_TOPSIDE(modItems.itemtiberiumblue, 1, 16, 30);
        ChestGenHelper.STRONGHOLDS(modItems.itemtiberiumred, 2, 8, 10);
    }
}
