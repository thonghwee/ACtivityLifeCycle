package com.taruc.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("hello", "onCreate method is called");


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("hello", "onStart method is called");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d("hello", "onResume method is called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("hello", "onPause method is called");

    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d("hello", "onStop method is called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("hello", "onDestroy method is called");
    }
}
