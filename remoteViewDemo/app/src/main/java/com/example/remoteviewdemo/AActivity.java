package com.example.remoteviewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

public class AActivity extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_activity );
    }
}
