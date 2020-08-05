package com.criticalprime9.anomaly.events;

import com.criticalprime9.anomaly.Anomaly;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShearsItem;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Anomaly.MOD_ID, bus = Bus.FORGE)
public class diffuseEvent {
	@SubscribeEvent
	public static void diffuseEvent(PlayerInteractEvent.RightClickBlock event){
		if(event.getFace() != Direction.UP)
		if(event.getFace() != Direction.DOWN)
		if(event.getFace() != Direction.EAST)
		if(event.getFace() != Direction.WEST)
		if(event.getFace() != Direction.NORTH)
		if(event.getFace() != Direction.SOUTH)
			return;
		
		World world = event.getWorld();
		BlockPos pos = event.getPos();
		PlayerEntity player = event.getPlayer();
		
		BlockState state = world.getBlockState(pos);
		if(state.getBlock() != Blocks.TNT)
			return;
		
		ItemStack stack = event.getPlayer().getHeldItem(event.getHand());
		
		if(!stack.isEmpty() && stack.getItem() instanceof ShearsItem) {
			if(state.getBlock() == Blocks.TNT)
				world.setBlockState(pos, Blocks.DIRT.getDefaultState());
		}
		
		world.playSound(event.getPlayer(), pos, SoundEvents.BLOCK_GRASS_BREAK, SoundCategory.BLOCKS, 1.0F, 1.0F);
//REMINDER: Add line for durability decrease (1 per item use).
		player.swingArm(event.getHand());
		event.setCanceled(true);
	}
}
