package com.example.mythirdapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_gallery.*

class GalleryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)
        //データの受け取り
        val id= intent.getIntExtra("TITLE",0)

        if(id == R.string.gallery_activity_title)
        {
            watchImage.setImageResource(R.drawable.images)
        }
    }

//    private fun saveData()
}