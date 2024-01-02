package com.example.travelapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class UlpianaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ulpiana_activity)

        val videoView: VideoView = findViewById(R.id.videoView)
        val mediaController = MediaController(this)

        val videoPath = "android.resource://${packageName}/${R.raw.ulpiana}"
        val uri = Uri.parse(videoPath)

        videoView.setVideoURI(uri)
        videoView.setMediaController(mediaController)
        mediaController.setAnchorView(videoView)
        videoView.start()
        val imageView: ImageView = findViewById(R.id.imageView)
        imageView.setOnClickListener {
            navigateToSecondActivity()
        }
    }

    private fun navigateToSecondActivity() {
        val intent = Intent(this@UlpianaActivity, SecondActivity::class.java)
        startActivity(intent)
    }
}
