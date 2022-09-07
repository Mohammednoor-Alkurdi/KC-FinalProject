package com.example.heartbeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class workoutLoseFe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_lose_fe);

        Bundle bundle = getIntent().getExtras() ;

        double calf = bundle.getDouble("calf");
        double BMIf = bundle.getDouble("bmif");

        Button yes = findViewById(R.id.losefebuttyes) ;


        double protein = bundle.getDouble("protein") ;

        Button no = findViewById(R.id.losefebuttyno) ;





        String Name = bundle.getString("name") ;





        yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(workoutLoseFe.this,LoseYesFe .class);

                intent.putExtra("calf", calf);
                intent.putExtra("bmif", BMIf);

                intent.putExtra("name" , Name) ;

                intent.putExtra("protein" , protein) ;










                startActivity(intent);


            }
        });


        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(workoutLoseFe.this ,  LoseNoFe.class);

                intent.putExtra("calf", calf);
                intent.putExtra("bmif", BMIf);

                intent.putExtra("name" , Name) ;

                intent.putExtra("protein" , protein) ;


                startActivity(intent);

            }
        });



    }
}