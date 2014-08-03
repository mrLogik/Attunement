package com.rad.attunement.worldgen;

import java.util.Random;

import com.rad.attunement.block.*;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class AttuneWorldGen implements IWorldGenerator {
	
	@Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		// params: Block X, Block Y, Block Z, Block;
		world.setBlock(0, 100, 0, new TestBlock());
    }
}
