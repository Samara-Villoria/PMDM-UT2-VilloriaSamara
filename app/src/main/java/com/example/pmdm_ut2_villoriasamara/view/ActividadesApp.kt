package com.example.pmdm_ut2_villoriasamara.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.pmdm_ut2_villoriasamara.model.actividadesEjemplo

@Composable
fun ActividadesApp(
    modifier: Modifier = Modifier
) {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Actividades,
        modifier = modifier
    ) {
        composable<Actividades> {

            PantallaActividades(
                onVerDetalle = { id ->
                    navController.navigate(
                        Detalle(id)
                    )
                }
            )
        }
        composable<Detalle> { backStackEntry ->

            val destino = backStackEntry.toRoute<Detalle>()

            val actividad = actividadesEjemplo.first {
                it.id == destino.actividadId
            }

            PantallaDetalle(
                actividad = actividad,
                onInscribirse = {
                    navController.navigate(
                        Inscripcion(actividad.id)
                    )
                }
            )
        }
        composable<Inscripcion> { backStackEntry ->

            val destino = backStackEntry.toRoute<Inscripcion>()

            PantallaInscripcion()
        }
    }
}