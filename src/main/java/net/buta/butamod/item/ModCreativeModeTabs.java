package net.buta.butamod.item;

import net.buta.butamod.ButaMod;
import net.buta.butamod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ButaMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BUTA_TAB = CREATIVE_MODE_TABS.register("buta_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BUTA_IRON_INGOT.get()))
                    .title(Component.translatable("creativetab.buta_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.BUTA_IRON_INGOT.get());
                        output.accept(ModItems.RAW_BUTA_IRON.get());
                        output.accept(ModBlocks.BUTA_IRON_BLOCK.get());
                        output.accept(ModBlocks.RAW_BUTA_IRON_BLOCK.get());
                        output.accept(ModBlocks.BUTA_IRON_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_BUTA_IRON_ORE.get());
                        output.accept(ModBlocks.NETHERRACK_BUTA_IRON_ORE.get());
                        output.accept(ModBlocks.END_STONE_BUTA_IRON_ORE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
