package com.doomsday.monstrousinovations.block;

import com.doomsday.monstrousinovations.MonstrousInovations;
import com.doomsday.monstrousinovations.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MonstrousInovations.MODID);

    // Monstrous Ore - drops Monstrous Gem, requires iron pickaxe or better
    public static final DeferredBlock<Block> MONSTROUS_ORE = BLOCKS.registerSimpleBlock("monstrous_ore",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .strength(3.0f, 3.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE));

    // Block item for the ore
    public static final DeferredItem<BlockItem> MONSTROUS_ORE_ITEM = ModItems.ITEMS.registerSimpleBlockItem("monstrous_ore", MONSTROUS_ORE);

    public static void register(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
    }
}
