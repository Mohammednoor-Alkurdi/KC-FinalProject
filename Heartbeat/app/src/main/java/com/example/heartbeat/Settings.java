package com.example.heartbeat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN) ;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        TextView p7tv1 = findViewById(R.id.p7tv1) ;
        TextView p7tv2 = findViewById(R.id.p7tv2) ;



        Bundle bundle = getIntent().getExtras() ;

        String name2 = bundle.getString("name2") ;

        p7tv1.setText(name2);

        int age = bundle.getInt("age") ;

        p7tv2.setText(String.valueOf(age));










    }
}