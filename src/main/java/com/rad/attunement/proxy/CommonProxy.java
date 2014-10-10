package com.rad.attunement.proxy;

import com.rad.attunement.tileentity.AltarTileEntity;
import cpw.mods.fml.common.registry.GameRegistry;

public abstract class CommonProxy{

    public void registerTileEntities() {

        GameRegistry.registerTileEntity(AltarTileEntity.class, AltarTileEntity.publicName);
    }
}