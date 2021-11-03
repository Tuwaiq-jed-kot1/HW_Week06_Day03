package com.sumaya.hw_week06_day03.PhotoGallaryActivity.api

import retrofit2.Call
import retrofit2.http.GET

interface FlickrApi {
    /* @GET("/")
     fun fetchContents(): Call<String>*/
    @GET(
        "services/rest/?method=flickr." +
                "interestingness.getList&api_key=2ef5e2f68997c0920c5a319503406019&format" +
                "=json&nojsoncallback=1&extras=url_s"
    )
    fun fetchPhotos(): Call<FlickrResponse>
}