package com.remotegetaway.gildednetherite.items;


import com.remotegetaway.gildednetherite.materials.GildedNetheriteArmorMaterial;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

	private static final String MODID = "gildednetherite";

	public static final Item GILDED_NETHERITE = new Item(new Item.Settings().fireproof());

	public static final Item GILDED_NETHERITE_HELMET =  new GildedNetheriteItem(GildedNetheriteArmorMaterial.GILDED_NETHERITE_ARMOR, ArmorItem.ArmorSlot.HELMET, (new Item.Settings().fireproof()));
	public static final Item GILDED_NETHERITE_CHESTPLATE = new GildedNetheriteItem(GildedNetheriteArmorMaterial.GILDED_NETHERITE_ARMOR, ArmorItem.ArmorSlot.CHESTPLATE, (new Item.Settings().fireproof()));
	public static final Item GILDED_NETHERITE_LEGGINGS = new GildedNetheriteItem(GildedNetheriteArmorMaterial.GILDED_NETHERITE_ARMOR, ArmorItem.ArmorSlot.LEGGINGS, (new Item.Settings().fireproof()));
	public static final Item GILDED_NETHERITE_BOOTS = new GildedNetheriteItem(GildedNetheriteArmorMaterial.GILDED_NETHERITE_ARMOR, ArmorItem.ArmorSlot.BOOTS, (new Item.Settings().fireproof()));

	public static final Item GOLDEN_PORKCHOP = new GoldenPorkChopItem(new Item.Settings().food(FoodComponents.COOKED_PORKCHOP));


	public static void register() {
		Registry.register(Registries.ITEM, new Identifier(MODID, "gilded_netherite"), GILDED_NETHERITE);

		Registry.register(Registries.ITEM, new Identifier(MODID, "gilded_netherite_helmet"), GILDED_NETHERITE_HELMET);
		Registry.register(Registries.ITEM, new Identifier(MODID, "gilded_netherite_chestplate"), GILDED_NETHERITE_CHESTPLATE);
		Registry.register(Registries.ITEM, new Identifier(MODID, "gilded_netherite_leggings"), GILDED_NETHERITE_LEGGINGS);
		Registry.register(Registries.ITEM, new Identifier(MODID, "gilded_netherite_boots"), GILDED_NETHERITE_BOOTS);

		Registry.register(Registries.ITEM, new Identifier(MODID, "golden_porkchop"), GOLDEN_PORKCHOP);


		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> entries.addItem(GILDED_NETHERITE_HELMET));
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> entries.addItem(GILDED_NETHERITE_CHESTPLATE));
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> entries.addItem(GILDED_NETHERITE_LEGGINGS));
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> entries.addItem(GILDED_NETHERITE_BOOTS));

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS_AND_UTILITIES).register(entries -> entries.addItem(GILDED_NETHERITE));

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINKS).register(entries -> entries.addItem(GOLDEN_PORKCHOP));
}
}
