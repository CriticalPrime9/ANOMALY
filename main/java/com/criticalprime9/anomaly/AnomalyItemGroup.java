package com.criticalprime9.anomaly;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class AnomalyItemGroup extends ItemGroup
{
	public AnomalyItemGroup()
	{
		super("anomaly");
	}

	@Override
	public ItemStack createIcon() 
	{
		return new ItemStack(Blocks.BEDROCK);
	}

}
