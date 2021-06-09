package com.projects.converto.main

import com.projects.converto.data.models.CurrencyResponse
import com.projects.converto.utils.Resource


interface MainRepository {

    suspend fun getRates(base: String): Resource<CurrencyResponse>
}