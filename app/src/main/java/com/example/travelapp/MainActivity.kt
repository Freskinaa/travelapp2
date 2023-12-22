package com.example.travelapp
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.view.ViewTreeObserver
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RelativeLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val getStartedButton: TextView = findViewById(R.id.textView2)
        getStartedButton.setOnClickListener {
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(intent)

        }
    }
}
class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val imageView1: ImageView = findViewById(R.id.imageView1)
        imageView1.setOnClickListener {
            val intent = Intent(this@SecondActivity, MountainsActivity::class.java)
            startActivity(intent)
        }

        val imageView3: ImageView = findViewById(R.id.imageView3)
        imageView3.setOnClickListener {
            val intent = Intent(this@SecondActivity, FortressActivity::class.java)
            startActivity(intent)
        }
        val imageView2: ImageView = findViewById(R.id.imageView2)
        imageView2.setOnClickListener {
            val intent = Intent(this@SecondActivity, LakeActivity::class.java)
            startActivity(intent)
        }
        val imageView4: ImageView = findViewById(R.id.imageView4)
        imageView4.setOnClickListener {
            val intent = Intent(this@SecondActivity, CityActivity::class.java)
            startActivity(intent)
        }
    }
}

class MountainsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mountains)
        val button1: Button = findViewById(R.id.button1)

        // Set an OnClickListener for the Button
        button1.setOnClickListener {
            val intent = Intent(this@MountainsActivity, SecondActivity::class.java)

            // Start the SecondActivity
            startActivity(intent)
    }

}}
class FortressActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fortress)

        // Find the Button by its ID
        val button1: Button = findViewById(R.id.button1)

        // Set an OnClickListener for the Button
        button1.setOnClickListener {
            val intent = Intent(this@FortressActivity, SecondActivity::class.java)

            // Start the SecondActivity
            startActivity(intent)
        }
    }
}
    class LakeActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_lake)

            // Find the Button by its ID
            val button1: Button = findViewById(R.id.button1)

            // Set an OnClickListener for the Button
            button1.setOnClickListener {
                val intent = Intent(this@LakeActivity, SecondActivity::class.java)

                // Start the SecondActivity
                startActivity(intent)
            }
        }
    }
class CityActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_city)

        // Find the Button by its ID
        val button1: Button = findViewById(R.id.button1)

        // Set an OnClickListener for the Button
        button1.setOnClickListener {
            val intent = Intent(this@CityActivity, SecondActivity::class.java)

            // Start the SecondActivity
            startActivity(intent)
        }
    }
}