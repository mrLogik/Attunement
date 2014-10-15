package com.rad.attunement.proxy;

import com.rad.attunement.tileentity.AttuneTileEntity;
import com.rad.attunement.tileentity.PedestalTileEntity;
import cpw.mods.fml.common.registry.GameRegistry;

public abstract class CommonProxy {

    public void registerTileEntities() {

        GameRegistry.registerTileEntity(AttuneTileEntity.class, AttuneTileEntity.publicName);
        GameRegistry.registerTileEntity(PedestalTileEntity.class, PedestalTileEntity.publicName);
    }
}