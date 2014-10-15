package com.rad.attunement;

import com.rad.attunement.client.gui.GuiHandler;
import com.rad.attunement.handler.ConfigurationHandler;
import com.rad.attunement.init.WorldGen;
import com.rad.attunement.proxy.CommonProxy;
import com.rad.attunement.reference.Reference;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION) //guiFactory = Reference.GUI_FACTORY_CLASS
public class Attunement
{
	
	
    @Mod.Instance(Reference.MOD_ID)
    public static Attunement instance;
    
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        Reference.preInit(); // Initializes everything
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
    	WorldGen.init();
        proxy.registerTileEntities();
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        
    }
}