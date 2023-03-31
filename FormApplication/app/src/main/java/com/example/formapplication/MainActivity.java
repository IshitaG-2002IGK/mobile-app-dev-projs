package com.example.formapplication;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    String usn, name, dept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText e1 = (EditText) findViewById(R.id.editTextTextPersonName2);
        EditText e2 = (EditText) findViewById(R.id.editTextTextPersonName3);
        EditText e3 = (EditText) findViewById(R.id.editTextTextPersonName4);

        Button bt = (Button) findViewById(R.id.button2);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                usn = e1.getText().toString();
                name = e2.getText().toString();
                dept = e3.getText().toString();

                Intent i = new Intent(MainActivity.this,MainActivity2.class);

                i.putExtra("usn_key", usn);
                i.putExtra("name_key", name);
                i.putExtra("dept_key",dept);

                startActivity(i);

            }
        });






    }
}