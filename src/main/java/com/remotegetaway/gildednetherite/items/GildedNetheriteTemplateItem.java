package com.remotegetaway.gildednetherite.items;

import com.remotegetaway.gildednetherite.GildedNetherite;
import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

import java.util.List;

public class GildedNetheriteTemplateItem {

	public static final List<Identifier> armorTrimEmptyBaseSlotTextures = List.of(
		new Identifier("item/empty_armor_slot_helmet"),
		new Identifier("item/empty_armor_slot_chestplate"),
		new Identifier("item/empty_armor_slot_leggings"),
		new Identifier("item/empty_armor_slot_boots"));

	public static final List<Identifier> armorTrimEmptyAdditionsSlotTextures = List.of(
		new Identifier("item/empty_slot_gilded_netherite"));


	public static final Text GILDED_NETHERITE_UPGRADE_APPLIES_TO_TEXT = Text.translatable("item.gildednetherite.smithing_template.gilded_netherite_upgrade.applies_to").formatted(Formatting.BLUE);
	public static final Text GILDED_NETHERITE_UPGRADE_INGREDIENTS_TEXT = Text.translatable("item.gildednetherite.smithing_template.gilded_netherite_upgrade.ingredients").formatted(Formatting.BLUE);
	public static final Text GILDED_NETHERITE_UPGRADE_BASE_SLOT_TEXT = Text.translatable("item.gildednetherite.smithing_template.gilded_netherite_upgrade.base_slot_description");
	public static final Text GILDED_NETHERITE_UPGRADE_ADDITIONS_SLOT_TEXT = Text.translatable("item.gildednetherite.smithing_template.gilded_netherite_upgrade.additions_slot_description");
	public static final Formatting DESC_FORMATTING = Formatting.GRAY;

	public static final SmithingTemplateItem GILDED_NETHERITE_TEMPLATE = registerItem("gilded_netherite_template",
	new SmithingTemplateItem(GILDED_NETHERITE_UPGRADE_APPLIES_TO_TEXT, GILDED_NETHERITE_UPGRADE_INGREDIENTS_TEXT, Text.translatable("Gilded Netherite Upgrade").formatted(DESC_FORMATTING),
		GILDED_NETHERITE_UPGRADE_BASE_SLOT_TEXT, GILDED_NETHERITE_UPGRADE_ADDITIONS_SLOT_TEXT, armorTrimEmptyBaseSlotTextures, armorTrimEmptyAdditionsSlotTextures));


	private static SmithingTemplateItem registerItem(String name, SmithingTemplateItem item) {
		return Registry.register(Registries.ITEM, new Identifier(GildedNetherite.MOD_ID, name), item);
	}

	public static void registerModItems() {
		GildedNetherite.LOGGER.info("Registering items for mod" + GildedNetherite.MOD_ID);
	}
}
