package com.sensualbardnoise.invertedmod.tools;

import java.util.List;

import com.sensualbardnoise.invertedmod.Main;
import com.sensualbardnoise.invertedmod.init.ModItems;
import com.sensualbardnoise.invertedmod.util.IHasModel;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ToolPickaxe extends ItemPickaxe implements IHasModel{

	public ToolPickaxe(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabInvertedMod);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
