package com.informatika19100018.databarang.network

import com.informatika19100018.databarang.model.ResponseActionBarang
import com.informatika19100018.databarang.model.ResponseBarang
import com.informatika19100018.databarang.model.ResponseUsersItem
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST


interface ApiService {
    @GET("read.php")
    fun getBarang(): Call<ResponseBarang>

    @FormUrlEncoded
    @POST("create.php")
    fun insertBarang(
        @Field("Nama_barang") namaBarang: String?,
        @Field("Jumlah_barang") jmlBarang: String?
    ): Call<ResponseActionBarang>

    @FormUrlEncoded
    @POST("update.php")
    fun updateBarang(
        @Field("id") id: String?,
        namaBarang: String,
        jmlBarang: String
    ): Call<ResponseActionBarang>

    @FormUrlEncoded
    @POST("delete.php")
    fun deleteBarang(
        @Field("id") id: String?
    ): Call<ResponseActionBarang>
}