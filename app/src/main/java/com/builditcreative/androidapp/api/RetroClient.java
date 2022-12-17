package com.builditcreative.androidapp.api;


import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroClient {

    private static RetroClient retroClient;
    private ServicesApi servicesApi;
    private Retrofit retrofit;

    public static void initRetroClient() {
        retroClient = new RetroClient();

        retroClient.retrofit = new Retrofit.Builder()
                .baseUrl("https://login-panel.elsnerdev.com/")
                .client(getOkHttpClient())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        retroClient.servicesApi = retroClient.retrofit.create(ServicesApi.class);
    }


    public static ServicesApi getServicesAPI() {
        return retroClient.servicesApi;
    }


    private static OkHttpClient getOkHttpClient() {
        HttpLoggingInterceptor debugLogging = new HttpLoggingInterceptor();
        debugLogging.setLevel(HttpLoggingInterceptor.Level.NONE);
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(debugLogging)
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .addInterceptor(chain -> {
                    Request originalReq = chain.request();
                    originalReq.url();
                    return chain.proceed(originalReq);

                })
                .build();
        return client;
    }
}
