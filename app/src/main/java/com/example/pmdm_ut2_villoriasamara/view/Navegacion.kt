package com.example.pmdm_ut2_villoriasamara.view

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.serialization.Serializable

@Serializable
data object Actividades

@Serializable
data class Detalle(
    val actividadId: Int
)

@Serializable
data class Inscripcion(
    val actividadId: Int
)

@Composable
fun MiAplicacion() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Actividades

    ) {
        composable<Actividades> {

            PantallaActividades()
        }
    }
}