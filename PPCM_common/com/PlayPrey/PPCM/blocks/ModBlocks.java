package com.PlayPrey.PPCM.blocks;

import net.minecraft.block.Block;

import com.PlayPrey.PPCM.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {

public static Block Pp_Ore_Ruby;

public static void init(){

Pp_Ore_Ruby = new Pp_Ore_Ruby(3000);

GameRegistry.registerBlock(Pp_Ore_Ruby, Strings.Pp_Ore_Ruby);
}
}