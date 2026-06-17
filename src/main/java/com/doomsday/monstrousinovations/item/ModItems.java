package com.doomsday.monstrousinovations.item;

import com.doomsday.monstrousinovations.MonstrousInovations;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MonstrousInovations.MODID);

    // Monstrous Gem - dropped from Monstrous Ore, used as a crafting material
    public static final DeferredItem<Item> MONSTROUS_GEM = ITEMS.registerSimpleItem("monstrous_gem", new Item.Properties());

    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
}
