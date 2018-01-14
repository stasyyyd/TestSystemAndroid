package com.example.anastasia.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class EditActivity5 extends AppCompatActivity {

    Button button10;
    Button button11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit5);
        button10=(Button) findViewById(R.id.button10) ;
        button11=(Button) findViewById(R.id.button11) ;

        View.OnClickListener onClickListener= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.button10:
                        Intent intent=new Intent(EditActivity5.this,EditActivity4.class);
                        startActivity(intent);
                        break;
                    case R.id.button11:
                        Intent intent1 = new Intent(EditActivity5.this, EndActivity.class);
                        startActivity(intent1);
                        break;
                }
            }
        };
        button10.setOnClickListener(onClickListener);
        button11.setOnClickListener(onClickListener);
    }
}
