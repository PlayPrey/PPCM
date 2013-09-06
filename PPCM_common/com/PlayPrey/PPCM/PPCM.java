package com.PlayPrey.PPCM;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;

import com.PlayPrey.PPCM.Gui.GuiHandlerIronFurnace;
//import com.PlayPrey.PPCM.blocks.IronFurnace;
import com.PlayPrey.PPCM.blocks.ModBlocks;
import com.PlayPrey.PPCM.core.handler.ConfigurationHandler;
import com.PlayPrey.PPCM.core.handler.LocalizationHandler;
import com.PlayPrey.PPCM.core.proxy.CommonProxy;
import com.PlayPrey.PPCM.lib.References;
import com.PlayPrey.PPCM.tile.entity.TileEntityIronFurnace;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod( name = References.MODNAME, modid = References.MODID , version = References.VERSION)
@NetworkMod( clientSideRequired = true, serverSideRequired = false)
public class PPCM 
{
@Instance("Iron")
	//public static Iron_Furnace instance;
//public static IronFurnace INSTANCE;
	//private GuiHandlerIron_Furnace guiHandlerHighSpeed = new GuiHandlerIron_Furnace();
//private GuiHandlerIronFurnace guiHandlerIronFurnace = new GuiHandlerIronFurnace ();
	
	
@SidedProxy( clientSide = References.CLIENT_PROXY_LOCATION, serverSide = References.COMMON_PROXY_LOCATION)

public static CommonProxy proxy;


@EventHandler
public void preInit(FMLPreInitializationEvent event)
{
	
	ModBlocks.init();
	final CreativeTabs tabPPCM= new tabPPCM(12, References.MODID);
	
	ConfigurationHandler.init(new File(event.getModConfigurationDirectory().getAbsolutePath()+ File.separator + References.MODID + File.separator + References.MODID + ".cfg"));
	LocalizationHandler.init();
	
}
@EventHandler
public void init(FMLInitializationEvent event)
{
//	GameRegistry.registerTileEntity(TileEntityIronFurnace.class,"tileEntityIronFurnace");
//	RenderingRegistry.registerBlockHandler(2105, PPCM.INSTANCE);
//	NetworkRegistry.instance().registerGuiHandler(this, guiHandlerIronFurnace);
}
@EventHandler
public void postInit(FMLPostInitializationEvent event)
{

}

}
