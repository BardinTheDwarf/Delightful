package net.brdle.delightful.common.tile;

import net.brdle.delightful.Delightful;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class DelightfulTiles {

    private static final DeferredRegister<BlockEntityType<?>> TILES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, Delightful.MODID);

    public static void create(IEventBus bus) {
        TILES.register(bus);
    }
}
