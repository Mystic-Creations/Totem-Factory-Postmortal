package marcos.mysticcreations.totemfactory.init;

import marcos.mysticcreations.totemfactory.blocks.TumbagaBlock;
import net.minecraft.core.registries.Registries;
import marcos.mysticcreations.totemfactory.TotemFactory;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class TfBlocks {
    public static final DeferredRegister<Block> REGISTER = DeferredRegister.create(Registries.BLOCK, TotemFactory.MODID);

    public static final DeferredHolder<Block, TumbagaBlock> TUMBAGA_BLOCK = REGISTER.register("tumbaga_block", TumbagaBlock::new);
}