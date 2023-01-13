package com.example.api_calls

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val baseUrl="https://quotable.io/"
val retrofit: Retrofit =Retrofit.Builder()
    .baseUrl(baseUrl)
    .addConverterFactory(GsonConverterFactory.create())
    .build()

object QuotesAPI
{
    val retrofitService:quotesApiInterface by lazy {
        retrofit.create(quotesApiInterface::class.java)
    }

}



