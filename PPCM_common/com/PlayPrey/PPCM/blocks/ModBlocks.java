package com.PlayPrey.PPCM.blocks;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

import com.PlayPrey.PPCM.core.handler.ConfigurationHandler;
import com.PlayPrey.PPCM.lib.BlockIds;
import com.PlayPrey.PPCM.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {

public static Block Pp_Ore_Ruby;
//public static Block IronFurnace;
//public static Block IronFurnaceActive;
//public static int IronFurnaceID;
//public static int IronFurnaceActiveID;


public static void init()
{

Pp_Ore_Ruby = new Pp_Ore_Ruby(BlockIds.RUBY_ORE_ID);
//IronFurnace = new IronFurnace(BlockIds.IronFurnaceID, false).setHardness(3.5F).setResistance(2000.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName(Strings.IronFurnace).setCreativeTab(CreativeTabs.tabBlock);
//IronFurnaceActive = new IronFurnace(BlockIds.IronFurnaceActiveID, true).setHardness(3.5F).setResistance(2000.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName(Strings.IronFurnace);


GameRegistry.registerBlock(Pp_Ore_Ruby, Strings.Pp_Ore_Ruby);

}
}