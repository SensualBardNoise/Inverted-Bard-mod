package com.sensualbardnoise.invertedmod.init;

import net.minecraft.item.ItemStack;


import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		//GameRegistry.addSmelting(ModItems.RUBY, new ItemStack(ModBlocks.RUBY_BLOCK, 1, data), 1.5f); // Testing - ignore
		GameRegistry.addSmelting(ModItems.INVWFLOUR, new ItemStack(ModItems.INVBREAD, 1), 0.25f); // input, (output, amount), xp
		GameRegistry.addSmelting(ModItems.INVBRBASE, new ItemStack(ModItems.INVTOAST1, 1), 1.5f);
	}	
}