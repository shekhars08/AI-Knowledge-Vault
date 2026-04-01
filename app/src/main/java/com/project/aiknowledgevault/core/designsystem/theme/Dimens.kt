package com.project.aiknowledgevault.core.designsystem.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Centralized dimension system for AI Knowledge Vault app.
 * Follows a consistent spacing scale and provides semantic dimensions.
 */
@Immutable
data class AppDimens(
    // Spacing Scale (Recommended 4dp base grid)
    val spacing0: Dp,
    val spacing2: Dp,
    val spacing4: Dp,
    val spacing6: Dp,
    val spacing8: Dp,
    val spacing10: Dp,
    val spacing12: Dp,
    val spacing14: Dp,
    val spacing16: Dp,
    val spacing20: Dp,
    val spacing24: Dp,
    val spacing28: Dp,
    val spacing32: Dp,
    val spacing40: Dp,
    val spacing48: Dp,

    // Corner Radii
    val cornerExtraSmall: Dp,
    val cornerSmall: Dp,
    val cornerMedium: Dp,
    val cornerLarge: Dp,
    val cornerExtraLarge: Dp,

    // Elevation
    val elevation0: Dp,
    val elevation1: Dp,
    val elevation2: Dp,
    val elevation3: Dp,
    val elevation4: Dp,

    // Borders
    val borderThin: Dp,
    val borderRegular: Dp,

    // Icon Sizes
    val iconExtraSmall: Dp,
    val iconSmall: Dp,
    val iconMedium: Dp,
    val iconLarge: Dp,
    val iconExtraLarge: Dp,

    // Component Heights
    val buttonHeightSmall: Dp,
    val buttonHeightMedium: Dp,
    val buttonHeightLarge: Dp,
    val textFieldMinHeight: Dp,
    val chipHeight: Dp,

    // Layout Dimensions
    val topBarHeight: Dp,
    val bottomBarHeight: Dp,
    val cardMinHeight: Dp,

    // Screen Padding
    val screenHorizontalPadding: Dp,
    val screenVerticalPadding: Dp,

    // Utility
    val dividerThickness: Dp,
)

val DefaultAppDimens: AppDimens = AppDimens(
    // Spacing
    spacing0 = 0.dp,
    spacing2 = 2.dp,
    spacing4 = 4.dp,
    spacing6 = 6.dp,
    spacing8 = 8.dp,
    spacing10 = 10.dp,
    spacing12 = 12.dp,
    spacing14 = 14.dp,
    spacing16 = 16.dp,
    spacing20 = 20.dp,
    spacing24 = 24.dp,
    spacing28 = 28.dp,
    spacing32 = 32.dp,
    spacing40 = 40.dp,
    spacing48 = 48.dp,

    // Corners
    cornerExtraSmall = 6.dp,
    cornerSmall = 10.dp,
    cornerMedium = 14.dp,
    cornerLarge = 18.dp,
    cornerExtraLarge = 24.dp,

    // Elevation
    elevation0 = 0.dp,
    elevation1 = 1.dp,
    elevation2 = 2.dp,
    elevation3 = 4.dp,
    elevation4 = 8.dp,

    // Borders
    borderThin = 1.dp,
    borderRegular = 1.5.dp,

    // Icons
    iconExtraSmall = 14.dp,
    iconSmall = 18.dp,
    iconMedium = 24.dp,
    iconLarge = 32.dp,
    iconExtraLarge = 40.dp,

    // Component Heights
    buttonHeightSmall = 36.dp,
    buttonHeightMedium = 48.dp,
    buttonHeightLarge = 56.dp,
    textFieldMinHeight = 56.dp,
    chipHeight = 32.dp,

    // Layout
    topBarHeight = 64.dp,
    bottomBarHeight = 72.dp,
    cardMinHeight = 88.dp,

    // Screen Padding
    screenHorizontalPadding = 20.dp,
    screenVerticalPadding = 16.dp,

    // Utility
    dividerThickness = 1.dp,
)