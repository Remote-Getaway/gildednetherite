package com.remotegetaway.gildednetherite.items;


import com.remotegetaway.gildednetherite.materials.GildedNetheriteArmorMaterial;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.remotegetaway.gildednetherite.items.GildedNetheriteTemplateItem.GILDED_NETHERITE_TEMPLATE;


public class ModItems {

	private static final String MODID = "gildednetherite";

	public static final Item GILDED_NETHERITE = new Item(new Item.Settings().fireproof());

	public static final Item GOLDEN_PORKCHOP = new GoldenPorkChopItem(new Item.Settings().food(FoodComponents.COOKED_PORKCHOP));

	public static final Item GILDED_NETHERITE_HELMET =  new GildedNetheriteItem(GildedNetheriteArmorMaterial.GILDED_NETHERITE_ARMOR, ArmorItem.ArmorSlot.HELMET, (new Item.Settings().fireproof()));
	public static final Item GILDED_NETHERITE_CHESTPLATE = new GildedNetheriteItem(GildedNetheriteArmorMaterial.GILDED_NETHERITE_ARMOR, ArmorItem.ArmorSlot.CHESTPLATE, (new Item.Settings().fireproof()));
	public static final Item GILDED_NETHERITE_LEGGINGS = new GildedNetheriteItem(GildedNetheriteArmorMaterial.GILDED_NETHERITE_ARMOR, ArmorItem.ArmorSlot.LEGGINGS, (new Item.Settings().fireproof()));
	public static final Item GILDED_NETHERITE_BOOTS = new GildedNetheriteItem(GildedNetheriteArmorMaterial.GILDED_NETHERITE_ARMOR, ArmorItem.ArmorSlot.BOOTS, (new Item.Settings().fireproof()));


	public static void register() {
		Registry.register(Registries.ITEM, new Identifier(MODID, "gilded_netherite"), GILDED_NETHERITE);

		Registry.register(Registries.ITEM, new Identifier(MODID, "gilded_netherite_helmet"), GILDED_NETHERITE_HELMET);
		Registry.register(Registries.ITEM, new Identifier(MODID, "gilded_netherite_chestplate"), GILDED_NETHERITE_CHESTPLATE);
		Registry.register(Registries.ITEM, new Identifier(MODID, "gilded_netherite_leggings"), GILDED_NETHERITE_LEGGINGS);
		Registry.register(Registries.ITEM, new Identifier(MODID, "gilded_netherite_boots"), GILDED_NETHERITE_BOOTS);

		Registry.register(Registries.ITEM, new Identifier(MODID, "golden_porkchop"), GOLDEN_PORKCHOP);

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> entries.addAfter(Items.NETHERITE_INGOT, GILDED_NETHERITE));
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINKS).register(entries -> entries.addAfter(Items.COOKED_PORKCHOP, GOLDEN_PORKCHOP));
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> entries.addAfter(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, GILDED_NETHERITE_TEMPLATE));

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> entries.addAfter(
			Items.NETHERITE_BOOTS, GILDED_NETHERITE_HELMET, GILDED_NETHERITE_CHESTPLATE, GILDED_NETHERITE_LEGGINGS, GILDED_NETHERITE_BOOTS));


}
}
