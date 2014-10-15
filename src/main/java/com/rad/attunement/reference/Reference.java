package com.rad.attunement.reference;

import com.rad.attunement.init.ModBlocks;
import com.rad.attunement.init.ModItems;
import com.rad.attunement.init.Recipes;
import com.rad.attunement.init.WorldGen;

public class Reference
{
    public static final String MOD_ID = "Attunement";
    public static final String MOD_NAME = "Attunement";
    public static final String VERSION = "1.7.10-1.0";
    public static final String CLIENT_PROXY_CLASS = "com.rad.attunement.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "com.rad.attunement.proxy.ServerProxy";
    
    //public static final String GUI_FACTORY_CLASS = "com.rad.attunement.client.gui.GuiFactory";
    
    /*
     * Initializes everything for Attunement! Put anything
     * here you want initialized in the pre-init.
     */
    public static void preInit() {
    	
    	ModItems.init();

        ModBlocks.init();
        
        Recipes.init();
        
    }
}