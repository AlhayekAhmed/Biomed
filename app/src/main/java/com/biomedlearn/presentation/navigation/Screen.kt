package com.biomedlearn.presentation.navigation

sealed class Screen(val route: String) {
    data object Home : Screen("home")
    data object Devices : Screen("devices")
    data object Settings : Screen("settings")
}
