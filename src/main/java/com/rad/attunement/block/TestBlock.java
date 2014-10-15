package com.rad.attunement.block;

import java.util.Random;

import com.rad.attunement.init.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class TestBlock extends AttuneBlock {
	public TestBlock()
	{
		super();
		this.setBlockName("testBlock");
        this.setBlockTextureName("testBlock");
        this.setHarvestLevel("pickaxe", 1);
        this.setHardness(4.0F);
	}
	
	@Override
	public Item getItemDropped(int num1, Random random, int num2)
    {
        return ModItems.testIngot;
    }

    public int quantityDropped(Random rand)
    {
        return 8;
    }

}
