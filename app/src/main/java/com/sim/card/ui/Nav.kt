package com.sim.card.ui
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNav() {
    val nav = rememberNavController()
    NavHost(nav, startDestination = "cards") {
        composable("cards") { /* TODO CardsListScreen */ }
    }
}
