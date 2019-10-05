package com.example.mad314_1898334_assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       final EditText e=findViewById(R.id.tv);
        final EditText e2=findViewById(R.id.tv2);
        final EditText e3=findViewById(R.id.tv3);
        Button b=findViewById(R.id.click);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,SecondActivity.class);
                i.putExtra("numbers",e.getText().toString());
                i.putExtra("sumnumbers",e2.getText().toString());
                i.putExtra("productnumbers",e3.getText().toString());

                startActivity(i);
            }
        });


    }
}
