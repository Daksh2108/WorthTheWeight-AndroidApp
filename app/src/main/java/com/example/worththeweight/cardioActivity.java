package com.example.worththeweight;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class cardioActivity extends AppCompatActivity {

    public Button button;
    public Button yogaButton;
    public Button weightLifting;
    public Button flexButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardio);

        button=findViewById(R.id.cardio_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardioActivity();

            }
        });

        yogaButton=findViewById(R.id.balance);
        yogaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yogaActivity();

            }
        });


        weightLifting=findViewById(R.id.weight_lifting);
        weightLifting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                weightLiftingActivity();
            }
        });

        flexButton=findViewById(R.id.flex);
        flexButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flexActivity();
            }
        });

    }

    public void flexActivity(){

        Intent intent = new Intent(this,activity_flex.class);
        startActivity(intent);

    }

    public void weightLiftingActivity(){

        Intent intent = new Intent(this,weight_lifting.class);
        startActivity(intent);

    }

    public void cardioActivity(){

        Intent intent = new Intent(this,cardi.class);
        startActivity(intent);

    }
    public void yogaActivity(){

        Intent intent = new Intent(this, ActivityYoga.class);
        startActivity(intent);

    }

}