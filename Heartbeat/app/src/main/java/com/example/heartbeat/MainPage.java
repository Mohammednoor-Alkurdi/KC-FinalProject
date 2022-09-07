package com.example.heartbeat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.jar.Attributes;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN) ;
        setContentView(R.layout.activity_main_page);




        Bundle bundle = getIntent().getExtras() ;








        TextView p4tv1 = findViewById(R.id.p4tv1) ;
        TextView p4tv2 = findViewById(R.id.p4tv2) ;
        TextView p4tv3 = findViewById(R.id.p4tv3) ;
        TextView p4tv4 = findViewById(R.id.p4tv4) ;
        TextView p4tv5 = findViewById(R.id.p4tv5) ;
        TextView p4tv6 = findViewById(R.id.p4tv6) ;
        TextView p4tv7 = findViewById(R.id.p4tv7) ;
        TextView p4tv8 = findViewById(R.id.p4tv8) ;

        TextView p4tv10 = findViewById(R.id.p4tv10) ;

        String Name = bundle.getString("name") ;
        p4tv2.setText(Name);






        EditText name = findViewById(R.id.p2ed1) ;


        ImageView p4im2 = findViewById(R.id.p4im2) ;




        CardView p4cv1 =findViewById(R.id.p4cv1 ) ;
        CardView p4cv2 =findViewById(R.id.p4cv2 ) ;


        Button p4butt = findViewById(R.id.p4butt) ;
        Button p4butt2 = findViewById(R.id.p4butt2) ;
        Button p4butt3 = findViewById(R.id.p4butt3) ;









        p4butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainPage.this , calorieCalculator.class) ;



                startActivity(intent);


                }



        });

        p4butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MainPage.this , bmiCalculator.class) ;

                startActivity(intent);




            }
        });


        p4butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainPage.this , DP1.class) ;

                intent.putExtra("name" , Name) ;

                startActivity(intent);

            }
        });












    }
}