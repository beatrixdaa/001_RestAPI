package com.example.consumeapi.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import com.example.consumeapi.ui.DestinasiHome
import com.example.consumeapi.ui.HomeScreen

@Composable
fun PengelolaHalaman(navControler : NavHostController = rememerberNavController()){
NavHost(
    navControler = navControler,
    startDestination = DestinasiHome.route,
    modifier = Modifier,
){
    composable(DestinasiHome.route){
        HomeScreen(navigateToItemEntry = {
            navControler.navigate(DestinasiEntry.route)
        },
            onDetailClick = {

            })
}
    composable(DestinasiEntry.route){
        EntryKontakScreen(navigateBack = {
            navControler.navigate(
                DestinasiHome.route
            ){
                popUpTo(DestinasiHome.route){
                    inclusive = true
                }
            }
        })
    }
}