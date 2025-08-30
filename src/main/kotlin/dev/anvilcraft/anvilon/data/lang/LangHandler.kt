package dev.anvilcraft.anvilon.data.lang

import com.tterrag.registrate.providers.RegistrateLangProvider
import dev.anvilcraft.anvilon.AnvilCraftCastingAnvilonConfig
import dev.anvilcraft.lib.config.ConfigData

class LangHandler {
    companion object {
        /**
         * 语言文件初始化
         *
         * @param provider 提供器
         */
        fun init(provider: RegistrateLangProvider) {
            ConfigData.readConfigClass(provider, AnvilCraftCastingAnvilonConfig::class.java)
        }
    }
}