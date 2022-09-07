package com.example.heartbeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class LoseNoFe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN) ;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lose_no_fe);

        Bundle bundle = getIntent().getExtras() ;


        double calf = bundle.getDouble("calf");
        double BMIf = bundle.getDouble("bmif");

        String Name = bundle.getString("name") ;





        TextView SW2 =findViewById(R.id.SW9) ;
        TextView lowcal =findViewById(R.id.lowcal8) ;


        SW2.setMovementMethod(LinkMovementMethod.getInstance());
        lowcal.setMovementMethod(LinkMovementMethod.getInstance());







        TextView calv = findViewById(R.id.calcuttfe) ;

        calv.setText(String.valueOf(calf-500));



        Button butt = findViewById(R.id.buttcutfe) ;

        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(LoseNoFe.this, MainPage.class);

                intent.putExtra("name" , Name) ;

                startActivity(intent);

            }
        });
    }
}




