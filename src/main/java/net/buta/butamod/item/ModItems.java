package net.buta.butamod.item;

import net.buta.butamod.ButaMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ButaMod.MOD_ID);

    public static final RegistryObject<Item> BUTA_IRON_INGOT = ITEMS.register("buta_iron_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_BUTA_IRON = ITEMS.register("raw_buta_iron",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
