package ru.gb.course1.android_lesson_1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    Button buttonSecondActivity;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSecondActivity = (Button) findViewById(R.id.buttonSecondActivity);
        buttonSecondActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonSecondActivity:
                Intent intent = new Intent(this, MainActivity2.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}