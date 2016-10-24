package com.example.abdellah.portfolioapp;

import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button mybutton1s = (Button)findViewById(R.id.button1);
        Button mybutton2s = (Button)findViewById(R.id.button2);
        Button mybutton3s = (Button)findViewById(R.id.button3);
        Button mybutton4s = (Button)findViewById(R.id.button4);
        Button mybutton5s = (Button)findViewById(R.id.button5);
        Button mybutton6s = (Button)findViewById(R.id.button6);

        mybutton1s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             Toast.makeText(MainActivity.this, "this button will launch Popular Movies App ", LENGTH_LONG).show();


            }
        });

        mybutton2s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "this button will launch my Stock Hawk App ", LENGTH_LONG).show();
            }
        });

        mybutton3s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "this button will launch my  Build it Bigger App ", LENGTH_LONG).show();
            }
        });

        mybutton4s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "this button will launch my  Make Your App Material App ", LENGTH_LONG).show();
            }
        });

        mybutton5s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "this button will launch my Go Ubiquitous App ", LENGTH_LONG).show();
            }
        });
        mybutton6s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "this button will launch my Capstone  App ", LENGTH_LONG).show();
            }
        });

    }



}
