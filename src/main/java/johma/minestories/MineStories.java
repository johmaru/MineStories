package johma.minestories;

import com.mojang.logging.LogUtils;
import johma.minestories.block.MsBlock;
import johma.minestories.event.MsCreativeMode;
import johma.minestories.item.CoinItem;
import net.minecraft.client.Minecraft;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

@Mod(MineStories.MODID)
public class MineStories {

    public static final String MODID = "minestories";

    private static final Logger LOGGER = LogUtils.getLogger();
    public MineStories(){

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        startingMsg();

        IEventBus forgeBus = MinecraftForge.EVENT_BUS;

        CoinItem.MsItem.register(modEventBus);

        MsCreativeMode.TABS.register(modEventBus);

        MsBlock.BLOCKS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

    }

    private void setup(FMLCommonSetupEvent event){

    }

    private void startingMsg(){

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("server is starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
