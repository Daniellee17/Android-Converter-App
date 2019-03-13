package com.example.daniellemarie.espiritu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class area extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.areaa);

    }

    public void cc(View view)
    {
        double finalans = 0;
        final EditText et = findViewById(R.id.hello);
        String temp = et.getText().toString();
        double j = Integer.parseInt(temp);
        finalans = j*0.09290304;
        String hello = String.valueOf(finalans);

        TextView answerView = findViewById(R.id.textView);
        answerView.setText(hello + " Sqr Meters");
        Toast.makeText(this, "Converted", Toast.LENGTH_LONG).show();
    }

    public void ff(View view)
    {
        double finalans = 0;
        final EditText et = findViewById(R.id.hello);
        String temp = et.getText().toString();
        double j = Integer.parseInt(temp);
        finalans = j*100;
        String hello = String.valueOf(Math.round(finalans));

        TextView answerView = findViewById(R.id.textView);
        answerView.setText(hello + " Sqr Milimeters");
        Toast.makeText(this, "Converted", Toast.LENGTH_LONG).show();
    }

}
