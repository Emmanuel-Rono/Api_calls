package com.example.api_calls

import retrofit2.Response
import retrofit2.http.GET

interface quotesApiInterface
{
    @GET("/random")
    suspend fun getQoutes():Response<QuoteList>


}