package dev.anvilcraft.anvilon.init

import com.tterrag.registrate.util.entry.ItemEntry
import dev.anvilcraft.anvilon.AnvilCraftCastingAnvilon.Companion.REGISTRATE
import net.minecraft.world.item.Item

class AddonItems {
    @Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
    companion object {
        init {
            REGISTRATE.defaultCreativeTab(AddonItemGroups.ADDON_ITEMS.key)
        }

        // 砧子重铸演算机
        val CASTING_ANVILON_DEVICE: ItemEntry<Item> = REGISTRATE
            .item("casting_anvilon_device") { Item(it) }
            .register()

        fun register() {
        }
    }
}