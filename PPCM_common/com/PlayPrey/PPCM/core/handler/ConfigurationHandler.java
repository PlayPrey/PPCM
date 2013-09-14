package com.PlayPrey.PPCM.core.handler;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;

import com.PlayPrey.PPCM.items.ItemIds;
import com.PlayPrey.PPCM.lib.BlockIds;

import com.PlayPrey.PPCM.lib.References;
import com.PlayPrey.PPCM.lib.Strings;

import cpw.mods.fml.common.FMLLog;

public class ConfigurationHandler {

	static Configuration config = new Configuration();

	public static void init(File file){

		config = new Configuration(file);
		
		try{
			

			config.load();
			
			

			//BlockIds.IronFurnaceID = config.get(config.CATEGORY_BLOCK, Strings.IronFurnaceID, BlockIds.IronFurnaceID_DEFAULT).getInt(BlockIds.IronFurnaceID_DEFAULT);

			BlockIds.RUBY_ORE_ID = config.get(config.CATEGORY_BLOCK, Strings.Pp_Ore_Ruby, BlockIds.RUBY_ORE_ID_DEFAULT).getInt(BlockIds.RUBY_ORE_ID_DEFAULT);
			BlockIds.PORTAL_AVATASH = config.get(config.CATEGORY_BLOCK, Strings.PortalAvatash, BlockIds.PORTAL_AVATASH_DEFAULT).getInt(BlockIds.PORTAL_AVATASH_DEFAULT);
			BlockIds.FROSTDIMENSION_OAK = config.get(config.CATEGORY_BLOCK, Strings.OakWoodTBFROST, BlockIds.FROSTDIMENSION_OAK_ID).getInt(BlockIds.FROSTDIMENSION_OAK_ID);
			BlockIds.FROSTDIMENSION_GRASSBLOCK = config.get(config.CATEGORY_BLOCK, Strings.FROSTgrassBlock, BlockIds.FROSTDIMENSION_GRASSBLOCK_ID).getInt(BlockIds.FROSTDIMENSION_GRASSBLOCK_ID);
			BlockIds.FROSTDIMENSION_STONE = config.get(config.CATEGORY_BLOCK, Strings.FROSTstoneBlock, BlockIds.FROSTDIMENSION_STONE_ID).getInt(BlockIds.FROSTDIMENSION_STONE_ID);
			BlockIds.FROSTDIMENSION_DIRT = config.get(config.CATEGORY_BLOCK, Strings.FROSTdirtBlock, BlockIds.FROSTDIMENSION_DIRT_ID).getInt(BlockIds.FROSTDIMENSION_DIRT_ID);
			BlockIds.FROSTDIMENSION_COBBLESTONE = config.get(config.CATEGORY_BLOCK, Strings.FROSTcobblestoneBlock, BlockIds.FROSTDIMENSION_COBBLESTONE_ID).getInt(BlockIds.FROSTDIMENSION_COBBLESTONE_ID);

			
			
			
			
			
			//ITEMS
			
			
			
			//Wheat Tools
			ItemIds.WHEATTOOL_SWORD = config.get(config.CATEGORY_ITEM, Strings.wheatTool_sword, ItemIds.WHEATTOOL_SWORD_DEFAULT).getInt(ItemIds.WHEATTOOL_SWORD_DEFAULT);
			ItemIds.WHEATTOOL_SHOVEL = config.get(config.CATEGORY_ITEM, Strings.wheatTool_shovel, ItemIds.WHEATTOOL_SHOVEL_DEFAULT).getInt(ItemIds.WHEATTOOL_SHOVEL_DEFAULT);
			ItemIds.WHEATTOOL_PICKAXE = config.get(config.CATEGORY_ITEM, Strings.wheatTool_pickaxe, ItemIds.WHEATTOOL_PICKAXE_DEFAULT).getInt(ItemIds.WHEATTOOL_PICKAXE_DEFAULT);
			ItemIds.WHEATTOOL_AXE = config.get(config.CATEGORY_ITEM, Strings.wheatTool_axe, ItemIds.WHEATTOOL_AXE_DEFAULT).getInt(ItemIds.WHEATTOOL_AXE_DEFAULT);
			ItemIds.WHEATTOOL_HOE = config.get(config.CATEGORY_ITEM, Strings.wheatTool_hoe, ItemIds.WHEATTOOL_HOE_DEFAULT).getInt(ItemIds.WHEATTOOL_HOE_DEFAULT);
			//Special Tools
			ItemIds.SPECIALTOOL_BROKENINGOT = config.get(config.CATEGORY_ITEM, Strings.Pp_Special_BrokenIngot, ItemIds.SPECIALTOOL_BROKENINGOT_DEFAULT).getInt(ItemIds.SPECIALTOOL_BROKENINGOT_DEFAULT);
			ItemIds.SPECIALTOOL_INGOT = config.get(config.CATEGORY_ITEM, Strings.Pp_Special_Ingot, ItemIds.SPECIALTOOL_INGOT_DEFAULT).getInt(ItemIds.SPECIALTOOL_INGOT_DEFAULT);

		}

		catch(Exception e){

			FMLLog.log(Level.SEVERE, e, References.MODID + References.VERSION + " has trouble loading the config, please report on the forums with the crash log.");
		}

		finally{

			config.save();
		}
	}
}