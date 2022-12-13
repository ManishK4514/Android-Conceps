package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText t, p;
    Button b;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = (EditText) findViewById(R.id.t);
        p = (EditText) findViewById(R.id.p);
        b = (Button) findViewById(R.id.b);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                Bundle b1 = new Bundle();
                b1.putString("Username", t.getText().toString());
                Bundle b2 = new Bundle();
                b1.putString("Password", p.getText().toString());
                intent.putExtras(b1);
                intent.putExtras(b2);
                startActivity(intent);
            }
        });
    }
}