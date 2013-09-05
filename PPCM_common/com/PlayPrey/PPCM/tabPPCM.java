package com.PlayPrey.PPCM;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

public final class tabPPCM extends CreativeTabs
{
public tabPPCM(int par1, String par2Str)
{
super(par1, par2Str);
}
@SideOnly(Side.CLIENT)
public int getTabIconItemIndex()
{
return Block.sand.blockID;
}

public String getTranslatedTabLabel()
{
return "P-P-C-M";
}
}