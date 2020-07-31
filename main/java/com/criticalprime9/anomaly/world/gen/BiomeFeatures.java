package com.criticalprime9.anomaly.world.gen;

import com.criticalprime9.anomaly.init.blocks.BlockInit;

import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class BiomeFeatures {
	public static final BlockState BLUE_GRANITE = BlockInit.BLUE_GRANITE.get().getDefaultState();
	
	public static void addStoneVariants() {
		for(Biome biome : ForgeRegistries.BIOMES)
		biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BLUE_GRANITE, 33)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 0, 0, 80))));
	}

}
