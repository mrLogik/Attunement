package com.rad.attunement.worldgen;

import java.util.Random;

import com.rad.attunement.block.*;

import com.rad.attunement.handler.ConfigurationHandler;
import com.rad.attunement.init.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class AttuneWorldGen implements IWorldGenerator {
	
	@Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		// params: Block X, Block Y, Block Z, Block;
		world.setBlock(0, 100, 1, Blocks.brick_stairs );

        switch(world.provider.dimensionId){
            case -1:
                generateNether(world, random, chunkX * 16, chunkZ * 16);
                break;
            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
                break;
            case 1:
                generateEnd(world, random, chunkX * 16, chunkZ * 16);
                break;
        }
    }

    private void generateEnd(World world, Random rand, int chunkX, int chunkZ) {}

    private void generateSurface(World world, Random rand, int chunkX, int chunkZ) {
        generateSurfaceOres(world,rand,chunkX,chunkZ);// this might for some reason cause lag, don't know why but in one test tick rate was low
    }

    private void generateNether(World world, Random rand, int chunkX, int chunkZ) {}

    private void generateSurfaceOres(World world, Random rand, int chunkX, int chunkZ) {
        for (int k = 0; k < 10; k++) {
            int xPos = chunkX + rand.nextInt(16);
            int yPos = rand.nextInt(64);
            int zPos = chunkZ + rand.nextInt(16);

            // params(target block(for our mod it has to reference "ModBlocks.ExampleBlock"), ore vein size(number of blocks per vein))
            if (ConfigurationHandler.doesGenTestOre) {
                (new WorldGenMinable(ModBlocks.testOre, 10)).generate(world, rand, xPos, yPos, zPos);
            }

        }
    }
}
