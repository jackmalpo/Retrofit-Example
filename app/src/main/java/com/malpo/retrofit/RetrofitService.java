package com.malpo.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

interface RetrofitService {

    @GET("/posts")
    Call<List<Post>> getPosts();

    @GET("/posts/{id}/comments")
    Call<List<Comment>> getComments(@Path("id") int id);

}
