package com.example.lab2_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText Name;  //This edittext is typed name.
    EditText Age;   //This edittext is typed name.
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name = (EditText) findViewById(R.id.editText1);
        Age = (EditText) findViewById(R.id.editText2);
        button1 = (Button) findViewById(R.id.button1);
        //When button is selected, this Event happened
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = Name.getText().toString();
                String age = Age.getText().toString();
                Intent intent = new Intent (getApplicationContext(), NewActivity.class);
                //put info.
                intent.putExtra("loginName", name);
                intent.putExtra("loginAge", age);
                startActivity(intent);
            }
        });
    }
}