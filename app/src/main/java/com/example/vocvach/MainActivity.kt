package com.example.vocvach

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.SizeTransform
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.keyframes
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.animation.with
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.KeyboardArrowRight
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.KeyboardArrowRight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import coil.compose.rememberAsyncImagePainter
import com.example.vocvach.ui.theme.VocvachTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VocvachTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HomeScreen(modifier = Modifier.padding(innerPadding))
                }
            }
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

        //DemoSideBar()
    }
}

//@Composable

@Composable
fun DemoSideBar(){
    var isExpanded by remember {
        mutableStateOf(false)
    }
    val widthAnim by animateDpAsState(targetValue = if (isExpanded) 200.dp else 50.dp)
    Box(){
        Column(Modifier.fillMaxSize(),
            Arrangement.Center,
            Alignment.CenterHorizontally) {
            Text("Trang chủ")
        }
        Column(Modifier
            .fillMaxHeight()
            .width(widthAnim)//chinh mat dau
            .background(Color.Blue)
            .padding(horizontal = 10.dp, vertical = 10.dp),
            horizontalAlignment = Alignment.Start) {
            Icon(Icons.Default.Menu,
                modifier = Modifier.clickable {
                    isExpanded = !isExpanded;
                },
                contentDescription = null, tint = Color.White)
            Spacer(modifier = Modifier.height(20.dp))
            DrawerItem(Icons.Default.Person, "Thông tin", isExpanded)
            DrawerItem(Icons.Default.Settings, "Cài đặt", isExpanded)
            DrawerItem(Icons.Default.Info, "Topic", isExpanded)
            DrawerItem(Icons.Default.Search, "Khám bệnh", isExpanded)

        }
    }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun DrawerItem(icon: ImageVector, title: String, expanded: Boolean){

    Row(
        Modifier
            .fillMaxWidth()
            .padding(vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically) {
        Icon(icon, contentDescription = null, tint = Color.White)
        AnimatedContent(
            targetState = expanded,
            transitionSpec = {
                fadeIn(animationSpec = tween(150, 150)) togetherWith fadeOut(
                    tween(150)
                ) using SizeTransform { initialSize, targetSize ->
                    keyframes {
                        IntSize(targetSize.width, initialSize.height) at 150
                        durationMillis = 300
                    }
                }
            }
            ) {
                targetState ->
            if (targetState){
                Row(Modifier.fillMaxWidth()) {
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(title, color = Color.White)
                }
            }
        }

    }
}

@Composable
fun Ingredients(modifier: Modifier = Modifier){
    ConstraintLayout() {
        val configuration = LocalConfiguration.current
        //val screenHeight = configuration.screenHeightDp.dp
        val screenWidth = configuration.screenWidthDp
        val itemWidth = (screenWidth * 0.25).dp

        val (tvIngredients, imgArrow)=createRefs()
        Text("Ingredients",
            style = TextStyle(
            fontWeight = FontWeight.SemiBold,
            fontSize = 24.sp,
            color = Color(0xffFB7D8A)
            ),
            modifier = Modifier.constrainAs(tvIngredients){
                top.linkTo(parent.top)
                start.linkTo(parent.start, margin = 16.dp)
            }
        )
        Icon(
            imageVector = Icons.AutoMirrored.Outlined.KeyboardArrowRight,
            contentDescription = null,
            tint = Color(0xffFB7D8A),
            modifier = Modifier
                .size(24.dp)
                .constrainAs(imgArrow){
                    start.linkTo(tvIngredients.end, margin = 6.dp)
                    bottom.linkTo(tvIngredients.bottom)
                    top.linkTo(tvIngredients.top)
                }
        )
        val (lineOne, lineTwo)=createRefs()
        ConstraintLayout(
            modifier=Modifier
            .fillMaxWidth()
            .constrainAs(lineOne){
            start.linkTo(parent.start)
            top.linkTo(tvIngredients.bottom, margin = 14.dp)
            }
                .background(color = Color.Black)
            ) {
            val (e1,e2,e3) =createRefs()
            val lineOneChain = createHorizontalChain(e1, e2, e3, chainStyle = ChainStyle.Spread)
            Ingredient(
                icon = R.drawable.leaves,
                value = 10,
                unit = "cái",
                name = "Mint Leaves",
                modifier = Modifier.size(itemWidth).constrainAs(e1){lineOneChain}
            )
            Ingredient(
                icon = R.drawable.lemon,
                value = 10, unit = null,
                name = "Lemon Wedges",
                modifier = Modifier.size(itemWidth).constrainAs(e2){lineOneChain}
            )
            Ingredient(
                icon = R.drawable.leaves,
                value = 8,
                unit = "cái",
                name = "Mint Leaves",
                modifier = Modifier.size(itemWidth).constrainAs(e3){lineOneChain}
            )
        }
        ConstraintLayout(
            modifier=Modifier
                .fillMaxWidth()
                .constrainAs(lineTwo){
                    start.linkTo(parent.start)
                    top.linkTo(lineOne.bottom, margin = 14.dp)
                }
                .background(color = Color.Black)
        ) {
            val (e1,e2,e3) =createRefs()
            val lineOneChain = createHorizontalChain(e1, e2, e3, chainStyle = ChainStyle.Spread)
            Ingredient(
                icon = R.drawable.leaves,
                value = 10,
                unit = "cái",
                name = "Mint Leaves",
                modifier = Modifier.size(itemWidth).constrainAs(e1){lineOneChain}
            )
            Ingredient(
                icon = R.drawable.lemon,
                value = 10, unit = null,
                name = "Lemon Wedges",
                modifier = Modifier.size(itemWidth).constrainAs(e2){lineOneChain}
            )
            Ingredient(
                icon = R.drawable.leaves,
                value = 8,
                unit = "cái",
                name = "Mint Leaves",
                modifier = Modifier.size(itemWidth).constrainAs(e3){lineOneChain}
            )
        }
    }
}

@Composable
fun Ingredient(
    @DrawableRes icon: Int,
    value: Int,
    unit: String?,
    name: String,
    modifier: Modifier = Modifier){
    val backgroundColor = Color(0xFFFEF9E4) //0xFF la do trong suot
    //backgroundColor.copy(alpha = 0.7f)  //chinh mau
    val borderColor = Color(0xFFFBE897).copy(alpha = 0.7f)
    ConstraintLayout(
        modifier=modifier
            .background(color = backgroundColor, shape = CircleShape)
            //.border(BorderStroke(width = 1.dp, color = borderColor))
    )
    {
        val horizontalGuideLine50 = createGuidelineFromTop(0.5f)

        val imgIcon = createRef()
        Image(
            painter = painterResource(id = icon),
            contentDescription = null,
            modifier =Modifier.constrainAs(imgIcon){
                top.linkTo(parent.top)
                start.linkTo(parent.start) //phải định nghĩa ít nhất 2 cái
                end.linkTo(parent.end)
                bottom.linkTo(horizontalGuideLine50)
                height = Dimension.fillToConstraints
            },
            contentScale = ContentScale.FillHeight
        )

        val (tvValue, tvUnit, tvName) = createRefs()
        val verticalGuideLine50 = createGuidelineFromStart(0.5f)
        val valueTextColor = Color(0xFFFB7D8A)
        Text(
            value.toString(),
            style = TextStyle(
                fontWeight = FontWeight.SemiBold,
                fontSize = 28.sp,
                color = valueTextColor
            ),
            modifier = Modifier.constrainAs(tvValue){
                top.linkTo(horizontalGuideLine50, margin = 2.dp)
                end.linkTo(verticalGuideLine50)
            }
        )
        unit?.let {
            Text(
                unit,
                style = TextStyle(
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 12.sp,
                    lineHeight = 14.sp,
                    color = valueTextColor
                ),
                modifier = Modifier.constrainAs(tvUnit){
                    top.linkTo(tvValue.bottom)
                    end.linkTo(tvValue.end)
                }
            )
        }
        val bottomBarrier = createBottomBarrier(tvValue,tvUnit)
        val endGuideLine20 =createGuidelineFromEnd(0.1f)
        Text(name,
            style = TextStyle(
                color = Color(0xff1E2742),
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium,
                lineHeight = 14.sp
            ),
            modifier = Modifier.constrainAs(tvName){
                start.linkTo(verticalGuideLine50)
                bottom.linkTo(bottomBarrier)
                top.linkTo(horizontalGuideLine50)
                end.linkTo(endGuideLine20)
                width = Dimension.fillToConstraints
            },
            maxLines = 2
        )
    }
}

// Định nghĩa style chung cho text
val customH1: TextStyle
    get() = TextStyle(
        color = Color.Magenta
    )
@Composable
fun Greeting(name: String) {
    Text(
        text = "Hello $name!",
        color = Color.Green,
        fontSize = 30.sp,
        fontWeight = FontWeight.ExtraBold
    )
    Text(
        text = stringResource(id = R.string.app_name),
        fontStyle = FontStyle.Italic,
        fontSize = 30.sp
    )
    Text(
        text = stringResource(id = R.string.taolao),
        textAlign = TextAlign.End,
        textDecoration = TextDecoration.LineThrough
    )
    Text(
        text = stringResource(id = R.string.taolao1),
        textAlign = TextAlign.Start,
        fontFamily = FontFamily.Cursive,
        fontSize = 25.sp,
        style = customH1,
        maxLines = 2,
        overflow = TextOverflow.Ellipsis
    )
}

@Composable
fun MultipleStylesText(){
    Text(text = buildAnnotatedString {
        withStyle(style = SpanStyle(color = Color.Blue)){
            append("H")
        }
        withStyle(style = SpanStyle(textDecoration = TextDecoration.Underline)){
            append("ello")
        }
        withStyle(style = SpanStyle(color = Color.Red)){
            append("M")
        }
        append("inh")
        //withStyle(style = ParagraphStyle(textAlign = TextAlign.End)){}
        //ap dung cho ca doan van
    },
    fontSize = 25.sp //nếu ko muốn tăng fontsize thì thay thế bằng })
        )
}

@Composable
fun VectorImageComponent(){
    Image(imageVector = Icons.Filled.Person, contentDescription = "person")
}

@Composable
fun CustomPainterImageCompose(){
    Image(ColorPainter(Color.Red), contentDescription = null, modifier = Modifier.size(150.dp))
}

@Composable
fun BannerCompose(contentScale:ContentScale){
    Image(
        painterResource(id = R.drawable.cat),
        contentDescription = "Cat",
        contentScale = contentScale,
        modifier = Modifier
            .height(150.dp)
            .fillMaxSize()
            .shadow(
                elevation = 8.dp,
                shape = RoundedCornerShape(size = 8.dp)
            )
            .aspectRatio(2f), //tỉ lệ chiều cao được tính bằng chiều rộng
        alignment = Alignment.TopCenter //ảnh kéo hết sang bên phải
    )
}

@Composable
fun CircleAvatar(){
    Image(
        painterResource(id = R.drawable.avarta1),
        contentDescription = "circle avatar",
        modifier = Modifier.size(150.dp)
            .border(BorderStroke(2.dp, color = Color.Gray), shape = CircleShape)
            .clip(shape = CircleShape),
        contentScale = ContentScale.Crop
        )
}

@Composable
fun UrlImageCompose(){ //phai gan thu vien implementation("io.coil-kt:coil-compose:2.2.0")
Image(
    rememberAsyncImagePainter(model = "https://images.unsplash.com/photo-1601425276965-bdb69f1f3977?fm=jpg&q=60&w=3000&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OHx8bm8lMjBjb3B5cmlnaHR8ZW58MHx8MHx8fDA%3D",
        placeholder = painterResource(id = R.drawable.avarta1)), //là ảnh tạm thời được hiển thị trong khi hình ảnh chính đang tải từ URL
    contentDescription = null
)
}

@Composable
fun SimpleButton(){
    val count = remember {
        mutableStateOf(0)
    }
    Column {
        Text(text="click count ${count.value}")
        Button(onClick = {
            count.value++
        },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Green, //mau nen
                contentColor = Color.Blue),  //mau chu
            //disabledContainerColor = Color.Gray, //co the dung cung luc 2 trang thai
            //disabledContentColor = Color.White
        ) {
            Column { //nếu muốn cho theo chiều dọc đặt vô column
                //Text("Click me") //color an theo text
                //Text(" Right now", style = TextStyle(color = Color.White)) //color an theo text
                //Icon(Icons.Default.ShoppingCart, contentDescription = "")
            }
            Text("Click me") //color an theo text
            Text(" Right now", style = TextStyle(color = Color.White)) //color an theo text
            Icon(Icons.Default.ShoppingCart, contentDescription = "")
        }
    }

}

@Composable
fun DisableSimpleButton(){
    Button(onClick = {},
        colors = ButtonDefaults.buttonColors(
            disabledContainerColor = Color.Gray,
            disabledContentColor = Color.White
        ),
        enabled = false
        ) {
        Text("Disable button")
    }
}

@Composable
fun RoundedCornerButton(){
    Button(
        onClick = {},
        shape = RoundedCornerShape(topStart = 10.dp, bottomStart = 10.dp) //bo 1 ben nut
    ) {
        Text("Rounded corner button")
    }
}

@Composable
fun BorderSimpleButton(){//them vien cho nut
    Button(
        onClick = {},
        border = BorderStroke(width = 2.dp, color = Color.Magenta),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.White
        )
    ) {
        Text("checkout", color = Color.Magenta)
    }
}

