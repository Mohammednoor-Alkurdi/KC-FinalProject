package com.example.heartbeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class DP1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN) ;
        setContentView(R.layout.activity_dp1);



        Bundle bundle = getIntent().getExtras() ;

        Button dp1butt = findViewById(R.id.dp1butt) ;

        String Name = bundle.getString("name") ;


        dp1butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(DP1.this , DP2.class) ;

                intent.putExtra("name" , Name) ;


                startActivity(intent) ;

            }
        });









    }
}