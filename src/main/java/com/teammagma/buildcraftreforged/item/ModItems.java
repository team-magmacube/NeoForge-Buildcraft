package com.teammagma.buildcraftreforged.item;

import com.teammagma.buildcraftreforged.*;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BuildCraftReforged.MOD_ID);

    public static final DeferredItem<Item> WoodenGear = ITEMS.register("woodengear",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> StoneGear = ITEMS.register("stonegear",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> IronGear = ITEMS.register("irongear",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> GoldGear = ITEMS.register("goldgear",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> DiamondGear = ITEMS.register("diamondgear",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
