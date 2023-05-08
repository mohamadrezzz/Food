package com.example.food

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.food.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainView()
                }
            }
        }
    }
}

@Composable
fun MainView() {
    var count by remember { mutableStateOf(1) }
    var liked by remember { mutableStateOf(false) }
    Box(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        ) {
            Column(modifier = Modifier.padding(top = 380.dp)) {
                Row(
                    Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Green Salad",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(horizontal = 45.dp)

                    )
                    Text(
                        text = "299$",
                        fontSize = 16.sp,
                        color = Color.Red,
                        modifier = Modifier.padding(horizontal = 25.dp)

                    )
                }
                Spacer(modifier = Modifier.height(10.dp))

                Row(
                    Modifier
                        .fillMaxWidth()
                ) {
                    Button(
                        onClick = { if (count > 1) count-- },

                        Modifier
                            .clip(RoundedCornerShape(5.dp))
                            .padding(30.dp, 0.dp, 0.dp, 0.dp)
                            .size(40.dp),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = AppGray,
                            contentColor = Color.White
                        )
                    ) {
                        Text(text = "-")
                    }
                    Button(
                        onClick = { },
                        Modifier
                            .clip(RoundedCornerShape(5.dp))
                            .padding(5.dp, 0.dp, 0.dp, 0.dp)
                            .size(40.dp),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = AppGray,
                            contentColor = Color.Black
                        )
                    ) {
                        Text(text = count.toString())
                    }
                    Button(
                        onClick = { if(count < 9)count++ },
                        Modifier
                            .clip(RoundedCornerShape(5.dp))
                            .padding(5.dp, 0.dp, 0.dp, 0.dp)
                            .size(40.dp),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = AppGray,
                            contentColor = Color.White
                        )
                    ) {
                        Text(text = "+")
                    }
                    Spacer(modifier = Modifier.width(50.dp))
                    IconButton(
                        onClick = { liked = !liked },
                        modifier = Modifier
                            .size(38.dp)
                            .padding(5.dp, 5.dp, 0.dp, 5.dp)

                    ) {
                        Icon(
                            painter = painterResource(id = if (liked) R.drawable.heart_fill else R.drawable.heart_empty),
                            contentDescription = "",
                            tint = if (liked) AppRed else AppGray
                            )

                    }
                }
                Text(
                    text = "burger at home delivery available order now",
                    fontSize = 15.sp,
                    color = Black2,
                    modifier = Modifier.padding(start = 45.dp, top = 30.dp)
                )
                Text(
                    text = "organic healthy delicious salad",
                    fontSize = 15.sp,
                    color = Black2,
                    modifier = Modifier.padding(start = 80.dp, top = 10.dp)
                )
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(65.dp)

                    ) {
                    Icon(
                        painter = painterResource(id =  R.drawable.star),
                        contentDescription = "",
                        modifier = Modifier
                            .padding(30.dp, 0.dp, 0.dp, 0.dp)
                            .size(35.dp),
                        tint = AppYellow,
                        )
                    Icon(
                        painter = painterResource(id =  R.drawable.star),
                        contentDescription = "",
                        modifier = Modifier
                            .padding(5.dp, 0.dp, 0.dp, 0.dp)
                            .size(35.dp),
                        tint = AppYellow,
                    )
                    Icon(
                        painter = painterResource(id =  R.drawable.star),
                        contentDescription = "",
                        modifier = Modifier
                            .padding(5.dp, 0.dp, 0.dp, 0.dp)
                            .size(35.dp),
                        tint = AppYellow,
                    )
                    Icon(
                        painter = painterResource(id =  R.drawable.star),
                        contentDescription = "",
                        modifier = Modifier
                            .padding(5.dp, 0.dp, 0.dp, 0.dp)
                            .size(35.dp),
                        tint = AppYellow,
                    )
                    Icon(
                        painter = painterResource(id =  R.drawable.star),
                        contentDescription = "",
                        modifier = Modifier
                            .padding(5.dp, 0.dp, 0.dp, 0.dp)
                            .size(35.dp),
                        tint = AppGray,
                    )
                }

                Row(
                    ) {
                    Button(
                        onClick = { count = 1},
                        modifier = Modifier
                            .width(200.dp)
                            .height(50.dp)
                            .padding(5.dp, 0.dp, 0.dp, 0.dp)
                            .clip(RoundedCornerShape(50)),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color.Black,
                            contentColor = Color.White
                        )

                    ) {
                        Text(text = "Add to Cart")
                    }
                    Button(
                        onClick = { count = 1 },
                        modifier = Modifier
                            .width(200.dp)
                            .height(50.dp)
                            .padding(0.dp, 0.dp, 5.dp, 0.dp)
                            .clip(RoundedCornerShape(50)),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = AppYellow,
                            contentColor = Color.Black
                        )

                    ) {
                        Text(text = "Buy Now")
                    }
                }
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(370.dp)
                .clip(RoundedCornerShape(0.dp, 0.dp, 60.dp, 60.dp))

        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(AppYellow)
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Row(
                        Modifier
                            .fillMaxWidth()
                            .padding(20.dp, 15.dp, 20.dp, 0.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.icon),
                            contentDescription = "",
                            modifier = Modifier.size(40.dp),
                            tint = Color.Black
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.logo),
                            contentDescription = "",
                            modifier = Modifier.size(40.dp),
                            tint = Color.Black
                        )
                    }
                    Image(
                        painter = painterResource(id = R.drawable.food),
                        contentDescription = "food",
                        modifier = Modifier
                            .size(300.dp)
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FoodTheme {
        MainView()
    }
}