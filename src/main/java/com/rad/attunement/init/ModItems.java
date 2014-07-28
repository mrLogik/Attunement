package com.rad.attunement.init;

import com.rad.attunement.item.AttuneItem;
import com.rad.attunement.item.TestIngot;
import com.rad.attunement.item.TestItem;
import com.rad.attunement.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
	
	public static final AttuneItem testIngot = new TestIngot();
	public static final AttuneItem testItem = new TestItem();
	
    public static void init() {
    	GameRegistry.registerItem(testIngot, "testIngot");
    	GameRegistry.registerItem(testItem, "testItem");
    }
}