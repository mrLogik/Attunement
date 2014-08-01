package com.rad.attunement.block;

import java.util.Random;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TestBlock extends AttuneBlock {
	public TestBlock()
	{
		super();
		this.setBlockName("testBlock");
        this.setBlockTextureName("testBlock");
        this.setHarvestLevel("pickaxe", 1);
	}
	
	@Override
	public Item getItemDropped(int num1, Random random, int num2)
    {
        return Items.redstone;
    }
	
	
}
