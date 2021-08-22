package com.github.bucket1572.springpotato.colors

import net.kyori.adventure.text.format.TextColor

enum class ColorTag(val red: Int, val green: Int, val blue: Int) {
    DESCRIPTION(255, 255, 255),
    COMMON_HANDLER_NAME(168, 43,217),
    ALERT(255,0,0),
    EASY(0,255,0),
    INTERMEDIATE(232,172,53),
    HARD(255,0,0),
    SUCCESS(0,255,0)
}

fun ColorTag.getTextColor(): TextColor = TextColor.color(red, green, blue)