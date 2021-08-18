package com.javaex.ex06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    private Button btn02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn02 = (Button) findViewById(R.id.btn02);

        btn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);

            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("MainActivity2","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("MainActivity2","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("MainActivity2","onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("MainActivity2","onRestart");
    }

}