package com.example.heartbeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class DP5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN) ;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dp5);

        Bundle bundle = getIntent().getExtras() ;

        String Name = bundle.getString("name") ;



        int Age = bundle.getInt("age") ;
        int Weight = bundle.getInt("weight") ;
        int Height = bundle.getInt("height") ;
        int Goal = bundle.getInt("goal") ;

        Button dp5butt1 = findViewById(R.id.dp5butt1) ;
        Button dp5butt2 = findViewById(R.id.dp5butt2) ;






        dp5butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                double cal = (10 * Weight + 6.25 * Height - 5 * Age + 5) + 300 ;
                double BMI = Weight / ((Height / 100.0) * (Height / 100.0));

                double protein = Weight * 1.7 ;


                if (Goal > Weight)  {

                    Intent intent = new Intent(DP5.this ,DP7E.class ) ;

                    intent.putExtra("cal" ,cal) ;
                    intent.putExtra("bmi" ,BMI) ;

                    intent.putExtra("protein" , protein) ;

                    intent.putExtra("name" , Name) ;

                    startActivity(intent);


                }

                else if (Goal < Weight)  {

                    Intent intent = new Intent(DP5.this , WorkoutLoss.class) ;

                    intent.putExtra("cal" ,cal) ;
                    intent.putExtra("bmi" ,BMI) ;

                    intent.putExtra("name" , Name) ;

                    intent.putExtra("protein" , protein) ;

                    startActivity(intent);





                }







            }
        });

        dp5butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                double calf = (10 * Weight +  6.25  * Height - 5 * Age - 161) + 300 ;
                double BMIf = Weight / ((Height / 100.0) * (Height / 100.0));

                double protein = Weight * 1.7 ;


                if (Goal > Weight)  {

                    Intent intent = new Intent(DP5.this ,workoutGainFe.class ) ;

                    intent.putExtra("calf" ,calf) ;
                    intent.putExtra("bmif" ,BMIf) ;

                    intent.putExtra("protein" , protein) ;

                    intent.putExtra("name" , Name) ;

                    startActivity(intent);


                }

                else if (Goal < Weight)  {

                    Intent intent = new Intent(DP5.this , workoutLoseFe.class) ;

                    intent.putExtra("calf" ,calf) ;
                    intent.putExtra("bmif" ,BMIf) ;

                    intent.putExtra("name" , Name) ;

                    intent.putExtra("protein" , protein) ;

                    startActivity(intent);



                }





            }
        });








    }
}