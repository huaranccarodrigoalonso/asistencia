package com.example.asistencia

import android.graphics.drawable.PaintDrawable
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.asistencia.ui.theme.AsistenciaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CRUD()
        }
    }
}

@Preview
@Composable
fun CRUD() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = painterResource(id = R.drawable.congreso_main),
            contentDescription = "Congress image")

	//create user
        Button(
            onClick = {
                onNavigateToListUser()
            },
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.Red
            ),
            elevation =  ButtonDefaults.buttonElevation(
                defaultElevation = 10.dp,
                pressedElevation = 15.dp,
                disabledElevation = 0.dp
            )
        ) {
            Image(
                painter = painterResource(id = R.drawable.add_assistent),
                contentDescription = "add assistent",
                modifier = Modifier.size(20.dp)
            )
            Text(
                text = "Create Assistant",
                modifier = Modifier.padding(start = 10.dp)
            )
        }

	//update user
	Button(
            onClick = {
            //your onclick code here
            },
            colors = ButtonDefaults.buttonColors(
                //backgroundColor = Color.White,
                contentColor = Color.Red),
            elevation =  ButtonDefaults.buttonElevation(
                defaultElevation = 10.dp,
                pressedElevation = 15.dp,
                disabledElevation = 0.dp
            )
        ) {
            Image(
                painter = painterResource(id = R.drawable.edit_user),
                contentDescription = "edit assistent",
                modifier = Modifier.size(20.dp)
            )
            Text(
                text = "Edit Assistant",
                modifier = Modifier.padding(start = 10.dp)
            )
        }

	//view user - list
	Button(
            onClick = {
            //your onclick code here
            },
            colors = ButtonDefaults.buttonColors(
                //backgroundColor = Color.White,
                contentColor = Color.Red
            ),
            elevation =  ButtonDefaults.buttonElevation(
                defaultElevation = 10.dp,
                pressedElevation = 15.dp,
                disabledElevation = 0.dp
            )
        ) {
            Image(
                painter = painterResource(id = R.drawable.list_user),
                contentDescription = "list assistent",
                modifier = Modifier.size(20.dp)
            )
            Text(
                text = "List Assistant",
                modifier = Modifier.padding(start = 10.dp)
            )
        }

	//delete user
	Button(
            onClick = {
            //your onclick code here
            },
            colors = ButtonDefaults.buttonColors(
                //backgroundColor = Color.White,
                contentColor = Color.Red),
            elevation =  ButtonDefaults.buttonElevation(
                defaultElevation = 10.dp,
                pressedElevation = 15.dp,
                disabledElevation = 0.dp
            )
        ) {
            Image(
                painter = painterResource(id = R.drawable.delete_user),
                contentDescription = "add assistent",
                modifier = Modifier.size(20.dp)
            )
            Text(
                text = "Delete Assistant",
                modifier = Modifier.padding(start = 10.dp)
            )
        }
    }
}

fun onNavigateToListUser() {
    TODO("Not yet implemented")
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun createUser(){

    //nombre, apellidos, fecha, sangre, telefono, correo, monto
    var name by remember {
        mutableStateOf("Carlos Eduardo")
    }
    var lname by remember {
        mutableStateOf("Mariategui Batallanos")
    }
    var fecha by remember {
        mutableStateOf("20/05/2023")
    }
    var sangre by remember {
        mutableStateOf("O+")
    }
    var telefono by remember {
        mutableStateOf("942036585")
    }
    var correo by remember {
        mutableStateOf("example@gmail.com")
    }
    var monto by remember {
        mutableStateOf("100.00")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = painterResource(id = R.drawable.user_acount),
            contentDescription = "user account",
            modifier = Modifier.size(200.dp)
        )

        TextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Name") }
        )
        TextField(
            value = lname,
            onValueChange = { lname = it },
            label = { Text("Surname") }
        )
        TextField(
            value = fecha,
            onValueChange = { fecha = it },
            label = { Text("Date") }
        )
        TextField(
            value = sangre,
            onValueChange = { sangre = it },
            label = { Text("Blood type") }
        )
        TextField(
            value = telefono,
            onValueChange = { telefono = it },
            label = { Text("Mobile phone") }
        )
        TextField(
            value = correo,
            onValueChange = { correo = it },
            label = { Text("Email") }
        )
        TextField(
            value = monto,
            onValueChange = { monto = it },
            label = { Text("Amount") }
        )
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth().padding(60.dp)

        ) {
            Button(onClick = { /*TODO*/ }) {
                Image(
                    painter = painterResource(id = R.drawable.cancel_user),
                    contentDescription = "add assistent",
                    modifier = Modifier.size(20.dp)
                )
                Text(
                    text = "Cancel",
                    modifier = Modifier.padding(start = 10.dp)
                )
            }
            Button(onClick = { /*TODO*/ }) {
                Image(
                    painter = painterResource(id = R.drawable.add_assistent),
                    contentDescription = "add assistent",
                    modifier = Modifier.size(20.dp)
                )
                Text(
                    text = "Add",
                    modifier = Modifier.padding(start = 10.dp)
                )
            }
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun updateUser() {
    //nombre, apellidos, fecha, sangre, telefono, correo, monto
    var name by remember {
        mutableStateOf("Carlos Eduardo")
    }
    var lname by remember {
        mutableStateOf("Mariategui Batallanos")
    }
    var fecha by remember {
        mutableStateOf("20/05/2023")
    }
    var sangre by remember {
        mutableStateOf("O+")
    }
    var telefono by remember {
        mutableStateOf("942036585")
    }
    var correo by remember {
        mutableStateOf("example@gmail.com")
    }
    var monto by remember {
        mutableStateOf("100.00")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        var expanded by remember { mutableStateOf(false) }
        val items = listOf("A", "B", "C", "D", "E", "F")
        val disabledValue = "B"
        var selectedIndex by remember { mutableStateOf(0) }


        TextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Name") }
        )
        TextField(
            value = lname,
            onValueChange = { lname = it },
            label = { Text("Surname") }
        )
        TextField(
            value = fecha,
            onValueChange = { fecha = it },
            label = { Text("Date") }
        )
        TextField(
            value = sangre,
            onValueChange = { sangre = it },
            label = { Text("Blood type") }
        )
        TextField(
            value = telefono,
            onValueChange = { telefono = it },
            label = { Text("Mobile phone") }
        )
        TextField(
            value = correo,
            onValueChange = { correo = it },
            label = { Text("Email") }
        )
        TextField(
            value = monto,
            onValueChange = { monto = it },
            label = { Text("Amount") }
        )
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth().padding(60.dp)

        ) {
            Button(onClick = { /*TODO*/ }) {
                Image(
                    painter = painterResource(id = R.drawable.cancel_user),
                    contentDescription = "add assistent",
                    modifier = Modifier.size(20.dp)
                )
                Text(
                    text = "Cancel",
                    modifier = Modifier.padding(start = 10.dp)
                )
            }
            Button(onClick = { /*TODO*/ }) {
                Image(
                    painter = painterResource(id = R.drawable.add_assistent),
                    contentDescription = "add assistent",
                    modifier = Modifier.size(20.dp)
                )
                Text(
                    text = "Add",
                    modifier = Modifier.padding(start = 10.dp)
                )
            }
        }
    }
}

fun DropdownMenuItem(onClick: () -> Unit, interactionSource: () -> Unit) {

}
