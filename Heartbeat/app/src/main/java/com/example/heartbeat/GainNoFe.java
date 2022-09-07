package com.example.heartbeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class GainNoFe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gain_no_fe);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN) ;

        Bundle bundle = getIntent().getExtras() ;


        double calf = bundle.getDouble("calf");
        double BMIf = bundle.getDouble("bmif");

        double protein = bundle.getDouble("protein") ;

        String Name = bundle.getString("name") ;






        TextView highcal =findViewById(R.id.lowcal3) ;


        highcal.setMovementMethod(LinkMovementMethod.getInstance());





        TextView calgain = findViewById(R.id.calcuttfe) ;

        calgain.setText(String.valueOf(calf+500));


        Button buttgain = findViewById(R.id.buttcutfe) ;

        buttgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(GainNoFe.this, MainPage.class);

                intent.putExtra("name", Name);

                startActivity(intent);

            }


        });
    }

}