package owmii.losttrinkets.item.trinkets;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import owmii.losttrinkets.api.trinket.ITickableTrinket;
import owmii.losttrinkets.api.trinket.Rarity;
import owmii.losttrinkets.api.trinket.Trinket;

public class ThaSpiritTrinket extends Trinket<ThaSpiritTrinket> implements ITickableTrinket {
    public ThaSpiritTrinket(Rarity rarity, Settings properties) {
        super(rarity, properties);
    }

    @Override
    public void tick(World world, BlockPos pos, PlayerEntity player) {
        if (!world.isClient && player.getHealth() <= 2.0F && player.age % 90 == 0) {
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 300, 1, false, false));
        }
    }
}
