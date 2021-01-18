package com.islasoft.atstore.retrofit;

import com.islasoft.atstore.retrofit.request.RequestLogin;
import com.islasoft.atstore.retrofit.request.RequestSignup;
import com.islasoft.atstore.retrofit.response.ResponseLogin;
import com.islasoft.atstore.retrofit.response.ResponseSignup;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

//Consumir Apis mediante Interfaces
public interface AtStoreService {

    @POST("/login")
    //Llama por metodo Async la respuesta que devuelve la api
    Call<ResponseLogin> doLogin(@Body RequestLogin reqLogin);

    @POST("/create_person")
    //Llama por metodo Async la respuesta que devuelve la api
    Call<ResponseSignup> doSignup(@Body RequestSignup reqSignup);
}
