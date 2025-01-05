package com.example.android2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class SecondActivity : AppCompatActivity() {

    private lateinit var viewPager2: ViewPager2
    private lateinit var viewPagerImages: ArrayList<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Initialize ViewPager2 images
        viewPagerImages = arrayListOf(
            R.drawable.french,
            R.drawable.ombre,
            R.drawable.red,
            R.drawable.chrome,
        )

        viewPager2 = findViewById(R.id.viewPager2)
        viewPager2.adapter = ViewPagerAdapter(viewPagerImages)
    }
}