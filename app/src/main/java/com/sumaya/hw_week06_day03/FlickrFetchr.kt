package com.sumaya.hw_week06_day03

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.sumaya.hw_week06_day03.api.FlickrApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory

class FlickrFetchr {
        private val flickrApi: FlickrApi

        init {
            val retrofit: Retrofit = Retrofit.Builder()
                //.baseUrl("https://www.flickr.com/")
                .baseUrl("https://api.flickr.com/")
                .addConverterFactory(ScalarsConverterFactory.create())
                .build()
            flickrApi = retrofit.create(FlickrApi::class.java)
        }


    //fun fetchContents(): LiveData<String> {
    fun fetchPhotos(): LiveData<String> {
        val responseLiveData: MutableLiveData<String> = MutableLiveData()
        val flickrRequest: Call<String> = flickrApi.fetchPhotos() //fetchContents()
        flickrRequest.enqueue(object : Callback<String> {
            override fun onFailure(call: Call<String>, t: Throwable) {
                Log.e(TAG, "Failed to fetch photos", t)
            }
            override fun onResponse(
                call: Call<String>,
                response: Response<String>
            ) {
                Log.d(TAG, "Response received")
                responseLiveData.value = response.body()
            }
        })
        return responseLiveData
    }
}