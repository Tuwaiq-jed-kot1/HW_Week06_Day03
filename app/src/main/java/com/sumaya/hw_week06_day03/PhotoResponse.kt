package com.sumaya.hw_week06_day03

import com.google.gson.annotations.SerializedName
import com.sumaya.hw_week06_day03.data.GalleryItem

class PhotoResponse {
    @SerializedName("photo")
    lateinit var galleryItems: List<GalleryItem>
    lateinit var photos: PhotoResponse

}