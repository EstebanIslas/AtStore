package com.islasoft.atstore.retrofit;

import com.islasoft.atstore.RequestLogin;
import com.islasoft.atstore.RequestSignup;
import com.islasoft.atstore.ResponseLogin;
import com.islasoft.atstore.ResponseSignup;

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
