package com.islasoft.atstore.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.islasoft.atstore.R;
import com.islasoft.atstore.retrofit.AtStoreClient;
import com.islasoft.atstore.retrofit.AtStoreService;
import com.islasoft.atstore.retrofit.request.RequestLogin;
import com.islasoft.atstore.retrofit.response.ResponseLogin;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edt_email;
    EditText edt_password;

    Button btn_login;

    //Variables Retrofit para definir acceso
    AtStoreClient atStoreClient;
    AtStoreService atStoreService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Ocultar ActionBar
        getSupportActionBar().hide();


        //Inicializar variables retrofit
        retrofitInit();

        //Inicializar variables xml
        initComponents();
        initActions();

    }

    private void retrofitInit() {
        atStoreClient = AtStoreClient.getInstance(); //Crea la instancia para la conexion a la Api
        atStoreService = atStoreClient.getAtStoreService(); //Obtiene la instancia y se llama las rutas del service
    }

    private void initComponents() {
        edt_email = findViewById(R.id.edt_email);
        edt_password = findViewById(R.id.edt_password);

        btn_login = findViewById(R.id.btn_ingresar);
    }

    private void initActions() {
        btn_login.setOnClickListener(this);
    }

    private void toast (String txt){
        Toast.makeText(this, txt, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id){
            case R.id.btn_ingresar:
                goToLogin();
                break;
        }
    }

    //Metodo de Inicio de Sesión
    private void goToLogin() {
        String email = edt_email.getText().toString();
        String password = edt_password.getText().toString();

        if (email.isEmpty()){
            edt_email.setError("Complete el campo!!");
        }else if(password.isEmpty()){
            edt_password.setError("Complete el campo!!");
        }else{
            RequestLogin reqLogin = new RequestLogin(email, password); //Encapsula el objeto de la petición

            Call<ResponseLogin> call = atStoreService.doLogin(reqLogin); //Llamada al metodo

            call.enqueue(new Callback<ResponseLogin>() {
                @Override
                public void onResponse(Call<ResponseLogin> call, Response<ResponseLogin> response) {
                    if (response.isSuccessful()){
                        toast("Sesión Iniciada Correctamente");

                        //Destruimos este activity para que no retorne a iniciar sesión nuevamente
                        //finish();
                    }else {
                        toast("Algo anda mal, revise sus datos de acceso!!");
                        Log.i("Resp_Err", response.message());
                    }
                }

                @Override
                public void onFailure(Call<ResponseLogin> call, Throwable t) {
                    toast("Problemas de Conexión");
                    Log.i("Api_Conn", t.getMessage());
                }
            });
        }
    }


}