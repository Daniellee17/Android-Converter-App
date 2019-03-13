package com.example.daniellemarie.espiritu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class temp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tempp);

    }

    public void cc(View view)
    {
        int finalans = 0;
        final EditText et = findViewById(R.id.hello);
        String temp = et.getText().toString();
        int j = Integer.parseInt(temp);
        finalans = j*9/5+32;
        String hello = String.valueOf(finalans);

        TextView answerView = findViewById(R.id.textView);
        answerView.setText(hello + " F");
        Toast.makeText(this, "Converted", Toast.LENGTH_LONG).show();
    }

    public void ff(View view)
    {
        int finalans = 0;
        final EditText et = (EditText) findViewById(R.id.hello);
        String temp = et.getText().toString();
        int j = Integer.parseInt(temp);
        finalans = (j-32)*5/9;
        String hello = String.valueOf(finalans);

        TextView answerView = (TextView) findViewById(R.id.textView);
        answerView.setText(hello + " C");
        Toast.makeText(this, "Converted", Toast.LENGTH_LONG).show();
    }

}
