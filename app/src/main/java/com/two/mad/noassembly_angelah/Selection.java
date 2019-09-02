package com.two.mad.noassembly_angelah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Selection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);


        final RadioButton bIkea = findViewById(R.id.btnIKEA);
        final RadioButton bBike = findViewById(R.id.btnBike);
        final RadioButton bPatio = findViewById(R.id.btnPatio);
        final Button bNext = findViewById(R.id.btnNext);

        bNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bIkea.isChecked())
                {
                    startActivity(new Intent(Selection.this, ikea.class));
                }
                if(bBike.isChecked())
                {
                    startActivity(new Intent(Selection.this, Bike.class));
                }
                if(bPatio.isChecked())
                {
                    startActivity(new Intent(Selection.this, Patio.class));
                }
            }
        });

    }
}
