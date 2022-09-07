package com.example.heartbeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN) ;
        setContentView(R.layout.activity_main);

        TextView p1tv1 = findViewById(R.id.p1tv1) ;
        TextView p1tv2 = findViewById(R.id.p1tv2) ;
        TextView p1dc1 = findViewById(R.id.p1dc1) ;
        TextView p1dc2 = findViewById(R.id.p1dc2) ;

        ImageView p1im1 = findViewById(R.id.p1im1) ;
        ImageView p1im2 = findViewById(R.id.p1im2) ;

        Button p1butt1 = findViewById(R.id.p1butt1) ;

        p1butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this , logInActivity.class) ;



                startActivity(intent);




            }
        });








    }
}