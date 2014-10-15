package com.rad.attunement.block;

import com.rad.attunement.Attunement;
import com.rad.attunement.tileentity.AttuneTileEntity;
import com.rad.attunement.tileentity.PedestalTileEntity;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Pedestal extends AttuneBlock implements ITileEntityProvider {

	public Pedestal()
    {
        super();
        this.setBlockName("Pedestal");
        this.setBlockTextureName("Pedestal");
        this.setBlockUnbreakable();
    }
	
	@Override
	public TileEntity createNewTileEntity(World world, int meta)
	{
        return new PedestalTileEntity();
    }
	
	@Override
    public boolean hasTileEntity(int metadata)
	{
        return true;
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float a, float b, float c) 
    {
    	if(world.isRemote)
    			if(world.getTileEntity(x, y, z) != null)
    					player.openGui(Attunement.instance, 0, world, x, y, z);
    	return true;
    }

}
