package dev.anvilcraft.anvilon.init

import dev.anvilcraft.anvilon.AnvilCraftCastingAnvilon
import dev.dubhe.anvilcraft.init.item.ModItemGroups
import net.minecraft.core.registries.Registries
import net.minecraft.world.item.CreativeModeTab
import net.neoforged.bus.api.IEventBus
import net.neoforged.neoforge.registries.DeferredHolder
import net.neoforged.neoforge.registries.DeferredRegister
import java.util.function.Supplier

class AddonItemGroups {
    companion object {
        val DEFERRED_REGISTER: DeferredRegister<CreativeModeTab?> = DeferredRegister.create<CreativeModeTab>(
            Registries.CREATIVE_MODE_TAB,
            AnvilCraftCastingAnvilon.MOD_ID
        )

        val ADDON_ITEMS: DeferredHolder<CreativeModeTab?, CreativeModeTab?> =
            DEFERRED_REGISTER.register<CreativeModeTab?>(
                "addon_items",
                Supplier {
                    CreativeModeTab.builder()
                        .icon { AddonItems.CASTING_ANVILON_DEVICE.asStack() }
                        .displayItems { _, _ -> }
                        .title(
                            AnvilCraftCastingAnvilon.REGISTRATE.addLang(
                                "itemGroup",
                                AnvilCraftCastingAnvilon.of("addon_items"),
                                "AnvilCraft: Casting Anvilon"
                            )
                        )
                        .withTabsBefore(ModItemGroups.ANVILCRAFT_BUILD_BLOCK.id)
                        .build()
                }
            )

        fun register(modEventBus: IEventBus) {
            DEFERRED_REGISTER.register(modEventBus)
        }
    }
}