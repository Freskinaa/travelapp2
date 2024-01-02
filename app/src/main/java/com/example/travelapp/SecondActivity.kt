package com.example.travelapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

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

        val imageView19: ImageView = findViewById(R.id.imageView19)
        imageView19.setOnClickListener {
            val intent = Intent(this@SecondActivity, MenuActivity::class.java)
            startActivity(intent)
        }

        val imageView5: ImageView = findViewById(R.id.imageView5)
        imageView5.setOnClickListener {
            val intent = Intent(this@SecondActivity, BrezovicaActivity::class.java)
            startActivity(intent)
        }
        val imageView6: ImageView = findViewById(R.id.imageView6)
        imageView6.setOnClickListener {
            val intent = Intent(this@SecondActivity, LiqeniBatllavesActivity::class.java)
            startActivity(intent)
        }
        val imageView7: ImageView = findViewById(R.id.imageView7)
        imageView7.setOnClickListener {
            val intent = Intent(this@SecondActivity, PrizreniActivity::class.java)
            startActivity(intent)
        }
        val imageView8: ImageView = findViewById(R.id.imageView8)
        imageView8.setOnClickListener {
            val intent = Intent(this@SecondActivity, MirushaActivity::class.java)
            startActivity(intent)
        }
        val imageView9: ImageView = findViewById(R.id.imageView9)
        imageView9.setOnClickListener {
            val intent = Intent(this@SecondActivity, BogeActivity::class.java)
            startActivity(intent)
        }
        val imageView10: ImageView = findViewById(R.id.imageView10)
        imageView10.setOnClickListener {
            val intent = Intent(this@SecondActivity, LiqenatiActivity::class.java)
            startActivity(intent)
        }
        val imageView17: ImageView = findViewById(R.id.imageView17)
        imageView17.setOnClickListener {
            val intent = Intent(this@SecondActivity, LumiLlapActivity::class.java)
            startActivity(intent)
        }
        val imageView18: ImageView = findViewById(R.id.imageView18)
        imageView18.setOnClickListener {
            val intent = Intent(this@SecondActivity, UlpianaActivity::class.java)
            startActivity(intent)
        }

    }
}
