package com.builditcreative.androidapp.api;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ServicesApi {

    @POST("api.php/")
    @FormUrlEncoded
    Call<ApiData> getData(@Field("event_id") String fname,
                                        @Field("lang_id") String lname,
                                        @Field("time_zone") String email);

}
