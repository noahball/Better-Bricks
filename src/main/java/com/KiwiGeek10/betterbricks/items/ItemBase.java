package com.KiwiGeek10.betterbricks.items;

import com.KiwiGeek10.betterbricks.Main;
import com.KiwiGeek10.betterbricks.init.ModItems;
import com.KiwiGeek10.betterbricks.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
	
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MISC);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
