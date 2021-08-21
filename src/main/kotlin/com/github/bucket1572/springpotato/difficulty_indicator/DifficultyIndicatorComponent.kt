package com.github.bucket1572.springpotato.difficulty_indicator

import com.github.bucket1572.springpotato.colors.ColorTag
import com.github.bucket1572.springpotato.difficulty_indicator.tag.DifficultyTag
import com.github.bucket1572.springpotato.difficulty_indicator.tag.getStyle
import com.github.bucket1572.springpotato.text_components.SpecialTextComponent
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.Style
import net.kyori.adventure.text.format.TextColor
import net.kyori.adventure.text.format.TextDecoration

sealed class DifficultyIndicatorComponent(val text: String, private val difficultyIndex: DifficultyTag) {
    fun getComponent(): Component {
        return Component.text(text).style(difficultyIndex.getStyle())
    }
}

data class EasyIndexComponent(val title: String): DifficultyIndicatorComponent(
    text = title,
    difficultyIndex = DifficultyTag.EASY
)

data class IntermediateIndexComponent(val title: String): DifficultyIndicatorComponent(
    text = title,
    difficultyIndex = DifficultyTag.INTERMEDIATE
)

data class HardIndexComponent(val title: String): DifficultyIndicatorComponent(
    text = title,
    difficultyIndex = DifficultyTag.HARD
)
