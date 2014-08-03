package com.rad.attunement.init;

import com.rad.attunement.block.AttuneBlock;
import com.rad.attunement.block.TestOre;
import com.rad.attunement.worldgen.AttuneWorldGen;

import cpw.mods.fml.common.registry.GameRegistry;

public class WorldGen {
	public static void init() {
		
		final AttuneWorldGen testGen = new AttuneWorldGen();
		
		GameRegistry.registerWorldGenerator(testGen, 0);
    }
}
