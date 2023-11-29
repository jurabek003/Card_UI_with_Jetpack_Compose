package uz.turgunboyevjurabek.carduiwithjetpackcompose

import android.health.connect.datatypes.ElevationGainedRecord
import android.icu.text.CaseMap.Title
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.turgunboyevjurabek.carduiwithjetpackcompose.ui.theme.CardUIWithJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CardUIWithJetpackComposeTheme {
               // Greeting(name = "Assalom alekum")
                GreetingPreview()
            }
        }
    }
}

@Composable
fun CardView(painter :Painter,description: String, title: String,modifier: Modifier = Modifier) {

    Card(modifier=modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
    ) {
        Box(modifier = Modifier.height(200.dp)){
            Image(painter = painter, contentDescription = description,contentScale=ContentScale.Crop)

            Box(modifier = Modifier.fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.LightGray
                        ),
                        startY = 300f
                    )
                ))

         Box(modifier = Modifier
             .fillMaxSize()
             .padding(12.dp),
             contentAlignment = Alignment.BottomStart ){
             Column(modifier=modifier.padding(2.dp)) {
                 Text(text = title, style = TextStyle(color = Color.Blue, fontFamily = FontFamily.Cursive, fontSize = 16.sp))
                 Text(text = description, style = TextStyle(color = Color.Blue, fontFamily = FontFamily.Cursive, fontSize = 16.sp))
             }

         }

        }
    }

}

@Preview(showSystemUi  = true)
@Composable
fun GreetingPreview() {
    CardUIWithJetpackComposeTheme {
        val rasm= painterResource(id = R.drawable.r1)

        Box(modifier = Modifier.fillMaxWidth(0.5f)
            .padding(16.dp)){
            CardView(painter =rasm, description ="Assalom alekum" , title ="Android" )
        }


    }
}