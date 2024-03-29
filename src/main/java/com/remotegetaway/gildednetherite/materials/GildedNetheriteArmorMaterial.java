package com.remotegetaway.gildednetherite.materials;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import static net.minecraft.item.Items.NETHERITE_INGOT;

public enum GildedNetheriteArmorMaterial implements ArmorMaterial {
    GILDED_NETHERITE_ARMOR("gilded_netherite_armor", 40, new int[]{4, 7, 9, 4}, 15,
                   SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.5F, 0.1F, NETHERITE_INGOT);

	private final String name;
    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private final int durability, enchantability;
    private final int[] slotProtections;
    private final SoundEvent sound;
    private final float toughness, knockbackResistance;
    private final Item repairIngredient;

    private GildedNetheriteArmorMaterial(String name, int durability, int[] slotProtections, int enchantability, SoundEvent sound, float toughness, float knockbackResistance, Item repairIngredient) {
        this.name = name;
        this.durability = durability;
        this.slotProtections = slotProtections;
        this.enchantability = enchantability;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }


    @Override
    public int getDurability(ArmorItem.ArmorSlot slot) {
        return BASE_DURABILITY[slot.ordinal()] * this.durability;
    }

    @Override
    public int getProtection(ArmorItem.ArmorSlot slot) {
        return this.slotProtections[slot.ordinal()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.sound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofStacks(this.repairIngredient.getDefaultStack());
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
