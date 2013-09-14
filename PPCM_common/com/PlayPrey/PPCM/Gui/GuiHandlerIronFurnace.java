/** package com.PlayPrey.PPCM.Gui;
 

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.PlayPrey.PPCM.container.ContainerIronFurnace;
import com.PlayPrey.PPCM.tile.entity.TileEntityIronFurnace;

import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandlerIronFurnace implements IGuiHandler
{
@Override
public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
{
TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
switch(id)
{
case 0: return new ContainerIronFurnace(player.inventory, (TileEntityIronFurnace) tile_entity);
}
return null;
}
@Override
public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
{
TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
switch(id)
{
case 0: return new GuiIronFurnace(player.inventory, (TileEntityIronFurnace) tile_entity);
}
return null;
}
}

*/