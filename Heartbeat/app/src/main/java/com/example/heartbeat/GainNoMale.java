package com.example.heartbeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class GainNoMale extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gain_no_male);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN) ;

        Bundle bundle = getIntent().getExtras() ;


        double cal = bundle.getDouble("cal");
        double BMI = bundle.getDouble("bmi");


        TextView highcal =findViewById(R.id.lowcal4) ;


        highcal.setMovementMethod(LinkMovementMethod.getInstance());



        double protein = bundle.getDouble("protein") ;


        String Name = bundle.getString("name") ;


        TextView calgain = findViewById(R.id.calcuttfe) ;

        calgain.setText(String.valueOf(cal+500));


        Button buttgain = findViewById(R.id.buttcutfe) ;

        buttgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(GainNoMale.this, MainPage.class);

                intent.putExtra("name" , Name) ;

                startActivity(intent);

            }



    });
    }
}