package com.remotegetaway.gildednetherite;

import com.google.common.collect.Lists;
import com.remotegetaway.gildednetherite.items.ModItems;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.fabricmc.fabric.impl.itemgroup.FabricItemGroupBuilderImpl;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.item.*;
import net.minecraft.registry.Holder;
import net.minecraft.util.Identifier;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

import java.util.ArrayList;
import java.util.Objects;

import static net.minecraft.entity.damage.DamageTypes.*;


public class GildedNetherite implements ModInitializer {

	private static final String MODID = "gildednetherite";

	private static Item GILDED_NETHERITE;

	private static Item GILDED_NETHERITE_HELMET;
	private static Item GILDED_NETHERITE_CHESTPLATE;
	private static Item GILDED_NETHERITE_LEGGINGS;
	private static Item GILDED_NETHERITE_BOOTS;

	private static Item GOLDEN_PORKCHOP;

	@Override
	public void onInitialize(ModContainer mod) {

		ModItems.register();
	}


public static final ArrayList<DamageSource> DAMAGE_SOURCES = Lists.newArrayList(
	new DamageSource((Holder<DamageType>) HOT_FLOOR),
	new DamageSource((Holder<DamageType>) IN_FIRE),
	new DamageSource((Holder<DamageType>) LAVA),
	new DamageSource((Holder<DamageType>) LIGHTNING_BOLT),
	new DamageSource((Holder<DamageType>) ON_FIRE)
	);

}
