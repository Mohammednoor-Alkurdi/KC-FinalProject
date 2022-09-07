package com.example.heartbeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class DP6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN) ;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dp6);

        Bundle bundle = getIntent().getExtras();

        int Age = bundle.getInt("age") ;
        int Weight = bundle.getInt("weight") ;
        int Height = bundle.getInt("height") ;

        String Name = bundle.getString("name") ;






        EditText dp6ed = findViewById(R.id.dp6ed) ;

        Button dp6butt = findViewById(R.id.dp6butt) ;





        dp6butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent (DP6.this , DP5.class) ;

                int Goal = Integer.parseInt(dp6ed.getText().toString()) ;

                intent.putExtra("goal" , Goal ) ;
                intent.putExtra("age" , Age ) ;
                intent.putExtra("weight" , Weight ) ;
                intent.putExtra("height" , Height ) ;

                intent.putExtra("name" , Name) ;


                startActivity(intent);



            }
        });



    }
}