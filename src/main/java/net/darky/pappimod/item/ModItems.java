package net.darky.pappimod.item;

import net.darky.pappimod.PappiMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {

    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot", new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL)));
    public static final Item MYTHRIL_NUGGET = registerItem("mythril_nugget", new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL)));
    public static final Item RAW_MYTHRIL = registerItem("raw_mythril", new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(PappiMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PappiMod.LOGGER.info("Registering Mod Items for " + PappiMod.MOD_ID);
    }
}
