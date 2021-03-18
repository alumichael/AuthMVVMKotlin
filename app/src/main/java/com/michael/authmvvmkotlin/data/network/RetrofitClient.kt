package com.michael.authmvvmkotlin.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {
    companion object{
        private const val BASE_URL="http://simplifiedcoding.tech/mywebapp/public"
    }

    fun <Api>buildApi(
        api: Class<Api>
    ): Api{

        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(api)
    }
}