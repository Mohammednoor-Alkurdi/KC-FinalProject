package com.example.heartbeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class DP4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN) ;
        setContentView(R.layout.activity_dp4);

        Bundle bundle = getIntent().getExtras() ;

        int Age = bundle.getInt("age") ;
        int Weight = bundle.getInt("weight") ;


        EditText dp4ed1 = findViewById(R.id.dp4ed1) ;


        String Name = bundle.getString("name") ;

        Button dp4butt= findViewById(R.id.dp4butt) ;



        dp4butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int Height = Integer.parseInt(dp4ed1.getText().toString()) ;

                Intent intent = new Intent(DP4.this, DP6.class) ;


                intent.putExtra("age" , Age ) ;
                intent.putExtra("weight" , Weight ) ;
                intent.putExtra("height" , Height ) ;

                intent.putExtra("name" , Name) ;



                startActivity(intent);








            }
        });
    }
}