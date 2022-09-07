package com.example.heartbeat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class bmiCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN) ;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_calculator);


        Bundle bundle = getIntent().getExtras() ;


        TextView p6tdc1 = findViewById(R.id.p6dc1) ;
        TextView p6ttv = findViewById(R.id.p6tv) ;
        TextView p6tv1 = findViewById(R.id.p6tv1) ;
        TextView p6tv2 = findViewById(R.id.p6tv2) ;
        TextView p6tv3 = findViewById(R.id.p6tv3) ;
        TextView p6tv4 = findViewById(R.id.p6tv4) ;
        TextView p6tv5 = findViewById(R.id.p6tv5) ;
        TextView p6tv6 = findViewById(R.id.p6tv6) ;
        TextView p6tv7 = findViewById(R.id.p6tv7) ;
        TextView p6tv8 = findViewById(R.id.p6tv8) ;
        TextView p6tv9 = findViewById(R.id.p6tv9) ;
        TextView p6tv10 = findViewById(R.id.p6tv10) ;
        TextView p6tv30 = findViewById(R.id.p6tv30) ;
        TextView p6tv18 = findViewById(R.id.p6tv18) ;
        TextView p6tv12 = findViewById(R.id.p6tv12) ;
        TextView p6tv13 = findViewById(R.id.p6tv13) ;
        TextView p6tv14 = findViewById(R.id.p6tv14) ;
        TextView p6tv15 = findViewById(R.id.p6tv15) ;



        EditText p6ed1 = findViewById(R.id.p6ed1) ;
        EditText p6ed2 = findViewById(R.id.p6ed2) ;


        ImageView p6im1 = findViewById(R.id.p6im1) ;
        ImageView p6im2 = findViewById(R.id.p6im2) ;


        Button p6butt1 = findViewById(R.id.p6butt1) ;





        BMIimage bmiim1 = new BMIimage(R.drawable.screen_shot_2022_09_04_at_10_13_01_pm) ;
        BMIimage bmiim2 = new BMIimage(R.drawable.norm) ;
        BMIimage bmiim3 = new BMIimage(R.drawable.overw) ;
        BMIimage bmiim4 = new BMIimage(R.drawable.obesity) ;
        BMIimage bmiim5 = new BMIimage(R.drawable.morbid) ;



        int bmiim11 = R.drawable.screen_shot_2022_09_04_at_10_13_01_pm  ;
        int bmiimm22 = R.drawable.norm ;
        int bmiim33 = R.drawable.overw ;
        int bmiim44 = R.drawable.obesity ;
        int bmiim55 = R.drawable.morbid ;




        p6butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int Hight = Integer.parseInt(p6ed1.getText().toString());
                int Weight = Integer.parseInt(p6ed2.getText().toString());
                double BMI = Weight / ((Hight / 100.0) * (Hight / 100.0));












                p6tv1.setText(String.valueOf(BMI));


                if (BMI < 18.5)   {


                    p6im1.setImageResource(bmiim11) ;







                    p6tv3.setText(null);
                    p6tv4.setText(null);
                    p6tv5.setText(null);
                    p6tv18.setText(null);


                    p6tv15.setText(null);
                    p6tv12.setText(null);
                    p6tv13.setText(null);
                    p6tv14.setText(null);



                    p6tv2.setText("Underweight");

                    p6ttv.setText("You are advised to eat more to avoid health problems ");

                }
                else if (BMI > 40) {

                    p6im1.setImageResource(bmiim55);


                    p6tv3.setText(null);
                    p6tv4.setText(null);
                    p6tv2.setText(null);
                    p6tv18.setText(null);


                    p6ttv.setText(null);
                    p6tv12.setText(null);
                    p6tv13.setText(null);
                    p6tv14.setText(null);




                    p6tv5.setText("Morbid obesity");

                    p6tv15.setText("You are advised to follow a strict diet to ovoid series health problems");

                } else if (BMI < 24.9) {


                    p6im1.setImageResource(bmiimm22);


                    p6tv5.setText(null);
                    p6tv4.setText(null);
                    p6tv2.setText(null);
                    p6tv18.setText(null);

                    p6ttv.setText(null);
                    p6tv13.setText(null);
                    p6tv15.setText(null);
                    p6tv14.setText(null);



                    p6tv3.setText("Normal");

                    p6tv12.setText("You are perfect! ");

                } else if (BMI < 29.9) {

                    p6im1.setImageResource(bmiim33);

                    p6tv3.setText(null);
                    p6tv4.setText(null);
                    p6tv2.setText(null);
                    p6tv5.setText(null);

                    p6ttv.setText(null);
                    p6tv12.setText(null);
                    p6tv14.setText(null);
                    p6tv15.setText(null);



                    p6tv18.setText("Overweight");

                    p6tv13.setText("You are advised to eat less to avoid health problems");

                }
                else if (BMI < 39.9)  {

                    p6im1.setImageResource(bmiim44);


                    p6tv3.setText(null);
                    p6tv18.setText(null);
                    p6tv2.setText(null);
                    p6tv5.setText(null);

                    p6ttv.setText(null);
                    p6tv12.setText(null);
                    p6tv13.setText(null);
                    p6tv15.setText(null);




                    p6tv4.setText("Obesity");

                    p6tv14.setText("You are advised to follow a diet to avoid series health problems ");
                }



                }


        });

}
}
