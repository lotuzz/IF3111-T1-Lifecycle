package com.vogella.android.lifecycle.activity;

/**
 * Created by Professor Aldo on 2/8/2015.
 */
import android.os.Bundle;

public class SecondActivity extends TracerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

}