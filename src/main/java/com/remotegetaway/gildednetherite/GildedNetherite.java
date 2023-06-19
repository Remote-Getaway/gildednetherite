package com.remotegetaway.gildednetherite;

import com.google.common.collect.Lists;
import com.remotegetaway.gildednetherite.items.ModItems;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.fabricmc.fabric.impl.itemgroup.FabricItemGroupBuilderImpl;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.item.*;
import net.minecraft.registry.Holder;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static net.minecraft.entity.damage.DamageTypes.*;


public class GildedNetherite implements ModInitializer {

	public static final String MOD_ID = "gildednetherite";

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

	public static final TagKey<DamageType> INVULNERABLE_DAMAGE_TAG =
		TagKey.of(RegistryKeys.DAMAGE_TYPE,
			new Identifier("gildednetherite", "gilded_netherite_armor_invulnerable_to"));

}
