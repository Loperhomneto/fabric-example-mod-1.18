package net.darky.pappimod.util;

import net.darky.pappimod.PappiMod;
import net.darky.pappimod.item.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModRegistries {

    public static void registerModStuff() {
        registerFuels();
    }

    private static void registerFuels() {
        PappiMod.LOGGER.info("Registering Fuels for " + PappiMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.LILAC_FLOWER_BULB, 200);
    }

}
