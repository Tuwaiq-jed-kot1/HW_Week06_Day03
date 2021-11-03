package com.sumaya.hw_week06_day03.api

import retrofit2.Call
import com.sumaya.hw_week06_day03.PhotoResponse
import retrofit2.http.GET

interface FlickrApi {
    @GET(
        "method=flickr.interestingness.getList&api_key=603510ea46cdb6061685261ab60a0404&extras=url_s"
    //
    )
    fun fetchPhotos(): Call<PhotoResponse>
}