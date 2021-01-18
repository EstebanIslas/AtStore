package com.islasoft.atstore.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

//Define el patron Singleton para la conexión a la API
public class AtStoreClient {

    private static AtStoreClient instance = null; //guarda la instancia del objeto de tipo class
    private AtStoreService atStoreService;
    private Retrofit retrofit;

    //Constructor
    public AtStoreClient() {
        //Crea una instancia al objeto retrofit
        retrofit = new Retrofit.Builder()
                .baseUrl("")
                .addConverterFactory(GsonConverterFactory.create())
                .build(); //Como parametros las credenciales de conexión

        atStoreService = retrofit.create(AtStoreService.class); //Añade el servicio
    }
}
