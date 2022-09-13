package com.irosueun.gildednetherite;

import com.google.common.collect.Lists;
import com.irosueun.gildednetherite.items.RegisterItems;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.quiltmc.qsl.item.group.api.QuiltItemGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

import static com.irosueun.gildednetherite.items.RegisterItems.GILDED_NETHERITE;

public class GildedNetherite implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("Gilded Netherite started");

	public static final QuiltItemGroup GILDED_NETHERITE_GROUP =
			QuiltItemGroup.builder(
					new Identifier("gildednetherite", "gilded_netherite_group"))
					.build();

	public static final ArrayList<DamageSource> DAMAGE_SOURCES = Lists.newArrayList(
			DamageSource.HOT_FLOOR,
			DamageSource.IN_FIRE,
			DamageSource.LAVA,
			DamageSource.LIGHTNING_BOLT,
			DamageSource.ON_FIRE
	);

	@Override
	public void onInitialize(ModContainer mod) {
		RegisterItems.register();

		GILDED_NETHERITE_GROUP.setIcon(GILDED_NETHERITE);
	}



}
