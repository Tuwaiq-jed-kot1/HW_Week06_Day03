package com.sumaya.hw_week06_day03.api

import retrofit2.Call
import retrofit2.http.GET

// this represents DAO
interface FlickrApi {

    /*@GET("/")
    fun fetchContents(): Call<String>*/

    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=yourApiKeyHere" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    fun fetchPhotos(): Call<String>
}