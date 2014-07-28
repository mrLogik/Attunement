package com.rad.attunement.creativetab;

import com.rad.attunement.init.ModItems;
import com.rad.attunement.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabAttune {
	public static final CreativeTabs ATTUNE_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
	{
		@Override
		public Item getTabIconItem()
		{
			return ModItems.testIngot;
		}
	};
}
