package com.example.heartbeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class LoseYesMale extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN) ;
        setContentView(R.layout.activity_lose_yes_male);

        Bundle bundle = getIntent().getExtras() ;


        double cal = bundle.getDouble("cal");
        double BMI = bundle.getDouble("bmi");

        double protein = bundle.getDouble("protein") ;

        String Name = bundle.getString("name") ;


        TextView workoutm =findViewById(R.id.workoutm) ;
        TextView highpro =findViewById(R.id.highpro2) ;
        TextView SW3 =findViewById(R.id.SW3) ;
        TextView SW4 =findViewById(R.id.SW4) ;
        TextView lowcal2 =findViewById(R.id.lowcal2) ;


        workoutm.setMovementMethod(LinkMovementMethod.getInstance());
        highpro.setMovementMethod(LinkMovementMethod.getInstance());
        SW3.setMovementMethod(LinkMovementMethod.getInstance());
        SW4.setMovementMethod(LinkMovementMethod.getInstance());
        lowcal2.setMovementMethod(LinkMovementMethod.getInstance());













        TextView calv = findViewById(R.id.calcuttfe) ;

        calv.setText(String.valueOf(cal-500+400));

        TextView proteinv = findViewById(R.id.proteincuttfe) ;

        proteinv.setText(String.valueOf(protein));

        Button buttm = findViewById(R.id.buttcutfe) ;

        buttm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(LoseYesMale.this, MainPage.class);

                intent.putExtra("name" , Name) ;

                startActivity(intent);

            }
        });
    }
}


