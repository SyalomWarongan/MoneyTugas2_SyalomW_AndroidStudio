package com.example.money;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private Button info;
    private Button more;
    private TextView res;
    private TextView output;

    private int val = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        info = findViewById(R.id.button3);
        more = findViewById(R.id.button);
        res = findViewById(R.id.out);
        output = findViewById(R.id.output);
    }

    public void result(View view) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        val += 100000;
        res.setText(String.valueOf(val));
        switch (val) {
            case 500000:
                Toast.makeText(getApplicationContext(), "Wow so much money!", Toast.LENGTH_SHORT).show();
                res.setTextSize(30);
                res.setTextColor(Color.BLUE);
                break;
            case 1000000:
                Toast.makeText(getApplicationContext(), "Awesome! Many more money!", Toast.LENGTH_SHORT).show();
                res.setTextSize(40);
                res.setTextColor(Color.GREEN);
                break;
            case 1500000:
                Toast.makeText(getApplicationContext(), "YOU ARE RICH!", Toast.LENGTH_SHORT).show();
                res.setTextSize(50);
                res.setTextColor(Color.RED);
                break;
        }
    }

    public void information(View view) {
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This is my App!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}