package com.browser2345.wordsizebar;

import com.browser2345.wordsizebar.wordsizebar.RangeBar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends Activity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "oncreate");
        setContentView(R.layout.activity_main);

        RangeBar rangebar = (RangeBar) findViewById(R.id.rangebar);
        rangebar.setTickCount(5);
        rangebar.setTickHeight(10);
        rangebar.setBarWeight(3);
        rangebar.setBarColor(R.color.black);

        rangebar.setOnRangeBarChangeListener(new RangeBar.OnRangeBarChangeListener() {
            @Override
            public void onIndexChangeListener(RangeBar rangeBar, int thumbIndex) {
                Log.d("fan", "thumbIndex.." + thumbIndex);
                //Code using the leftThumbIndex and rightThumbIndex to update the index values.
            }
        });

        findViewById(R.id.to_content).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ContentActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onstart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onresume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }
}
