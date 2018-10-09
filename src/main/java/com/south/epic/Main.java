package com.south.epic;

import com.south.epic.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.MODVERSION, useMetadata = true)
public class Main
{
    public static final String MODID = "snepicbosses";
    public static final String MODNAME = "Epic Bosses";
    public static final String MODVERSION= "@VERSION@";


    @Mod.Instance
    public static Main instance;

    @SidedProxy(clientSide = Main.CLIENT_PROXY_LOCATION, serverSide = Main.SERVER_PROXY_LOCATION)
    public static CommonProxy proxy;

    public static final String CLIENT_PROXY_LOCATION = "com.south.epic.proxy.ClientProxy";
    public static final String SERVER_PROXY_LOCATION = "com.south.epic.proxy.ServerProxy";


    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
