package com.rad.attunement.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.rad.attunement.block.AttuneBlock;
import com.rad.attunement.block.TestBlock;
import com.rad.attunement.block.TestOre;
import com.rad.attunement.item.AttuneItem;
import com.rad.attunement.item.TestIngot;
import com.rad.attunement.item.TestItem;

import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	
	public static final AttuneItem testIngot = new TestIngot();
	public static final AttuneItem testItem = new TestItem();
	public static final AttuneBlock testBlock = new TestBlock();
	public static final AttuneBlock testOre = new TestOre();
	
	public static void init() {
		//Crafting Recipes
    	GameRegistry.addRecipe(new ItemStack(testBlock), "xxx","xyx","xxx",'x', new ItemStack(testIngot), 'y', new ItemStack(Items.diamond, 3));
    	GameRegistry.addRecipe(new ItemStack(testItem), " x "," x "," y ",'x', new ItemStack(testIngot), 'y', new ItemStack(Items.stick));
    	
    	//Smelting Recipes
    	GameRegistry.addSmelting(testOre, new ItemStack(testIngot), 0.1F);
    }
}
