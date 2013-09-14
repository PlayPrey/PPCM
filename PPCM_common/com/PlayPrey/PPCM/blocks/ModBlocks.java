package com.PlayPrey.PPCM.blocks;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.src.ModLoader;

import com.PlayPrey.PPCM.core.handler.ConfigurationHandler;
import com.PlayPrey.PPCM.lib.BlockIds;
import com.PlayPrey.PPCM.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks 
{

	
//public static Block Special_Block;	
public static Block Pp_Ore_Ruby;
public static Block FrostDimension_Oak;
public static Block FrostDimension_GrassBlock;
public static Block FrostDimension_Dirt;
public static Block FrostDimension_Stone;
public static Block FrostDimension_Cobblestone;
//public static Block IronFurnace;
//public static Block IronFurnaceActive;
//public static int IronFurnaceID;
//public static int IronFurnaceActiveID;
public static Block portalAvatashBlock;

//Frozen Dimension




public static void init()
{

//Special_Block = new Pp_Block_Special(BlockIds.SPECIAL_BLOCK_ID);
Pp_Ore_Ruby = new Pp_Ore_Ruby(BlockIds.RUBY_ORE_ID);
FrostDimension_Dirt = new FrostDimension_Dirt(BlockIds.FROSTDIMENSION_DIRT_ID);
FrostDimension_Stone = new FrostDimension_Stone(BlockIds.FROSTDIMENSION_STONE_ID);
FrostDimension_Cobblestone = new FrostDimension_Cobblestone(BlockIds.FROSTDIMENSION_COBBLESTONE_ID);
FrostDimension_GrassBlock = new FrostDimension_GrassBlock(BlockIds.FROSTDIMENSION_GRASSBLOCK_ID);
FrostDimension_Oak = new FrostDimension_Oak(BlockIds.FROSTDIMENSION_OAK_ID);
portalAvatashBlock = new BlockAvatashPortal(BlockIds.PORTAL_AVATASH);//.setUnlocalizedName("portalTutorialBlock");
//IronFurnace = new IronFurnace(BlockIds.IronFurnaceID, false).setHardness(3.5F).setResistance(2000.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName(Strings.IronFurnace).setCreativeTab(CreativeTabs.tabBlock);
//IronFurnaceActive = new IronFurnace(BlockIds.IronFurnaceActiveID, true).setHardness(3.5F).setResistance(2000.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName(Strings.IronFurnace);





GameRegistry.registerBlock(Pp_Ore_Ruby, Strings.Pp_Ore_Ruby);
GameRegistry.registerBlock(FrostDimension_Oak, Strings.OakWoodTBFROST);
GameRegistry.registerBlock(FrostDimension_GrassBlock, Strings.FROSTgrassBlock);
GameRegistry.registerBlock(FrostDimension_Dirt, Strings.FROSTdirtBlock);
GameRegistry.registerBlock(FrostDimension_Stone, Strings.FROSTstoneBlock);
GameRegistry.registerBlock(FrostDimension_Cobblestone, Strings.FROSTcobblestoneBlock);
GameRegistry.registerBlock(portalAvatashBlock, Strings.PortalAvatash);

}
}