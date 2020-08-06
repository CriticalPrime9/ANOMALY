package com.criticalprime9.anomaly.events;

import com.criticalprime9.anomaly.Anomaly;
import com.criticalprime9.anomaly.init.blocks.BlockInit;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
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
public class DiffuseEventHandler {
	@SubscribeEvent
	public static void DiffuseEvent(PlayerInteractEvent.RightClickBlock event){
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
			//Replace Block.
				world.setBlockState(pos, BlockInit.DIFFUSED_TNT.get().getDefaultState());
			//Items.
				Direction direction = event.getFace();
				Direction direction1 = direction.getAxis() == Direction.Axis.Y ? player.getHorizontalFacing().getOpposite() : direction;
		        ItemEntity itementity = new ItemEntity(world, (double)pos.getX() + 0.5D + (double)direction1.getXOffset() * 0.65D, (double)pos.getY() + 0.1D, (double)pos.getZ() + 0.5D + (double)direction1.getZOffset() * 0.65D, new ItemStack(Items.SAND, 1));
		        itementity.setMotion(0.05D * (double)direction1.getXOffset() + world.rand.nextDouble() * 0.02D, 0.05D, 0.05D * (double)direction1.getZOffset() + world.rand.nextDouble() * 0.02D);
		        ItemEntity itementity2 = new ItemEntity(world, (double)pos.getX() + 0.5D + (double)direction1.getXOffset() * 0.65D, (double)pos.getY() + 0.1D, (double)pos.getZ() + 0.5D + (double)direction1.getZOffset() * 0.65D, new ItemStack(Items.GUNPOWDER, 2));
		        itementity.setMotion(0.05D * (double)direction1.getXOffset() + world.rand.nextDouble() * 0.02D, 0.05D, 0.05D * (double)direction1.getZOffset() + world.rand.nextDouble() * 0.02D);
				world.addEntity(itementity);
				world.addEntity(itementity2);
			//Sound, Animation, and Item Damage.
				player.swingArm(event.getHand());
				world.playSound(event.getPlayer(), pos, SoundEvents.BLOCK_GRASS_BREAK, SoundCategory.BLOCKS, 1.0F, 1.0F);
				stack.damageItem(1, player, null);
				event.setCanceled(true);
		}
	}
}
