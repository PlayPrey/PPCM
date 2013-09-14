/** package com.PlayPrey.PPCM.Gui;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

import com.PlayPrey.PPCM.container.ContainerIronFurnace;
import com.PlayPrey.PPCM.tile.entity.TileEntityIronFurnace;
public class GuiIronFurnace extends GuiContainer
{
private ResourceLocation hsf = new ResourceLocation("textures/highspeed/textures/gui/extruder.png");
private TileEntityIronFurnace IronInventory;
public GuiIronFurnace(InventoryPlayer par1InventoryPlayer, TileEntityIronFurnace par2TileEntityIronFurnace)
{
         super(new ContainerIronFurnace(par1InventoryPlayer, par2TileEntityIronFurnace));
         this.IronInventory = par2TileEntityIronFurnace;
}


protected void drawGuiContainerForegroundLayer(int par1, int par2)
{
         this.fontRenderer.drawString(StatCollector.translateToLocal("HighSpeed Furnace"), 40, 6, 4210752);
         this.fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
}


protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
{
         //int var4 = this.mc.renderEngine.getTexture("/microjunk/trees/common/aart/furnace.png");
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         mc.renderEngine.func_110577_a(hsf);
         int var5 = (this.width - this.xSize) / 2;
         int var6 = (this.height - this.ySize) / 2;
         this.drawTexturedModalRect(var5, var6, 0, 0, this.xSize, this.ySize);
         int var7;
         if (this.IronInventory.isBurning())
         {
                 var7 = this.IronInventory.getBurnTimeRemainingScaled(12);
                 this.drawTexturedModalRect(var5 + 56, var6 + 36 + 12 - var7, 176, 12 - var7, 14, var7 + 2);
         }
         var7 = this.IronInventory.getCookProgressScaled(24);
         this.drawTexturedModalRect(var5 + 79, var6 + 34, 176, 14, var7 + 1, 16);
}
}

*/