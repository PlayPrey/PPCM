package com.PlayPrey.PPCM.dimension;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

import com.PlayPrey.PPCM.PPCM;
import com.PlayPrey.PPCM.dimension.provider.ChunkProviderAvatash;

public class WorldProviderAvatash extends WorldProvider
{
       public void registerWorldChunkManager()
       {
              this.worldChunkMgr = new WorldChunkManagerHell(PPCM.Christmas, 0.8F, 0.1F);
              this.worldChunkMgr = new WorldChunkManagerHell(PPCM.Glacier, 0.8F, 0.1F);
              this.dimensionId = PPCM.dimensionId;
       }
      
       public IChunkProvider createChunkGenerator()
       {
              return new ChunkProviderAvatash(worldObj, worldObj.getSeed(), true);
       }
      
       @Override
       public String getDimensionName()
       {
              return "Avatash";
       }
}