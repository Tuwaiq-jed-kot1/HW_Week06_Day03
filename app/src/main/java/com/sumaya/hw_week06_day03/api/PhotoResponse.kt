package com.sumaya.hw_week06_day03.api

import com.sumaya.hw_week06_day03.GalleryItem
import com.google.gson.annotations.SerializedName

class PhotoResponse {
    @SerializedName("photo")
    lateinit var galleryItems: List<GalleryItem>
}