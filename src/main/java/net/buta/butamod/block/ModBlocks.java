package net.buta.butamod.block;

import net.buta.butamod.ButaMod;
import net.buta.butamod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ButaMod.MOD_ID);

    public static final RegistryObject<Block> BUTA_IRON_BLOCK = registerBlock("buta_iron_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> RAW_BUTA_IRON_BLOCK = registerBlock("raw_buta_iron_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)));
    public static final RegistryObject<Block> BUTA_IRON_ORE = registerBlock("buta_iron_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f)
                    .requiresCorrectToolForDrops(), UniformInt.of(3,6)
            ));
    public static final RegistryObject<Block> DEEPSLATE_BUTA_IRON_ORE = registerBlock("deepslate_buta_iron_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(2.5f)
                    .requiresCorrectToolForDrops(), UniformInt.of(4,7)
            ));
    public static final RegistryObject<Block> NETHERRACK_BUTA_IRON_ORE = registerBlock("netherrack_buta_iron_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops(), UniformInt.of(4,6)
            ));
    public static final RegistryObject<Block> END_STONE_BUTA_IRON_ORE = registerBlock("end_stone_buta_iron_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE)
                    .strength(3f)
                    .requiresCorrectToolForDrops(), UniformInt.of(6,9)
            ));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
