package com.example.anastasia.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class EditActivity3 extends AppCompatActivity {

    Button button6;
    Button button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit3);
        button6=(Button) findViewById(R.id.button6) ;
        button7=(Button) findViewById(R.id.button7) ;

        View.OnClickListener onClickListener= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.button6:
                        Intent intent=new Intent(EditActivity3.this,EditActivity2.class);
                        startActivity(intent);
                        break;
                    case R.id.button7:
                        Intent intent1 = new Intent(EditActivity3.this, EditActivity4.class);
                        startActivity(intent1);
                        break;
                }
            }
        };
        button6.setOnClickListener(onClickListener);
        button7.setOnClickListener(onClickListener);
    }
}
