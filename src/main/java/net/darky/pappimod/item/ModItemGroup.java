package net.darky.pappimod.item;

import net.darky.pappimod.PappiMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup MYTHRIL = FabricItemGroupBuilder.build(new Identifier(PappiMod.MOD_ID, "mythril"), () -> new ItemStack(ModItems.MYTHRIL_INGOT));
}
