package com.sensualbardnoise.invertedmod.items;

import java.util.List;

import com.sensualbardnoise.invertedmod.Main;
import com.sensualbardnoise.invertedmod.init.ModItems;
import com.sensualbardnoise.invertedmod.util.IHasModel;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ItemTomatoItem extends ItemFood implements IHasModel{

	public ItemTomatoItem(String name) {
		super(4, 0.8F, false);

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
