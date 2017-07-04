package com.example.codetribe.footballscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Button btnchiefs,btnpirates,btnreset;
    private TextView txtchiefs,txtpirates;
    private int countchiefs=0;
            private int countpirates=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnchiefs=(Button)findViewById(R.id.btnchiefs);
        btnpirates=(Button)findViewById(R.id.btnpirates);
        btnreset=(Button)findViewById(R.id.btnreset);
        txtchiefs=(TextView)findViewById(R.id.txtchiefs);
        txtpirates=(TextView)findViewById(R.id.txtpirates);

        btnchiefs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                countchiefs=countchiefs+1;

                txtchiefs.setText(String.valueOf(countchiefs));
            }
        });
        btnpirates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                countpirates=countpirates+1;

                txtpirates.setText(String.valueOf(countpirates));

            }
        });

        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtchiefs.setText("0");

                txtpirates.setText("0");
            }
        });


    }



    }

