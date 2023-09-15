package ru.mirea.shunyaev.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textView2 = findViewById(R.id.textView);
        String value = (String) getIntent().getSerializableExtra("key");
        textView2.setText(value);
    }
}