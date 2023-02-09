package claudiu.balciza.test1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import claudiu.balciza.test1.ui.theme.Test1Theme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    var list: List<String> = listOf("aaa", "bbb", "ccc")
    setContent {
      Test1Theme {
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
          ListComposable(list)
          Greeting("Android")
        }
      }
    }
  }
}

@Composable
fun Greeting(name: String) {
  Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
  Test1Theme {
    Greeting("Android")
  }
}

@Composable
fun ListComposable(myList: List<String>) {
  Row(horizontalArrangement = Arrangement.SpaceBetween) {
    Column {
      for (item in myList) {
        Text("Item: $item")
      }
    }
    Text("Count: ${myList.size}")
  }
}
