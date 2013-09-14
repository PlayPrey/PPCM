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

public class FrostDimension_GrassBlock extends Block {
public FrostDimension_GrassBlock(int id) {
super(id, Material.grass);
setUnlocalizedName(Strings.FROSTgrassBlock);
setCreativeTab(PPCM.tabFROSTPPCM);
setHardness(2F);
setResistance(15F);
setStepSound(Block.soundGrassFootstep);
setLightValue(0.1F);
}

@SideOnly(Side.CLIENT)
public static Icon topIcon;
@SideOnly(Side.CLIENT)
public static Icon bottomIcon;
@SideOnly(Side.CLIENT)
public static Icon sideIcon;



@Override
@SideOnly(Side.CLIENT)

public void registerIcons(IconRegister iconRegister) 
{
	sideIcon = iconRegister.registerIcon(String.format("%s:%s", References.MODID.toLowerCase(), getUnwrappedUnlocalizedName(this.getUnlocalizedName())));	
topIcon = iconRegister.registerIcon(String.format("%s:%s", References.MODID.toLowerCase(), getUnwrappedUnlocalizedName(this.getUnlocalizedName() + "_top")));
bottomIcon = iconRegister.registerIcon(String.format("%s:%s", References.MODID.toLowerCase(), getUnwrappedUnlocalizedName("Frost_Dirt")));
}


protected String getUnwrappedUnlocalizedName(String name){

	return name.substring(name.indexOf(".") + 1);
}
@Override
@SideOnly(Side.CLIENT)
public Icon getIcon(int side, int metadata) {
if(side == 0) {
return bottomIcon;
} else if(side == 1) {
return topIcon;
} else {
return sideIcon;
}
}
}