package com.example.colorapp;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

//    int ch=1;
    TextView v;
    Button b,b1;
    float font =30;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v=findViewById(R.id.textView2);
        b=findViewById(R.id.button);
        b1=findViewById(R.id.button2);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                font = font+5;
//                v.setTextSize(font);
                if(font==40)
                {
                    font=20;
                }
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            int count=1;
            @Override
            public void onClick(View v) {
                switch(count){
                    case 1:
//                        v.setTextColor(Color.RED);
//                        holder.text.setTextColor(Color.rgb(200,0,0));


                }
            }
        });

    }
}