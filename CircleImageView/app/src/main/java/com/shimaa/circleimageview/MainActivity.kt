package com.shimaa.circleimageview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.squareup.picasso.Picasso
import de.hdodenhof.circleimageview.CircleImageView

class MainActivity : AppCompatActivity() {

    private lateinit var circleImageView:CircleImageView
    private lateinit var loadImage:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        circleImageView=findViewById(R.id.profile_image)
        loadImage=findViewById(R.id.loadbtn)

        loadImage.setOnClickListener({

            Picasso.get().load("https://www.elastic.co/assets/bltada7771f270d08f6/enhanced-buzz-1492-1379411828-15.jpg").into(circleImageView);

        })
    }
}
