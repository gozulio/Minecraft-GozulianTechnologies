package com.gozulio.gozuliantechnologies.init;

import cpw.mods.fml.common.asm.transformers.ItemStackTransformer;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

/**
 * Created by Xeno on 5/10/2015.
 */
public class modCraftDict
{
    public static void init()
    {
        /**
        //Example recipes, so i don't forget how to do this =P
        GameRegistry.addRecipe(new ItemStack(modItems.itemtiberiumgreen),
                " d ",
                "ddd",
                " d ",
                'd', new ItemStack(Items.diamond)
        );

        GameRegistry.addShapelessRecipe(new ItemStack(modItems.itemtiberiumgreen),
                new ItemStack(Items.diamond),
                new ItemStack(Items.diamond)
        );
         **/

        /**
        ITEMS MAIN
         **/
        /**
        //Green Tiberium Shard - Depreciated.
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(modItems.itemtiberiumgreen),
                "ege",
                "gdg",
                "ege",
                'e', Items.ender_pearl,
                'g', Items.gold_ingot,
                'd', Items.diamond));
        **/
        //Tiberium Blue crafting.
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(modItems.itemtiberiumblue, 9),
                "ggg",
                "gDg",
                "ggg",
                'g', "tibshardgreen",
                'D', new ItemStack(Items.diamond)));

        //Tiberium Red Crafting.
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(modItems.itemtiberiumred, 9),
                "bbb",
                "bSb",
                "bbb",
                'b', "tibshardblue",
                'S', Items.nether_star));


        /**
        ITEMS SWORDS
         **/
        //Green Tiberium Sword.
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(modItems.tooltiberiumgreensword),
                " g ",
                " g ",
                " s ",
                'g', "tibshardgreen",
                's', "stickWood"));

        //Green Tiberium Pickaxe.
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(modItems.tooltiberiumgreenpickaxe),
                "ggg",
                " s ",
                " s ",
                'g', "tibshardgreen",
                's', "stickWood"));

        //Blue Tiberium Sword.
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(modItems.tooltiberiumbluesword),
                " b ",
                " b ",
                " o ",
                'b', "tibshardblue",
                'o', new ItemStack(Blocks.obsidian)));
        //Blue Tiberium Pickaxe.
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(modItems.tooltiberiumbluepickaxe),
                "bbb",
                " o ",
                " o ",
                'b', "tibshardblue",
                'o', new ItemStack(Blocks.obsidian)));

        //Red Tiberium Sword.
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(modItems.tooltiberiumredsword),
                " r ",
                " r ",
                " d ",
                'r', "tibshardred",
                'd', new ItemStack(Items.diamond)));

        //Red Tiberium Pickaxe.
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(modItems.tooltiberiumredpickaxe),
                "rrr",
                " d ",
                " d ",
                'r', "tibshardred",
                'd', new ItemStack(Items.diamond)));
    }
}
