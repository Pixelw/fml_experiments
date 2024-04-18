package tech.pixelw.aiorepo

import net.minecraft.world.level.block.Block
import net.minecraft.world.level.material.MapColor

class ItemsPortal(private val properties: Properties) : Block(properties) {

    init {
        properties.apply {
            mapColor(MapColor.COLOR_GRAY)

        }
    }

}