@Composable
fun ElevationSimpleButton(){
    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.White,
            contentColor = Color.Black
        ),
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 10.dp,
            pressedElevation = 15.dp,
            disabledElevation = 0.dp
        )
    ) {
        Text("Elevation Button")
    }
}

@Composable
fun DemoClickable(){
    Column(modifier = Modifier.width(150.dp).clickable {  }) {
        Image(painter = painterResource(id = R.drawable.avarta1), contentDescription = "")
        Text("Product name")
        Text("$1000")
    }
}

@Composable
fun DemoDetectTapGestures(){
    val textContent = remember {
        mutableStateOf("")
    }
    Column {
        Text(text=textContent.value)
        Text(text="something", modifier = Modifier.pointerInput(Unit){
            detectTapGestures(
                onDoubleTap = {
                    textContent.value="double tap"
                },
                onLongPress = {
                    textContent.value="long press"
                },
                onPress = {
                    textContent.value = "press"
                }
            )
        })
    }
}

@Composable
fun DemoRadioButtonWithTitle(title:String){
    var ISSELECTED by remember { mutableStateOf(false) } //nếu lỗi hãy import
    Row(
        modifier = Modifier.selectable(
            selected = ISSELECTED,
            onClick = {ISSELECTED = !ISSELECTED},
            role = Role.RadioButton
        )
    ) {
        RadioButton(
            selected = ISSELECTED,
            onClick = null,
            colors = RadioButtonDefaults.colors(
                selectedColor = Color.Red,
                unselectedColor = Color.Green,
                disabledSelectedColor = Color.Gray
            ))
        Text(text= title, modifier = Modifier.padding(start = 8.dp))
    }
}

