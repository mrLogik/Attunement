package com.rad.attunement.tileentity;

import net.minecraft.tileentity.TileEntity;

public class AltarTileEntity extends TileEntity {

    int tick = 0;

    public static final String publicName = "altarTileEntity";
    private String name = "altarTileEntity";

    public String getName() {

        return name;
    }

    @Override
    public void updateEntity() {

        if(!worldObj.isRemote) {

            tick++;
            if(tick == 100) {

                this.worldObj.setWorldTime(1000);
                tick = 0;
            }
        }
    }
}