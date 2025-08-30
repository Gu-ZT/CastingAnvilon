package dev.anvilcraft.anvilon.init

import com.tterrag.registrate.util.entry.BlockEntry
import dev.anvilcraft.anvilon.AnvilCraftCastingAnvilon.Companion.REGISTRATE
import net.minecraft.world.level.block.Block

class AddonBlocks {
    @Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
    companion object {
        init {
            REGISTRATE.defaultCreativeTab(AddonItemGroups.ADDON_ITEMS.key)
        }

        val EXAMPLE_BLOCK: BlockEntry<Block> = REGISTRATE
            .block("example_block") { Block(it) }
            .simpleItem()
            .register()

        fun register() {
        }
    }
}