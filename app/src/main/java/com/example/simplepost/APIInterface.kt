package com.example.simplepost


import retrofit2.Call
import retrofit2.http.*



interface APIInterface {
    @Headers("Content-Type: application/json")
    @GET("/people/")
    fun getUser(): Call<List<People.PeopleDetailed>>

    @Headers("Content-Type: application/json")
    @POST("/people/")
    fun addUser(@Body userData: People.PeopleDetailed): Call<People.PeopleDetailed>

}
