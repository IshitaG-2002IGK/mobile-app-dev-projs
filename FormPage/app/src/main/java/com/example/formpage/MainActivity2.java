package com.example.formpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity2 extends AppCompatActivity {

    String usn, name, dept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView t1 = (TextView) findViewById(R.id.textView4);
        TextView t2 = (TextView) findViewById(R.id.textView5);
        TextView t3 = (TextView) findViewById(R.id.textView6);

        Intent i = getIntent();

        usn=i.getStringExtra("usn_key");
        name = i.getStringExtra("name_key");
        dept = i.getStringExtra("dept_key");



        t1.setText(usn);
        t2.setText(name);
        t3.setText(dept);


    }
}