package com.islasoft.atstore.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.islasoft.atstore.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Ocultar ActionBar
        getSupportActionBar().hide();
    }
}