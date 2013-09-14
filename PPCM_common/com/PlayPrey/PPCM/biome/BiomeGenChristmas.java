package com.PlayPrey.PPCM.biome;

import com.PlayPrey.PPCM.lib.Strings;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenChristmas extends BiomeGenBase
{
public BiomeGenChristmas(int par1)
{
super(par1);
this.spawnableCreatureList.clear();
this.spawnableMonsterList.clear();
this.theBiomeDecorator.treesPerChunk = -999;
this.theBiomeDecorator.flowersPerChunk = 4;
this.theBiomeDecorator.grassPerChunk = 10;
this.fillerBlock=(byte)Block.tnt.blockID;
this.topBlock=(byte)Block.wood.blockID;
this.biomeName=Strings.BIOME_CHRISTMAS;
}
}