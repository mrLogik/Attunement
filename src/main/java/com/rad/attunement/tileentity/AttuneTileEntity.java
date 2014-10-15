package com.rad.attunement.tileentity;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.entity.player.EntityPlayer;


public class AttuneTileEntity extends TileEntity
{

    public static final String publicName = "AttuneTileEntity";
    private String name = "AttuneTileEntity";

    public String getName()
    {
        return name;
    }

    @Override
    public void updateEntity()
    {
    	// What it does.
    }
    
    
}