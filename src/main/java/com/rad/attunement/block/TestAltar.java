package com.rad.attunement.block;


public class TestAltar extends AttuneBlock {
    public TestAltar()
    {
        super();
        this.setBlockName("testAltar");
        this.setBlockTextureName("testAltar");
        this.setHarvestLevel("pickaxe", 1);
        this.setHardness(4.0F);
    }
}
