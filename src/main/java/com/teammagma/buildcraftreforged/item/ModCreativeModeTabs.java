package com.teammagma.buildcraftreforged.item;

import com.teammagma.buildcraftreforged.BuildCraftReforged;
import com.teammagma.buildcraftreforged.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, com.teammagma.buildcraftreforged.BuildCraftReforged.MOD_ID);

    public static final Supplier<CreativeModeTab> BuildCraftReforged = CREATIVE_MODE_TAB.register("buildcraft_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.Quarry_Block.get()))
                    .title(Component.translatable("creativetab.buildcraftreforged.buildcraftreforged"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.Quarry_Block);
                        output.accept(ModBlocks.Pump_Block);
                        output.accept(ModItems.DiamondGear);
                        output.accept(ModItems.GoldGear);
                        output.accept(ModItems.IronGear);
                        output.accept(ModItems.StoneGear);
                        output.accept(ModItems.WoodenGear);
                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
