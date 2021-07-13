package com.noahgreenmusic.myapplication.api

import android.telecom.Call
import com.noahgreenmusic.myapplication.models.User

interface PlaceHolderAPI {

    @GET(value "users")

    fun getUsers(): Call<List<User>>
}