package com.example.heartbeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WorkoutLoss extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_loss);

        Bundle bundle = getIntent().getExtras();


        double cal = bundle.getDouble("cal");
        double BMI = bundle.getDouble("bmi");

        String Name = bundle.getString("name") ;

        Button losebuttno = findViewById(R.id.losebuttno);
        Button losebuttyes = findViewById(R.id.losebuttyes);

        double protein = bundle.getDouble("protein") ;


        losebuttno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(WorkoutLoss.this, LoseNoMale.class);

                intent.putExtra("cal", cal);
                intent.putExtra("bmi", BMI);

                intent.putExtra("name" , Name) ;

                intent.putExtra("protein" , protein) ;


                startActivity(intent);


            }
        });


        losebuttyes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(WorkoutLoss.this, LoseYesMale.class);

                intent.putExtra("cal", cal);
                intent.putExtra("bmi", BMI);

                intent.putExtra("name" , Name) ;

                intent.putExtra("protein" , protein) ;

                startActivity(intent);

            }
        });
    }
}
