package com.ching.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.textExample);
        button = findViewById(R.id.bigbutton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button.setBackgroundColor(Color.WHITE);
                button.setBackgroundColor(Color.BLACK);
                text.setVisibility(View.INVISIBLE);
                button.setVisibility(View.VISIBLE);

            }
        });

        text.setTextColor(Color.GREEN);;
        text.setText("This is a Test");


    }
}