package johma.minestories.event;

import johma.minestories.MineStories;
import johma.minestories.block.MsBlock;
import johma.minestories.item.CoinItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.flag.FeatureFlag;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

@Mod.EventBusSubscriber(modid = MineStories.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MsCreativeMode {

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MineStories.MODID);

    public static final List<Supplier<?extends ItemLike>> MS_TAB_ITEM = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> MsItem = TABS.register("msblock", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.MineStories_TAB"))
            .icon(CoinItem.oneMsCoin.get()::getDefaultInstance)
            .displayItems((displayParams, output) ->
             MS_TAB_ITEM.forEach(itemLike -> output.accept(itemLike.get())))
            .build()
    );
    public static <T extends Item> RegistryObject<T> addToTab(RegistryObject<T> itemLike){
        MS_TAB_ITEM.add(itemLike);
        return itemLike;
    }
}
