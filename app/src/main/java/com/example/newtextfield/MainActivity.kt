// Define o pacote para a classe MainActivity.
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

//Declara a classe MainActivity como uma subclasse de ComponentActivity.
class MainActivity : ComponentActivity() {

    //Sobrescreve o método onCreate da classe base para definir o conteúdo da atividade.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            // Define o conteúdo da atividade como um tema personalizado
            NewTextFieldTheme {
                // Cria uma superfície que preenche toda a tela.
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Chama a função Register para exibir o formulário de cadastro.
                    Register()
                }
            }
        }
    }
}

// Define a função Register como um Composable.
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

    //Criando o formulário de cadastro:
    Column(
        Modifier
            .fillMaxWidth(),
             Arrangement.Center
    ){

        // Cria uma linha para exibir o título do aplicativo.
        Row(
            Modifier
                .fillMaxWidth(),
                 Arrangement.Center
        ){

            // Adiciona o título do aplicativo no meio ao centro da linha.
            Text(
                text = "App cadastro",
                fontSize = 20.sp
            )
        }

        // Adiciona um espaço vertical.
        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp)
        )

        // Cria uma linha para exibir o campo de texto para o nome.
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ){

            // Adiciona o campo de texto para o nome.
            TextField(
                value = nome,
                onValueChange ={novoValor -> nome = novoValor},
                label = {Text("Digite seu nome:")},
            )
        }

        // Adiciona um espaço vertical.
        Spacer(modifier = Modifier.height(16.dp))

        // Cria uma linha para exibir o campo de texto para o bairro.
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ){

            // Adiciona o campo de texto para o bairro.
            TextField(
                value = bairro,
                onValueChange ={novoValor -> bairro = novoValor},
                label = {Text("Digite seu bairro:")},
            )
        }

        // Adiciona um espaço vertical.
        Spacer(modifier = Modifier.height(16.dp))

        // Cria uma linha para exibir o campo de texto para o CEP.
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ){

            // Adiciona o campo de texto para o CEP.
            TextField(
                value = cep,
                onValueChange ={novoValor -> cep = novoValor},
                label = {Text("Digite seu bairro:")},
            )
        }

        // Adiciona um espaço vertical.
        Spacer(modifier = Modifier.height(16.dp))

        // Cria uma linha para exibir o campo de texto para a cidade.
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ){

            // Adiciona o campo de texto para a cidade.
            TextField(
                value = cidade,
                onValueChange ={novoValor -> cidade = novoValor},
                label = {Text("Digite seu bairro:")},
            )
        }

        // Adiciona um espaço vertical.
        Spacer(modifier = Modifier.height(16.dp))

        // Cria uma linha para exibir o campo de texto para o estado.
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ){

            // Adiciona o campo de texto para o estado.
            TextField(
                value = estado,
                onValueChange ={novoValor -> estado = novoValor},
                label = {Text("Digite o nome do seu estado")},
                //shape = RoundedCornerShape(25.dp)
            )
        }

        //Adiciona espaço vertical:
        Spacer(modifier = Modifier.height(26.dp))

        //Cria uma linha para exibir o botão de cadastro.
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ){

            //Cria o botão de cadastro:
            Button(onClick = {}){
                Text(text = "Cadastro")
            }
        }
    }
}

// Define a função RegisterPreview como um Composable.
@Preview(showBackground = true)
@Composable

//Função para exibir o formulário de cadastro:
fun RegisterPreview() {
    Register()
}