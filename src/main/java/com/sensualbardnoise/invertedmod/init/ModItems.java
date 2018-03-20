package com.sensualbardnoise.invertedmod.init;

import java.util.ArrayList;




import java.util.List;

import com.sensualbardnoise.invertedmod.armor.ArmorBase;
import com.sensualbardnoise.invertedmod.items.InvBread;
import com.sensualbardnoise.invertedmod.items.InvToast1;
import com.sensualbardnoise.invertedmod.items.ItemBase;
import com.sensualbardnoise.invertedmod.items.ItemTomatoItem;
import com.sensualbardnoise.invertedmod.tools.ToolPickaxe;
import com.sensualbardnoise.invertedmod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Items
	public static final Item RUBY = new ItemBase("ruby"); //Just the creative icon - ignore for other purposes
	
		//Food
		//public static final Item TOMATOITEM = new ItemTomatoItem("tomatoitem");
		public static final Item INVERTEDWDUST = new ItemBase("invwdust");
		public static final Item INVWFLOUR = new ItemBase("invwflour");
		public static final Item INVBREAD = new InvBread("invbread");
		public static final Item INVBRBASE = new ItemBase("invbrbase");
		public static final Item INVTOAST1 = new InvToast1("invtoast1");
	
	//Materials
	public static final ToolMaterial INV_PICKAXE = EnumHelper.addToolMaterial("inv_pickaxe", 3, 2000, 8F, 7F, 10);
	public static final ArmorMaterial INV_ARMOR_BASE = EnumHelper.addArmorMaterial("inv_armor_base", Reference.MOD_ID + ":base", 13, new int[]{2, 5, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
	
	//Tools
	public static final Item INVERTED_PICKAXE = new ToolPickaxe("inverted_pickaxe", INV_PICKAXE);
	
	//Armor
	//public static final Item INVERTED_HELMET = new ArmorBase("inverted_helmet", INV_ARMOR_BASE, 1, EntityEquipmentSlot.HEAD);
	//public static final Item INVERTED_CHESTPLATE = new ArmorBase("inverted_chestplate", INV_ARMOR_BASE, 1, EntityEquipmentSlot.CHEST);
	//public static final Item INVERTED_LEGGINGS = new ArmorBase("inverted_leggings", INV_ARMOR_BASE, 2, EntityEquipmentSlot.LEGS);
	//public static final Item INVERTED_BOOTS = new ArmorBase("inverted_boots", INV_ARMOR_BASE, 1, EntityEquipmentSlot.FEET);
}
