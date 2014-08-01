package com.rad.attunement;

import com.rad.attunement.handler.ConfigurationHandler;
import com.rad.attunement.init.ModBlocks;
import com.rad.attunement.init.ModItems;
import com.rad.attunement.init.Recipes;
import com.rad.attunement.proxy.IProxy;
import com.rad.attunement.reference.Reference;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class Attunement
{
	
	
    @Mod.Instance(Reference.MOD_ID)
    public static Attunement instance;
    
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModItems.init();

        ModBlocks.init();
        
        Recipes.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        
    }
}