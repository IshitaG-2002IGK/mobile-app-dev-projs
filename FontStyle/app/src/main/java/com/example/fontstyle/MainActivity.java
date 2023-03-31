package com.example.fontstyle;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int ch=1;
    float font=30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView t = (TextView) findViewById(R.id.textView);

        Button bt = (Button) findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                t.setTextSize(font);
                font = font+5;
                if(font==50)
                {
                    font = 30;
                }
            }
        });

        Button b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(ch)
                {
                    case 1:
                            t.setTextColor(Color.BLUE);
                            break;
                    case 2:
                        t.setTextColor(Color.RED);

                        break;

                    case 3:
                        t.setTextColor(Color.GREEN);
                        t.setTypeface(Typeface.DEFAULT_BOLD, Typeface.NORMAL);
                        break;

                    case 4:
                        t.setTextColor(Color.CYAN);
                        t.setTypeface(Typeface.SANS_SERIF,Typeface.BOLD);
                        break;

                    case 5:
                        t.setTextColor(Color.MAGENTA);
                        t.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD_ITALIC);
                        break;

                    case 6:
                        t.setTextColor(Color.YELLOW);
                        t.setTypeface(Typeface.MONOSPACE,Typeface.BOLD);
                        break;
                }

                ch++;
                if(ch==7)
                    ch=1;
            }
        });
    }
}