package com.example.anastasia.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class EditActivity2 extends AppCompatActivity {

    Button button4;
    Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit2);
        button4=(Button) findViewById(R.id.button4) ;
        button5=(Button) findViewById(R.id.button5) ;


         View.OnClickListener onClickListener= new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 switch (v.getId()){
                     case R.id.button4:
                         Intent intent=new Intent(EditActivity2.this,EditActivity.class);
                         startActivity(intent);
                         break;
                     case R.id.button5:
                         Intent intent1 = new Intent(EditActivity2.this, EditActivity3.class);
                         startActivity(intent1);
                         break;
                                     }
             }
         };
         button4.setOnClickListener(onClickListener);
         button5.setOnClickListener(onClickListener);
    }
}
