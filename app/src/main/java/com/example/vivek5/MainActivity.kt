package com.example.vivek5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.SemanticsActions.OnClick
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.vivek5.ui.theme.Vivek5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Vivek5Theme {
                // A surface container using the 'background' color from the theme
         val viewModel=viewModel<calculatorViewModel>()
             val state=viewModel.state
             calculator(state=state,onAction=viewModel::onAction,modifier=Modifier.fillMaxSize().padding(16.dp))
            }
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
    Vivek5Theme {
        Greeting("Android")
    }
}
//@Preview(showBackground = true)
//@Composable
//fun calculator(){
//    Surface(
//        modifier = Modifier.fillMaxSize(),
//        color = MaterialTheme.colorScheme.background
//    ) {
//dollarcounter()
//    }
//}
//@Preview(showBackground = true)
//@Composable
//fun dollarcounter() {
//    var counter=remember{
//        mutableStateOf ("")
//    }
//    Column(
//        modifier = Modifier.fillMaxWidth().padding(12.dp),
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//       TextField(value=counter.value,onValueChange={counter.value=it})
//
//      // Text(text = "${counter.value}", style = TextStyle(color = Color.Black, fontSize = (80.sp)))
//        Divider()
//        Spacer(modifier=Modifier.height(5.dp))
//        //First
//        Row(verticalAlignment = Alignment.CenterVertically) {
//            Button(onClick = { }, modifier = Modifier.height(40.dp)) {
//                Text(text = "AC", style = TextStyle(color = Color.Black, fontSize = (20.sp)))
//            }
//            Button(onClick = { }, modifier = Modifier.height(40.dp)) {
//                Text(text = "Cross", style = TextStyle(color = Color.Black, fontSize = (20.sp)))
//            }
//            Button(onClick = { }, modifier = Modifier.height(40.dp)) {
//                Text(text = "%", style = TextStyle(color = Color.Black, fontSize = (20.sp)))
//            }
//            Button(onClick = { }, modifier = Modifier.height(40.dp)) {
//                Text(text = "/", style = TextStyle(color = Color.Black, fontSize = (20.sp)))
//            }
//        }
//        Spacer(modifier=Modifier.height(5.dp))
//        //second
//        Row(verticalAlignment = Alignment.CenterVertically) {
//            Button(onClick = {}, modifier = Modifier.height(40.dp)) {
//                Text(text = "7", style = TextStyle(color = Color.Black, fontSize = (20.sp)))
//            }
//            Button(onClick = { }, modifier = Modifier.height(40.dp)) {
//                Text(text = "8", style = TextStyle(color = Color.Black, fontSize = (20.sp)))
//            }
//            Button(onClick = { }, modifier = Modifier.height(40.dp)) {
//                Text(text = "9", style = TextStyle(color = Color.Black, fontSize = (20.sp)))
//            }
//            Button(onClick = { }, modifier = Modifier.height(40.dp)) {
//                Text(text = "*", style = TextStyle(color = Color.Black, fontSize = (20.sp)))
//            }
//        }
//        Spacer(modifier=Modifier.height(5.dp))
//        // third
//        Row(verticalAlignment = Alignment.CenterVertically) {
//            Button(onClick = { }, modifier = Modifier.height(40.dp)) {
//                Text(text = "4", style = TextStyle(color = Color.Black, fontSize = (20.sp)))
//            }
//            Button(onClick = { }, modifier = Modifier.height(40.dp)) {
//                Text(text = "5", style = TextStyle(color = Color.Black, fontSize = (20.sp)))
//            }
//            Button(onClick = { }, modifier = Modifier.height(40.dp)) {
//                Text(text = "6", style = TextStyle(color = Color.Black, fontSize = (20.sp)))
//            }
//            Button(onClick = { }, modifier = Modifier.height(40.dp)) {
//                Text(text = "-", style = TextStyle(color = Color.Black, fontSize = (20.sp)))
//            }
//        }
//        Spacer(modifier=Modifier.height(5.dp))
//        //fourth
//        Row(verticalAlignment = Alignment.CenterVertically) {
//            Button(onClick = { }, modifier = Modifier.height(40.dp)) {
//                Text(text = "1", style = TextStyle(color = Color.Black, fontSize = (20.sp)))
//            }
//            Button(onClick = { }, modifier = Modifier.height(40.dp)) {
//                Text(text = "2", style = TextStyle(color = Color.Black, fontSize = (20.sp)))
//            }
//            Button(onClick = { }, modifier = Modifier.height(40.dp)) {
//                Text(text = "3", style = TextStyle(color = Color.Black, fontSize = (20.sp)))
//            }
//            Button(onClick = { }, modifier = Modifier.height(40.dp)) {
//                Text(text = "+", style = TextStyle(color = Color.Black, fontSize = (20.sp)))
//            }
//        }
//        Spacer(modifier=Modifier.height(5.dp))
//        // five
//        Row(verticalAlignment = Alignment.CenterVertically) {
//            Button(onClick = { }, modifier = Modifier.height(40.dp)) {
//                Text(text = "0", style = TextStyle(color = Color.Black, fontSize = (20.sp)))
//            }
//            Button(onClick = { }, modifier = Modifier.height(40.dp)) {
//                Text(text = ".", style = TextStyle(color = Color.Black, fontSize = (20.sp)))
//            }
//            Button(onClick = { }, modifier = Modifier.height(40.dp)) {
//                Text(text = "=", style = TextStyle(color = Color.Black, fontSize = (20.sp)))
//            }
//        }
//    }
//}
//fun dollarcounter(){
//    val counter= remember{
//        mutableStateOf(1)
//    }
//    Column(modifier=Modifier.fillMaxSize(),verticalArrangement= Arrangement.Center,horizontalAlignment= Alignment.CenterHorizontally){
//        Text(text="$${counter.value*100}",style= TextStyle(color= Color.Black,fontWeight= FontWeight.Bold))
//        Spacer(modifier=Modifier.height(190.dp))
//        custombutton(){
//            counter.value++
//        }
//    }
//}
//@Composable
//fun custombutton(onClick:()->Unit){
//    Card(modifier=Modifier.size(140.dp).clickable{
//        onClick.invoke()
//    }.background(color=Color.Yellow),shape= CircleShape){
//        Box(modifier=Modifier.fillMaxSize(),contentAlignment=Alignment.Center){
//            Text(text="Tap",style=TextStyle(color=Color.Green,fontSize=40.sp,fontWeight=FontWeight.Bold))
//        }
//    }
//}
////
////fun statemanagement(){
////    var State =remember{
////        mutableStateOf("")
////    }
////    TextField(value=State.value,onValueChange={
//        State.value=it
//    })
//}



