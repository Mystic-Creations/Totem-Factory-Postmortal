package marcos.mysticcreations.totemfactory.equipment;

import marcos.mysticcreations.totemfactory.init.TfItems;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

public class TumbagaSword extends SwordItem {
    public TumbagaSword(Tier tier, Properties properties) {
        super(
            new Tier() {
                @Override public int getUses() { return 220; }
                @Override public float getSpeed() { return 1.6f; }
                @Override public float getAttackDamageBonus() { return 5; }
                @Override public TagKey<Block> getIncorrectBlocksForDrops() { return BlockTags.INCORRECT_FOR_IRON_TOOL; }
                @Override public int getEnchantmentValue() { return 14; }
                @Override public Ingredient getRepairIngredient() { return Ingredient.of(TfItems.TUMBAGA_ALLOY.get()); }
            }, new Properties().stacksTo(1).rarity(Rarity.COMMON)
        );
    }
}
