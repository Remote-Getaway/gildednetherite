package com.irosueun.gildednetherite;

import com.google.common.collect.Lists;

import com.irosueun.gildednetherite.items.ModItems;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

import java.util.ArrayList;
import java.util.Objects;

public class GildedNetherite implements ModInitializer {

	private static final String MODID = "gildednetherite";

	private static Item GILDED_NETHERITE;

	private static Item GILDED_NETHERITE_HELMET;
	private static Item GILDED_NETHERITE_CHESTPLATE;
	private static Item GILDED_NETHERITE_LEGGINGS;
	private static Item GILDED_NETHERITE_BOOTS;

	private static Item GOLDEN_PORKCHOP;

	private static final ItemGroup GILDED_NEHTERITE_GROUP = FabricItemGroup.builder(new Identifier(MODID, "gilded_netherite_group"))
			.icon(() -> new ItemStack(ModItems.GILDED_NETHERITE))
			.entries((enabledFeatures, entries, operatorEnabled) -> {
				entries.addItem(ModItems.GILDED_NETHERITE);

				entries.addItem(ModItems.GILDED_NETHERITE_HELMET);
				entries.addItem(ModItems.GILDED_NETHERITE_CHESTPLATE);
				entries.addItem(ModItems.GILDED_NETHERITE_LEGGINGS);
				entries.addItem(ModItems.GILDED_NETHERITE_BOOTS);

				entries.addItem(ModItems.GOLDEN_PORKCHOP);
			})
			.build();

	@Override
	public void onInitialize(ModContainer mod) {

		ModItems.register();

		assert Objects.equals(ItemGroups.HOTBAR.getId().toString(), "minecraft:hotbar");
		assert Objects.equals(GILDED_NEHTERITE_GROUP.getId().toString(), "gildednetherite:gilded_netherite_group");
	}

public static final ArrayList<DamageSource> DAMAGE_SOURCES = Lists.newArrayList(
			DamageSource.HOT_FLOOR,
			DamageSource.IN_FIRE,
			DamageSource.LAVA,
			DamageSource.LIGHTNING_BOLT,
			DamageSource.ON_FIRE
	);

}
