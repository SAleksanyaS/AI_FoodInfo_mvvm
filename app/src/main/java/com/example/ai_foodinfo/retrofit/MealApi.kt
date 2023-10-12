package com.example.ai_foodinfo.retrofit

import com.example.ai_foodinfo.pojo.MealList
import retrofit2.Call
import retrofit2.http.Query
import retrofit2.http.GET

interface MealApi {
    @GET("random.php")
    fun getRandomMeal():Call<MealList>

    @GET("lookup.php?")
    fun getMealDetails(@Query("i") id:String) : Call<MealList>
}