package com.PlayPrey.PPCM.core.handler;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;

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
			//ItemIds.ITEM_ID = config.get(config.CATEGORY_ITEM, Strings.ITEMNAME, ItemIds.ITEM_ID_DEFAULT).getInt(ItemIds.ITEM_ID_DEFAULT);
		}

		catch(Exception e){

			FMLLog.log(Level.SEVERE, e, References.MODID + " has trouble loading the config");
		}

		finally{

			config.save();
		}
	}
}