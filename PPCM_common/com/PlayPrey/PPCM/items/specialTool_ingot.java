package com.PlayPrey.PPCM.items;

import com.PlayPrey.PPCM.PPCM;
import com.PlayPrey.PPCM.lib.References;
import com.PlayPrey.PPCM.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class specialTool_ingot extends Item
{
       public specialTool_ingot(int id)
       {
             super(id);
             this.setUnlocalizedName(Strings.Pp_Special_Ingot);
             this.setCreativeTab(PPCM.tabPPCM);
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

