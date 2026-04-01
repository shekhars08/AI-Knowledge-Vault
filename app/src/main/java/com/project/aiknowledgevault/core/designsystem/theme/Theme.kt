package com.project.aiknowledgevault.core.designsystem.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf

/**
 * AI Knowledge Vault Custom Theme
 * Combines Material Design 3 with custom AppColors and AppDimens
 */

private val LightMaterialColorScheme = lightColorScheme(
    primary = LightAppColors.primaryBrand,
    onPrimary = LightAppColors.onPrimaryBrand,
    primaryContainer = LightAppColors.primaryBrandContainer,
    onPrimaryContainer = LightAppColors.onPrimaryBrandContainer,

    secondary = LightAppColors.secondaryBrand,
    onSecondary = LightAppColors.onSecondaryBrand,
    secondaryContainer = LightAppColors.secondaryBrandContainer,
    onSecondaryContainer = LightAppColors.onSecondaryBrandContainer,

    tertiary = LightAppColors.aiAccent,
    onTertiary = LightAppColors.onAiAccent,
    tertiaryContainer = LightAppColors.aiAccentContainer,
    onTertiaryContainer = LightAppColors.onAiAccentContainer,

    background = LightAppColors.backgroundPrimary,
    onBackground = LightAppColors.onSurfacePrimary,

    surface = LightAppColors.surfacePrimary,
    onSurface = LightAppColors.onSurfacePrimary,
    surfaceVariant = LightAppColors.surfaceSecondary,
    onSurfaceVariant = LightAppColors.onSurfaceSecondary,

    outline = LightAppColors.outline,

    error = LightAppColors.error,
    onError = LightAppColors.onError,
    errorContainer = LightAppColors.errorContainer,
    onErrorContainer = LightAppColors.onErrorContainer,
)

private val DarkMaterialColorScheme = darkColorScheme(
    primary = DarkAppColors.primaryBrand,
    onPrimary = DarkAppColors.onPrimaryBrand,
    primaryContainer = DarkAppColors.primaryBrandContainer,
    onPrimaryContainer = DarkAppColors.onPrimaryBrandContainer,

    secondary = DarkAppColors.secondaryBrand,
    onSecondary = DarkAppColors.onSecondaryBrand,
    secondaryContainer = DarkAppColors.secondaryBrandContainer,
    onSecondaryContainer = DarkAppColors.onSecondaryBrandContainer,

    tertiary = DarkAppColors.aiAccent,
    onTertiary = DarkAppColors.onAiAccent,
    tertiaryContainer = DarkAppColors.aiAccentContainer,
    onTertiaryContainer = DarkAppColors.onAiAccentContainer,

    background = DarkAppColors.backgroundPrimary,
    onBackground = DarkAppColors.onSurfacePrimary,

    surface = DarkAppColors.surfacePrimary,
    onSurface = DarkAppColors.onSurfacePrimary,
    surfaceVariant = DarkAppColors.surfaceSecondary,
    onSurfaceVariant = DarkAppColors.onSurfaceSecondary,

    outline = DarkAppColors.outline,

    error = DarkAppColors.error,
    onError = DarkAppColors.onError,
    errorContainer = DarkAppColors.errorContainer,
    onErrorContainer = DarkAppColors.onErrorContainer,
)

// Custom App Theme Tokens
@Immutable
data class AppThemeTokens(
    val colors: AppColors,
    val dimens: AppDimens,
)

// Composition Locals
private val LocalAppColors = staticCompositionLocalOf<AppColors> { LightAppColors }
private val LocalAppDimens = staticCompositionLocalOf<AppDimens> { DefaultAppDimens }

// App Shapes (using Dimens for consistency)
private val AppShapes = Shapes(
    extraSmall = RoundedCornerShape(DefaultAppDimens.cornerExtraSmall),
    small = RoundedCornerShape(DefaultAppDimens.cornerSmall),
    medium = RoundedCornerShape(DefaultAppDimens.cornerMedium),
    large = RoundedCornerShape(DefaultAppDimens.cornerLarge),
    extraLarge = RoundedCornerShape(DefaultAppDimens.cornerExtraLarge),
)

@Composable
fun AiKnowledgeVaultTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val appColors = if (darkTheme) DarkAppColors else LightAppColors

    CompositionLocalProvider(
        LocalAppColors provides appColors,
        LocalAppDimens provides DefaultAppDimens,
    ) {
        MaterialTheme(
            colorScheme = if (darkTheme) DarkMaterialColorScheme else LightMaterialColorScheme,
            typography = AppTypography,
            shapes = AppShapes,
            content = content
        )
    }
}

val MaterialTheme.appColors: AppColors
    @Composable
    @ReadOnlyComposable
    get() = LocalAppColors.current

val MaterialTheme.appDimens: AppDimens
    @Composable
    @ReadOnlyComposable
    get() = LocalAppDimens.current

val MaterialTheme.appThemeTokens: AppThemeTokens
    @Composable
    @ReadOnlyComposable
    get() = AppThemeTokens(
        colors = appColors,
        dimens = appDimens
    )