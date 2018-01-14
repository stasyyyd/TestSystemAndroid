package com.example.anastasia.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class EndActivity extends AppCompatActivity {
     Button button12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        button12 =(Button) findViewById(R.id.button);
           button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(EndActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
