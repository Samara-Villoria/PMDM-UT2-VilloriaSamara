package com.example.pmdm_ut2_villoriasamara

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pmdm_ut2_villoriasamara.ui.theme.PMDMUT2VilloriaSamaraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PMDMUT2VilloriaSamaraTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    PantallaActividades()
                }
            }
        }
    }
}

@Composable
fun PantallaInscripcion() {

    var nombre by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {

        Text("Inscripción")

        TextField(
            value = nombre,
            onValueChange = { nuevoNombre ->
                nombre = nuevoNombre
            },
            label = {
                Text("Nombre")
            }
        )

        Button(
            onClick = {
                println("Nombre: $nombre")
            }
        ) {
            Text("Continuar")
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PMDMUT2VilloriaSamaraTheme {
        Greeting("Android")
    }
}

@Composable
fun Titulo(texto: String) {
    Text(text = texto)
}

@Composable
fun ActividadItem(
    nombre: String,
    categoria: String
) {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {

        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ){

        }
        Image(
            painter = painterResource(R.drawable.ic_launcher_background),
            contentDescription = "Imagen de la actividad",
            modifier = Modifier.size(200.dp)
        )


        Text(text = nombre)
        Text(text = categoria)

        Button(
            onClick = { }
        ) {
            Text("Ver detalle")
        }
    }
}

@Composable
fun Contador() {

    var contador by remember {
        mutableStateOf(0)
    }

    Column (modifier = Modifier.padding(16.dp)) {
        Text("Has pulsado $contador veces")

        Button(
            onClick = {
                contador++
            }
        ) {
            Text("Pulsar")
        }
    }
}

@Composable
fun EjemploNombre() {

    var nombre by remember {
        mutableStateOf("")
    }

    Column {

        TextField(
            value = nombre,
            onValueChange = { nuevoNombre ->
                nombre = nuevoNombre
            }
        )

        Text("Nombre introducido: $nombre")
    }
}

@Composable
fun PantallaActividades() {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {

        PantallaInscripcion()

        Contador()

        EjemploNombre()

        ActividadItem(
            nombre = "Taller de Android",
            categoria = "Tecnología"
        )

        ActividadItem(
            nombre = "Ruta de senderismo",
            categoria = "Deporte"
        )

    }
}
