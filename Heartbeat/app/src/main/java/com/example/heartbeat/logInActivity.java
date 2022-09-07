package com.example.heartbeat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.viewmodel.CreationExtras;

import android.content.Intent;
import android.os.Bundle;
import android.sax.EndElementListener;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.BreakIterator;

public class logInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN) ;
        setContentView(R.layout.activity_log_in);


        Bundle bundle = getIntent().getExtras();



        TextView p2tv1 = findViewById(R.id.p2tv1) ;
        TextView p2tt1 = findViewById(R.id.p2tt1) ;
        TextView p2dc1 = findViewById(R.id.p2dc1) ;
        TextView p2dc2 = findViewById(R.id.p2dc2) ;

        EditText p2ed1 = findViewById(R.id.p2ed1) ;
        EditText p2ed2 = findViewById(R.id.p2ed2) ;

        ImageView p2im1 = findViewById(R.id.p2im1) ;
        ImageView p2im2 = findViewById(R.id.p2im2) ;
        ImageView p2im3 = findViewById(R.id.p2im3) ;


        Button p2butt1 = findViewById(R.id.p2butt1) ;


        p2butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String name = p2ed1.getText().toString();

                int age = Integer.parseInt(p2ed2.getText().toString());

                if (name.isEmpty()) {

                    p2tv1.setText("Please enter a username!");


                }





             else if ( p2ed2 == null)  {

                 p2tv1.setText("Please enter your age") ;



             }

             else if (age < 13)  {

                 p2tv1.setText("You must be older than 13 to use heartbeat");





             }

             else {
                    p2tv1.setText(null) ;

                    Intent intent = new Intent(logInActivity.this , MainPage.class) ;



                    String Name = p2ed1.getText().toString() ;

                    intent.putExtra("name" , Name) ;

                    int Age = Integer.parseInt(p2ed2.getText().toString()) ;

                    intent.putExtra("Age" , Age) ;

                    startActivity(intent);


                }
























            }



                });

            }





}