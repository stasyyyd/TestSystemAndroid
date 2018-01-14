package com.example.anastasia.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EditActivity extends AppCompatActivity {

    Button button2;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        button2=(Button) findViewById(R.id.button2) ;
        button3=(Button) findViewById(R.id.button3) ;

        View.OnClickListener onClickListener= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.button2:
                        Intent intent=new Intent(EditActivity.this,MainActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.button3:
                        Intent intent1 = new Intent(EditActivity.this, EditActivity2.class);
                        startActivity(intent1);
                        break;
                }
            }
        };
        button2.setOnClickListener(onClickListener);
        button3.setOnClickListener(onClickListener);
    }

}
