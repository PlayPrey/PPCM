package com.PlayPrey.PPCM.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

import com.PlayPrey.PPCM.lib.References;
import com.PlayPrey.PPCM.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Mouse Does Mods
 * 
 * BaseBlock
 * 
 * @author Martijn
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */

public class Pp_Ore_Ruby extends Block {

	public Pp_Ore_Ruby(int id){

		super(id, Material.rock);
		this.setHardness(25F);
		this.setResistance(25F);
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setUnlocalizedName(Strings.Pp_Ore_Ruby);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister){

		blockIcon = iconRegister.registerIcon(String.format("%s:%s", References.MODID.toLowerCase(), getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
	}

	protected String getUnwrappedUnlocalizedName(String name){

		return name.substring(name.indexOf(".") + 1);
	}
}