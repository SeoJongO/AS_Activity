package com.javaex.ex06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn01 = (Button) findViewById(R.id.btn01);

        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("MainActivity1","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("MainActivity1","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("MainActivity1","onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("MainActivity1","onRestart");
    }

}