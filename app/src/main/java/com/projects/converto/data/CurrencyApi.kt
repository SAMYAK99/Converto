package com.projects.converto.data


import com.projects.converto.data.models.CurrencyResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApi {

    @GET("/latest?access_key=93f7dbf2542f4d512b45cd1b263d1d09")
    suspend fun getRates(
        @Query("base") base: String
    ): Response<CurrencyResponse>
}