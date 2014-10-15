package com.rad.attunement.block;


import com.rad.attunement.tileentity.AttuneTileEntity;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TestAltar extends AttuneBlock implements ITileEntityProvider {
    
	public TestAltar()
    {
        super();
        this.setBlockName("testAltar");
        this.setBlockTextureName("testAltar");
        this.setHarvestLevel("pickaxe", 1);
        this.setHardness(4.0F);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta)
    {
        return new AttuneTileEntity();
    }

    @Override
    public boolean hasTileEntity(int metadata)
    {
        return true;
    }
}
