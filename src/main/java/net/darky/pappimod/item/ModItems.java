package net.darky.pappimod.item;

import net.darky.pappimod.PappiMod;
import net.darky.pappimod.item.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {

    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot", new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL)));
    public static final Item MYTHRIL_NUGGET = registerItem("mythril_nugget", new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL)));
    public static final Item RAW_MYTHRIL = registerItem("raw_mythril", new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL)));

    public static final Item DOWSING_ROD = registerItem("dowsing_rod", new DowsingRodItem(new FabricItemSettings().group(ModItemGroup.MYTHRIL).maxDamage(16)));

    public static final Item LILAC_FLOWER_BULB = registerItem("lilac_flower_bulb", new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL)));

    public static final Item GRAPE = registerItem("grape", new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL).food(ModFoodComponents.GRAPE)));

    public static final Item MYTHRIL_SWORD = registerItem("mythril_sword"
            , new ModSlownessSwordItem(ModToolMaterials.MYTHRIL, 3, -1.9f, new FabricItemSettings().group(ModItemGroup.MYTHRIL)));
    public static final Item MYTHRIL_AXE = registerItem("mythril_axe"
            , new ModAxeItem(ModToolMaterials.MYTHRIL, 6, -2.5f, new FabricItemSettings().group(ModItemGroup.MYTHRIL)));
    public static final Item MYTHRIL_HOE = registerItem("mythril_hoe"
            , new SwordItem(ModToolMaterials.MYTHRIL, 0, 0.5f, new FabricItemSettings().group(ModItemGroup.MYTHRIL)));
    public static final Item MYTHRIL_SHOVEL = registerItem("mythril_shovel"
            , new ShovelItem(ModToolMaterials.MYTHRIL, 0, -2.5f, new FabricItemSettings().group(ModItemGroup.MYTHRIL)));
    public static final Item MYTHRIL_PICKAXE = registerItem("mythril_pickaxe"
            , new ModPickaxeItem(ModToolMaterials.MYTHRIL, 1, -2.5f, new FabricItemSettings().group(ModItemGroup.MYTHRIL)));

    public static final Item MYTHRIL_HELMET = registerItem("mythril_helmet"
            , new ModArmorItem(ModArmorMaterials.MYTHRIL, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.MYTHRIL)));
    public static final Item MYTHRIL_CHESTPLATE = registerItem("mythril_chestplate"
            , new ArmorItem(ModArmorMaterials.MYTHRIL, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.MYTHRIL)));
    public static final Item MYTHRIL_LEGGINGS = registerItem("mythril_leggings"
            , new ArmorItem(ModArmorMaterials.MYTHRIL, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.MYTHRIL)));
    public static final Item MYTHRIL_BOOTS = registerItem("mythril_boots"
            , new ArmorItem(ModArmorMaterials.MYTHRIL, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.MYTHRIL)));

    public static final Item MAGIC_MYTHRIL_DUST = registerItem("magic_mythril_dust", new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL)));

    public static final Item DATA_TABLET = registerItem("data_tablet", new DataTabletItem(new FabricItemSettings().group(ModItemGroup.MYTHRIL).maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(PappiMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PappiMod.LOGGER.info("Registering Mod Items for " + PappiMod.MOD_ID);
    }
}
