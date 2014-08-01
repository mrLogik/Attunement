package com.rad.attunement.init;

import com.rad.attunement.block.TestBlock;
import com.rad.attunement.block.AttuneBlock;
import com.rad.attunement.block.TestOre;
import com.rad.attunement.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)

public class ModBlocks {
	
	public static final AttuneBlock testBlock = new TestBlock();
	public static final AttuneBlock testOre = new TestOre();
	
    public static void init() {
    	GameRegistry.registerBlock(testBlock, "testBlock");
    	GameRegistry.registerBlock(testOre, "testOre");
    }
}