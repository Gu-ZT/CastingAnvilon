package dev.anvilcraft.anvilon

import com.mojang.logging.LogUtils
import com.tterrag.registrate.Registrate
import dev.anvilcraft.anvilon.data.ModDatagen
import dev.anvilcraft.anvilon.init.AddonBlocks
import dev.anvilcraft.anvilon.init.AddonItemGroups
import dev.anvilcraft.anvilon.init.AddonItems
import dev.anvilcraft.lib.config.ConfigManager
import net.minecraft.resources.ResourceLocation
import net.neoforged.bus.api.IEventBus
import net.neoforged.fml.ModContainer
import net.neoforged.fml.common.Mod
import org.jetbrains.annotations.NotNull
import org.slf4j.Logger

@Mod(AnvilCraftCastingAnvilon.MOD_ID)
class AnvilCraftCastingAnvilon(modEventBus: IEventBus, modContainer: ModContainer) {
    companion object {
        const val MOD_ID: String = "anvilcraft_casting_anvilon"
        val LOGGER: Logger = LogUtils.getLogger()
        val CONFIG: AnvilCraftCastingAnvilonConfig = ConfigManager.register(MOD_ID, ::AnvilCraftCastingAnvilonConfig)
        val REGISTRATE: Registrate = Registrate.create(MOD_ID)

        @NotNull
        fun of(path: String): ResourceLocation {
            return ResourceLocation.fromNamespaceAndPath(MOD_ID, path)
        }
    }

    init {
        AddonItemGroups.register(modEventBus)
        AddonBlocks.register()
        AddonItems.register()
        ModDatagen.init()
    }
}