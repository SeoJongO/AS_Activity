package com.javaex.ex06;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    private Button btn03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btn03 = (Button) findViewById(R.id.btn03);

        btn03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(intent);

            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("MainActivity3","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("MainActivity3","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("MainActivity3","onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("MainActivity3","onRestart");
    }

}
