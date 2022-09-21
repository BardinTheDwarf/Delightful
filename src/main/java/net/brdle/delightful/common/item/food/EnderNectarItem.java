package net.brdle.delightful.common.item.food;

import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.piglin.PiglinAi;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.NetworkHooks;
import vectorwing.farmersdelight.common.registry.ModEffects;

public class EnderNectarItem extends DrinkItem {
    public EnderNectarItem(Properties properties) {
        super(properties, ModEffects.NOURISHMENT, 2400, 0);
    }

    @Override
    public void affectConsumer(ItemStack stack, Level worldIn, LivingEntity consumer) {
        super.affectConsumer(stack, worldIn, consumer);
        if (consumer instanceof ServerPlayer player) {
            NetworkHooks.openGui(player, new SimpleMenuProvider((i, inv, p) -> new ChestMenu(MenuType.GENERIC_9x3, i, inv, p.getEnderChestInventory(), 3) {
                @Override
                public boolean stillValid(Player pPlayer) {
                    return true;
                }
            }, new TranslatableComponent("container.enderchest")));
            player.awardStat(Stats.OPEN_ENDERCHEST);
            PiglinAi.angerNearbyPiglins(player, true);
        }
    }
}
