package com.PlayPrey.PPCM.items;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.PlayPrey.PPCM.PPCM;
import com.PlayPrey.PPCM.blocks.ModBlocks;
import com.PlayPrey.PPCM.items.tool.wheat.wheatTool_axe;
import com.PlayPrey.PPCM.items.tool.wheat.wheatTool_hoe;
import com.PlayPrey.PPCM.items.tool.wheat.wheatTool_pickaxe;
import com.PlayPrey.PPCM.items.tool.wheat.wheatTool_shovel;
import com.PlayPrey.PPCM.items.tool.wheat.wheatTool_sword;
import com.PlayPrey.PPCM.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems 
{
public static Item specialTool_ingot;
public static Item specialTool_brokeningot;
	
	
	
	
	
public static Item wheatTool_sword;
public static Item wheatTool_axe;
public static Item wheatTool_hoe;
public static Item wheatTool_pickaxe;
public static Item wheatTool_shovel;



public static void init()
{
//====Tools
	
	//===Wheat
	wheatTool_sword = new wheatTool_sword(ItemIds.WHEATTOOL_SWORD, PPCM.EnumToolMaterialWheat);
	wheatTool_axe = new wheatTool_axe(ItemIds.WHEATTOOL_AXE, PPCM.EnumToolMaterialWheat);
	wheatTool_hoe = new wheatTool_hoe(ItemIds.WHEATTOOL_HOE, PPCM.EnumToolMaterialWheat);
	wheatTool_pickaxe = new wheatTool_pickaxe(ItemIds.WHEATTOOL_PICKAXE, PPCM.EnumToolMaterialWheat);
	wheatTool_shovel = new wheatTool_shovel(ItemIds.WHEATTOOL_SHOVEL, PPCM.EnumToolMaterialWheat);
	GameRegistry.registerItem(wheatTool_sword, Strings.wheatTool_sword);
	GameRegistry.registerItem(wheatTool_axe, Strings.wheatTool_axe);
	GameRegistry.registerItem(wheatTool_hoe, Strings.wheatTool_hoe);
	GameRegistry.registerItem(wheatTool_pickaxe, Strings.wheatTool_pickaxe);
	GameRegistry.registerItem(wheatTool_shovel, Strings.wheatTool_shovel);
	//===Special
	specialTool_ingot = new specialTool_ingot(ItemIds.SPECIALTOOL_INGOT);
	specialTool_brokeningot = new specialTool_brokeningot(ItemIds.SPECIALTOOL_BROKENINGOT);
	GameRegistry.registerItem(specialTool_ingot, Strings.Pp_Special_Ingot);
	GameRegistry.registerItem(specialTool_brokeningot, Strings.Pp_Special_BrokenIngot);



recipesInit();
}


public static void recipesInit(){

	//===Tools
	//=========Wheat
	GameRegistry.addRecipe(new ItemStack(ModItems.wheatTool_axe,1,0), new Object[]{"DD ","SD ","S  ",'D', Item.wheat, 'S', Item.stick});
	GameRegistry.addRecipe(new ItemStack(ModItems.wheatTool_axe,1,0), new Object[]{" DD"," SD"," S ",'D', Item.wheat, 'S', Item.stick});
	GameRegistry.addRecipe(new ItemStack(ModItems.wheatTool_axe,1,0), new Object[]{"DD ","DS "," S ",'D', Item.wheat, 'S', Item.stick});
	GameRegistry.addRecipe(new ItemStack(ModItems.wheatTool_axe,1,0), new Object[]{" DD"," DS","  S",'D', Item.wheat, 'S', Item.stick});
	GameRegistry.addRecipe(new ItemStack(ModItems.wheatTool_sword,1,0), new Object[]{"D","D","S",'D', Item.wheat, 'S', Item.stick});
	GameRegistry.addRecipe(new ItemStack(ModItems.wheatTool_shovel,1,0), new Object[]{"D","S","S",'D', Item.wheat, 'S', Item.stick});
	GameRegistry.addRecipe(new ItemStack(ModItems.wheatTool_pickaxe,1,0), new Object[]{"DDD"," S "," S ",'D', Item.wheat, 'S', Item.stick});
	GameRegistry.addRecipe(new ItemStack(ModItems.wheatTool_hoe,1,0), new Object[]{" DD"," S "," S ",'D', Item.wheat, 'S', Item.stick});
	GameRegistry.addRecipe(new ItemStack(ModItems.wheatTool_hoe,1,0), new Object[]{"DD ","S  ","S  ",'D', Item.wheat, 'S', Item.stick});
	GameRegistry.addRecipe(new ItemStack(ModItems.wheatTool_hoe,1,0), new Object[]{" DD","  S","  S",'D', Item.wheat, 'S', Item.stick});
	GameRegistry.addRecipe(new ItemStack(ModItems.wheatTool_hoe,1,0), new Object[]{"DD "," S "," S ",'D', Item.wheat, 'S', Item.stick});
	//=========Special
	//GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.NewBlock, 2,0), new Object[]{new ItemStack(Block.dirt), new ItemStack(Block.dirt), new ItemStack(Block.dirt), new ItemStack(Block.stone)});


	//GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.NewBlock, 2,0), new Object[]{new ItemStack(Block.dirt), new ItemStack(Block.dirt), new ItemStack(Block.dirt), new ItemStack(Block.stone)});

    //GameRegistry.addSmelting(Block.dirt.blockID, new ItemStack(ModBlocks.NewBlock,5,0), 1F);};
}
}