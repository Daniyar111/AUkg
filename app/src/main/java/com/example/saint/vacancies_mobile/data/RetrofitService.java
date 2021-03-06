package com.example.saint.vacancies_mobile.data;

import com.example.saint.vacancies_mobile.data.models.VacancyModel;
import com.example.saint.vacancies_mobile.utils.Constants;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface RetrofitService {

    @FormUrlEncoded
    @POST(Constants.MOBILE_API)
    Call<ArrayList<VacancyModel>> postVacancies(@Field("login") String login,
                                           @Field("f") String f,
                                           @Field("limit") String limit,
                                           @Field("page") String page);

    @FormUrlEncoded
    @POST(Constants.MOBILE_API)
    Call<ArrayList<VacancyModel>> postSearchingVacancies(@Field("login") String login,
                                                         @Field("f") String f,
                                                         @Field("limit") String limit,
                                                         @Field("page") String page,
                                                         @Field("salary") String salary,
                                                         @Field("term") String term);
}