@Composable
fun DemoCustomRadioButton(title: String){
    var ISSELECTED by remember { mutableStateOf(false) } //nếu lỗi hãy import

    CustomRadioButton("Female", ISSELECTED=ISSELECTED) {
        ISSELECTED = !ISSELECTED
    }
}

@Composable
fun CustomRadioButton(title: String, ISSELECTED: Boolean, onClick:()->Unit){ //nên để 1 folder riêng
    Row(
        modifier = Modifier.selectable(
            selected = ISSELECTED,
            onClick = onClick,
            role = Role.RadioButton
        )
    ) {
        val iconRadio = if (ISSELECTED) Icons.Default.CheckCircle else Icons.Default.Clear
        Icon(iconRadio, contentDescription = null)
        Text(text= title, modifier = Modifier.padding(start = 8.dp))
    }
}

@Composable
fun DemoCheckboxWithTitle(title: String){
    var ISCHECKED by remember {
        mutableStateOf(false)
    }
    return Row(
        modifier = Modifier.selectable(
            selected = ISCHECKED,
            onClick = {
                ISCHECKED = !ISCHECKED
            },
            role = Role.Checkbox
        )
    ) {
//        Checkbox( //check box mac dinh, con ben duoi la custom
//            checked = ISCHECKED,
//            onCheckedChange = null,
//            colors = CheckboxDefaults.colors(
//                checkedColor = Color.Green,
//                uncheckedColor = Color.Red
//            ))
        val icon = if (ISCHECKED) Icons.Default.Done else Icons.Default.Close
        Icon(icon, contentDescription = null)
        Text(title, modifier = Modifier.padding(start = 8.dp))
    }
}

