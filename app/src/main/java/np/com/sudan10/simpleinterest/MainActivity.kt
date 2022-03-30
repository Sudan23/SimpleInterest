package np.com.sudan10.simpleinterest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




//        val interest = (p * t * r)/100


        val calc = findViewById<Button>(R.id.calulate_btn)
        calc.setOnClickListener {

            val principal  = findViewById<EditText>(R.id.principle_et).text.toString().toFloat()
            val rate = findViewById<EditText>(R.id.rate_et).text.toString().toFloat()
            val time = findViewById<EditText>(R.id.time_et).text.toString().toFloat()

            val interest = (principal * rate * time) / 100


            Toast.makeText(this, "$interest", Toast.LENGTH_SHORT).show()

        }
    }
}