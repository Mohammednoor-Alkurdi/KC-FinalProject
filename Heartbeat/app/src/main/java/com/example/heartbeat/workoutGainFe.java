package com.example.heartbeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class workoutGainFe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_gain_fe);

        Bundle bundle = getIntent().getExtras() ;

        double calf = bundle.getDouble("calf");
        double BMIf = bundle.getDouble("bmif");

        double protein = bundle.getDouble("protein") ;

        String Name = bundle.getString("name") ;

        Button yes = findViewById(R.id.gainfebuttyes) ;
        Button no = findViewById(R.id.gainfebuttno) ;


        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(workoutGainFe.this,GainYesFe .class);

                intent.putExtra("calf", calf);
                intent.putExtra("bmif", BMIf);

                intent.putExtra("protein" , protein) ;

                intent.putExtra("name" , Name) ;

                startActivity(intent);


            }
        });


        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(workoutGainFe.this ,  GainNoFe.class);

                intent.putExtra("calf", calf);
                intent.putExtra("bmif", BMIf);

                intent.putExtra("protein" , protein) ;

                intent.putExtra("name" , Name) ;


                startActivity(intent);

            }
        });



    }
}