package com.sumaya.hw_week06_day03

class PhotoResponse {
    @SerializedName("photo")
    lateinit var galleryItems: List<GalleryItem>
    lateinit var photos: PhotoResponse

}