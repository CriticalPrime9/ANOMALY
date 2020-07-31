package com.criticalprime9.anomaly.init.blocks;

import com.criticalprime9.anomaly.Anomaly;
import com.criticalprime9.anomaly.objects.blocks.CustomStairsBlock;

import net.minecraft.block.Block;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Anomaly.MOD_ID);
	
	/**
	 * Blue Granite /&/ Polished Blue Granite
	 */
	public static final RegistryObject<Block> BLUE_GRANITE = BLOCKS.register("blue_granite", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)));
	public static final RegistryObject<Block> BLUE_GRANITE_STAIRS = BLOCKS.register("blue_granite_stairs", () -> new CustomStairsBlock(BlockInit.BLUE_GRANITE.get().getDefaultState(), Block.Properties.create(Material.ROCK).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> BLUE_GRANITE_WALL = BLOCKS.register("blue_granite_wall", () -> new WallBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)));
	public static final RegistryObject<Block> BLUE_GRANITE_SLAB = BLOCKS.register("blue_granite_slab", () -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)));
	public static final RegistryObject<Block> POLISHED_BLUE_GRANITE = BLOCKS.register("polished_blue_granite", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)));
	public static final RegistryObject<Block> POLISHED_BLUE_GRANITE_STAIRS = BLOCKS.register("polished_blue_granite_stairs", () -> new CustomStairsBlock(BlockInit.POLISHED_BLUE_GRANITE.get().getDefaultState(), Block.Properties.create(Material.ROCK).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> POLISHED_BLUE_GRANITE_SLAB = BLOCKS.register("polished_blue_granite_slab", () -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)));
	
	/**
	 * Quartered Stone Bricks
	 */
	public static final RegistryObject<Block> QUARTERED_STONE_BRICKS = BLOCKS.register("quartered_stone_bricks", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)));
	public static final RegistryObject<Block> QUARTERED_STONE_BRICK_STAIRS = BLOCKS.register("quartered_stone_brick_stairs", () -> new CustomStairsBlock(BlockInit.QUARTERED_STONE_BRICKS.get().getDefaultState(), Block.Properties.create(Material.ROCK).hardnessAndResistance(0.8F)));
	public static final RegistryObject<Block> QUARTERED_STONE_BRICK_SLAB = BLOCKS.register("quartered_stone_brick_slab", () -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)));
	public static final RegistryObject<Block> QUARTERED_STONE_BRICK_WALL = BLOCKS.register("quartered_stone_brick_wall", () -> new WallBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)));
	
	/**
	 * Black Nether Bricks
	 */
	public static final RegistryObject<Block> BLACK_NETHER_BRICKS = BLOCKS.register("black_nether_bricks", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 6.0F)));
	public static final RegistryObject<Block> BLACK_NETHER_BRICK_STAIRS = BLOCKS.register("black_nether_brick_stairs", () -> new CustomStairsBlock(BlockInit.BLACK_NETHER_BRICKS.get().getDefaultState(), Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 6.0F)));
	public static final RegistryObject<Block> BLACK_NETHER_BRICK_SLAB = BLOCKS.register("black_nether_brick_slab", () -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 6.0F)));
	public static final RegistryObject<Block> BLACK_NETHER_BRICK_WALL = BLOCKS.register("black_nether_brick_wall", () -> new WallBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 6.0F)));
	public static final RegistryObject<Block> BLACK_NETHER_BRICK_FENCE = BLOCKS.register("black_nether_brick_fence", () -> new FenceBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 6.0F)));
	public static final RegistryObject<Block> CRACKED_BLACK_NETHER_BRICKS = BLOCKS.register("cracked_black_nether_bricks", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 6.0F)));
	public static final RegistryObject<Block> CHISELED_BLACK_NETHER_BRICKS = BLOCKS.register("chiseled_black_nether_bricks", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 6.0F)));

}
