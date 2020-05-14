package com.skhu.capstone2020.REST_API;

import com.skhu.capstone2020.Model.AddressResponse;
import com.skhu.capstone2020.Model.PlaceResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface KakaoLocalApi {
    String base = "https://dapi.kakao.com/";
    String key = "KakaoAK 651f3f5b5087073c6f75c4a053e75eaa";

    @GET("v2/local/search/category.json")
    Call<PlaceResponse> getPlaces(@Header("Authorization") String key, @Query("x") String x, @Query("y") String y,
                                  @Query("category_group_code") String groupCode, @Query("radius") int radius, @Query("sort") String sort);

    @GET("v2/local/geo/coord2address.json")
    Call<AddressResponse> getAddress(@Header("Authorization") String key, @Query("x") String longitude, @Query("y") String latitude);
}
