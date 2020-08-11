package com.example.worththeweight;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import java.lang.Math;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class MainActivity extends AppCompatActivity {
    public Button button;
    TextView tv;
    TextView tv2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv2=(TextView) findViewById(R.id.time);
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy");
       String dateTime= simpleDateFormat.format(calendar.getTime());
       tv2.setText(dateTime);

        String quotes[] = {"\"The last three or four reps is what makes the muscle grow. This area of pain divides a champion from someone who is not a champion.\""
                ,"\"Success usually comes to those who are too busy to be looking for it.\"","\"All progress takes place outside the comfort zone.\"","\"Whether you think you can, or you think you can’t, you’re right.\"","\"The successful warrior is the average man, with laser-like focus.\""};
        int rand=(int)(Math.random()*4);
        tv=(TextView) findViewById(R.id.quotes);
        tv.setText(quotes[rand]);
        button=findViewById(R.id.getStarted);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity();

            }
        });

    }

    public void openActivity(){
        Intent intent = new Intent(this,Home.class);
        startActivity(intent);
    }
}