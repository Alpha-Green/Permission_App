package com.noahgreenmusic.myapplication.api

object RetrofitProvider {

    private val retrofit = Retrofit.builder().baseUrl("https://jsonplaceholder.typicode.com/")
        .addConveterFactory(GsonConverterFactory.Create()).build()

    var placeHolderAPI = retrofit.create(PlaceHolderAPI::class.java)
}