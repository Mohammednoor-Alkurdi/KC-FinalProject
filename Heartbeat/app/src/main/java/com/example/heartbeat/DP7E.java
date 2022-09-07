package com.example.heartbeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class DP7E extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN) ;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dp7_e);


        Bundle bundle = getIntent().getExtras() ;


        double cal = bundle.getDouble("cal");
        double BMI = bundle.getDouble("bmi");

        String Name = bundle.getString("name") ;


        double protein = bundle.getDouble("protein") ;



                Button dp7ebutt1 = findViewById(R.id.dp7ebutt1) ;
        Button dp7ebutt2 = findViewById(R.id.dp7ebutt2) ;


        dp7ebutt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(DP7E.this,GainYesMale .class);

                intent.putExtra("cal", cal);
                intent.putExtra("bmi", BMI);

                intent.putExtra("protein" , protein) ;

                intent.putExtra("name" , Name) ;



                startActivity(intent);


            }
        });


        dp7ebutt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(DP7E.this ,  GainNoMale.class);

                intent.putExtra("cal", cal);
                intent.putExtra("bmi", BMI);

                intent.putExtra("name" , Name) ;

                intent.putExtra("protein" , protein) ;

                startActivity(intent);

            }
        });









    }
}