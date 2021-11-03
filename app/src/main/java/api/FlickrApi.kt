package api

import android.telecom.Call
import retrofit2.http.GET


interface FlickrApi {
    @GET("/")
    fun fetchContents(): Call<String>

}