// Copyright 2026, shso contributors
// SPDX-License-Identifier: GPL-3.0-or-later

package com.mixradio.droid.ui.theme

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Brush

/**
 * 暖米白背景（替换原极光玻璃背景）。
 *
 * 只有一层极浅的竖向渐变：#F8F6F1 → #F1EFE7。
 * 分层交给白色卡片 + 发丝描边，不再用光晕。
 */
fun Modifier.auroraBackground(): Modifier = this.drawBehind {
    drawRect(
        brush = Brush.verticalGradient(
            0.00f to AuroraTokens.AuroraTop,
            0.55f to AuroraTokens.AuroraMid,
            1.00f to AuroraTokens.AuroraBottom,
        )
    )
}
