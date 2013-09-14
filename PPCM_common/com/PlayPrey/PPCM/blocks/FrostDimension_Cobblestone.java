package com.PlayPrey.PPCM.blocks;

import com.PlayPrey.PPCM.PPCM;
import com.PlayPrey.PPCM.lib.References;
import com.PlayPrey.PPCM.lib.Strings;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class FrostDimension_Cobblestone extends Block 
{
public FrostDimension_Cobblestone(int id) 
{
super(id, Material.rock);
setUnlocalizedName(Strings.FROSTcobblestoneBlock);
setCreativeTab(PPCM.tabFROSTPPCM);
setHardness(2F);
setResistance(15F);
setStepSound(Block.soundStoneFootstep);
setLightValue(0.1F);
}



@Override
@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister iconRegister)
{

	blockIcon = iconRegister.registerIcon(String.format("%s:%s", References.MODID.toLowerCase(), getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
}

protected String getUnwrappedUnlocalizedName(String name){

	return name.substring(name.indexOf(".") + 1);
}
}