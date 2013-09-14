package com.PlayPrey.PPCM;

import com.PlayPrey.PPCM.blocks.ModBlocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

public final class tabFROSTPCMM extends CreativeTabs
{
public tabFROSTPCMM(int par1, String par2Str)
{
super(par1, par2Str);
}
@SideOnly(Side.CLIENT)
public int getTabIconItemIndex()
{
return ModBlocks.FrostDimension_GrassBlock.blockID;
}

public String getTranslatedTabLabel()
{
return "Frost Dimension";
}
}