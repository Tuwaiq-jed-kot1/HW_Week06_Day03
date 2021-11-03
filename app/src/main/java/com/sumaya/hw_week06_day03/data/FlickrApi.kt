package com.sumaya.hw_week06_day03.data

import retrofit2.Call
import retrofit2.http.GET

interface FlickrApi {
        @GET(
                "services/rest/?method=flickr.interestingness.getList" +
                        "&api_key=1b7927fc4e8b0ea384d1e23718565b01" +
                        "&format=json" +
                        "&nojsoncallback=1" +
                        "&extras=url_s"
        )
        fun fetchPhotos(): Call<FlickrResponse>
}
