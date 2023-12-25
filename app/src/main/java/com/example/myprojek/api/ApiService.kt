package com.example.myprojek.api
import com.example.myprojek.model.ResponModel
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST
interface ApiService {
    @FormUrlEncoded
    @POST("register")
    fun register(
        @Field("name") name: String,
        @Field("email") email: String,
        @Field("password") password: String,
    ): Call<ResponModel>


    @FormUrlEncoded
    @POST("login")
    fun login(
        @Field("email") username: String,
        @Field("password") password: String,
    ): Call<ResponModel>
}