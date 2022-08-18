package net.darky.pappimod.block;

import net.darky.pappimod.PappiMod;
import net.darky.pappimod.block.custom.SpeedyBlock;
import net.darky.pappimod.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ModBlocks {

    public static final Block MYTHRIL_BLOCK =
            registerBlock("mythril_block", new Block(FabricBlockSettings.of(Material.METAL).strength(5.5f).requiresTool()), ModItemGroup.MYTHRIL
                    , "tooltip.pappimod.mythril_block");
    public static final Block MYTHRIL_ORE =
            registerBlock("mythril_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroup.MYTHRIL);
    public static final Block RAW_MYTHRIL_BLOCK =
            registerBlock("raw_mythril_block", new Block(FabricBlockSettings.of(Material.STONE).strength(5f).requiresTool()), ModItemGroup.MYTHRIL);
    public static final Block DEEPSLATE_MYTHRIL_ORE =
            registerBlock("deepslate_mythril_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ModItemGroup.MYTHRIL);
    public static final Block NETHERRACK_MYTHRIL_ORE =
            registerBlock("netherrack_mythril_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(3.5f).requiresTool()), ModItemGroup.MYTHRIL);

    public static final Block SPEEDY_BLOCK =
            registerBlock("speedy_block", new SpeedyBlock(FabricBlockSettings.of(Material.STONE).strength(3.5f).requiresTool()), ModItemGroup.MYTHRIL);

    private static Block registerBlock(String name, Block block, ItemGroup group, String tooltipKey) {
        registerBlockItem(name, block, group, tooltipKey);
        return Registry.register(Registry.BLOCK, new Identifier(PappiMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group, String tooltipKey) {
        return Registry.register(Registry.ITEM, new Identifier(PappiMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(group)) {
            @Override
            public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                tooltip.add(new TranslatableText(tooltipKey));
            }
        });
    }

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(PappiMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(PappiMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        PappiMod.LOGGER.info("Registering Mod Blocks for " + PappiMod.MOD_ID);
    }
}
