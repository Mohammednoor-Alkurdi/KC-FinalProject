package com.example.heartbeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class GainYesFe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN) ;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gain_yes_fe);

        Bundle bundle = getIntent().getExtras() ;


        double calf = bundle.getDouble("calf");
        double BMIf = bundle.getDouble("bmif");

        String Name = bundle.getString("name") ;


        TextView workoutf =findViewById(R.id.workoutw2) ;
        TextView highpro =findViewById(R.id.highpro3) ;

        TextView SW2 =findViewById(R.id.SW7) ;
        TextView lowcal =findViewById(R.id.lowcal6) ;


        workoutf.setMovementMethod(LinkMovementMethod.getInstance());
        highpro.setMovementMethod(LinkMovementMethod.getInstance());
        SW2.setMovementMethod(LinkMovementMethod.getInstance());
        lowcal.setMovementMethod(LinkMovementMethod.getInstance());





        double protein = bundle.getDouble("protein") ;

        TextView calv = findViewById(R.id.calf) ;

        calv.setText(String.valueOf(calf+500+400));

        TextView proteinv = findViewById(R.id.proteinf) ;

        proteinv.setText(String.valueOf(protein));

        Button buttf = findViewById(R.id.buttf) ;

        buttf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(GainYesFe.this , MainPage .class) ;

                intent.putExtra("name" , Name) ;



                startActivity(intent);





            }
        });








    }
}