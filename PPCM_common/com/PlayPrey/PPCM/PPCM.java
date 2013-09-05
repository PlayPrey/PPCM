package com.PlayPrey.PPCM;

import net.minecraft.creativetab.CreativeTabs;

import com.PlayPrey.PPCM.blocks.ModBlocks;
import com.PlayPrey.PPCM.core.proxy.CommonProxy;
import com.PlayPrey.PPCM.lib.References;

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
@SidedProxy( clientSide = References.CLIENT_PROXY_LOCATION, serverSide = References.COMMON_PROXY_LOCATION)

public static CommonProxy proxy;


@EventHandler
public void preInit(FMLPreInitializationEvent event)
{
	ModBlocks.init();
	final CreativeTabs tabPPCM= new tabPPCM(12, "P-P-C-M");
	
}
@EventHandler
public void init(FMLInitializationEvent event)
{
	
}
@EventHandler
public void postInit(FMLPostInitializationEvent event)
{

}

}