@Composable
fun DemoTextField(){
    var firstName by remember {
        mutableStateOf("")
    }
    val keyboardController = LocalSoftwareKeyboardController.current //dong code them cho 502
    TextField(
        value = firstName,
        onValueChange = { newValue ->
        firstName = newValue},
        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp, fontWeight = FontWeight.Bold),
        label = { Text("Firstname")}, //day label len tren khi nhap ban phim
        placeholder ={ Text("enter your first name")},
        leadingIcon = {
            Icon(
                Icons.Default.Person,
                contentDescription = "firstname",
                tint = Color.Red
            )},// hien thi truoc
        trailingIcon = {
            IconButton(onClick = {
                firstName = ""
            }) {
                Icon(
                    Icons.Default.Close,
                    contentDescription = null,
                    tint = Color.Blue
                )}
        },// hien thi sau
        colors = TextFieldDefaults.colors(
            cursorColor = Color.Green,
            unfocusedIndicatorColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
            errorIndicatorColor = Color.Transparent,
        ),
        shape = RoundedCornerShape(16.dp),
        keyboardOptions = KeyboardOptions(
            imeAction = ImeAction.Done,
            //keyboardType = KeyboardType.Phone //dung cho ban phim so
            //capitalization = KeyboardCapitalization.Words //viet hoa chu cai dau
        ),
        keyboardActions = KeyboardActions(// code them o dong 466
            onDone ={
                keyboardController?.hide() //bam done thi an ban phim di
            }
        )
        )
}

