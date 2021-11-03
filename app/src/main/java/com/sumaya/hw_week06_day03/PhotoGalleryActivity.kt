package com.sumaya.hw_week06_day03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PhotoGalleryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo_gallery)
    }

    // create an instance of PhotoGalleryFragment and add it to the container.
    val isFragmentContainerEmpty = savedInstanceState == null
    if (isFragmentContainerEmpty) {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragmentContainer, PhotoGalleryFragment.newInstance())
            .commit()
    }
}