package com.sensualbardnoise.invertedmod;


import com.sensualbardnoise.invertedmod.gen.InvertedModOreGen;
import com.sensualbardnoise.invertedmod.init.ModItems;
import com.sensualbardnoise.invertedmod.init.ModRecipes;
import com.sensualbardnoise.invertedmod.proxy.CommonProxy;
import com.sensualbardnoise.invertedmod.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS )
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
		InvertedModOreGen ore_gen = new InvertedModOreGen();
		GameRegistry.registerWorldGenerator(ore_gen, 0);
		
	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent event) {
		ModRecipes.init();
		
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {
		
	}
	
	public static CreativeTabs tabInvertedMod = new CreativeTabs("tab_invertedmod") {
		
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.RUBY);
		}
	};
}
