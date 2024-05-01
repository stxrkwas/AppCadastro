package com.example.newtextfield

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newtextfield.ui.theme.NewTextFieldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewTextFieldTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Register()
                }
            }
        }
    }
}

@Composable
fun Register() {

    //Criando a variável nome, com as funções remember e mutableStateOf:
    var nome by remember{
        mutableStateOf("")
    }

    //Criando a variável bairro:
    var bairro by remember{ mutableStateOf("") }

    //Criando a variável cep:
    var cep by remember{ mutableStateOf("") }

    //Criando a variável cidade:
    var cidade by remember{mutableStateOf("")}

    //Criando a variável estado:
    var estado by remember{ mutableStateOf("") }

    Column(
        Modifier
            .fillMaxWidth(),
             Arrangement.Center
    ){

        Row(
            Modifier
                .fillMaxWidth(),
                 Arrangement.Center
        ){
            Text(
                text = "App cadastro",
                fontSize = 20.sp
            )
        }

        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp)
        )

        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ){
            TextField(
                value = nome,
                onValueChange ={novoValor -> nome = novoValor},
                label = {Text("Digite seu nome:")},
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        //Bairro:
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ){
            TextField(
                value = bairro,
                onValueChange ={novoValor -> bairro = novoValor},
                label = {Text("Digite seu bairro:")},
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        //CEP:
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ){
            TextField(
                value = cep,
                onValueChange ={novoValor -> cep = novoValor},
                label = {Text("Digite seu bairro:")},
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        //Cidade:
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ){
            TextField(
                value = cidade,
                onValueChange ={novoValor -> cidade = novoValor},
                label = {Text("Digite seu bairro:")},
            )
        }

        Spacer(modifier = Modifier.height(16.dp))
        //Estado:
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ){
            TextField(
                value = estado,
                onValueChange ={novoValor -> estado = novoValor},
                label = {Text("Digite o nome do seu estado")},
                //shape = RoundedCornerShape(25.dp)
            )
        }

        //Adiciona espaço vertical:
        Spacer(modifier = Modifier.height(26.dp))

        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ){
            Button(onClick = {}){
                Text(text = "Cadastro")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RegisterPreview() {
    Register()
}