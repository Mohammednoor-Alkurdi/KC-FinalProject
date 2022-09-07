package com.example.heartbeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class DP3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN) ;
        setContentView(R.layout.activity_dp3);




        Bundle bundle = getIntent().getExtras() ;

        int Age = bundle.getInt("age") ;



        EditText dp3ed1 = findViewById(R.id.dp3ed1) ;

        String Name = bundle.getString("name") ;


        Button dp3butt = findViewById(R.id.dp3butt) ;




        dp3butt.setOnClickListener(new View.OnClickListener() {




            @Override
            public void onClick(View view) {

                int Weight = Integer.parseInt(dp3ed1.getText().toString()) ;
                Intent intent = new Intent(DP3.this , DP4.class) ;

               ;


                intent.putExtra("weight" , Weight) ;

                intent.putExtra("age" , Age) ;

                intent.putExtra("name" , Name) ;



                startActivity(intent);





            }
        });






    }
}