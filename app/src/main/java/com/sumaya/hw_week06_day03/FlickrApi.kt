package com.sumaya.hw_week06_day03

import retrofit2.Call
import retrofit2.http.GET

interface FlickrApi {
    @GET("services/rest/?method=flickr.interestingness.getList" +
        "&api_key=7389686c4a2c69250786e34ffb34d48f"+
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s")
    fun fetchPhotos(): Call<FlickrResponse>
}