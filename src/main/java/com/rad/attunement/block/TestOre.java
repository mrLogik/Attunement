package com.rad.attunement.block;

public class TestOre extends AttuneBlock {
	public TestOre()
	{
		super();
		this.setBlockName("testOre");
        this.setBlockTextureName("testOre");
        this.setHarvestLevel("pickaxe", 3);
        this.setHardness(4.0F);
	}
}
