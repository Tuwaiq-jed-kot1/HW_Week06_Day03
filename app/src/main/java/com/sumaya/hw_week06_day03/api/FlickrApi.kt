package com.sumaya.hw_week06_day03.api

import com.sumaya.hw_week06_day03.data.FlickrResponse
import retrofit2.Call
import retrofit2.http.GET

interface FlickrApi {
@GET("?method=flickr.interestingness.getList&api_key=e4a9e94f8900a71a43a20d8eee021d6e&format=json&nojsoncallback=1&extras=url_s")
fun fetchPhotos(): Call<FlickrResponse>
}