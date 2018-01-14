package com.example.anastasia.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView view;
    Button button;
    String[] list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //button =(Button) findViewById(R.id.button);
        view=(ListView) findViewById(R.id.listView);


        /*button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,EditActivity.class);
                startActivity(intent);
            }
        });*/

        final ArrayList<String> test = new ArrayList<>();
        test.add(0,"тест1");
        test.add(1,"тест2");
        test.add(2,"тест3");
        test.add(3,"тест4");
        test.add(4,"тест5");

        ArrayAdapter<String> adapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, test);
        view.setAdapter(adapter);

        view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView textView=(TextView) view;
                String str=textView.getText().toString();

                if(str.equalsIgnoreCase(test.get(0))){
                    Intent intent=new Intent(MainActivity.this,EditActivity.class);
                    startActivity(intent);
                }


            }
        });
    }

}
