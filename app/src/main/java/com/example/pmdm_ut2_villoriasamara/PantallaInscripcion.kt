package com.example.pmdm_ut2_villoriasamara

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun PantallaInscripcion() {

    var nombre by remember { mutableStateOf("") }

    var email by remember { mutableStateOf("") }

    var recordatorio by remember { mutableStateOf(false) }

    var turno by remember { mutableStateOf("Mañana") }

    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {

        Text("Inscripción")

        CampoNombre(
            nombre = nombre,
            onNombreChange = { nuevoNombre ->
                nombre = nuevoNombre
            }
        )

        CampoEmail(
            email = email,
            onEmailChange = { nuevoEmail ->
                email = nuevoEmail
            }
        )

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = recordatorio,
                onCheckedChange = { nuevoValor ->
                    recordatorio = nuevoValor
                }
            )

            Text("Quiero recibir un recordatorio")
        }

        Text("Elige un turno")

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            RadioButton(
                selected = turno == "Mañana",
                onClick = {
                    turno = "Mañana"
                }
            )

            Text("Mañana")
        }

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            RadioButton(
                selected = turno == "Tarde",
                onClick = {
                    turno = "Tarde"
                }
            )

            Text("Tarde")
        }

        Button(
            onClick = {
                println("Nombre: $nombre" +
                        "\nEmail: $email" +
                        "\nRecordatorio: $recordatorio" +
                        "\nTurno: $turno")

            }
        ) {
            Text("Continuar")
        }
    }
}
