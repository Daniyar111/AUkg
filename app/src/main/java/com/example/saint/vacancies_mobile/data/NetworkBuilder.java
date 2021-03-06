package com.example.saint.vacancies_mobile.data;

import com.example.saint.vacancies_mobile.utils.Constants;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public final class NetworkBuilder {

    private static RetrofitService sService = null;

    public static RetrofitService initService() {
        if (sService == null) {
            sService = new Retrofit.Builder()
                    .baseUrl(Constants.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(getClient())
                    .build()
                    .create(RetrofitService.class);
        }
        return sService;
    }

    private static OkHttpClient getClient() {

        return new OkHttpClient.Builder()
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {

                        Request.Builder builder = chain.request()
                                .newBuilder()
                                .addHeader("Accept", "application/json;versions=1");

                        return chain.proceed(builder.build());
                    }
                })
                .writeTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .connectTimeout(30, TimeUnit.SECONDS)
                .build();
    }
}
