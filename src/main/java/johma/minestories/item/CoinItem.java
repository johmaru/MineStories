package johma.minestories.item;

import johma.minestories.MineStories;
import johma.minestories.event.MsCreativeMode;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static johma.minestories.event.MsCreativeMode.addToTab;

public class CoinItem {
    public static final DeferredRegister<Item> MsItem = DeferredRegister.create(ForgeRegistries.ITEMS, MineStories.MODID);

    public static final RegistryObject<Item> oneMsCoin = addToTab(MsItem.register("onems_coin",
            () -> new Item(new Item.Properties()
                    .stacksTo(32)
                    .rarity(Rarity.COMMON)
            )));


    public static final RegistryObject<Item> tenMsCoin = addToTab(MsItem.register("tenms_coin",
            () -> new Item(new Item.Properties()
                    .stacksTo(32)
                    .rarity(Rarity.COMMON)
            )));

    public static final RegistryObject<Item> hundredMsCoin = addToTab(MsItem.register("hundred_coin",
            () -> new Item(new Item.Properties()
                    .stacksTo(32)
                    .rarity(Rarity.COMMON)
            )));

    public static final RegistryObject<Item> oneKMsCoin = addToTab(MsItem.register("onekms_coin",
            () -> new Item(new Item.Properties()
                    .stacksTo(32)
                    .rarity(Rarity.COMMON)
            )));

    public static final RegistryObject<Item> tenKMsCoin = addToTab(MsItem.register("tenkms_coin",
            () -> new Item(new Item.Properties()
                    .stacksTo(32)
                    .rarity(Rarity.COMMON)
            )));


}
