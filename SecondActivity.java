package com.example.mad314_1898334_assignment1;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView t=findViewById(R.id.et);
        TextView t2=findViewById(R.id.et2);
        String s1=getIntent().getStringExtra("numbers");
        String s2=getIntent().getStringExtra("sumnumbers");
        String s3=getIntent().getStringExtra("productnumbers");
        int in=Integer.parseInt(s1);
        int in2=Integer.parseInt(s2);
        int in3=Integer.parseInt(s3);
        int sum=in+in2+in3;
        int prod=in*in2*in3;
        t.setText(""+sum);
        t2.setText(""+prod);


    }
}