@Composable
fun DemoOutlineTextField(){
    var email by remember {
        mutableStateOf("")
    }
    OutlinedTextField(
        value = email,
        onValueChange = { newValue ->
        email = newValue
    },
        placeholder = { Text("usename/email")},
        label = { Text("usename/email")},
        leadingIcon = {Icon(Icons.Default.Email, contentDescription = null)}
        )
}

@Composable
fun PasswordCompose(){
    var password by remember {
        mutableStateOf("")
    }
    var isShowPassword by remember {
        mutableStateOf(false) //mac dinh la khong show
    }
    OutlinedTextField(value = password, onValueChange = {
        password = it
    },
        label = { Text("password")},
        placeholder = { Text("enter characters, number")},
        leadingIcon = {Icon(Icons.Default.Lock, contentDescription = null)},
        trailingIcon = {
            IconButton(onClick = {
                isShowPassword = !isShowPassword
            }) {
                Icon(
                    if (isShowPassword) Icons.Default.Search else Icons.Default.Lock,
                    contentDescription = null
                )
            }
        },
        visualTransformation = if (isShowPassword) VisualTransformation.None else PasswordVisualTransformation()
        )
}

@Composable
fun BoxItem(modifier: Modifier = Modifier,color: Color, size: Dp =100.dp){
    Box(
        modifier = modifier
            .size(size)
            .background(color=color)
    )
}

@Composable
fun GetOTP(){
    Box(modifier = Modifier.fillMaxSize()){
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth().align(Alignment.Center)
            ) {
                Text("code has been send to you")
                OutlinedTextField(value = "", onValueChange = {})
                CommonSpace()
                Text("Resend code in 53s")
            }
            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp)
                    .align(Alignment.BottomCenter)) {
                Text("Verify")
            }
        }
}

@Composable
fun DemoScroll(){
    Box(){
        Column {
            Column(
                modifier = Modifier
                    .size(300.dp, 400.dp)
                    .background(color = Color.Black)
                    .verticalScroll(
                        rememberScrollState()
                    )
            ) {
                BoxItem(color = Color.Blue)
                BoxItem(color = Color.Red)
                BoxItem(color = Color.Yellow)
                BoxItem(color = Color.Blue)
                BoxItem(color = Color.Red)
                BoxItem(color = Color.Yellow)
            }
            CommonSpace()
            Row (
                modifier = Modifier
                    .horizontalScroll(
                        rememberScrollState()
                    )
            ) {
                BoxItem(color = Color.Blue)
                BoxItem(color = Color.Red)
                BoxItem(color = Color.Yellow)
                BoxItem(color = Color.Blue)
                BoxItem(color = Color.Red)
                BoxItem(color = Color.Yellow)
            }
        }
    }
}

@Composable
fun CommonSpace(){
    Spacer(modifier = Modifier.height(20.dp))
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
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    VocvachTheme {
        HomeScreen()
    }
}
