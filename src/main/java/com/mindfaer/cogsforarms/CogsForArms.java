package com.mindfaer.cogsforarms;

import com.mojang.logging.LogUtils;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.slf4j.Logger;

@Mod(CogsForArms.MODID)
public class CogsForArms {
    public static final String MODID = "cogsforarms";
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final DeferredItem<Item> COPPER_PLATED_COG = ITEMS.registerSimpleItem("copper_plated_cog", new Item.Properties()
            );
    public static final DeferredItem<Item> SMALL_STOCK = ITEMS.registerSimpleItem("small_stock", new Item.Properties()
    );
    public static final DeferredItem<Item> LARGE_STOCK = ITEMS.registerSimpleItem("large_stock", new Item.Properties()
    );
    public static final DeferredItem<Item> BRASS_STOCK = ITEMS.registerSimpleItem("brass_stock", new Item.Properties()
    );
    public static final DeferredItem<Item> SHORT_BARREL = ITEMS.registerSimpleItem("short_barrel", new Item.Properties()
    );
    public static final DeferredItem<Item> LONG_BARREL = ITEMS.registerSimpleItem("long_barrel", new Item.Properties()
    );
    public static final DeferredItem<Item> AMMO_BOX = ITEMS.registerSimpleItem("ammo_box", new Item.Properties()
    );
    public static final DeferredItem<Item> CYLINDER = ITEMS.registerSimpleItem("cylinder", new Item.Properties()
    );
    public static final DeferredItem<Item> MAGAZINE = ITEMS.registerSimpleItem("magazine", new Item.Properties()
    );
    public static final DeferredItem<Item> TRIGGER = ITEMS.registerSimpleItem("trigger", new Item.Properties()
    );
    public static final DeferredItem<Item> IRON_BULLET_CASING = ITEMS.registerSimpleItem("iron_bullet_casing", new Item.Properties()
    );
    public static final DeferredItem<Item> BRASS_BULLET_CASING = ITEMS.registerSimpleItem("brass_bullet_casing", new Item.Properties()
    );

    //Create Incomplete Items
    public static final DeferredItem<Item> INCOMPLETE_CYLINDER = ITEMS.registerSimpleItem("incomplete_cylinder", new Item.Properties()
    );
    public static final DeferredItem<Item> INCOMPLETE_SIX_SHOOTER = ITEMS.registerSimpleItem("incomplete_six_shooter", new Item.Properties()
    );
    public static final DeferredItem<Item> INCOMPLETE_BLACKPOWDER_REVOLVER = ITEMS.registerSimpleItem("incomplete_blackpowder_revolver", new Item.Properties()
    );

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> COGS_TAB = CREATIVE_MODE_TABS.register("cogsforarmstab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.cogsforarms"))
            .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
            .icon(() -> COPPER_PLATED_COG.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(COPPER_PLATED_COG.get());
                output.accept(SMALL_STOCK.get());
                output.accept(LARGE_STOCK.get());
                output.accept(BRASS_STOCK.get());
                output.accept(SHORT_BARREL.get());
                output.accept(LONG_BARREL.get());
                output.accept(AMMO_BOX.get());
                output.accept(CYLINDER.get());
                output.accept(MAGAZINE.get());
                output.accept(TRIGGER.get());
                output.accept(IRON_BULLET_CASING.get());
                output.accept(BRASS_BULLET_CASING.get());
            }).build());

    public CogsForArms(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);
        ITEMS.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);
        NeoForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
}
