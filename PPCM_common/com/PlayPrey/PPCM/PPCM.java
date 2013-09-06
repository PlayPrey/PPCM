package com.PlayPrey.PPCM;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import com.PlayPrey.PPCM.blocks.ModBlocks;
import com.PlayPrey.PPCM.core.handler.ConfigurationHandler;
import com.PlayPrey.PPCM.core.handler.LocalizationHandler;
import com.PlayPrey.PPCM.core.proxy.CommonProxy;
import com.PlayPrey.PPCM.lib.References;
import com.PlayPrey.PPCM.tile.entity.TileEntityIronFurnace;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod( name = References.MODNAME, modid = References.MODID , version = References.VERSION)
@NetworkMod( clientSideRequired = true, serverSideRequired = false)
public class PPCM 
{
@Instance("HighSpeed")
	//public static Iron_Furnace instance;

	//private GuiHandlerIron_Furnace guiHandlerHighSpeed = new GuiHandlerIron_Furnace();

	
	
@SidedProxy( clientSide = References.CLIENT_PROXY_LOCATION, serverSide = References.COMMON_PROXY_LOCATION)

public static CommonProxy proxy;
public static CreativeTabs tabPPCM;


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
	GameRegistry.registerTileEntity(TileEntityIronFurnace.class,"tileEntityIronFurnace");
	RenderingRegistry.registerBlockHandler(2105, RenderIron.INSTANCE);
	NetworkRegistry.instance().registerGuiHandler(this, guiHandlerIron);
}
@EventHandler
public void postInit(FMLPostInitializationEvent event)
{

}

}
