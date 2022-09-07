package com.example.heartbeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class LoseNoMale extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN) ;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lose_no_male);


        Bundle bundle = getIntent().getExtras() ;

        double cal = bundle.getDouble("cal");
        double BMI = bundle.getDouble("bmi");

        String Name = bundle.getString("name") ;





        TextView highcal =findViewById(R.id.lowcal5) ;

        TextView meal1 =findViewById(R.id.meal1) ;


        highcal.setMovementMethod(LinkMovementMethod.getInstance());

        meal1.setMovementMethod(LinkMovementMethod.getInstance());



        TextView calv = findViewById(R.id.calcuttfe) ;

        calv.setText(String.valueOf(cal-500));



        Button buttm = findViewById(R.id.buttcutfe) ;

        buttm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(LoseNoMale.this, MainPage.class);

                intent.putExtra("name" , Name) ;

                startActivity(intent);

            }
        });
    }
}



