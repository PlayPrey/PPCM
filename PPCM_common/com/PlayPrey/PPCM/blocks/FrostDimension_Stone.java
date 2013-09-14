package com.PlayPrey.PPCM.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

import com.PlayPrey.PPCM.PPCM;
import com.PlayPrey.PPCM.lib.References;
import com.PlayPrey.PPCM.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class FrostDimension_Stone extends Block {

	public FrostDimension_Stone(int id){

		super(id, Material.rock);
		this.setHardness(25F);
		this.setResistance(25F);
		this.setStepSound(Block.soundGrassFootstep);
		this.setCreativeTab(PPCM.tabFROSTPPCM);
		this.setUnlocalizedName(Strings.FROSTstoneBlock);
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