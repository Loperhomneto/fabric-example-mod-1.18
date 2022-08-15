package net.darky.pappimod;

import net.darky.pappimod.block.ModBlocks;
import net.darky.pappimod.item.ModItems;
import net.darky.pappimod.util.ModRegistries;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PappiMod implements ModInitializer {
	public static final String MOD_ID = "pappimod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModStuff();

	}
}
