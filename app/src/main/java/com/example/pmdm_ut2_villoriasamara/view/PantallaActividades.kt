package com.example.pmdm_ut2_villoriasamara.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pmdm_ut2_villoriasamara.model.actividadesEjemplo
import com.example.pmdm_ut2_villoriasamara.view.components.ActividadItem

@Composable
fun PantallaActividades() {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(actividadesEjemplo) { actividad ->
            ActividadItem(actividad = actividad)
        }
    }
}
