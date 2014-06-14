package com.onehackoranother.jasonsmod;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = JasonsMod.MODID, version = JasonsMod.VERSION)
public class JasonsMod
{
    public static final String MODID = "jasonsmod";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void preinit(FMLInitializationEvent event)
    {
    	GameRegistry.addRecipe(new ItemStack(Blocks.obsidian, 16), new Object[]{
        	"AAA",
        	"ABA",
        	"AAA",
        	'A', Items.cookie,
        	'B', Items.melon
    	});
    }
}
