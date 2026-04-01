package com.project.aiknowledgevault.core.designsystem.theme

import androidx.compose.ui.graphics.Color

data class AppColors(
    val primaryBrand: Color,
    val onPrimaryBrand: Color,
    val primaryBrandContainer: Color,
    val onPrimaryBrandContainer: Color,
    val secondaryBrand: Color,
    val onSecondaryBrand: Color,
    val secondaryBrandContainer: Color,
    val onSecondaryBrandContainer: Color,
    val aiAccent: Color,
    val onAiAccent: Color,
    val aiAccentContainer: Color,
    val onAiAccentContainer: Color,
    val backgroundPrimary: Color,
    val backgroundSecondary: Color,
    val surfacePrimary: Color,
    val surfaceSecondary: Color,
    val surfaceTertiary: Color,
    val surfaceInverse: Color,
    val onSurfacePrimary: Color,
    val onSurfaceSecondary: Color,
    val onSurfaceTertiary: Color,
    val onSurfaceInverse: Color,
    val outline: Color,
    val outlineVariant: Color,
    val divider: Color,
    val error: Color,
    val onError: Color,
    val errorContainer: Color,
    val onErrorContainer: Color,
    val success: Color,
    val onSuccess: Color,
    val successContainer: Color,
    val onSuccessContainer: Color,
    val warning: Color,
    val onWarning: Color,
    val warningContainer: Color,
    val onWarningContainer: Color,
    val info: Color,
    val onInfo: Color,
    val infoContainer: Color,
    val onInfoContainer: Color,
    val noteCardBackground: Color,
    val noteCardBorder: Color,
    val tagBackground: Color,
    val tagText: Color,
    val inputBackground: Color,
    val inputBorder: Color,
    val shimmerBase: Color,
    val shimmerHighlight: Color,
)

private val Indigo80 = Color(0xFFB8C3FF)
private val Indigo90 = Color(0xFFDEE1FF)
private val Indigo40 = Color(0xFF4459C9)
private val Indigo30 = Color(0xFF3346AE)
private val Teal80 = Color(0xFF9DE7DE)
private val Teal90 = Color(0xFFD0F5F0)
private val Teal40 = Color(0xFF0F8C80)
private val Teal30 = Color(0xFF0D6E65)
private val Violet80 = Color(0xFFD5C0FF)
private val Violet90 = Color(0xFFECDDFF)
private val Violet40 = Color(0xFF7A4DDB)
private val Violet30 = Color(0xFF633DBA)
private val Slate0 = Color(0xFFFFFFFF)
private val Slate10 = Color(0xFFF8FAFC)
private val Slate20 = Color(0xFFF1F5F9)
private val Slate30 = Color(0xFFE2E8F0)
private val Slate40 = Color(0xFFCBD5E1)
private val Slate50 = Color(0xFF94A3B8)
private val Slate60 = Color(0xFF64748B)
private val Slate70 = Color(0xFF475569)
private val Slate80 = Color(0xFF334155)
private val Slate90 = Color(0xFF1E293B)
private val Slate100 = Color(0xFF0F172A)
private val Success40 = Color(0xFF15803D)
private val Success90 = Color(0xFFDCFCE7)
private val Warning40 = Color(0xFFD97706)
private val Warning90 = Color(0xFFFEF3C7)
private val Error40 = Color(0xFFDC2626)
private val Error90 = Color(0xFFFEE2E2)
private val Info40 = Color(0xFF2563EB)
private val Info90 = Color(0xFFDBEAFE)

val LightAppColors = AppColors(
    primaryBrand = Indigo40,
    onPrimaryBrand = Slate0,
    primaryBrandContainer = Indigo90,
    onPrimaryBrandContainer = Indigo30,
    secondaryBrand = Teal40,
    onSecondaryBrand = Slate0,
    secondaryBrandContainer = Teal90,
    onSecondaryBrandContainer = Teal30,
    aiAccent = Violet40,
    onAiAccent = Slate0,
    aiAccentContainer = Violet90,
    onAiAccentContainer = Violet30,
    backgroundPrimary = Slate10,
    backgroundSecondary = Slate20,
    surfacePrimary = Slate0,
    surfaceSecondary = Slate10,
    surfaceTertiary = Slate20,
    surfaceInverse = Slate100,
    onSurfacePrimary = Slate100,
    onSurfaceSecondary = Slate70,
    onSurfaceTertiary = Slate60,
    onSurfaceInverse = Slate0,
    outline = Slate40,
    outlineVariant = Slate30,
    divider = Slate30,
    error = Error40,
    onError = Slate0,
    errorContainer = Error90,
    onErrorContainer = Error40,
    success = Success40,
    onSuccess = Slate0,
    successContainer = Success90,
    onSuccessContainer = Success40,
    warning = Warning40,
    onWarning = Slate0,
    warningContainer = Warning90,
    onWarningContainer = Warning40,
    info = Info40,
    onInfo = Slate0,
    infoContainer = Info90,
    onInfoContainer = Info40,
    noteCardBackground = Slate0,
    noteCardBorder = Slate30,
    tagBackground = Indigo90,
    tagText = Indigo30,
    inputBackground = Slate0,
    inputBorder = Slate40,
    shimmerBase = Slate20,
    shimmerHighlight = Slate10,
)

val DarkAppColors = AppColors(
    primaryBrand = Indigo80,
    onPrimaryBrand = Slate100,
    primaryBrandContainer = Indigo30,
    onPrimaryBrandContainer = Indigo90,
    secondaryBrand = Teal80,
    onSecondaryBrand = Slate100,
    secondaryBrandContainer = Teal30,
    onSecondaryBrandContainer = Teal90,
    aiAccent = Violet80,
    onAiAccent = Slate100,
    aiAccentContainer = Violet30,
    onAiAccentContainer = Violet90,
    backgroundPrimary = Slate100,
    backgroundSecondary = Slate90,
    surfacePrimary = Slate90,
    surfaceSecondary = Slate80,
    surfaceTertiary = Slate70,
    surfaceInverse = Slate10,
    onSurfacePrimary = Slate10,
    onSurfaceSecondary = Slate30,
    onSurfaceTertiary = Slate40,
    onSurfaceInverse = Slate100,
    outline = Slate70,
    outlineVariant = Slate80,
    divider = Slate80,
    error = Color(0xFFFF8A80),
    onError = Slate100,
    errorContainer = Color(0xFF7F1D1D),
    onErrorContainer = Color(0xFFFECACA),
    success = Color(0xFF86EFAC),
    onSuccess = Slate100,
    successContainer = Color(0xFF14532D),
    onSuccessContainer = Color(0xFFDCFCE7),
    warning = Color(0xFFFCD34D),
    onWarning = Slate100,
    warningContainer = Color(0xFF78350F),
    onWarningContainer = Color(0xFFFEF3C7),
    info = Color(0xFF93C5FD),
    onInfo = Slate100,
    infoContainer = Color(0xFF1E3A8A),
    onInfoContainer = Color(0xFFDBEAFE),
    noteCardBackground = Slate90,
    noteCardBorder = Slate80,
    tagBackground = Indigo30,
    tagText = Indigo90,
    inputBackground = Slate80,
    inputBorder = Slate70,
    shimmerBase = Slate80,
    shimmerHighlight = Slate70,
)