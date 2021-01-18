package com.islasoft.atstore.common;

import android.app.Application;
import android.content.Context;

//Mejorar el acceso al contexto
public class MyApp extends Application {
    private static MyApp instance;

    //Devuelve la isntancia creada instance
    public static MyApp getInstance(){
        return instance;
    }

    //Obtener el context de la app
    public static Context getContext(){
        return instance;
    }

    //Se crea solo una vez cuando se abre la app
    @Override
    public void onCreate() {
        instance = this;
        super.onCreate();
    }
}
