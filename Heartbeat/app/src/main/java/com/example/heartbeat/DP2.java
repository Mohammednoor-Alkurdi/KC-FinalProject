package com.example.heartbeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.jar.Attributes;

public class DP2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN) ;
        setContentView(R.layout.activity_dp2);

        Bundle bundle = getIntent().getExtras() ;

        EditText dp2ed = findViewById(R.id.dp2ed) ;

        Button dp2butt = findViewById(R.id.dp2butt) ;

        TextView dp2tv = findViewById(R.id.dp2tv) ;


        String Name = bundle.getString("name") ;

        dp2butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int Age = Integer.parseInt(dp2ed.getText().toString()) ;

                if (Age <13) {

                    dp2tv.setText("Please enter an age older than 13");
;

                }

                else {

                    Intent intent = new Intent(DP2.this , DP3.class) ;

                    intent.putExtra("age" , Age) ;

                    intent.putExtra("name" , Name ) ;

                    startActivity(intent);

                }







            }
        });


    }
}