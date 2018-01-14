package com.example.anastasia.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class EditActivity4 extends AppCompatActivity {

    Button button8;
    Button button9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit4);
        button8=(Button) findViewById(R.id.button8) ;
        button9=(Button) findViewById(R.id.button9) ;

        View.OnClickListener onClickListener= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.button8:
                        Intent intent=new Intent(EditActivity4.this,EditActivity3.class);
                        startActivity(intent);
                        break;
                    case R.id.button9:
                        Intent intent1 = new Intent(EditActivity4.this, EditActivity5.class);
                        startActivity(intent1);
                        break;
                }
            }
        };
        button8.setOnClickListener(onClickListener);
        button9.setOnClickListener(onClickListener);
    }
}
