package com.example.social.network;

import com.example.social.model.feed.Feed;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RestApi {
    @GET("/v2/everything")
    Call<Feed> fetchFeed(@Query("q") String q,
                         @Query("apiKey") String apiKey,
                         @Query("page") long page,
                         @Query("pageSize") int pageSize);

    @GET("/v2/top-headlines")
    Call<Feed> fetchFeedByLanguage(@Query("country") String country,
                                   @Query("category") String category,
                                   @Query("apiKey") String apiKey,
                                   @Query("page") long page,
                                   @Query("pageSize") int pageSize);
}