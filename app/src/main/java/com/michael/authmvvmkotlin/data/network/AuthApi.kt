package com.michael.authmvvmkotlin.data.network;

import androidx.datastore.preferences.protobuf.Any;
import com.michael.authmvvmkotlin.data.model.LoginResponse
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

public interface AuthApi {

    @FormUrlEncoded
    @POST("auth/login")
    suspend fun login(
        @Field("email") email: String,
        @Field("password") password: String
    ): LoginResponse
}
