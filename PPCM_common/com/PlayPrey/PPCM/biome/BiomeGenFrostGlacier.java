package com.PlayPrey.PPCM.biome;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

import com.PlayPrey.PPCM.blocks.ModBlocks;
import com.PlayPrey.PPCM.lib.Strings;
import com.PlayPrey.PPCM.blocks.FrostDimension_GrassBlock;

public class BiomeGenFrostGlacier extends BiomeGenBase
{
public BiomeGenFrostGlacier(int par1)
{
super(par1);
this.spawnableCreatureList.clear();
this.spawnableMonsterList.clear();
this.minHeight = 0.1F;
this.maxHeight = 0.1F;
this.theBiomeDecorator.treesPerChunk = -999;
this.theBiomeDecorator.flowersPerChunk = 4;
this.theBiomeDecorator.grassPerChunk = 10;
this.fillerBlock=(byte) ModBlocks.FrostDimension_Dirt.blockID;
this.topBlock=(byte) ModBlocks.FrostDimension_GrassBlock.blockID;
this.biomeName=Strings.BIOME_GLACIER;
}
}