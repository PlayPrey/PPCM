package com.PlayPrey.PPCM.items.tool.wheat;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;

import com.PlayPrey.PPCM.PPCM;
import com.PlayPrey.PPCM.lib.References;
import com.PlayPrey.PPCM.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


// *REMEBER* Change "ItemPickaxe" to ItemAxe, ItemHoe, ItemSword, etc if you are making those tools!
public class wheatTool_hoe extends ItemHoe
{
	{
		this.setCreativeTab(PPCM.tabPPCM);
	this.setUnlocalizedName(Strings.wheatTool_hoe);
	}

public wheatTool_hoe(int ItemID, EnumToolMaterial material) 
{
	
	super(ItemID, material);
}
@Override
@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister iconRegister)
{

	itemIcon = iconRegister.registerIcon(String.format("%s:%s", References.MODID.toLowerCase(), getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
}

protected String getUnwrappedUnlocalizedName(String name){

	return name.substring(name.indexOf(".") + 1);
}
}


