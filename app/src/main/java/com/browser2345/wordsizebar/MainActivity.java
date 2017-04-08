package com.browser2345.wordsizebar;

import com.browser2345.wordsizebar.wordsizebar.RangeBar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
    }
}
