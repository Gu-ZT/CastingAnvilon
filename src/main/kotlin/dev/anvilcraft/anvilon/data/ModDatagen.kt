package dev.anvilcraft.anvilon.data

import com.tterrag.registrate.providers.ProviderType
import dev.anvilcraft.anvilon.AnvilCraftCastingAnvilon
import dev.anvilcraft.anvilon.data.lang.LangHandler
import net.neoforged.bus.api.SubscribeEvent
import net.neoforged.fml.common.EventBusSubscriber
import net.neoforged.neoforge.data.event.GatherDataEvent

@EventBusSubscriber(modid = AnvilCraftCastingAnvilon.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
class ModDatagen {
    companion object {
        @SubscribeEvent
        @JvmStatic
        fun gatherData(event: GatherDataEvent) {
        }

        /**
         * 初始化生成器
         */
        fun init() {
            AnvilCraftCastingAnvilon.REGISTRATE.addDataGenerator(ProviderType.LANG, LangHandler.Companion::init)
        }
    }
}