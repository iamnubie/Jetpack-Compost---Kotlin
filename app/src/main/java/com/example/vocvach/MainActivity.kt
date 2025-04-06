package com.example.vocvach

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.vocvach.ui.theme.VocvachTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VocvachTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    HomeScreen(modifier = Modifier.padding(innerPadding))
                MainApp()
            }
        }
    }
}

@Composable
fun MainApp() {

    var currentScreen by remember {
        mutableStateOf(Screen.VideoDetailScreen)
    }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {

        if (currentScreen == Screen.VideoDetailScreen) {
            VideoDetailScreen() {
                currentScreen = Screen.CategoryScreen
            }
        } else {
            CategoryScreen()
        }

    }
}
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(bottom = 14.dp, top = 45.dp)
    )
    {
        //Greeting(name = "Android")
        //Spacer(modifier = Modifier.height(20.dp))//khoảng cách
        //MultipleStylesText()
        //VectorImageComponent()
        //CustomPainterImageCompose()
        //BannerCompose(contentScale = ContentScale.Crop) //bi cat mat anh
        //BannerCompose(contentScale = ContentScale.Fit)//gian cho vừa khít với box hoặc image
        //BannerCompose(contentScaz`1le = ContentScale.Inside)//giu nguyen kich thuoc anh, ko bị co gian(Inside)
        //CircleAvatar()
        //UrlImageCompose()
        //SimpleButton()
        //DisableSimpleButton()
        //RoundedCornerButton()
        //BorderSimpleButton()
        //ElevationSimpleButton()
//        OutlinedButton(onClick = {}) {
//            Text("Outline button")
//        }
//        TextButton(onClick = {}) {
//            Text("Text button")
//        }
//        IconButton(onClick = {}) {
//            Icon(imageVector = Icons.Default.Phone, contentDescription = "")
//        }
        //DemoClickable()
        //DemoDetectTapGestures()
        //RadioButton(selected = true, onClick = {})
        //RadioButton(selected = false, onClick = {})
//        RadioButton(selected = true, onClick = {},
//            colors = RadioButtonDefaults.colors(
//                selectedColor = Color.Red,
//                unselectedColor = Color.Green,
//                disabledSelectedColor = Color.Gray
//            ))
//        RadioButton(selected = false, onClick = {},
//            colors = RadioButtonDefaults.colors(
//                selectedColor = Color.Red,
//                unselectedColor = Color.Green,
//                disabledSelectedColor = Color.Gray
//            ))
//        RadioButton(
//            enabled = false,
//            selected = false,
//            onClick = {},
//            colors = RadioButtonDefaults.colors(
//                selectedColor = Color.Red,
//                unselectedColor = Color.Green,
//                disabledSelectedColor = Color.Gray
//            ))
        //DemoRadioButtonWithTitle("male")
        //DemoCustomRadioButton("female")
//        Checkbox(checked = true, onCheckedChange = {},
//            colors = CheckboxDefaults.colors(
//                checkedColor = Color.Green,
//                uncheckedColor = Color.Red
//            ))
//        Checkbox(checked = false, onCheckedChange = {},
//            colors = CheckboxDefaults.colors(
//                checkedColor = Color.Green,
//                uncheckedColor = Color.Red
//            ))
        //DemoCheckboxWithTitle(title = "tomato")
        //DemoTextField()
        //DemoOutlineTextField()
        //PasswordCompose()
        //CommonSpace()
//        Box(modifier = Modifier.fillMaxSize()) // Chiếm toàn bộ màn hình
//        {
//            BoxItem(color = Color.Blue, size = 200.dp, modifier = Modifier.align(Alignment.TopStart))//.matchParentSize() để rộng hết màn hình
//            BoxItem(color = Color.Red, size = 150.dp, modifier = Modifier.align(Alignment.TopEnd))
//            BoxItem(color = Color.Yellow, size = 120.dp, modifier = Modifier.align(Alignment.BottomStart))
//            BoxItem(color = Color.Magenta, modifier = Modifier.align(Alignment.BottomEnd))
//            BoxItem(color = Color.Black, modifier = Modifier.align(Alignment.Center))
//        }
//        Box(){
//            Row(
//                modifier = Modifier
//                    .size(400.dp,200.dp)
//                    .background(color = Color.Cyan),
//                verticalAlignment = Alignment.CenterVertically,
//                horizontalArrangement = Arrangement.SpaceEvenly //khoang cach giua cac phan tu trong row
//                //horizontalArrangement = Arrangement.SpaceBetween //khoang cach giua cac phan tu trong row, nhưng ko tính 2 cạnh bên ngoài
//            ) {
//                BoxItem(color = Color.Blue)
//                BoxItem(color = Color.Red)
//                BoxItem(color = Color.Yellow)
//            }
//        }
//        Box(){
////            Row(
////                verticalAlignment = Alignment.CenterVertically
////            ) {
////                OutlinedTextField(value = "", onValueChange = {}, modifier=Modifier.weight(1f))
////                Icon(Icons.Default.Send, contentDescription = "send", Modifier.size(36.dp))
////            }
//            Column(
//                horizontalAlignment = Alignment.CenterHorizontally,//can giua
//                modifier = Modifier.width(300.dp).height(700.dp).background(color = Color.Cyan),
//                verticalArrangement = Arrangement.SpaceBetween
//            ) {
//                BoxItem(color = Color.Red)
//                BoxItem(color = Color.Blue)
//                BoxItem(color = Color.Yellow)
//            }
//        }
        //GetOTP()
        //DemoScroll()
        /////////////////////// Constraintlayout///////////////////

//        Ingredients()

//        DemoSideBar()
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    VocvachTheme {
        MainApp()
    }
}

enum class Screen {
    VideoDetailScreen,
    CategoryScreen
}
//@Preview(showBackground = true)
//@Composable
//fun IngredientPreview() {
//    Row {
//        Ingredient(
//            icon = R.drawable.leaves,
//            value = 10,
//            name = "Mint Leaves",
//            unit = "cái",
//            modifier = Modifier.size(110.dp)
//        )
//    }
//}

//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun HomeScreenPreview() {
//    VocvachTheme {
//        HomeScreen()
//    }
//}
