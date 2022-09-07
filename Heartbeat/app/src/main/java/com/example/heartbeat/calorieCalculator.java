package com.example.heartbeat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calorieCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie_calculator);


        Bundle bundle = getIntent().getExtras();


        TextView p5tv11 = findViewById(R.id.p5tv11);
        TextView p5tv10 = findViewById(R.id.p5tv10);
        TextView p5tv9 = findViewById(R.id.p5tv9);
        TextView p5tv1 = findViewById(R.id.p5tv1);
        TextView p5tv2 = findViewById(R.id.p5tv2);
        TextView p5tv3 = findViewById(R.id.p5tv3);
        TextView p5tv4 = findViewById(R.id.p5tv4);
        TextView p5tv5 = findViewById(R.id.p5tv5);
        TextView p5tv6 = findViewById(R.id.p5tv6);
        TextView p5tv7 = findViewById(R.id.p5tv7);
        TextView p5tv8 = findViewById(R.id.p5tv8);
        TextView p5tv2f = findViewById(R.id.p5tv2f);
        TextView p5tv3f = findViewById(R.id.p5tv3f);
        TextView p5tv4f = findViewById(R.id.p5tv4f);
        TextView p5tv5f = findViewById(R.id.p5tv5f);
        TextView p5tv6f = findViewById(R.id.p5tv6f);
        TextView p5tv7f = findViewById(R.id.p5tv7f);
        TextView p5tv11f = findViewById(R.id.p5tv11f);
        TextView p5tv10f = findViewById(R.id.p5tv10f);
        TextView p5tv9f = findViewById(R.id.p5tv9f);




        EditText p5ed1 = findViewById(R.id.p5ed1);
        EditText p5ed2 = findViewById(R.id.p5ed2);
        EditText p5ed3 = findViewById(R.id.p5ed3);


        Button p5butt1 = findViewById(R.id.p5butt1);
        Button p5butt2 = findViewById(R.id.p5butt2);

        p5butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int AGE = Integer.parseInt(p5ed3.getText().toString());

                if (p5ed3 == null)  {

                    p5tv8.setText("Please enter your age");

                }

                if (p5ed1==null)  {

                    p5tv8.setText("Please enter your height");
                }

                if (p5ed2 == null)  {

                    p5tv8.setText("Please enter your weight");


                }

                if (AGE < 13) {

                    p5tv8.setText("Please enter an age older than 13");
                } else {


                    p5tv8.setText(null);


                    p5tv6f.setText(null);
                    p5tv4f.setText(null);
                    p5tv3f.setText(null);


                    p5tv2f.setText(null) ;
                    p5tv7f.setText(null) ;
                    p5tv5f.setText(null) ;

                    p5tv9f.setText(null) ;
                    p5tv10f.setText(null) ;
                    p5tv11f.setText(null) ;




                    int Age = Integer.parseInt(p5ed3.getText().toString());
                    int Weight = Integer.parseInt(p5ed2.getText().toString());
                    int Hight = Integer.parseInt(p5ed1.getText().toString());


                    double ResultL = (10 * Weight + 6.25 * Hight - 5 * Age + 5) ;
                    double ResultM = (10 * Weight + 6.25 * Hight - 5 * Age + 5) ;
                    double ResultG = (10 * Weight + 6.25 * Hight - 5 * Age + 5) ;

                    p5tv6.setText(String.valueOf(ResultL + 300 - 500));
                    p5tv4.setText(String.valueOf(ResultM + 300));
                    p5tv3.setText(String.valueOf(ResultG + 300 + 500));

                    p5tv2.setText("Lose weight:");
                    p5tv7.setText("Maintain weight:");
                    p5tv5.setText("Gain weight:");

                    p5tv9.setText("Cal per day");
                    p5tv10.setText("Cal per day");
                    p5tv11.setText("Cal per day");


                }


            }
        });





          p5butt1.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {

                  int AGE = Integer.parseInt(p5ed3.getText().toString());



                  if (AGE < 13) {

                      p5tv8.setText("Please enter an age older than 13");



                  } else {


                      p5tv8.setText(null) ;


                      p5tv6.setText(null) ;
                      p5tv4.setText(null) ;
                      p5tv3.setText(null) ;


                      p5tv2.setText(null) ;
                      p5tv7.setText(null) ;
                      p5tv5.setText(null) ;

                      p5tv9.setText(null) ;
                      p5tv10.setText(null) ;
                      p5tv11.setText(null) ;



                      int Hight = Integer.parseInt(p5ed1.getText().toString());
                      int Weight = Integer.parseInt(p5ed2.getText().toString());
                      int Age = Integer.parseInt(p5ed3.getText().toString());


                      double ResultL = (10 * Weight +  6.25  * Hight - 5 * Age - 161) ;
                      double ResultM = (10 * Weight + 6.25 * Hight - 5 * Age - 161) ;
                      double ResultG = (10 * Weight + 6.25 * Hight - 5 * Age - 161) ;


                      p5tv6f.setText(String.valueOf(ResultL + 300 - 500));
                      p5tv4f.setText(String.valueOf(ResultM + 300));
                      p5tv3f.setText(String.valueOf(ResultG + 300 + 500));

                      p5tv2f.setText("Lose weight:");
                      p5tv7f.setText("Maintain weight:");
                      p5tv5f.setText("Gain weight:");

                      p5tv9f.setText("Cal per day");
                      p5tv10f.setText("Cal per day");
                      p5tv11f.setText("Cal per day");


                  }
              }


          });

    }
}






