package com.example.myapplication;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.graphics.Color;
        import android.graphics.drawable.ColorDrawable;
        import android.nfc.Tag;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private static String TAG ="main-LifeCycle";
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "oncreate");
        button =findViewById(R.id.myButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,otherActivity.class);
                startActivity(i);

            }

        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "oncreate");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "oncreate");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "oncreate");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i(TAG,"onCreate");




        };
    }

