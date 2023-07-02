package johma.minestories.block;

import johma.minestories.MineStories;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MsBlock {

        public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MineStories.MODID);

        public static final RegistryObject<Block> ATM = BLOCKS.register ("atmblock", () -> new Block(BlockBehaviour.Properties.of()));

    }
