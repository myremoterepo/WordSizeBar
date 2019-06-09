package com.browser2345.wordsizebar;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class ContentActivity extends Activity {
    private static final String TAG = ContentActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "oncreate");
        setContentView(R.layout.activity_content);
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
        Log.d(TAG, "onpause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onstop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "ondestroy");
    }
}
