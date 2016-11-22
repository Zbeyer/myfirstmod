package com.HelloWorldExampleMod.HelloWorldExampleMod;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = HelloWorldExampleMod.MODID, version = HelloWorldExampleMod.VERSION)
public class HelloWorldExampleMod
{
    public static final String MODID = "HelloWorldExampleMod";
    public static final String VERSION = "1.0";

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("DIRT BLOCK >> "+Blocks.DIRT.getUnlocalizedName());
        this.addRecipes();

    }

    public void addRecipes()
    {
        // Adds a recipe to get 4 Stone blocks by shaped crafting of 4 cobblestone in a square
        GameRegistry.addRecipe(new ItemStack(Blocks.STONE, 4), new Object[] { "CC", "C", 'C', Blocks.COBBLESTONE});

        // Adds a shapeless recipe to get 1 grass block by crafting Wheat_seeds and Dirt together
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.GRASS, 1), new ItemStack(Blocks.DIRT, 1), new ItemStack(Items.WHEAT_SEEDS, 1));
    }
}