package com.example.heartbeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class LoseYesFe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN) ;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lose_yes_fe);

        Bundle bundle = getIntent().getExtras() ;


        double calf = bundle.getDouble("calf");
        double BMIf = bundle.getDouble("bmif"); double protein = bundle.getDouble("protein") ;

        String Name = bundle.getString("name") ;

        TextView workoutf =findViewById(R.id.workoutw) ;
        TextView highpro =findViewById(R.id.highpro) ;
        TextView SW1 =findViewById(R.id.SW1) ;
        TextView SW2 =findViewById(R.id.SW2) ;
        TextView lowcal =findViewById(R.id.lowcal) ;


        workoutf.setMovementMethod(LinkMovementMethod.getInstance());
        highpro.setMovementMethod(LinkMovementMethod.getInstance());
        SW1.setMovementMethod(LinkMovementMethod.getInstance());
        SW2.setMovementMethod(LinkMovementMethod.getInstance());
        lowcal.setMovementMethod(LinkMovementMethod.getInstance());






        TextView calv = findViewById(R.id.calcuttfe) ;

        calv.setText(String.valueOf(calf-500+400));

        TextView proteinv = findViewById(R.id.proteincuttfe) ;

        proteinv.setText(String.valueOf(protein));

        Button buttm = findViewById(R.id.buttcutfe) ;

        buttm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(LoseYesFe.this, MainPage.class);

                intent.putExtra("name" , Name) ;

                startActivity(intent);

            }
        });
    }


    }