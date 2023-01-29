package com.irosueun.gildednetherite.items;


import com.irosueun.gildednetherite.materials.GildedNetheriteArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

	private static final String MODID = "gildednetherite";

	public static final Item GILDED_NETHERITE = new Item(new Item.Settings().fireproof());

	public static final Item GILDED_NETHERITE_HELMET =  new GildedNetheriteItem(GildedNetheriteArmorMaterial.GILDED_NETHERITE_ARMOR, EquipmentSlot.HEAD, (new Item.Settings().fireproof()));
	public static final Item GILDED_NETHERITE_CHESTPLATE = new GildedNetheriteItem(GildedNetheriteArmorMaterial.GILDED_NETHERITE_ARMOR, EquipmentSlot.CHEST, (new Item.Settings().fireproof()));
	public static final Item GILDED_NETHERITE_LEGGINGS = new GildedNetheriteItem(GildedNetheriteArmorMaterial.GILDED_NETHERITE_ARMOR, EquipmentSlot.LEGS, (new Item.Settings().fireproof()));
	public static final Item GILDED_NETHERITE_BOOTS = new GildedNetheriteItem(GildedNetheriteArmorMaterial.GILDED_NETHERITE_ARMOR, EquipmentSlot.FEET, (new Item.Settings().fireproof()));

	public static final Item GOLDEN_PORKCHOP = new GoldenPorkChopItem(new Item.Settings().food(FoodComponents.COOKED_PORKCHOP));


	public static void register() {

		Registry.register(Registries.ITEM, new Identifier(MODID, "gilded_netherite"), GILDED_NETHERITE);

		Registry.register(Registries.ITEM, new Identifier(MODID, "gilded_netherite_helmet"), GILDED_NETHERITE_HELMET);
		Registry.register(Registries.ITEM, new Identifier(MODID, "gilded_netherite_chestplate"), GILDED_NETHERITE_CHESTPLATE);
		Registry.register(Registries.ITEM, new Identifier(MODID, "gilded_netherite_leggings"), GILDED_NETHERITE_LEGGINGS);
		Registry.register(Registries.ITEM, new Identifier(MODID, "gilded_netherite_boots"), GILDED_NETHERITE_BOOTS);

		Registry.register(Registries.ITEM, new Identifier(MODID, "golden_porkchop"), GOLDEN_PORKCHOP);

}
}
